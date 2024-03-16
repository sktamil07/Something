	import java.io.*;

public class SumofdigutRecrction {

	// Recursive java program to 
	// find sum of digits of a number

	
		// Function to check sum 
		// of digit using recursion
		static int SumofdigutRecrction(int n)
		{ 
			if (n == 0)
				return 0;
			return (n % 10 + SumofdigutRecrction(n / 10));
		}

		// Driven Program to check above
		public static void main(String args[])
		{
			int num = 12345;
			int result = SumofdigutRecrction(num);
			System.out.println("Sum of digits in " + 
							num + " is " + result);
		
	}

	// This code is contributed by Anshika Goyal.

}
