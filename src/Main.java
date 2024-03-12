import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al programa. Por favor escoja una opción:");
        System.out.println("1) Capturar dos valores, multiplicarlos, sumarlos y mostrar los resultados de forma individual");
        System.out.println("2) Solicitar nombre y edad, validar si es mayor de edad y realizar un posible cobro");
        System.out.println("3) Calcular el área de un triángulo");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1: {
                System.out.print("porfavor Ingresa el primer valor: ");
                int valor1 = scanner.nextInt();
                System.out.print("porfavor Ingresa el segundo valor: ");
                int valor2 = scanner.nextInt();
                int suma = valor1 + valor2;
                int producto = valor1 * valor2;
                System.out.println("La suma de los valores es: " + suma);
                System.out.println("El producto de los valores es: " + producto);
                break;
            }
            case 2: {

                System.out.print("porfavor Ingresa tu nombre: ");
                String nombre = scanner.next();
                System.out.print("porfavor Ingresa tu edad: ");
                int edad = scanner.nextInt();
                if (edad >= 18) {
                    int cobro = 10000 * edad;
                    System.out.println("El valor a cobrar es: " + cobro);
                } else {
                    System.out.println("Usted no genera cobro.");
                }
            }
            break;
            case 3: {
                System.out.print("porfavor Ingresa la base del triángulo: ");
                double base = scanner.nextDouble();
                System.out.print("porfavor Ingresa la altura del triángulo: ");
                double altura = scanner.nextDouble();
                double area = (base * altura) / 2;
                System.out.println("El área del triángulo es: " + area);
                break;
            }
            default:
                System.out.println("Por favor seleccione una opción válida (1, 2 o 3).");
        }
    }
}