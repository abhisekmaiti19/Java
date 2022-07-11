package ExtraPackages;
import java.util.*;

public class Reverse_Integer {

    public static int reverseUsingStack(int n)
    {
        if(n == 0) return 0;
        if(n >= Math.pow(-2,31) || n >= (Math.pow(-2,31) - 1) ) {
            Stack<Integer> st = new Stack<>();
            Stack<Integer> Finalst = new Stack<>();

            while (n > 0) {
                int myNum = n % 10;
                n = n / 10;
                st.push(myNum);
            }
            while (!st.empty()) {
                Finalst.push(st.pop());
            }
            int check = 1;
            int finalnum = 0;
            if (Finalst.peek() == 0) Finalst.pop();

            while (!Finalst.empty()) finalnum = finalnum * 10 + Finalst.pop();

            return finalnum;
        }
        return 0;
    }
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int flagNeg = 0;
        if(n<0)
        {
            n = -n;
            flagNeg = 1;
        }
        int my_reverse = reverseUsingStack(n);

        if(flagNeg == 1)
        {
            my_reverse = - my_reverse;
        }

        System.out.println(my_reverse);
    }
}