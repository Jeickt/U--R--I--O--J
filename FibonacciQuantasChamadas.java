// 1029
import java.util.Scanner;

public class FibonacciQuantasChamadas {
    public static int chamadas = 0;
    
    private static int fibo(int num) {
        chamadas++;
        if (num == 0 || num == 1)
            return num;
        else
            return fibo(num - 1) + fibo(num - 2);
        }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int linhas = sc.nextInt();
        
        for (int i=0; i<linhas; i++) {
            int x = sc.nextInt();
            chamadas = -1;
            int fib = fibo(x);
            System.out.printf("fib(%d) = %d calls = %d\n", x, chamadas, fib);
        }
        
    }
}
