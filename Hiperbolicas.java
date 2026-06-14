import java.util.Scanner;

public class Hiperbolicas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora de operaciones hiperbolicas");
        System.out.println("Seleccione la funcion:");
        System.out.println(" 1. seno hiperbolico (sinh)");
        System.out.println(" 2. coseno hiperbolico (cosh)");
        System.out.println(" 3. tangente hiperbolica (tanh)");
        System.out.print("Opcion: ");
        int funcion = sc.nextInt();

        System.out.print("Ingrese el valor: ");
        double valor = sc.nextDouble();

        switch (funcion) {
            case 1:
                double sinh = Math.sinh(valor);
                System.out.println("El seno hiperbolico de " + valor + " es: " + sinh);
                break;
            case 2:
                double cosh = Math.cosh(valor);
                System.out.println("El coseno hiperbolico de " + valor + " es: " + cosh);
                break;
            case 3:
                double tanh = Math.tanh(valor);
                System.out.println("La tangente hiperbolica de " + valor + " es: " + tanh);
                break;
            default:
                System.out.println("Opcion no valida");
        }

        sc.close();
    }
}