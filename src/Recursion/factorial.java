package Recursion;
import java.util.*;

public class factorial {

    public static int factorial(int n)
    {
        if(n == 0)
        {
            return 1;
        }

        int factTillNm1 = factorial(n-1);
        return n*factTillNm1;
    }

    public static void main(String[] args) {

        System.out.println(factorial(6));

    }
}
