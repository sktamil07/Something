
public class Bignumber {

	public static void main(String[] args) {
		int []a= {2,36,4,6,33,5,22,99,99,99};
		int temp;
		for(int i=0;i<a.length;i++) {
			for (int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			if(a[0]<a[i]) {
				System.out.println(a[0]);
				System.out.println(a[i]);
				break;
				
			}
		}
		
		

	}

}
