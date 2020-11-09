// 1901
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


/**
 *
 * @author JLR
 */
public class Borboletas {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int tamMatriz = sc.nextInt();
        Set<Integer> borboletas = new HashSet<>();
        
        int[][] floresta = new int[tamMatriz][tamMatriz];
        
        for (int i=0; i<tamMatriz; i++) {
            for (int j=0; j<tamMatriz; j++) {
                floresta[i][j] = sc.nextInt();
            }
        }
        
        for (int i=0; i<tamMatriz*2; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            borboletas.add(floresta[x][y]);
        }
        
        System.out.println(borboletas.size());
        
    }
}
