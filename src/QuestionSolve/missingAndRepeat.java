package QuestionSolve;
import java.util.*;

public class missingAndRepeat {


    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n; i++)
        {
            arr[i] = scn.nextInt();
        }

        Arrays.sort(arr);

        for(int i = 0;i<n; i++)
        {
            System.out.print("( "+ (i+1) + " ) " + arr[i] + " - ");
        }

        int [] ans = new int[2];

        for(int i  = 0 ;i< n; i++)
        {
            if(i+1 != arr[i])
            {
                ans[0] = arr[i];
                ans[1] = i+1;


            }
        }

        System.out.println("Answer Found");

        for(int i = 0; i<2; i++)
        {
            System.out.print(ans[i] + " ");
        }


    }

}
