package QuestionSolve;

import java.util.*;

public class ShuffaledArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[2*n];

        for(int i = 0; i<2*n; i++)
        {

                arr[i] = scn.nextInt();


        }
        int newArr[] = new int[2*n];
        int start = 0;
        int actual = n;

        for(int i = 0; i<2*n && start<2*n; i++)
        {
            newArr[start] = arr[i];
            newArr[start+1] = arr[actual];
            start += 2;
            actual ++;

        }

        for(int i = 0; i<2*n; i++)
        {
            System.out.print(newArr[i] + " ");
        }
    }
}
