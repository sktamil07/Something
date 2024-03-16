
public class Spy {

	public static void main(String[] args) {
		int n=22;
		int temp;
		int sum=0;
		int mul=1;
		while(n>0) {
			temp=n%10;
			sum=sum+temp;
			mul=sum*temp;
			n=n/10;
			
		}
		if(sum==mul) 
			System.out.println("this is spy number");
		else 
			System.out.println("this is not spy number");

		}

	}


