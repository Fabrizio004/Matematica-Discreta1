
import java.util.Scanner;
public class Main {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Ingrese un numero binario de 16 bits: ");
         String binario = scanner.nextLine();
         if (binario.length() != 16) {
                System.out.println("El numero binario debe tener exactamente 16 bits.");
                return;
         }
         int decimal = Integer.parseInt(binario, 2);
         String hexadecimal = Integer.toHexString(decimal).toUpperCase();
         String octal = Integer.toOctalString(decimal);
         System.out.println("Hexadecimal: " + hexadecimal);
         System.out.println("Decimal: " + decimal);
         System.out.println("Octal: " + octal);

    }
}
