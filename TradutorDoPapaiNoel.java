// 1763
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 *
 * @author JLR
 */
public class TradutorDoPapaiNoel {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Map<String, String> tradutor = new HashMap<>();
        
        tradutor.put("brasil", "Feliz Natal!");
        tradutor.put("alemanha", "Frohliche Weihnachten!");
        tradutor.put("austria", "Frohe Weihnacht!");
        tradutor.put("coreia", "Chuk Sung Tan!");
        tradutor.put("espanha", "Feliz Navidad!");
        tradutor.put("grecia", "Kala Christougena!");
        tradutor.put("estados-unidos", "Merry Christmas!");
        tradutor.put("inglaterra", "Merry Christmas!");
        tradutor.put("australia", "Merry Christmas!");
        tradutor.put("portugal", "Feliz Natal!");
        tradutor.put("suecia", "God Jul!");
        tradutor.put("turquia", "Mutlu Noeller");
        tradutor.put("argentina", "Feliz Navidad!");
        tradutor.put("chile", "Feliz Navidad!");
        tradutor.put("mexico", "Feliz Navidad!");
        tradutor.put("antardida", "Merry Christmas!");
        tradutor.put("canada", "Merry Christmas!");
        tradutor.put("irlanda", "Nollaig Shona Dhuit!");
        tradutor.put("belgica", "Zalig Kerstfeest!");
        tradutor.put("italia", "Buon Natale!");
        tradutor.put("libia", "Buon Natale!");
        tradutor.put("siria", "Milad Mubarak!");
        tradutor.put("marrocos", "Milad Mubarak!");
        tradutor.put("japao", "Merii Kurisumasu!");
        
        while (sc.hasNext()) {
            String linha = sc.nextLine();
            if (tradutor.containsKey(linha))
                System.out.println(tradutor.get(linha));
            else
                System.out.println("--- NOT FOUND ---");
        }
    }
}
