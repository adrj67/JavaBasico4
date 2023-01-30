
package ejercicio4;

import ejercicio4.hijas.SmartPhone;
import ejercicio4.hijas.SmartWatch;

public class Main {

    public static void main(String[] args) {
        
        //System.out.println("Creacion de SmartPhone - Motorola ============");
        SmartPhone motorola = new SmartPhone(2, "Android 10", "Motorola", "AZ22", 6.5f, 32);
        System.out.print("Marca: " + motorola.marca + " ");
        System.out.print("Modelo: " + motorola.modelo + " ");
        System.out.print("Memoria Interna: " + motorola.memoriaInterna + " ");
        System.out.print("Tamaño de la Pantalla: " + motorola.tamanioPantalla + " ");
        System.out.print("Numero de Camaras: " + motorola.numCamaras + " ");
        System.out.println("Sistema Operativo: " + motorola.sistemaOperativo);
        
        //System.out.println("Creacion de SmartPhone - Samsung ============");
        SmartPhone samsung = new SmartPhone(2, "Android 9", "Samsung", "A13", 6.9f, 128);
        System.out.print("Marca: " + samsung.marca + " ");
        System.out.print("Modelo: " + samsung.modelo + " ");
        System.out.print("Memoria Interna: " + samsung.memoriaInterna + " ");
        System.out.print("Tamaño de la Pantalla: " + samsung.tamanioPantalla + " ");
        System.out.print("Numero de Camaras: " + samsung.numCamaras + " ");
        System.out.println("Sistema Operativo: " + samsung.sistemaOperativo);
        
        //System.out.println("Creacion de SmartWatch - Haylou ============");
        SmartWatch haylou = new SmartWatch("Android 4.4, iOS 8.0", true, "Haylou", "LS05", 1.28f, 4);
        System.out.print("Marca: " + haylou.marca + " ");
        System.out.print("Modelo: " + haylou.modelo + " ");
        System.out.print("Memoria Interna: " + haylou.memoriaInterna + " ");
        System.out.print("Tamaño de la Pantalla: " + haylou.tamanioPantalla + " ");
        System.out.print("Resistente al agua?: " + haylou.resistenteAlAgua + " ");
        System.out.println("Sistemas Operativos compatibles: " + haylou.compatibilidadSO);
        
        //System.out.println("Creacion de SmartWatch - Genérica P12 ============");
        SmartWatch generica = new SmartWatch("Android 8.4, iOS 6.0", false, "Genérica", "P12", 1.15f, 4);
        System.out.print("Marca: " + generica.marca + " ");
        System.out.print("Modelo: " + generica.modelo + " ");
        System.out.print("Memoria Interna: " + generica.memoriaInterna + " ");
        System.out.print("Tamaño de la Pantalla: " + generica.tamanioPantalla + " ");
        System.out.print("Resistente al agua?: " + generica.resistenteAlAgua + " ");
        System.out.println("Sistemas Operativos compatibles: " + generica.compatibilidadSO);
               
    }
    
}
