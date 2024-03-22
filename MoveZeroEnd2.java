
public class MoveZeroEnd2 {

	public static void main(String[] args) {
		int a[]= {1,2,3,0,5,0,6,0,7};
		int count=0;
		for(int i=0;i<a.length;i++)
				{
			if(a[i]!=0) {
				a[count++]=a[i];
				
			}
			}
		while(count<a.length) {
			a[count++]=0;
		}
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
	}

}
