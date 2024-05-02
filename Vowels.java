//Given a string "Capable", replace all the vowels on the even positions with '*'

public class Vowels {
    public static void main(String[] args) {
        String s="capable";
        String temp="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if ((c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') & (i%2 !=0))
        {
            temp=temp+"*";

        }
else{
    temp=temp+c;

}
            }
            System.out.println(temp);
        }

    }
    
