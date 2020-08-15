import java.util.Arrays;

public class MergeSortedArray {
	
		   
	    public void merge(int[] num1, int m1, int[] num2, int n2) {
	        
	    System.arraycopy(num2, 0, num1, m1, n2);
	   
	        //array sort for num1
	        
	    Arrays.sort(num1);
	  
	        
	    }
	}

