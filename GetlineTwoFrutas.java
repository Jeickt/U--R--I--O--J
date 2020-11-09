// 1217
import java.util.Locale;
import java.util.Scanner;


/**
 *
 * @author JLR
 */
public class GetlineTwoFrutas {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int dias = Integer.parseInt(sc.nextLine()), kg = 0;
        double precoTotal = 0.0;
        
        for (int i=0; i<dias; i++) {
            precoTotal += Double.parseDouble(sc.nextLine());
            String[] frutas = sc.nextLine().split(" ");
            kg += frutas.length;
            System.out.printf("day %d: %d kg\n", i+1, frutas.length);
        }
        
        double mediaKg = (double) kg/dias;
        double mediaPreco = (double) precoTotal/dias;
        
        System.out.printf("%.2f kg by day\n", mediaKg);
        System.out.printf("R$ %.2f by day\n", mediaPreco);
    }
}
