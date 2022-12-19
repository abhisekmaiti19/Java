package QuestionSolve;
import java.util.*;

public class LastTwoDigitNthFibo {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();

        //genaration for 1018 limit nyh number of element
        long arr[] = new long[1018];

        // store last two digit in a array till N
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2; i<1018;i++)
        {
            //store last two digit of exact position in array of fibbo of that position
            arr[i] = ((arr[i-1]+arr[i-2])%100);
        }

        if(N <10)
        {
            System.out.println("0"+arr[N]);
        }
        else
        {
            System.out.println(arr[N]);
        }
    }
}
