import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//CALCULATOR
        String menu = """
                *** Bienvenido a la calculadora por consola ***
                
                Ingresa la opcion:
                
                1- SUMAR (+)
                2- RESTAR (-)
                3- Multiplicar(*)
                4- Dividir (/)
                5- Salir
                """;

        Scanner input = new Scanner(System.in);
        int opcion = 0;
        int  numero1;
        int  numero2;
//BUCLE
        while (opcion != 5){
            System.out.println(menu);
            opcion = input.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Ingresa el primer numero");
                    numero1 = input.nextInt();
                    System.out.println("ingresa el segundo numero");
                    numero2 = input.nextInt();
                    int suma = (numero1+numero2);
                    System.out.println("La suma de " + numero1 +" + " + numero2 + " es: " + suma);
                    break;

                case 2:
                    System.out.println("Ingresa el primer numero");
                    numero1 = input.nextInt();
                    System.out.println("ingresa el segundo numero");
                    numero2 = input.nextInt();
                    int resta = (numero1-numero2);
                    System.out.println("La resta de " + numero1 +" - " + numero2 + " es: " + resta);
                    break;

                case 3:
                    System.out.println("Ingresa el primer numero");
                    numero1 = input.nextInt();
                    System.out.println("ingresa el segundo numero");
                    numero2 = input.nextInt();
                    int multiplicacion = (numero1*numero2);
                    System.out.println("La multiplicacion de " + numero1 +" * " + numero2 + " es: " + multiplicacion);
                    break;

                case 4:
                    System.out.println("Ingresa el primer numero");
                    numero1 = input.nextInt();
                    System.out.println("ingresa el segundo numero");
                    numero2 = input.nextInt();
                    int divicion = (numero1/numero2);
                    System.out.println("La suma de " + numero1 +" / " + numero2 + " es: " + divicion);

                case 5:
                    break;

                default:
                    System.out.println("Ingresa una operacion correcta");
            }
        }
    } 
}