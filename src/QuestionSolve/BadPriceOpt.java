package QuestionSolve;

import java.util.Scanner;

public class BadPriceOpt {



    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        while(n-->=1)
        {
            int m= scn.nextInt();
            int[] arr = new int[m];
            int count = 0;

            for(int i = 0;i<m; i++)
            {
                arr[i] =scn.nextInt();
            }


            for(int i = m-2;i>0; i--)
            {
                if(arr[i]>arr[i+1]) count ++;
            }

            System.out.println(count);
        }

    }

}
