package taller3.televisores;



public class Control {

    /*Atributos*/
    
    protected TV tv;

    /*Metodos*/

    //TV

    public void turnOn() {tv.turnOn();}

    public void turnOff() {tv.turnOff();}

    public void canalUp() {tv.canalUp();}

    public void canalDown() {tv.canalDown();}

    public void volumenUp() {tv.volumenUp();}

    public void volumenDown() {tv.volumenDown();}

    public int getCanal() {return tv.getCanal();}
    
    public void setCanal(int canal) {tv.setCanal(canal);}

    public void setVolumen(int volumen){tv.setVolumen(volumen);}

    public int getVolumen(){return tv.getVolumen();}

    //Instancia
    
    public void enlazar(TV tv){
        this.tv = tv;
        tv.control = this;
    }

    /*Gets and Sets*/

    public void setTv(TV tv){
        this.tv = tv;
        tv.control = this;
    }

    public TV getTv(){return tv;}
    
} // Anti-copy: Carlos Yazid Padilla Royero