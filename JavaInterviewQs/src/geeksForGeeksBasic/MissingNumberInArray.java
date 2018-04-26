package geeksForGeeksBasic;
import java.util.Scanner;

/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Author      : Joseph Leovao
 * Date        : April 24, 2017
 * Filename    : MissingNumberInArray.java
 * Problem     : Given an array of size n-1 and given that there are numbers from 
 *               1 to n with one missing, the missing number is to be found.
 *           
 * Input       : The first line of input contains an integer T denoting the
 *               number of test cases. 
 *               The first line of each test case is N.
 *               The second line of each test case contains N-1 input C[i], 
 *               numbers in array. 
 *           
 * Output      : Print the missing number in array.
 * 
 * Constraints : 1 ≤   T  ≤ 200
 *               1 ≤   N  ≤ 1000
 *               1 ≤ C[i] ≤ 1000
 * 
 * Example :
 * Input
 * 2
 * 5
 * 1 2 3 5
 * 10
 * 1 2 3 4 5 6 7 8 10
 * Output
 * 4
 * 9
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
public class MissingNumberInArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numTestCases = input.nextInt();
		int[] solutionArray = new int[numTestCases];
		
		for(int x = 0; x < numTestCases; x++) {
			int sum = 0;
			int n = input.nextInt();
			
			// Initialize array as the input before
			// solving the problem.
			int[] c = new int[1000];
			for(int index = 0; index < n - 1; index++) {
				c[index] = input.nextInt();
				
			}
			// Solution
			//Get sum of input array
			for(int i = 0; i < n - 1; i++) {
				sum += c[i];
			}
			// Calculate expected sum
			int expectedSum = (1 + n) * n / 2;
			int missingValue = expectedSum - sum;
			solutionArray[x] = missingValue;
		}
		// Avoid resource leak
		input.close();
		for(int solIndex = 0; solIndex < numTestCases; solIndex++) {
			System.out.println(solutionArray[solIndex]);
		}
	}

}

