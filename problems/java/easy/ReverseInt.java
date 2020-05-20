
class Solution {
    public int reverse(int x) {
        //set a boolean value to check if int is negative 
        //will be used to determine if interger needs to be converted in a negative int
        boolean ifNegative = false; 
                
        //if it is a negative number
        if (x < 0){
            //set flag as true
            ifNegative = true; 
            //convert it to a postive int for now
            x *= -1; 
        }
                
        //acts as total 
        long rev = 0; 
                
        while(x > 0){
            //multiply reverse by 10 with each loop 
             //this makes sure we have the right number places 
            rev = (rev * 10) + (x % 10); 
                    
            //truncate the passed in number
            x /= 10; 
        }
                
        if (rev > Integer.MAX_VALUE){
            return 0; 
        }
                
        if (ifNegative){
             return (int)(-1 * rev); 
        } else{
            return (int)(rev); 
            }
    }
}
