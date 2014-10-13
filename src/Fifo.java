/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonatanLara
 */
public class Fifo {
    
    private Nodo sig,frente,ultimo;
    char dato;
    char matriz[];
    int marco;
    
    
    public Fifo(int x){
       marco = x;
       matriz = new char[x];
        for (int i = 0; i < matriz.length; i++) {
          matriz[i]=' ';
         }
        frente = ultimo = null;
    }
    public void Insertar(char x){
    Nodo nuevo;
        if (frente==null) {
            nuevo = new Nodo(x, null);
            frente = ultimo = nuevo;
            InsertarM(x);
        }else{
            if (Existe(x)) {
                //no hace nada
            }else{
                if (Tamaaño()) {
                    InsertarM(x);
                    nuevo= new Nodo(x, null);
                    ultimo.sig=nuevo;
                    ultimo=nuevo;
                    
                }else{
                    SacarM(Sacar());
                    InsertarM(x);
                    nuevo = new Nodo(x, null);
                    ultimo.sig= nuevo;
                    ultimo=nuevo;
                }
            }
        }
    }

    public void InsertarM(char x) {
       
        boolean ban= true;
        int i =0;
        while(ban){
            if (matriz[i]==' ') {
                matriz[i]=x;
               
                ban=false;
            }i++;
          }
       
    }

    public boolean Existe(char x) {
      Nodo aux = frente;
      while(aux!=null){
          if (aux.dato==x) {
              return true;
          }
          aux =aux.sig;
      }return false;
    }

    public boolean Tamaaño() {
        boolean ban = true;
        int i =0;
        while(ban&&i<marco){
            if (matriz[i]==' ') {
                
             //   ban = false;
                return true;
            }
            i++;
        }
        return false;
    }
    char Sacar(){
    Nodo aux= frente;
    frente = frente.sig;
    return aux.dato;
    }
    public void SacarM(char x){
        boolean ban=true;
        int i=0;
        while(ban){
            if (matriz[i]==x) {
                matriz[i]=' ';
                ban =false;
            }
            i++;
        }
    }
    String impimir(){
        String salida="";
        for (int i = 0; i < matriz.length; i++) {
            salida+=matriz[i]+"|";
            
        }
        return salida;
    }
}
