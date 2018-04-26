package geeksForGeeksEasy;
import java.util.Scanner;
import java.util.ArrayList;

/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Author  : Joseph Leovao
 * Date    : April 25, 2018
 * Filename: SubarrayWithGivenSum.java
 * Problem : Given an unsorted array of non-negative integers, find a 
 *          continuous sub-array which adds to a given number.
 *          
 * Input   : The first line of input contains an integer T denoting the number
 *           of test cases. Then T test cases follow. Each test case consists 
 *           of two lines. The first line of each test case is N and S, where 
 *           N is the size of array and S is the sum. The second line of each 
 *           test case contains N space separated integers denoting the array 
 *           elements.
 *
 * Output  : Corresponding to each test case, in a new line, print the starting
 *           and ending positions of first such occurring subarray if sum equals
 *           to subarray, else print -1.
 * 
 * Note    : Position of 1st element of the array should be considered as 1.
 * 
 * Expected Time Complexity: O(n)
 * 
 * Constraints: 1 ≤   T  ≤ 100
 *             1 ≤   N  ≤ 100
 *             1 ≤ an array element ≤ 200
 * 
 * Example:
 * Input:
 * 2
 * 5 12
 * 1 2 3 7 5
 * 10 15
 * 1 2 3 4 5 6 7 8 9 10
 * Output:
 * 2 4
 * 1 5
 * Explanation:
 * In first test case, sum of elements from 2nd position to 4th position is 12.
 * In the 2nd test case, sum of elements from 1st position to 5th is 15.
 * 
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

public class SubarrayWithGivenSum {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		// ArrayList to hold solutions
		ArrayList<Integer> solution = new ArrayList<Integer>();
		int numTestCases = input.nextInt();
		
		for (int t = 0; t < numTestCases; t++) {
			// Retrieve input
			// N : Size of array
			int N = input.nextInt();
			// S : Sum 
			int S = input.nextInt();
			// Get elements of array for current test case
			int[] c = new int[N];
			for (int index = 0; index < N; index++) {
				c[index] = input.nextInt();
			}
			// start and end are two index
			int start = 0, end = 0, sum = c[start];
			boolean found = false;
			// If first element is the sum, we're done
			if (sum == S) {
				found = true;
			}
			else {
				sum = c[start];
			}
			// Iterate through array
			while (sum != S && !found) {
				// If the indexes are the same, the sum is the c[either index]
				if (start == end) {
					sum = c[start];
				}
				// Else, sum is the sum of subarray.
				sum = 0;
				for (int index = start; index <= end; index++) {
					sum += c[index];
				}
				// If sum is less than S, increment the end pointer.
				if (sum < S) {
					end++;
				}
				// If sum is greater than S, increment the start pointer.
				else if (sum > S) {
					start++;
				}
				else {
					found = true;
					break;
				}
				
				// Out of bounds check
				if (end >= N) {
					break;
				}
			} // end while loop
			
			// Add to solution arrayList with index + 1
			if (found) {
				solution.add(start + 1);
				solution.add(end + 1);
			}
			else {
				solution.add(-1);
			}
		} // end test case
		// Avoid resource leak
		input.close();
		// Print solutions for each test case
		for (int index = 0; index < solution.size(); index++) {
			if (solution.get(index) != -1) {
				System.out.println(solution.get(index) + " " + 
			                       solution.get(index+1));
				index++;
			}
			else {
				// Always -1
				System.out.println(solution.get(index));
			}
		}
		
	}
}