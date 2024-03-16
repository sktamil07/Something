
public class SpyNumber {

	public static void main(String[] args) {
		//GCD of Number
		int a=98;
		int b=106;
		while(b>0) {
			int temp=0;
			temp=a%b;
			a=b;
			b=temp;
			}
		System.out.println(a);
	}
}

