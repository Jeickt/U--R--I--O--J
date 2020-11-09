// 1547
import java.util.Scanner;


/**
 *
 * @author JLR
 */
public class Adivinha {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int camisetas = sc.nextInt();
        
        for (int i=0; i<camisetas; i++) {
            int alunos = sc.nextInt();
            int bingo = sc.nextInt();
            int[] tentativas = new int[alunos];
            
            for (int j=0; j<alunos; j++) {
                tentativas[j] = sc.nextInt();
            }
            
            int margem = 100;
            int vencedor = 0;
            
            for (int j=0; j<alunos; j++) {
                if (margem == 100) {
                    vencedor = j + 1;
                    margem = Math.abs(bingo - tentativas[j]);
                }
                else if (Math.abs(bingo - tentativas[j]) < margem) {
                    vencedor = j + 1;
                    margem = Math.abs(bingo - tentativas[j]);
                }
            }
            System.out.println(vencedor);
        }
    }
}
