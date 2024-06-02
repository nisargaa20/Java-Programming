//Sliding Window Maximum : Given an array nums and an integer k, there is a sliding window of size k which moves from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position. Return the max sliding window.

// ex: Input: nums=[1,3,-1,-1,5,3,6,7], k=3, output:[3,3,5,5,6,7]


// class SlidingWindowMax {
//     public static void main(String[] args) {
//         int[] arr = {1,3,-1,-1,5,3,6,7};
//         int k = 3;
//         int arr1[]=new int[arr.length];
//         for(int i=0;i<arr.length-2;i++){
//             for(int j=0;j<i+k-1;j++){
//                 if(arr[j]>arr[j+1]){
//                     arr1[i]=arr[j];
//                 }
//                 else{
//                     arr1[i]=arr[j+1];
//                 }
//             }
//         }
//         for(int i=0;i<arr.length-2;i++){
// System.out.println(arr1[i]);
//         }
//         }
    
// }


import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximumArray {

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k == 0) {
            return new int[0];
        }
        
        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            // Remove indices that are out of the current window
            if (!deque.isEmpty() && deque.peekFirst() == i - k) {
                deque.pollFirst();
            }

            // Remove indices whose corresponding values are less than nums[i]
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            // Add the current index to the deque
            deque.offerLast(i);

            // The first element in the deque is the maximum of the current window
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peekFirst()];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        SlidingWindowMaximumArray solution = new SlidingWindowMaximumArray();
        int[] nums = {1, 3, 1, 3, 5, 3, 6, 7};
        int k = 3;
        int[] result = solution.maxSlidingWindow(nums, k);

        // Print the result
        for (int num : result) {
            System.out.print(num + " ");
        }
        // Output: 3 3 5 5 6 7
    }
}
