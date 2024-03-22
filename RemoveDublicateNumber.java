
public class RemoveDublicateNumber {
	
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,1,2,3,4};
		int count=1;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[i]==a[j]&& i!=j) {
					count++;
				} 
				if(count==1) {
					System.out.println(a[i]);
					break;
				}
			}
		}
	}
}
