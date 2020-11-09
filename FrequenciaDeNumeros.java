// 1171
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


/**
 *
 * @author JLR
 */
public class FrequenciaDeNumeros {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int casos = sc.nextInt();
        Map<Integer, Integer> numeros = new TreeMap<>();
        
        for (int i=0; i<casos; i++) {
            int num = sc.nextInt();
            if (!numeros.containsKey(num))
                numeros.put(num, 1);
            else
                numeros.put(num, numeros.get(num) + 1);
        }
        
        for (Integer key : numeros.keySet()) {
            System.out.println(key + " aparece " + numeros.get(key) + " vez(es)");
        }
    }
}
