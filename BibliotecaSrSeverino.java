// 2137
import java.util.Arrays;
import java.util.Scanner;

public class BibliotecaSrSeverino {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String leitura;
        String[] livros;
        int num = Integer.parseInt(sc.nextLine());
        
        while (num > 0) {
            livros = new String[num];
            for (int i=0; i<num; i++)
                livros[i] = sc.nextLine();
        
            Arrays.sort(livros);
        
            for (int i=0; i<num; i++)
                System.out.println(livros[i]);
            
            if (!sc.hasNext())
                break;
            
            leitura = sc.nextLine();
            if (leitura.isEmpty())
                num = 0;
            else
                num =  Integer.parseInt(leitura);
        }
    }
}
