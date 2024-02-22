package taller3.televisores.TVs;

import taller3.televisores.TVs.TV;

public class Control {

    /*Atributos*/
    
    private TV tv;

    /*Metodos*/

    //TV

    public void turnOn() {tv.turnOn();}

    public void turnOff() {tv.turnOff();}

    public void canalUp() {tv.canalUp();}

    public void canalDown() {tv.canalDown();}

    public void volumenUp() {tv.volumenUp();}

    public void volumenDown() {tv.volumenDown();}

    //Instancia
    
    public void enlazar(TV tv){
        this.tv = tv;
        tv.control = this;
    }

    /*Gets and Sets*/

    public void setTV(TV tv){this.tv = tv;}

    public TV getTV(){return tv;}
    
}
