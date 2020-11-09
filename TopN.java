// 1943
import java.util.Scanner;


/**
 *
 * @author JLR
 */
public class TopN {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
            
        int posicao = sc.nextInt();
        
        if (posicao > 50)
            System.out.println("Top 100");
        else if (posicao > 25)
            System.out.println("Top 50");
        else if (posicao > 10)
            System.out.println("Top 25");
        else if (posicao > 5)
            System.out.println("Top 10");
        else if (posicao > 3)
            System.out.println("Top 5");
        else if (posicao > 1)
            System.out.println("Top 3");
        else if (posicao == 1)
            System.out.println("Top 1");
            
    }
}
