// 2455
import java.util.Scanner;


/**
 *
 * @author JLR
 */
public class Gangorra {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[] gangorra = new int[4];
        
        for (int i=0; i<4; i++) {
            gangorra[i] = sc.nextInt();
        }
        
        if (gangorra[0] * gangorra[1] > gangorra[2] * gangorra[3])
            System.out.println("-1");
        else if (gangorra[0] * gangorra[1] < gangorra[2] * gangorra[3])
            System.out.println("1");
        else
            System.out.println("0");
        
    }
}
