// 1228
import java.util.Scanner;
/**
 *
 * @author JLR
 */
public class GridDeLargada {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        do {
            int carros = sc.nextInt();
            int trocas = 0, pos;
            int[] largada = new int[carros];
            int[] chegada = new int[carros];
            
            for (int i=0; i<carros; i++) {
                largada[i] = sc.nextInt();
            }
            for (int i=0; i<carros; i++) {
                chegada[i] = sc.nextInt();
            }
            
            for (int i=0; i<carros; i++) {
                for (int j=0; j<carros; j++) {
                    if (largada[i] == chegada[j]) {
                        trocas += j - i;
                        pos = chegada[j];
                        for (int k=0; k<j-i; k++) {
                            chegada[j-k] = chegada[j-k-1];
                        }
                        chegada[i] = pos;
                    }
                }
            }
            System.out.println(trocas);
            
        } while (sc.hasNext());
        
    }
}
