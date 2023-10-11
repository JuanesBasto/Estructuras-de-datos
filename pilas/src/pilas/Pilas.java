/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilas;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Pilas {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        pila pila1 = new pila();
        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Mostrar pila");
            System.out.println("2. Añadir dato a la pila");
            System.out.println("3. Eliminar dato de la pila");
            System.out.println("4. Mostrar tamño de la pila");
            System.out.println("5. ¿La lista esta vacia?");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opcion: ");
            int opcion = scanner.nextInt();
            switch (opcion){
                case 1 -> {
                    System.out.println("Pila 1:");
                    pila1.mostrar();
                }
                case 2 -> {
                    System.out.println("Digite el dato que desea ingresar");
                    pila1.push(scanner.nextInt());
                }
                case 3 -> {
                    System.out.println("Se ha eliminado un dato de la pila");
                    pila1.pop();
                }
                case 4 -> System.out.println("El tamaño de la pila es " + pila1.getTamaño());
                case 5 -> pila1.esvacia();
                case 6 -> {
                    scanner.close();
                    System.exit(0);
                }
                default -> System.out.println("Opcion no valida. Intente nuevamente.");
            }
        }
    }
}