
package Practica1.Ejercicio2;
public class claseEj2 {
    
    public static int[] multiplos(int n){
        int array[] = new int[n];
        int aux= 0;
        
        for(int i=0;i<n;i++){
            array[i] = n+aux;
            aux+=n;
        }
        return array;
    }
}
