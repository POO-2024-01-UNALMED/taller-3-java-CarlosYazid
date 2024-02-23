package taller3.televisores;

import java.rmi.MarshalException;
import taller3.televisores.*;

public class TV {

    /*Atributes*/
    
    public Marca marca;
    public int canal = 1;
    public int precio = 500;
    public Boolean estado;
    public int volumen = 1;
    public static int numTV;
    public Control control;

    /*Constructor*/

    public TV(Marca marca,  Boolean estado){
        this.marca = marca;
        this.estado = estado;
        TV.numTV++;
    }

    /*Metodos de estado */

    public void turnOn(){estado = true;}

    public void turnOff(){estado = false;}

    /*Metodos de canal */

    public void canalUp(){if (estado) {canal = (canal < 120)? canal++ : canal;}}

    public void canalDown(){if (estado) {canal = (1 < canal)? canal-- : canal;}}

    /*Metodos de volumen */

    public void volumenUp(){if (estado) {volumen = (volumen < 7)? volumen++ : volumen;}}

    public void volumenDown(){if (estado) {volumen = (0 < volumen)? volumen-- : volumen;}}



    /*Gets and sets*/

    //Cantidad de TV's

    public static int getNumTV(){return numTV;}

    public static void setNumTV(int numTV) {TV.numTV = numTV;}

    //Marca

    public void setMarca(Marca marca){this.marca = marca;}

    public Marca getMarca(){return marca;}

    //Canal

    public void setCanal(int canal){
        if (estado) {
            if (canal > 120 || canal <= 0){
                return;
            } else {
                this.canal = canal;
            }
            
        }
    }

    public int getCanal(){return canal;}

    //Precio

    public void setPrecio(int precio){this.precio = precio;}

    public int getPrecio(){return precio;}

    //Estado

    public void setEstado(Boolean estado){this.estado = estado;}

    public Boolean getEstado(){return estado;}

    //Volumen

    public void setVolumen(int volumen){this.volumen = volumen;}

    public int getVolumen(){return volumen;}

    //Control

    public void setControl(Control control) {
        this.control = control;
        control.tv = this;
    }

    public Control getControl(){return control;}

}
