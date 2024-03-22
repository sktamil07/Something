
public class Pair {

	public static void main(String[] args) {
		int a[]= {7,8,5,6,4,3,2};
		int num=9;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==num) {
					System.out.println(a[i]+"   "+a[j]);
				}
			}
		}

	}

}
