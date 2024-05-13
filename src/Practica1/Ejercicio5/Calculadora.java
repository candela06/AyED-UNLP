/*

 */
package Practica1.Ejercicio5;


public class Calculadora {
    private static Resultados res;
    
    
    public static Resultados maxMinPromA(int[] vec){
        int max = Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;
        double total=0;
        for(int i:vec){
            if(i>max) max=i;
            if(i<min) min=i; 
            total+=i;
        }
        Resultados r = new Resultados(min,max,total/vec.length);
        return r;
    }
    
    public static void minMaxPromB(int[]v,Resultados r){
        r.setMax(Integer.MIN_VALUE);
        r.setMin(Integer.MAX_VALUE);
        
        double total=0;
        for(int i:v){
            if(i>r.getMax()) r.setMax(i);
            if(i<r.getMin()) r.setMin(i);
            total+=i;
        }
        r.setProm(total/v.length);
    }
    
    public static void maxMinPromc(int[] vec){
        int max = Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;
        double total=0;
        for(int i:vec){
            if(i>max) max=i;
            if(i<min) min=i; 
            total+=i;
        }
        res = new Resultados();
        res.setMax(max);
        res.setMin(min);
        res.setProm(total/vec.length);
    }
    
    public static Resultados ResultadoC(){
        
        return res;
    }
}
