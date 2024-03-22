
public class NegativeEndofLast {
	 public static void main(String[] args) {
	        int [] num = {-1,-2,35,45,-3,-4,87,4,5,6};
	        int index=0;

    	        for (int i = 0;i<num.length;i++){
    	        	while(num[i]>0) {
    	        	int temp=num[i];
    	        	num[i]=num[index];
    	        	num[index]=temp;
    	        	index++;
	           
	            }
    	        }
	        for (int i = 0;i<num.length;i++){
	            System.out.print(num[i] + " ");
	        }
	    }
	

}
