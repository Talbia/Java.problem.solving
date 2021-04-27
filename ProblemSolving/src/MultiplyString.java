
public class MultiplyString {
	
	    public String multiply(String num1, String num2) {
	        int n1 = num1.length(); 
	        int n2 = num2.length();
	        int[] product = new int [n1 + n2];
	        int currentIndex = product.length-1;

	        for(int i = n1-1; i >= 0; i--) {
	            int index = currentIndex--;

	            for(int j = n2-1; j >= 0; j--) {
	                int a = num1.charAt(i) - '0';
	                int b = num2.charAt(j) - '0';
	                int result = a * b + product[index];
	                product[index] = result % 10;
	                product[--index] += result / 10;
	            }
	        }
	        
	        StringBuilder sb = new StringBuilder();
	        
	        for(int num : product) {
	            if(num == 0 && sb.length() == 0) 
	                continue;
	            sb.append(num);
	        }
	        
	        if(sb.length() == 0) return "0";
	        return sb.toString();
	    }
	}

