/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nodo_doble;

import java.util.Scanner;
import javax.swing.SpringLayout;

/**
 *
 * @author Usuario
 */
public class Nodo_Doble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        ListaDobleEnlazada lista = new ListaDobleEnlazada();
        
        int op;
        int num;
        do{
            System.out.println("\tMENU\n");
            System.out.println(" 1.Insertar al inicio de la lista\n 2.Insertar al final de la lista");
            System.out.println(" 3.Eliminar al inicio\n 4.Eliminar al final");
            System.out.println(" 5.Consultar lista\n 6.Tamaño de la lista\n 7.Salir");
            op=scan.nextInt();
            
            switch (op) {
                case 1:
                    System.out.print("Numero a ingresar: ");
                    num=scan.nextInt();
                    lista.insertarAlPrincipio(num);
                    break;
                
                case 2:
                    System.out.print("Numero a ingresar: ");
                    num=scan.nextInt();
                    lista.insertarAlFinal(num);
                    break;
                    
                case 3: 
                    lista.retirarAlPrincipio();
                    break;
                    
                case 4:
                    lista.retirarAlFinal();
                    break;
                    
                case 5:
                    if(lista.estaVacia()){
                        System.out.println("Lista vacia");
                    }else{
                        lista.consultar();
                        lista.consultarFinal();
                    }
                    break;
                    
                case 6:
                    System.out.println("\n Tamaño de la lista: "+ lista.longitud);
                    break;
                
                case 7:
                    System.out.println("chao");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        
        }while(op !=7);
    }
    
}
