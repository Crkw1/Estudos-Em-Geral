import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class N1008{

    public static void main(String[] args) throws IOException {
            Scanner scan = new Scanner(System.in);
            int funcionario = scan.nextInt();
            int horas = scan.nextInt();
            double pagamentoPorHora = scan.nextDouble();
            double salario = pagamentoPorHora * horas;
            System.out.println("NUMBER = " + funcionario);
            System.out.println(String.format("SALARY = U$ %.2f" , salario));
    }
}