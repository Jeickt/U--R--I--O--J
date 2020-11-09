// 1893
import java.util.Scanner;


public class FasesDaLua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int penultima, ultima;
        String leitura = sc.nextLine();
        String[] linha;
        
        linha = leitura.split(" ");
        penultima = Integer.parseInt(linha[0]);
        ultima = Integer.parseInt(linha[1]);
        if (ultima <= 2)
            System.out.println("nova");
        else if (ultima >= 97)
            System.out.println("cheia");
        else if (ultima > penultima)
            System.out.println("crescente");
        else if (penultima > ultima)
            System.out.println("minguante");
        else
            System.out.println("impossível");
                
        sc.close();
    }
}
