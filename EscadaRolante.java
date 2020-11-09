// 1793
import java.util.ArrayList;
import java.util.Scanner;

public class EscadaRolante {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        ArrayList<Integer> tempos = new ArrayList<>();
        int tempoDia = 0, anterior = 0;
        
	int dia = Integer.parseInt(sc.nextLine());
        String[] pessoas = sc.nextLine().split(" ");
        for (String pes : pessoas)
            tempos.add(Integer.parseInt(pes));
        
        while (true) {
            for (int i=0; i < tempos.size(); i++) {
                if (anterior == 0)
                    tempoDia += 10;
                else {
                    if (tempos.get(i) - anterior > 9)
                        tempoDia += 10;
                    else
                        tempoDia += tempos.get(i) - anterior;
                }
                anterior = tempos.get(i);
            }
            System.out.println(tempoDia);
        
            dia = Integer.parseInt(sc.nextLine());
            if (dia == 0)
                break;
            else {
                anterior = 0;
                tempoDia = 0;
                pessoas = sc.nextLine().split(" ");
                tempos.clear();
                for (String pes : pessoas)
                tempos.add(Integer.parseInt(pes));
            }
        }
        
        sc.close();	
    }
}
