// 1933
import java.util.Scanner;


public class TriDu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] leitura = sc.nextLine().split(" ");
        int carta1 = Integer.parseInt(leitura[0]);
        int carta2 = Integer.parseInt(leitura[1]);
        
        if (carta1 >= carta2)
            System.out.println(carta1);
        else
            System.out.println(carta2);
        
        sc.close();
    }
    
}
