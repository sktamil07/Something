
public class Zero {

	public static void main(String[] args) {
		int a[]= {1,-1,2,-6,3,-4,4};
		int index=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>0) {
			int temp=a[i];
			a[i]=a[index];
			a[index]=temp;
			index++;
		}
	}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
	}
}
