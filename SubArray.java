
public class SubArray {
	public static void main(String args[]) {
	  int [] a = {2,3,6,2,5,6};
      int [] b = {2,3,6,7};

      for (int i = 0;i<a.length;i++){
          int j;
          for (j = 0;j<b.length;j++){
              if(a[i+j]!=b[j]){
                  break;
              }
          }
          if(j == b.length){
              System.out.println("Subset Array");
              break;
          } else {
              System.out.println("Not Subset Array");
              break;
          }
      }
  }

}
