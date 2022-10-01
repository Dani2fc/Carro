package ejecutable;

import java.awt.Color;

import Controlador.Controlador;
import Vista.VentanaPrincipal;
import modelo.Carro;

public class Test {
    public static void main(String[] args) {
        Carro miModelo = null;
        VentanaPrincipal miVentanaPrincipal = new VentanaPrincipal();
        Controlador miControlador = new Controlador(miVentanaPrincipal, miModelo);
        
        /*// Crear un objeto de tipo carro usando el constructor sin parámetros
        Carro carro1 = new Carro();
        carro1.setColor("Green");
        System.out.println("Color: "+ carro1.getColor());
        System.out.println("Número de ruedas: "+ carro1.getNumRuedas());
        System.out.println("Pos X: "+ carro1.getPosX());
        System.out.println("Pos Y: "+ carro1.getPosY());
        System.out.println("Velocidad: "+ carro1.getVelocidad());

        System.out.println("--------------------------");

        System.out.println(carro1);

        // Crear un objeto de tipo carro usando constructor con parámetros
        Carro carro2 = new Carro("Blanco",10,100);
        carro2.acelerar();
        System.out.println(carro2);

        Carro[] misCarros = new Carro[2];
        misCarros[0] = carro1;
        misCarros[1] = carro2;*/
    }
}