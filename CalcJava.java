import java.util.Scanner; //biblioteca para leer datos de la terminal

public class CalcJava {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in); //creamos un objeto Scanner para leer datos de la terminal
        System.out.println("Calculadora Trigonometrica ");
        System.out.println("Seleccione el tipo de operacion:");
        System.out.println("  1. Trigonometricas              (sin, cos, tan)");
        System.out.println("  2. Trigonometricas inversas     (arcsin, arccos, arctan)");
        System.out.println("  3. Trigonometricas hiperbolicas (sinh, cosh, tanh)");
        System.out.print("Opcion: ");
        int tipo = sc.nextInt(); //leemos la opcion del usuario y la almacenamos en la variable tipo

        switch (tipo) { //viene de la libreria y es un metodo para comparar el valor de tipo con los casos que se le indiquen
            case 1:
                trigonometricas(sc); //si el valor de tipo es 1, se llama al metodo trigonometricas y se le pasa el objeto Scanner para que pueda leer datos de la terminal
                break;
            case 2:
                inversas(sc);
                break;
            case 3:
                hiperbolicas(sc); //si el valor de tipo es 3, se llama al metodo hiperbolicas y se le pasa el objeto Scanner para que pueda leer datos de la terminal
                break;
            default:
                System.out.println("Opcion no valida"); //si el valor de tipo no es 1, 2 o 3, se imprime un mensaje indicando que la opcion no es valida
        }
        sc.close(); //cerramos el objeto Scanner
    }
    //metodo para calcular las funciones trigonometricas
    public static void trigonometricas(Scanner sc) {
        System.out.println("\nSeleccione la funcion:");
        System.out.println(" 1. seno ");
        System.out.println(" 2. coseno ");
        System.out.println(" 3. tangente");
        System.out.print("Opcion: ");
        int funcion = sc.nextInt(); // lee cual de las tres funciones quiere
        
        System.out.print("Ingrese el angulo en grados: ");
        double grados = sc.nextDouble(); //double para permitir decimales, nextDouble para leer un numero decimal, se almacena en la variable grados
        double radianes = Math.toRadians(grados); //convertimos los grados a radianes usando el metodo toRadians de la clase Math y lo almacenamos en la variable radian
// java opera con radianes, por eso es necesario convertir los grados a radianes antes de calcular las funciones trigonometricas
        switch (funcion) {
// se escribe + grados +  sirve para unir texto, mete el valor de la variable grados dentro del texto, lo mismo con radianes, se mete el valor de la variable radianes dentro del texto
            case 1:
                System.out.println("El seno de " + grados + " grados es: " + Math.sin(radianes)); //calculamos el seno usando el metodo sin de la clase Math y lo imprimimos
                break;
            case 2:
                System.out.println("El coseno de " + grados + " grados es: " + Math.cos(radianes)); //calculamos el coseno usando el metodo cos de la clase Math y lo imprimimos
                break;
            case 3:
                System.out.println("La tangente de " + grados + " grados es: " + Math.tan(radianes)); //calculamos la tangente usando el metodo tan de la clase Math y lo imprimimos
                break;
            default:
                System.out.println("Opcion no valida"); //si el valor de funcion no es 1, 2 o 3, se imprime un mensaje indicando que la opcion no es valida
        }
    }
// metdo para calcular operaciones inversas 
    public static void inversas(Scanner sc) {

        System.out.println("\nSeleccione la funcion:");
        System.out.println(" 1. arcoseno (arcsin)");
        System.out.println(" 2. arcocoseno (arccos)");
        System.out.println(" 3. arcotangente (arctan)");
        System.out.print("Opcion: ");
        int funcion = sc.nextInt(); // Lee la funcion que se quiere relizar dependiendo de la razón trigonométrica

        double valor; // Variable donde se almacenará el valor ingresado
// arcsin y arcoss solo aceptan valores entre -1 y 1
        if (funcion == 1 || funcion == 2) { 
            System.out.print("Ingrese un valor entre -1 y 1: ");
            valor = sc.nextDouble(); // Lee el número decimal

            // Valida que el valor esté en el rango permitido
            if (valor < -1 || valor > 1) {
                System.out.println("Error: el valor debe estar entre -1 y 1.");
                return; // sale del método si el valor no es válido
            }
        } else {
            System.out.print("Ingrese un valor: ");
            valor = sc.nextDouble(); // Lee el número decimal
        }

        switch (funcion) {
            case 1:
                double arcsin = Math.toDegrees(Math.asin(valor)); // Calcula el arcoseno (asin) y lo convierte de radianes a grados
                // Muestra el resultado
                System.out.println("El arcoseno de " + valor + " es: " + arcsin + " grados");
                break;
            case 2:
                double arccos = Math.toDegrees(Math.acos(valor)); // Calcula el arcocoseno (acos) y convierte a grados
                // Muestra el resultado
                System.out.println("El arcocoseno de " + valor + " es: " + arccos + " grados");
                break;
            case 3:
                double arctan = Math.toDegrees(Math.atan(valor)); // Calcula el arcotangente (atan) y convierte a grados
                // Muestra el resultado
                System.out.println("La arcotangente de " + valor + " es: " + arctan + " grados");
                break;
            default:
                System.out.println("Opcion no valida"); // Si el usuario ingresa una opción no válida
        }
    }

    public static void hiperbolicas(Scanner sc) { //metodo para calcular las funciones hiperbolicas
        System.out.println("\nSeleccione la funcion:");
        System.out.println(" 1. seno hiperbolico (sinh)");
        System.out.println(" 2. coseno hiperbolico (cosh)");
        System.out.println(" 3. tangente hiperbolica (tanh)");
        System.out.print("Opcion: ");
        int funcion = sc.nextInt();

        System.out.print("Ingrese el valor: ");
        double valor = sc.nextDouble(); // Lee el número decimal para calcular las funciones hiperbolicas

        switch (funcion) {
            case 1:
                double sinh = Math.sinh(valor); // Calcula el seno hiperbolico usando el metodo sinh de la clase Math
                System.out.println("El seno hiperbolico de " + valor + " es: " + sinh);
                break;
            case 2:
                double cosh = Math.cosh(valor);// Calcula el coseno hiperbolico usando el metodo cosh de la clase Math
                System.out.println("El coseno hiperbolico de " + valor + " es: " + cosh);
                break;
            case 3:
                double tanh = Math.tanh(valor); // Calcula la tangente hiperbolica usando el metodo tanh de la clase Math
                System.out.println("La tangente hiperbolica de " + valor + " es: " + tanh);
                break;
            default:
                System.out.println("Opcion no valida"); // Si el usuario ingresa una opción no válida
        }
    }
}