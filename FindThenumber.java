
public class FindThenumber {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9};
		int find=7;
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==find) {
				count++;
				break;
			
			}
		}if(count==1) {
			System.out.println("is found");
		}else {
			System.out.println("not found");
		}
		

	}

}