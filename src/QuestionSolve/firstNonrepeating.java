package QuestionSolve;
import java.util.*;

public class firstNonrepeating {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<str.length();i++)
        {
            char cr = str.charAt(i);
            map.put(cr, map.getOrDefault(cr, 0)+1);
        }
        for(int i = 0; i<str.length();i++)
        {
            char cr = str.charAt(i);
            if(map.get(cr) == 1)
            {
                System.out.println(cr); return;
            }
        }

        System.out.println(-1);
    }
}
