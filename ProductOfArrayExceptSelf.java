// Product of array except self: given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

// ex: Input: nums = [1,2,3,4], output:[24,12,8,6]


// class Productnum {
    
//     public static void main(String[] args) {
//         int arr[]={1,2,3,4};
//         int arr1[]=new int[arr.length];
//         int temp=1;
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr.length;j++){
//                 if(i!=j){
//                     temp=temp*arr[j];
//                 }
//             }
//                 arr1[i]=temp;
//                 temp=1;
//         }
//         for(int i=0;i<arr.length;i++){
//             System.out.println(arr1[i]);
//         }
//     }
// }

public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        // Calculate left products
        answer[0] = 1;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        // Calculate right products and final result
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * right;
            right *= nums[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        ProductOfArrayExceptSelf solution = new ProductOfArrayExceptSelf();
        int[] nums = {1, 2, 3, 4};
        int[] result = solution.productExceptSelf(nums);

        // Print the result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
