
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonatanLara
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont= 0;
        Scanner leer = new Scanner(System.in);
        String secuncia;
        System.out.println("Introdusca 12 dig.");
        secuncia= leer.nextLine();
        
            
        Fifo fifo= new Fifo(3);
        for (int i = 0; i < secuncia.length(); i++) {
            fifo.Insertar(secuncia.charAt(i));
            System.out.println(fifo.impimir());
            
             }
        
    }
    
}
