public class ReverseInteger {
    
    public int reverse(int x) {
        long r = 0;
        int digit;

        while(x!=0){
            digit = x%10;
            r  = r *10+digit;
            x = x/10; 
        }
        if(r>Integer.MAX_VALUE || r<Integer.MIN_VALUE){
            return 0;  
    
        }
        return (int)r;
        
    }
}
