package QuestionSolve;
import java.sql.SQLOutput;
import java.util.*;

public class MostRequentWordInaArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        HashMap<String,Integer>mp = new HashMap<>();
        String[] stArr = new String[N];
        for(int i = 0; i<N; i++)
        {
            String str = sc.next();
            stArr[i]  = str;
            mp.put(str,(mp.getOrDefault(str,0)+1));
        }

        int maxValue = Collections.max(mp.values());
        for(int i = 0 ;i<N;i++)
        {
            if (mp.get(stArr[i]) == maxValue )
            {
                System.out.println(stArr[i]);
                return;
            }
        }



    }
}
