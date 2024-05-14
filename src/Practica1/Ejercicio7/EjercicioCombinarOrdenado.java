
package Practica1.Ejercicio7;
import java.util.*;
public class EjercicioCombinarOrdenado {
    public ArrayList<Integer> combinarOrdenado(ArrayList<Integer> lista1, ArrayList<Integer> lista2){
        ArrayList<Integer> newList = new ArrayList<Integer>(lista1);
        newList.addAll(lista2);
        Collections.sort(newList);
        return newList;
    }
    
    public static void main(String[]args){
        ArrayList<Integer> lista1= new ArrayList<Integer>();
        lista1.add(5);
        lista1.add(71);
        lista1.add(102);
        lista1.add(67);
        
        ArrayList<Integer> lista2 = new ArrayList<Integer>();
        lista2.add(51);
        lista2.add(45);
        lista2.add(15);
        lista2.add(9);
        
        EjercicioCombinarOrdenado combinar = new EjercicioCombinarOrdenado();
        ArrayList<Integer> newlist = combinar.combinarOrdenado(lista1, lista2);
        
        for(int i: newlist){
            System.out.println(i);
        }
    }
}
