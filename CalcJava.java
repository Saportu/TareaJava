import java.util.Scanner;

public class CalcJava {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Calculadora Trigonometrica ");
        System.out.println("Seleccione el tipo de operacion:");
        System.out.println("  1. Trigonometricas              (sin, cos, tan)");
        System.out.println("  2. Trigonometricas inversas     (arcsin, arccos, arctan)");
        System.out.println("  3. Trigonometricas hiperbolicas (sinh, cosh, tanh)");
        System.out.print("Opcion: ");
        int tipo = sc.nextInt();

        switch (tipo) {
            case 1:
                trigonometricas(sc);
                break;
            case 2:
                inversas(sc);
                break;
            case 3:
                hiperbolicas(sc);
                break;
            default:
                System.out.println("Opcion no valida");
        }
        sc.close();
    }
    
    public static void trigonometricas(Scanner sc) {
        System.out.println("\nSeleccione la funcion:");
        System.out.println(" 1. seno ");
        System.out.println(" 2. coseno ");
        System.out.println(" 3. tangente");
        System.out.print("Opcion: ");
        int funcion = sc.nextInt();
        
        System.out.print("Ingrese el angulo en grados: ");
        double grados = sc.nextDouble();
        double radianes = Math.toRadians(grados);

        switch (funcion) {
            case 1:
                System.out.println("El seno de " + grados + " grados es: " + Math.sin(radianes));
                break;
            case 2:
                System.out.println("El coseno de " + grados + " grados es: " + Math.cos(radianes));
                break;
            case 3:
                System.out.println("La tangente de " + grados + " grados es: " + Math.tan(radianes));
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }

    public static void inversas(Scanner sc) {
        System.out.println("\nSeleccione la funcion:");
        System.out.println(" 1. arcoseno (arcsin)");
        System.out.println(" 2. arcocoseno (arccos)");
        System.out.println(" 3. arcotangente (arctan)");
        System.out.print("Opcion: ");
        int funcion = sc.nextInt();

        double valor;

        if (funcion == 1 || funcion == 2) {
            System.out.print("Ingrese un valor entre -1 y 1: ");
            valor = sc.nextDouble();

            if (valor < -1 || valor > 1) {
                System.out.println("Error: el valor debe estar entre -1 y 1.");
                return;
            }
        } else {
            System.out.print("Ingrese un valor: ");
            valor = sc.nextDouble();
        }

        switch (funcion) {
            case 1:
                double arcsin = Math.toDegrees(Math.asin(valor));
                System.out.println("El arcoseno de " + valor + " es: " + arcsin + " grados");
                break;
            case 2:
                double arccos = Math.toDegrees(Math.acos(valor));
                System.out.println("El arcocoseno de " + valor + " es: " + arccos + " grados");
                break;
            case 3:
                double arctan = Math.toDegrees(Math.atan(valor));
                System.out.println("La arcotangente de " + valor + " es: " + arctan + " grados");
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }

    public static void hiperbolicas(Scanner sc) {
        // TODO: implementar. No tienen restricciones (sirven con cualquier numero).
        System.out.println("Operacion aun no implementada.");
    }
}