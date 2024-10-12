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
        Scanner input = new Scanner (System.in);
        
        //variables de almacenamiento.
        int numero1;//declaro y creo variable.
        int numero2;
        int Suma ;
        int Resta ;
        int Multiplicacion ;
        int Division ;

        System.out.println("bienvenido a la calculadora");//sirve para indicar que hace el programa.
        System.out.println(" ");
        
        char operaciones = '%';
        switch(operaciones){
            case '+':
                System.out.println("operacion de suma");
                System.out.print("coloque un numero: ");
                numero1 = input.nextInt();
                System.out.print("coloque otro numero: ");
                numero2 = input.nextInt();
                //sirve para cerrar el scanner.
                input.close();
                
                Suma = numero1 + numero2;
                System.out.println("la suma de: "+ numero1 +"+"+ numero2);
                System.out.println("la suma dio: " + Suma);
                break;
            case '-':
                System.out.println("operacion de resta");
                System.out.print("coloque un numero: ");
                numero1 = input.nextInt();
                System.out.print("coloque otro numero: ");
                numero2 = input.nextInt();
                //sirve para cerrar el scanner.
                input.close();
                
                Resta = numero1 - numero2;
                System.out.println("la resta dio: "+ Resta);
                break;
            case '*':
                System.out.println("operacion de multiplicacion");
                System.out.print("coloque un numero: ");
                numero1 = input.nextInt();
                System.out.print("coloque otro numero: ");
                numero2 = input.nextInt();
                //sirve para cerrar el scanner.
                input.close();
                
                Multiplicacion = numero1 * numero2;
                System.out.println("la multiplicacion dio: " + Multiplicacion);
                break;
            case '/': 
                System.out.println("operacion de divicion");
                System.out.print("coloque un numero: ");
                numero1 = input.nextInt();
                System.out.print("coloque otro numero: ");
                numero2 = input.nextInt();
                //sirve para cerrar el scanner.
                input.close();
                
                //sirve para no utilizar la excepcion
                if (numero2 != 0) {//sirve como reglar para cuando se quiera dividir por cero. 
                    Division = numero1 / numero2;
                    System.out.println("la division dio: " + Division);
                } else {
                    System.out.println("La división no se pudo realizar.");
                }
                break;
            default:
                System.out.println("operacion no valida");
                break;
        }
    }
    
}
