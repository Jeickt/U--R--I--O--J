// 1609
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


/**
 *
 * @author JLR
 */
public class ContandoCarneirinhos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int casos = sc.nextInt();
        
        for (int i=0; i<casos; i++) {
            int carneiros = sc.nextInt();
            Set<Long> unicos = new HashSet<>();
            for (int j=0; j<carneiros; j++) {
                unicos.add(sc.nextLong());
            }
            System.out.println(unicos.size());
        }
    }
}
