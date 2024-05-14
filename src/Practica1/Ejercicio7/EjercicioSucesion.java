
package Practica1.Ejercicio7;
import java.util.*;

public class EjercicioSucesion {
    
    public List<Integer> calcularSucesion (int n){
        List<Integer> sucesion = new ArrayList<Integer>();
        sucesion.add(n);
        if (n==1) return sucesion;
        else{
            if(n%2==0){
                sucesion.addAll(calcularSucesion(n/2));
            }
            else sucesion.addAll(calcularSucesion(3*n+1));
        }
        return sucesion;
    }
    public static int sumarLinkedList(LinkedList<Integer> lista){
        return sumarLinkedListRecursivo(lista,0);
    }
    
    public static int sumarLinkedListRecursivo(LinkedList<Integer> lista, int indice){   
        if (indice==lista.size()) return 0;
        else{
            int actual = lista.get(indice);
            return actual + sumarLinkedListRecursivo(lista,indice+1);
        }
    }
    
    public static void main(String[]args){
        LinkedList<Integer> lista = new LinkedList<Integer>();
        lista.add(2);
        lista.add(3);
        lista.add(5);
        
        System.out.println(sumarLinkedList(lista));
    }

}
