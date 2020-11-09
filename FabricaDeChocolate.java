// 1573
import java.util.Scanner;


/**
 *
 * @author JLR
 */
public class FabricaDeChocolate {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[] paralel = new int[3];
        for (int i=0; i<3; i++) {
            paralel[i] = sc.nextInt();
        }
        
        while (!(paralel[0] == 0 && paralel[1] == 0 && paralel[2] == 0)) {
            int volume = paralel[0] * paralel[1] * paralel[2];
            int aresta = (int) Math.cbrt((double) volume);
            System.out.println(aresta);
            
            for (int i=0; i<3; i++) {
            paralel[i] = sc.nextInt();
            }
        }
    }
}
