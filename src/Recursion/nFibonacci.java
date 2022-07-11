package Recursion;
import java.util.*;

public class nFibonacci {


    public static int fibbo(int n)
    {

        if(n == 0)
        {
            return 0;
        }

        if(n == 1)
        {
            return 1;
        }


        int fibn1 = fibbo(n-1);
        int fibn2 = fibbo(n-2);
        int fibn = fibn1+fibn2;

        System.out.print(fibn+" ");

        return fibn;
    }

    public static void main(String[] args) {

        System.out.println(fibbo(5));

    }
}
