//recursion and iteration(loop) -- determine time-complexity of both the approaches.

//Recursion approach

public class Factorial {
    public static int factorial(int n){
        if (n<=1)
        {
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }

    public static void main(String[] args){
        int number =5;
        int result=factorial(number);
        System.out.println("Factorial of " + number+ " is " + result);
    }
}

// Iterative approach

class Main {
    public static void main(String[] args) {
        int fact=1;
        int num=5;
        if(num<=1){
            System.out.println(fact);
        }
        else{
            for(int i=2;i<=num;i++){
                fact=fact*i;
            }
            System.out.println(fact);
        }
    }
}