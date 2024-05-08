//To rotate a given array to the right by k steps, where k is non-negative.

// {1,2,3,4,5,6,7}
//k=2
//first rotation={7,1,2,3,4,5,6}
//second rotation={6,7,1,2,3,4,5}



import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
     
        System.out.print("Enter the array values separated by space: ");
        String input = scanner.nextLine();
        String[] values = input.split(" ");
        int[] nums = Arrays.stream(values).mapToInt(Integer::parseInt).toArray();
        
   
        System.out.print("Enter the number of steps to rotate the array: ");
        int k = scanner.nextInt();
     
        rotate(nums, k);
    System.out.println("Rotated array: " + Arrays.toString(nums));
        
        scanner.close();
    }
    
    public static void rotate(int[] nums, int k) {
        // To handle cases where k is greater than array length
        k = k % nums.length;
        
        // Create a temporary array to store rotated elements
        int[] temp = new int[nums.length];
        
        // Copy elements to temporary array with rotation
        for (int i = 0; i < nums.length; i++) {
            temp[(i + k) % nums.length] = nums[i];
        }
        
        // Copy elements back to original array
        System.arraycopy(temp, 0, nums, 0, nums.length);
    }
}
