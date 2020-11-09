// 1618
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author JLR
 */
public class Colisao {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int casos = sc.nextInt();
        
        for (int i=0; i<casos; i++) {
            int[] cd = new int[10];
            for (int j=0; j<10; j++) {
                cd[j] = sc.nextInt(); // cd = coordenada
            }
            int[] x = new int[4];
            int[] y = new int[4];

            for (int j=0; j<8; j++) {
                if (j % 2 == 0)
                    x[j/2] = cd[j];
                else
                    y[j/2] = cd[j];
            }
            
            int xMax = Arrays.stream(x).max().getAsInt();
            int xMin = Arrays.stream(x).min().getAsInt();
            int yMax = Arrays.stream(y).max().getAsInt();
            int yMin = Arrays.stream(y).min().getAsInt();
            
            if (cd[8] >= xMin && cd[8] <= xMax && cd[9] >= yMin && cd[9] <= yMax)
                System.out.println("1");
            else
                System.out.println("0");
            
        }
    }
}
