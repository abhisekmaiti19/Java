package QuestionSolve;
import java.util.*;

public class Anagram {


    public static void check(String s1, String s2)
    {

        char arr[] = s2.toCharArray();
        Arrays.sort(arr);
        s2 = new String(arr);
//        System.out.println(s2);

        for(int i = 0; i<s1.length()-s2.length()+1; i++)
        {
            String sbstr = s1.substring(i,i+s2.length());
            char a[] = sbstr.toCharArray();
            Arrays.sort(a);
            sbstr = new String(a);

            if(sbstr.equals(s2))
            {
                System.out.print(i+" ");
            }
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int m = sc.nextInt();
        String str1 = sc.next();

        check(str,str1);

    }
}
