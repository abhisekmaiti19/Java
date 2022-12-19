package QuestionSolve;
import java.util.*;

public class mergedTwoSTRING {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1 = scn.next();
        String s2 = scn.next();

        String newStr = "";



        for(int i = 0; i<s1.length() ||  i<s2.length(); i++)
        {
            if(i<s1.length())
            {
                newStr += s1.charAt(i);
            }
            if(i<s2.length())
            {
                newStr += s2.charAt(i);
            }
        }

        System.out.println(newStr);










    }
}
