package Recursion;

public class power {

    public static int power(int n, int m )
    {

        if(m == 0)
        {
            return 1;
        }

        int powerTillMm1 = power(n,m-1);
        return powerTillMm1*n;
//        return pn;

    }

    public static void main(String[] args) {

        System.out.println(power(5,3));
    }
}
