/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listasenlazadassimple;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author basto
 */
public class ListasEnlazadasSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaEnlazada list = new ListaEnlazada();
        
         
        Scanner in = new Scanner(System.in);
        String dato;
        
        int op = 0;
        while(op!= 9){
            menu();
            op = in.nextInt();
            in.nextLine();
        switch (op){
            case 1:
                if(list.isEmpty()){
                    System.out.println("la lista esta vacia");
                }else{
                    System.out.println("la lista contiene elementos");
                }
                
                break;
                
            case 2:
                System.out.println("Digite un dato");
                dato = in.nextLine();
                list.insertarCabeza(dato);
                break;
            case 3:
                System.out.println("Digite un dato");
                dato = in.nextLine();
                list.insertarCola(dato);
                break;
            case 4:
                System.out.println("que dato desea eliminar");
                String delete = in.nextLine();
                list.Eliminar(delete);
                break;
            case 5:
                list.eliminarInicio();
                break;
            case 6: 
                list.eliminarFinal();
                break;
            case 7:
                list.Visualizar();
                break;
            case 8:
                int tamaño = list.obtenerLongitud();
                System.out.println(" El tamaño de la lista es "+tamaño);
                break;
            case 9:
                System.exit(0);
                break;
            default:
                System.out.println("Digite una opcion valida");
                break;
                
                     
        }
        }
        

    }

    public static void menu() {
        System.out.println("1. Verificar vacio");
        System.out.println("2. insertar al inicio");
        System.out.println("3. insertar al final");
        System.out.println("4. eliminar dato");
        System.out.println("5. eliminar al inicio");
        System.out.println("6. ELiminar al final");
        System.out.println("7. Recorrer");
        System.out.println("8. tamaño de la lista");
        System.out.println("9. Salir");

    }

}
