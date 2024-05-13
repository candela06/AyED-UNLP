
package Practica1.Ejercicio5;

public class Resultados {
    private int min;
    private int max;
    private double prom;

    public Resultados() {
    }

    
    public Resultados(int min, int max, double prom) {
        this.setMax(max);
        this.setMin(min);
        this.setProm(prom);
    }

    
    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public double getProm() {
        return prom;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setProm(double prom) {
        this.prom = prom;
    }

    @Override
    public String toString() {
        return "maximo: "+this.getMax()+" minimo: "+this.getMin()+" promedio: "+this.prom;
    }
    
    
}
