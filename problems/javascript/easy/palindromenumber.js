function isPalindrome(){
    //a negative int cannot be a palindrome number
    if (x < 0) {return false;}
        
    //reverse the number
    let x_copy = x ; 
    let reversed = 0;

    while (x_copy > 0){
        reversed =((reversed * 10) + x_copy % 10);  
        x_copy = parseInt(x_copy / 10); 
    }

    reversed = parseInt(reverAsed)
    
    return (reversed === x) ? true : false; 

 }

 