
public class PlusOneArray {
	
	//plus one for the last element of array

	    public int[] plusOne(int[] digits) {
	         
	    int n = digits.length;

	    // move along the input array starting from the end
	   
	        for (int id = n - 1; id >= 0; --id) {
	    
	        // set all the nines at the end of array
	      if (digits[id] == 9) {
	        digits[id] = 0;
	      }
	      // here we have the rightmost not-nine
	      else {
	        // increase this rightmost not-nine by 1 
	        digits[id]++;
	       
	          // return otherwise
	        return digits;
	      }
	    }
	   
	    digits = new int[n + 1];
	    digits[0] = 1;
	    return digits;
	 }

}
	        
	  

