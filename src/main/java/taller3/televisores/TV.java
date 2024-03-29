package taller3.televisores;

import java.rmi.MarshalException;

/*
 *  Taller 3 Java
 *  Realizado el 23 de febrero del 2024
 *  Desarrollado por Carlos Yazid Padilla
 *  Topico: Encapsulamiento y Constructores
 * 
 *  Dependencias:
 * 
 *  - Televisores > TV
 *  - Televisores > Marca
 *  - Televisores > Control
 * 
 */

public class TV {

    /*Atributes*/
    
    protected Marca marca;
    protected int canal = 1;
    protected int precio = 500;
    protected Boolean estado;
    protected int volumen = 1;
    protected static int numTV;
    protected Control control;

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

    public void canalUp(){if (estado) {canal = (canal < 120)? canal+1 : canal;}}

    public void canalDown(){if (estado) {canal = (1 < canal)? canal-1 : canal;}}

    /*Metodos de volumen */

    public void volumenUp(){if (estado) {volumen = (volumen < 7)? volumen+1 : volumen;}}

    public void volumenDown(){if (estado) {volumen = (0 < volumen)? volumen-1 : volumen;}}



    /*Gets and sets*/

    //Cantidad de TV's

    public static int getNumTV(){return numTV;}

    public static void setNumTV(int numTV) {TV.numTV = numTV;}

    //Marca

    public void setMarca(Marca marca){this.marca = marca;}

    public Marca getMarca(){return marca;}

    //Canal

    public void setCanal(int canal){if (estado) {if (canal <= 120 && canal > 0){this.canal = canal;}}}

    public int getCanal() {return canal;}

    //Precio

    public void setPrecio(int precio){this.precio = precio;}

    public int getPrecio(){return precio;}

    //Estado

    public void setEstado(Boolean estado){this.estado = estado;}

    public Boolean getEstado(){return estado;}

    //Volumen

    public void setVolumen(int volumen){if (estado && volumen >= 0 && volumen <= 7) {this.volumen = volumen;}}

    public int getVolumen(){return volumen;}

    //Control

    public void setControl(Control control) {this.control = control; control.tv = this;}

    public Control getControl(){return control;}

} // Anti-copy: Carlos Padilla Royero