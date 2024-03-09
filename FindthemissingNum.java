
public class FindthemissingNum {

  public static void main(String[] args) {
      int [] num = {1,2,3,4,6};
      int sum1 = 0;

      for (int i = 0;i<num.length;i++){
          sum1 = sum1 + num[i];
      }
     System.out.println(sum1);
      int sum2 = 0;
      for (int i = 1;i<=5;i++){
          sum2 = sum2 + i;
      }
     System.out.println(sum2);
      System.out.println("Missing Number: " + (sum2 -sum1));
  }
}