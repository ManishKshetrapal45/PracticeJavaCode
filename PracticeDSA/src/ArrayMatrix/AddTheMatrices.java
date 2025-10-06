//Add The Matrices
/*Problem Description
You are given two matrices A & B of same size, you have to return another matrix which is the sum of A and B.
Note: Matrices are of same size means the number of rows and number of columns of both matrices are equal.
The Following will give you an idea of matrix addition:

Problem Constraints:
1 <= A.size(), B.size() <= 1000 1 <= A[i].size(), B[i].size() <= 1000 1 <= A[i][j], B[i][j] <= 1000

Input Format:
The first argument is the 2D integer array A, the second argument is the 2D integer array B

Output Format:
You have to return a vector of integers after doing required operations.

Example Input:
Input 1:
A = [[1, 2, 3],
     [4, 5, 6],
     [7, 8, 9]]

B = [[9, 8, 7],
     [6, 5, 4],
     [3, 2, 1]]

Input 2:
A = [[1, 2, 3],
     [4, 1, 2],
     [7, 8, 9]]

B = [[9, 9, 7],
     [1, 2, 4],
     [4, 6, 3]]

Example Output:
Output 1:
[[10, 10, 10],
 [10, 10, 10],
 [10, 10, 10]]
Output 2:
[[10, 11, 10],
 [5,   3,  6],
 [11, 14, 12]]

Example Explanation:
Explanation 1:
A + B = [[1+9, 2+8, 3+7],
         [4+6, 5+5, 6+4],
         [7+3, 8+2, 9+1]]
      = [[10, 10, 10],
         [10, 10, 10],
         [10, 10, 10]].
Explanation 2:
A + B = [[1+9, 2+9, 3+7],
         [4+1, 1+2, 2+4],
         [7+4, 8+6, 9+3]]
      = [[10, 11, 10],
         [5,   3,  6],
         [11, 14, 12]].
*/
package ArrayMatrix;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class AddTheMatrices {
    public static void main(String[] args) {
        List<List<Integer>> A = new ArrayList<>();
        A.add(Arrays.asList(1, 2, 3));
        A.add(Arrays.asList(4, 5, 6));
        A.add(Arrays.asList(7, 8, 9));

        List<List<Integer>> B = new ArrayList<>();
        B.add(Arrays.asList(9, 8, 7));
        B.add(Arrays.asList(6, 5, 4));
        B.add(Arrays.asList(3, 2, 1));

        List<List<Integer>> ans = solve(A,B);
        for(int i=0;i<ans.size();i++)
        {
            for (int j=0;j<ans.get(i).size();j++)
            {
                System.out.print(ans.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> solve(List<List<Integer>> A, List<List<Integer>> B)
    {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < A.size(); i++)
        {
            List<Integer> l = new ArrayList<>();
            for (int j = 0; j < A.get(0).size(); j++)
            {
                l.add(A.get(i).get(j) + B.get(i).get(j));
            }
            ans.add(l);
        }
        return ans;
    }
}
