public class Fibonacci {
    public static void printFibonacci(int N) {
        if (N <= 0) {
            System.out.println("Please give a number greater than 0");
            return;
        }
        
        int a = 0, b = 1;
        System.out.print(a + " " + b);
        
        for (int i = 2; i < N; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
        
        System.out.println();
    }
    
    public static void main(String[] args) {
        int N = 10;
        printFibonacci(N);
    }
}
