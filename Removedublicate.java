
public class Removedublicate {

	public static void main(String[] args) {
		int a[]= {2,3,4,5,6,7,3,5};
		for(int i=0;i<a.length;i++) {
			int j;
			for(j=0;j<a.length;j++) {
				if(a[i]==a[j] && i!=j) {
					break;
				}
			}
			if(j==a.length) {
				System.out.println(a[i] + "");
			}
		}

	}

}
