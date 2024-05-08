// Find if a string is a Palindrome --> True or False

import java.util.Scanner;

public class Palindrome {
    public boolean isPalindrome(String s) {
        int i = 0; // start index
        int j = s.length() - 1; //The method returns a boolean value (true if the string is a palindrome, false otherwise) 
        // end of index
        s = s.toLowerCase(); //converts the entire string to lowercase

        while (i < j) { //loop that continues as long as i is less than j. This loop compares characters from both ends of the string, moving towards the middle.
            
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            } else if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            } else {
                if (s.charAt(i) != s.charAt(j)) {
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Palindrome solution = new Palindrome();
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        boolean result = solution.isPalindrome(input);
        System.out.println("Is palindrome: " + result);
        
        scanner.close();
    }
}
