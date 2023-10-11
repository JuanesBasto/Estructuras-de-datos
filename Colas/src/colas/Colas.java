/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colas;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author basto
 */
public class Colas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        cola fifo = new cola();
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Agregar dato a la cola");
            System.out.println("2. Eliminar dato de la cola");
            System.out.println("3. Mostrar cola");
            System.out.println("4. Mostrar tamano de la pila");
            System.out.println("5. Verificar vacio");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opcion: ");
            int opcion = scanner.nextInt();
            limpiarConsola();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Digite el dato que desea ingresar");
                    fifo.push(scanner.nextInt());
                }
                case 2 -> {
                    System.out.println("Se ha eliminado un dato de la pila");
                    fifo.pop();
                }
                case 3 -> {
                    System.out.println("Pila 1:");
                    fifo.mostrar();
                }
                case 4 ->
                    System.out.println("El tamaño de la pila es " + fifo.getTamaño());
                case 5 ->
                    fifo.esVacia();
                case 6 -> {
                    scanner.close();
                    System.exit(0);
                }
                default ->
                    System.out.println("Opcion no valida. Intente nuevamente.");
            }
        }
    }

    public static void limpiarConsola() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
