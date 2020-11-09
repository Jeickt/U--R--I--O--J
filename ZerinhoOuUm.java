// 1467
import java.util.Scanner;
/**
 *
 * @author JLR
 */
public class ZerinhoOuUm {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            String[] disputa = sc.nextLine().split(" ");
            if (disputa[0].equals(disputa[1]) && disputa[1].equals(disputa[2]))
                System.out.println("*");
            else if (disputa[0].equals(disputa[1]))
                System.out.println("C");
            else if (disputa[0].equals(disputa[2]))
                System.out.println("B");
            else
                System.out.println("A");
        }
    }
}
