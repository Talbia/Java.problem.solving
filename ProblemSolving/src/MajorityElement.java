// show majority element 
public class MajorityElement {

	    public int majorityElement(int[] nums) {
	    
	        int majorityCount = nums.length/2;

	        for (int number : nums) {
	            int count = 0;
	            for (int element : nums) {
	                if (element == number) {
	                    count += 1;
	                }
	            }

	            if (count > majorityCount) {
	                return number;
	            }

	        }

	        return -1;    
	    }
	}
	        
	    

