package QuestionSolve;
import java.util.*;

public class BadPrices {

    public static void check()
    {
        Scanner scn = new Scanner(System.in);


    }

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

            for(int i = 0;i<m; i++)
            {
                for(int j = i+1; j<m;j++)
                {
                    if(arr[j] < arr[i])
                    {
                        count++;
                        break;

                    }
                }
            }

            System.out.println(count);
        }

    }
}
