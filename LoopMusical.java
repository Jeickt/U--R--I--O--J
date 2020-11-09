// 1089
import java.util.Scanner;

/**
 *
 * @author JLR
 */
public class LoopMusical {
    
    public static Scanner sc = new Scanner(System.in);
    public static int contador = 0;
    
    public static void magnitudes(int caso) {
        int[] casos = new int[caso];
        int inicial = 0, anterior = 0, atual = 0;
        for (int i=0; i<caso; i++) {
            casos[i] = sc.nextInt();
        }
        int direcaoI = 0, direcaoA = 0;
        for (int i=0; i<caso; i++) {
            if (i == 0) {
                inicial = casos[i];
            }
            else if (direcaoI == 0 && casos[i] != inicial) {
                contador += 2;
                anterior = inicial;
                atual = casos[i];
                if (atual < anterior)
                    direcaoI = -1;
                else
                    direcaoI = 1;
            }
            else if (direcaoI != 0) {
                if (direcaoA == 0) {
                    if (direcaoI < 0 && casos[i] > atual)
                        direcaoA = 1;
                    if (direcaoI > 0 && casos[i] < atual)
                        direcaoA = -1;
                }
                else {
                    if (direcaoI > 0) {
                        if (atual <= inicial && casos[i] > inicial)
                            contador += 2;
                        if (atual > inicial && direcaoA < 0 && casos[i] > atual)
                            contador += 2;
                        if (atual < inicial && direcaoA > 0 && casos[i] < atual)
                            contador += 2;
                    }
                    else {
                        if (atual >= inicial && casos[i] < inicial)
                            contador += 2;
                        if (atual < inicial && direcaoA > 0 && casos[i] < atual)
                            contador += 2;
                        if (atual > inicial && direcaoA < 0 && casos[i] > atual)
                            contador += 2;
                    } 
                    if (direcaoA > 0 && casos[i] < atual)
                        direcaoA = -1;
                    if (direcaoA < 0 && casos[i] > atual)
                        direcaoA = 1;
                }
                anterior = atual;
                atual = casos[i];
                
            }
        }
        System.out.println(contador);
    }
    
    
    public static void main(String[] args) {
        
        int caso = sc.nextInt();
        
        while (caso != 0) {
            contador = 0;
            magnitudes(caso);
            caso = sc.nextInt();
        }
    }
}
