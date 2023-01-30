
package ejercicio4.hijas;

import ejercicio4.SmartDevice;

public class SmartPhone extends SmartDevice {
    
    public int numCamaras;
    public String sistemaOperativo;

    public SmartPhone() {
    }

    public SmartPhone(int numCamaras, String sistemaOperativo) {
        this.numCamaras = numCamaras;
        this.sistemaOperativo = sistemaOperativo;
    }

    public SmartPhone(int numCamaras, String sistemaOperativo, String marca, String modelo, float tamanioPantalla, int memoriaInterna) {
        super(marca, modelo, tamanioPantalla, memoriaInterna);
        this.numCamaras = numCamaras;
        this.sistemaOperativo = sistemaOperativo;
    }
    
    
    
}
