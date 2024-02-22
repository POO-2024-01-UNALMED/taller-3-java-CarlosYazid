package taller3.televisores;

import java.rmi.MarshalException;
import taller3.televisores.Marca;

public class TV {

    /*Atributes*/
    
    private Marca marca;
    private int canal;
    private int precio;
    private Boolean estado;
    private int volumen;

    /*Constructor*/

    public TV(Marca marca, int canal, int precio, Boolean estado, int volumen){
        this.marca = marca;
        this.canal = canal;
        this.precio = precio;
        this.estado = estado;
        this.volumen = volumen;

    }











    /*Gets and sets*/

    public void setMarca(Marca marca){
        this.marca = marca;
    }

    public Marca getMarca(){
        return marca;
    }

    public void setCanal(int canal){
        this.canal = canal;
    }

    public int getCanal(){
        return canal;
    }

    public void setPrecio(int precio){
        this.precio = precio;
    }

    public int getPrecio(){
        return precio;
    }

    public void setEstado(Boolean estado){
        this.estado = estado;
    }

    public Boolean getEstado(){
        return estado;
    }

    public void setVolumen(int volumen){
        this.volumen = volumen;
    }

    public int getVolumen(){
        return volumen;
    }

}
