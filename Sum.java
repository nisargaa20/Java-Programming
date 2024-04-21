// To find the maximum subarray sum in a given array.

// {-2,1,-3,4,-1,2,1,-1,4} ==> 1


public class Sum {
    public static void main(String[] args) {
       
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4}; // length=9
        int result = maxSumArray(arr);
        System.out.println(result);
    }

    public static int maxSumArray(int arr[]){
        int maxSum=arr[0]; //-2
        int currentSum=arr[0]; //-2
        for(int i=1;i<arr.length;i++){
            currentSum=Math.max(arr[i], currentSum+arr[i]);//1,-2,4,3,5,6,1,5
            maxSum=Math.max(currentSum,maxSum);//6

        }
        return maxSum;
    }
}



