// 1898
import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class SomaDePropina {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        String cpfS = "", numS1 = "", numS2 = "";
        int num1f = 0, num2f = 0;
        long num1, num2;
        
        String primeiraLinha = sc.nextLine();
        String segundaLinha = sc.nextLine();
        
        for (int i=0; i<primeiraLinha.length(); i++) {
            if (cpfS.length() < 11) {
                if (Character.isDigit(primeiraLinha.charAt(i)))
                    cpfS += primeiraLinha.charAt(i);
            }
            else {
                if (Character.isDigit(primeiraLinha.charAt(i)))
                    numS1 += primeiraLinha.charAt(i);
                else if (primeiraLinha.charAt(i) == '.')
                    numS1 += primeiraLinha.charAt(i);
            }
        }
        
        for (int i=0; i<segundaLinha.length(); i++) {
            if (Character.isDigit(segundaLinha.charAt(i)))
                numS2 += segundaLinha.charAt(i);
            else if (segundaLinha.charAt(i) == '.')
                numS2 += segundaLinha.charAt(i);
        }
        
        String[] numP1 = numS1.split("\\.");
        num1 = Long.parseLong(numP1[0]);
        if (numP1.length != 1)
        	num1f = Integer.parseInt(Character.toString(numP1[1].charAt(0)) + Character.toString(numP1[1].charAt(1)));
        
        String[] numP2 = numS2.split("\\.");
        num2 = Long.parseLong(numP2[0]);
        if (numP2.length != 1)
        	num2f = Integer.parseInt(Character.toString(numP2[1].charAt(0)) + Character.toString(numP2[1].charAt(1)));;
        
        
        if (num1f + num2f > 99) {
        	num1++;
        	num1f -= 100;
        }
        
        System.out.println("cpf " + cpfS);
        System.out.print("" + (num1 + num2) + ".");
        
        if (num1f + num2f > 9)
            System.out.print(num1f + num2f);
        else if (num1f + num2f == 0)
            System.out.print("00");
        else
            System.out.print("0" + (num1f + num2f));
 
    }
 
}