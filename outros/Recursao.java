package outros;
import java.util.Scanner;

public class Recursao {

    public static double somaN(int n){
        if (n == 1)
            return 1;
        return 1.0/n + somaN(n-1);
    }

    public static int fib(int n){
        if (n == 1)
            return 0;
        else if (n == 2)
            return 1;
        else
            return fib(n-1) + fib(n-2);
    }

    static int fibo(int n)
    {
        if (n <= 1)
            return n;
     
        int a = 0, b = 1, c = 1;
        int res = 1;
    
        while (c < n)
        {
            c = a + b;
            res++;
            a = b;
            b = c;
        }
         
        return res;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long startTime = System.currentTimeMillis();
        fib(n);
        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println(duration);

        startTime = System.currentTimeMillis();
        fibo(n);
        endTime = System.currentTimeMillis();
        duration = (endTime - startTime);
        System.out.println(duration);

    }
}
