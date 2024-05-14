/*
  Escriba un método que realice las siguientes acciones:
■ cree una lista que contenga 3 estudiantes
■ genere una nueva lista que sea una copia de la lista del inciso i
■ imprima el contenido de la lista original y el contenido de la nueva lista
■ modifique algún dato de los estudiantes
■ vuelva a imprimir el contenido de la lista original y el contenido de la nueva lista.
¿Qué conclusiones obtiene a partir de lo realizado?
■ ¿Cuántas formas de copiar una lista existen? ¿Qué diferencias existen entre
ellas?

 */
package Practica1.Ejercicio7;


public class Estudiante {
    private String nombre;
    private String apellido;
    private String facultad;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, String facultad) {
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setFacultad(facultad);
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    
    @Override
    public boolean equals(Object obj){
        boolean result = false;
        if ((obj!=null)&&(obj instanceof Estudiante)){
            Estudiante e = (Estudiante)obj; //downcasting
            if ((this.getNombre()== e.getNombre()) && (this.getApellido()==e.getApellido()))
                result = true;
        }
        return result;
    }
}
