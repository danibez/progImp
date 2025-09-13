package outros;

public class Fatorial {

    public static int fatorial(int n){
        int mult = 1;
        for (int i = 1; i <= n; i++) {
            mult = mult * i;
        }
        return mult;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fatorial(n));
    }
}
