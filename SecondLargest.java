public class SecondLargest {
    public static int findSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            System.out.println("Array must have at least two elements.");
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] < first) {
                second = arr[i];
            }
        }
        
        return second;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 7, 0, 5, 9, 2};
        int secondLargest = findSecondLargest(array);
        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("The second largest element is: " + secondLargest);
        }
    }
}
