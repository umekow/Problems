class PalindromeInt {
    public boolean isPalindrome(int x) {
        if (x < 0){
            return false; 
        }

        int x_copy = x; 
        long reversed = 0; 
            
        while(x_copy > 0){ 
            reversed = (reversed * 10) + (x_copy % 10); 
            x_copy /= 10; 
        }
        
        if((int)reversed == x){
            return true; 
        }else{
            return false; 
        }
    }
}