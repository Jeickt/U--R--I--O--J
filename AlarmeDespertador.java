// 1103
import java.util.Scanner;


/**
 *
 * @author JLR
 */
public class AlarmeDespertador {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String[] linha = sc.nextLine().split(" ");
        
        int[] hr = new int[4];
        for (int i=0; i<4; i++) {
            hr[i] = Integer.parseInt(linha[i]);
        }
        
        while (!(hr[0] == 0) && (hr[1] == 0) && (hr[2] == 0) && (hr[3] == 0))  {
            int inicio = hr[0] * 60 + hr[1];
            int fim = hr[2] * 60 + hr[3];
            if (inicio < fim)
                System.out.println(fim - inicio);
            else
                System.out.println(24*60 - inicio + fim);
            
            linha = sc.nextLine().split(" ");
            for (int i=0; i<4; i++) {
                hr[i] = Integer.parseInt(linha[i]);
            }
        }
    }
}
