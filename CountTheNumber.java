
public class CountTheNumber {

	public static void main(String[] args) {
		 int [] arr = {2,4,5,2,2,6,6,7};
	        int [] vArr = new int[arr.length];
	        int visited = -1;

	        for (int i = 0;i<arr.length;i++){
	            int count = 1;
	            for (int j = i+1;j<arr.length;j++){
	                if(arr[i]==arr[j]){
	                    count++;
	                    vArr[j] = visited;
	                }
	            }
	            if(vArr[i]!=visited){
	                vArr[i]=count;
	            }
	        }
	        for (int i = 0;i<vArr.length;i++){
	            if(vArr[i]!=visited){
	                System.out.println(arr[i]+" is "+vArr[i]+" times ");
	            }
	        }



	}

}
