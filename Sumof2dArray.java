
public class Sumof2dArray {

	public static void main(String[] args) {
        int [][] m1 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int [][] m2 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int [] [] result = new int[m1.length][m2.length];

        for (int i = 0;i<m1.length;i++){
            for (int j = 0;j<m2.length;j++){
                result[i][j] = m1[i][j] + m2[i][j];
            }
        }
        System.out.println("Sum of Matrix");
        for (int i = 0;i<m1.length;i++){
            for (int j=0;j<m2.length;j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
       
    }


	}


