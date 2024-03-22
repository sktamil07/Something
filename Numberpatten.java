
public class Numberpatten {

	public static void main(String[] args) {
		int temp=6,count=1;
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				if(j==0) {
					System.out.print(count+" ");
					count++;
				}else {
					System.out.print(temp+" ");
					temp++;
				}
			}
			System.out.println();
		}


		

	}

}
