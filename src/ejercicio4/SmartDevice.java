
package ejercicio4;

public class SmartDevice {
    
    protected String marca;
    protected String modelo;
    protected float tamanioPantalla;
    protected int memoriaInterna;

    public SmartDevice() {
    }

    public SmartDevice(String marca, String modelo, float tamanioPantalla, int memoriaInterna) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanioPantalla = tamanioPantalla;
        this.memoriaInterna = memoriaInterna;
    }
    
}
