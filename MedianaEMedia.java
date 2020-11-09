// 1379
import java.util.Scanner;

public class MedianaEMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] linha = sc.nextLine().split(" ");
	int a = Integer.parseInt(linha[0]);; 
	int b = Integer.parseInt(linha[1]);;
        
        while (true) {
            if (a == 0 && b == 0)
                break;
            else
                System.out.println(a-(b-a));
        
        linha = sc.nextLine().split(" ");
        a = Integer.parseInt(linha[0]);
        b = Integer.parseInt(linha[1]);
        }
        
        sc.close();	
    }
}
