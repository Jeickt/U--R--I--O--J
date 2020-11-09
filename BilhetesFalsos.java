// 1318
import java.util.Scanner;
/**
 *
 * @author JLR
 */
public class BilhetesFalsos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        while (!(n == 0 && m == 0)) {

            int[] bilhetes = new int[m];
            int falsos = 0;
            boolean verificador = false;
            
            for (int i=0; i<m; i++) {
                bilhetes[i] = sc.nextInt();
            }
            
            for (int i=1; i<=n; i++) {
                for (int j=0; j<m; j++) {
                    if (bilhetes[j] == i && !verificador)
                        verificador = true;
                    else if (bilhetes[j] == i && verificador) {
                        falsos++;
                        verificador = false;
                        break;
                    }
                }
                verificador = false;
            }
            
            System.out.println(falsos);
            
            n = sc.nextInt();
            m = sc.nextInt();
        }
        
    }
}
