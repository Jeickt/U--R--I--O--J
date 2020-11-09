// 2763
import java.util.ArrayList;
import java.util.Scanner;

public class EntradaSaidaCPF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] linha = sc.nextLine().split("[.-]");
                
        while (true) {       
            System.out.println(linha[0]);
            System.out.println(linha[1]);
            System.out.println(linha[2]);
            System.out.println(linha[3]);
            
            if (!sc.hasNext())
                break;
            linha = sc.nextLine().split("[.-]");
        }
    }
}
