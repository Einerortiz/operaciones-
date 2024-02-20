import java.util.Scanner;
public class necio{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double suma, resta, multiplicacion, division, valor1, valor2, valor3, valor4, valor5;

        System.out.println("Ingreses el primer valor:");
        valor1 = scanner.nextDouble();
        System.out.println("Ingreses el segundo valor:");
        valor2 = scanner.nextDouble();
        System.out.println("Ingreses el tercer valor:");
        valor3 = scanner.nextDouble();
        System.out.println("Ingreses el cuarto valor:");
        valor4 = scanner.nextDouble();
        System.out.println("Ingreses el quinto valor:");
        valor5 = scanner.nextDouble();

        suma = valor1 + valor2;
        resta =  valor3 - valor4;
        multiplicacion = valor1 * valor4;
        division = (valor4 / (valor1 ));

        System.out.println("La suma de los valor's es: " + suma);
        System.out.println("La rests de los valor's es: " + resta);
        System.out.println("El resultado de la multiplication es: " + multiplicacion);
        System.out.println("El resultado de la division es: " + division);
    }
}