
package ejercicio4.hijas;

import ejercicio4.SmartDevice;

public class SmartWatch extends SmartDevice {
    
    public String compatibilidadSO;
    public boolean resistenteAlAgua;

    public SmartWatch() {
    }

    public SmartWatch(String compatibilidadSO, boolean resistenteAlAgua) {
        this.compatibilidadSO = compatibilidadSO;
        this.resistenteAlAgua = resistenteAlAgua;
    }

    public SmartWatch(String compatibilidadSO, boolean resistenteAlAgua, String marca, String modelo, float tamanioPantalla, int memoriaInterna) {
        super(marca, modelo, tamanioPantalla, memoriaInterna);
        this.compatibilidadSO = compatibilidadSO;
        this.resistenteAlAgua = resistenteAlAgua;
    }
    
    
    
}
