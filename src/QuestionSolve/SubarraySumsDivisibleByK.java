package QuestionSolve;
import java.util.*;

public class SubarraySumsDivisibleByK {

    public static int check(int[]arr,int n,int k)
    {
//        <Reminder, frequency>
        HashMap<Integer, Integer> map = new HashMap<>();

        int rem = 0;
        int answer = 0;
        int freq = 1;
        int sum = 0;

        map.put(rem,freq);

        for(int i = 0; i <n; i++)
        {
            sum += arr[i];
            rem = sum%k;

            //if reminder is negative
            if(rem<0)
            {
                rem = rem+k;
            }

            if(!map.containsKey(rem))
            {
                map.put(rem,1);
            }else
            {
                answer += map.get(rem) ;
                map.put(rem,map.get(rem)+1);
            }


        }


        return answer;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n;i ++)
        {
            arr[i] = scn.nextInt();
        }

        System.out.println(check(arr,n,k));
    }
}
