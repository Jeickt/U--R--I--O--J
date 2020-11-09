// 1728
import java.util.Scanner;


/**
 *
 * @author JLR
 */
public class DificilDeAcreditarMasEVerdade {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String[] linha = sc.nextLine().split("[+=]");
        
        while (true) {
            String[] inversao = {"", "", ""};
            
            for (int i=0; i<3; i++) {
                for (int j=0; j<linha[i].length(); j++) {
                    inversao[i] = linha[i].substring(j, j+1) + inversao[i];
                }
            }
            
            int[] numeros = new int[3];
            for (int i=0; i<3; i++) {
                numeros[i] = Integer.parseInt(inversao[i]);
            }
            
            if (numeros[0] + numeros[1] == numeros[2])
                System.out.println("True");
            else
                System.out.println("False");
            
            if (linha[0].equals("0") && linha[1].equals("0") && linha[2].equals("0"))
                break;
            linha = sc.nextLine().split("[+=]");
        }
    }
}
