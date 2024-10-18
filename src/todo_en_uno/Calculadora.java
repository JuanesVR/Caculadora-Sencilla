/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
cuando esta el sacnner las variables no se tienen que inicializar. 
PARA LA VERSION DE calculadora espagueti dos cosas
    1 todo va en una sola clase.
    2 todo se coloca despues del main(para no tener errores).
 */
package todo_en_uno;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Calculadora {
    //logica

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //variables.
        int numero1;//declaro y creo variable.
        int numero2;
        int Suma;
        int Resta;
        int Multiplicacion;
        int Division;
        char operaciones;//variable del switch.

        System.out.println("bienvenido a la calculadora");//sirve para indicar que hace el programa.
        System.out.println(" ");
        System.out.println("menu de operacion en calculadora:\n1.suma + \n2.resta - \n3.multiplicacion * \n4.divicion / \n5.salir S ");
        System.out.print("digite simbolo de operacion que va realizar:");
        operaciones = input.next().charAt(0);//sirve solo cuando se utiliza el tipo char.

        while (true){
      /*toca colocar el menu despues del ciclo para dos cosas como: 
        1.para poder finalizar el ciclo y 
        2.para hacer varias o la misma operacion.*/
            try {
                switch (operaciones) {
                    case '+':
                        System.out.println("operacion de suma");
                        System.out.print("coloque un numero: ");
                        numero1 = input.nextInt();
                        System.out.print("coloque otro numero: ");
                        numero2 = input.nextInt();
                        //sirve para cerrar el scanner.

                        Suma = numero1 + numero2;
                        System.out.println("la suma de: " + numero1 + "+" + numero2);
                        System.out.println("la suma dio: " + Suma);
                        break;
                    case '-':
                        System.out.println("operacion de resta");
                        System.out.print("coloque un numero: ");
                        numero1 = input.nextInt();
                        System.out.print("coloque otro numero: ");
                        numero2 = input.nextInt();
                        //sirve para cerrar el scanner.

                        Resta = numero1 - numero2;
                        System.out.println("la resta de: " + numero1 + "-" + numero2);
                        System.out.println("la resta dio: " + Resta);
                        break;
                    case '*':
                        System.out.println("operacion de multiplicacion");
                        System.out.print("coloque un numero: ");
                        numero1 = input.nextInt();
                        System.out.print("coloque otro numero: ");
                        numero2 = input.nextInt();
                        //sirve para cerrar el scanner.

                        Multiplicacion = numero1 * numero2;
                        System.out.println("la multiplicacion de: " + numero1 + "*" + numero2);
                        System.out.println("la multiplicacion dio: " + Multiplicacion);
                        break;
                    case '/':
                        System.out.println("operacion de divicion");
                        System.out.print("coloque un numero: ");
                        numero1 = input.nextInt();
                        System.out.print("coloque otro numero: ");
                        numero2 = input.nextInt();
                        //sirve para cerrar el scanner.

                        Division = numero1 / numero2;
                        System.out.println("la division de: " + numero1 + "/" + numero2);
                        System.out.println("la division dio: " + Division);
                        break;
                    case 'S':
                        System.out.println("fin calculadora.");
                        input.close();//sirve para cerrar el scanner antes de salir del swicht.
                        return;
                    default:
                        System.out.println("operacion no valida");
                        break;
                }//cierre del switch.
            }//cierre del try. 
            catch (ArithmeticException e) {
                System.out.println("¡Error! No se puede dividir por cero.");
                input.nextLine();// Limpiar el buffer de entrada
            } 
            finally {
                System.out.println("gracias por usar calculadora.");
            }
        }//cierre del siclo while.
    }

}
