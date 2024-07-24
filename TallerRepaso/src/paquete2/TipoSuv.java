/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

import paquete3.Comprador;

/**
 *
 * @author utpl
 */
public class TipoSuv extends Auto {

    private double porcentajeAdicional;
    private double seguro;

    public TipoSuv(Comprador a, String b, double c, double d) {
        super(a, b, c);
        porcentajeAdicional = d;
    }

    public void establecerPorcentajeAdicional(double n) {
        porcentajeAdicional = n;
    }

    public void establecerSeguro() {
        seguro = precioBase * (porcentajeAdicional / 100);

    }

    @Override
    public void calcularPrecioFinal() {
        precioFinal = precioBase + seguro;

    }

    public double obtenerPorcentajeAdicional() {
        return porcentajeAdicional;
    }

    public double obtenerSeguro() {
        return seguro;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s\n"
                + "Porcentaje Seguro:%s\n"
                + "Costo Seguro:%.2f\n"
                + "Precio Final:%.2f",
                toString(),
                obtenerPorcentajeAdicional(),
                obtenerSeguro(),
                obtenerPrecioFinal());
        return cadena;
    }
}
