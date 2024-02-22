package taller3.televisores;

public class Marca {

    /*Atributos*/

    protected String nombre;

    /*Constructor*/
    
    public Marca(String nombre){
        this.nombre = nombre;
    }


    /*Gets and sets*/

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
}