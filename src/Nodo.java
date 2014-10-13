/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonatanLara
 */
public class Nodo {
    Nodo sig;
    char dato;
   
    Nodo(char x, Nodo enlace){
       sig = enlace;
       dato = x;
   }
}
