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
public class TipoCamioneta extends Auto {

    /*TipoCamioeneta: 
    propietario (Tipo Comprador, con atributos: nombres y cédula)
    , marca, 
    precio base, 
    precio final, 
    porcentaje de adicional fijo por importación, 
    valor de adicional fijo de importación (es el resultado de obtener el porcentaje de adicional fijo del precio base), 
    seguro adicional de mantenimiento (es el resultado de multiplicar el valor de adicional fijo de importación por 1.5).
     */
    private double porcentajeAdiImportacion;
    private double valorAdiImportacion;
    private double seguro;

    public TipoCamioneta(Comprador a, String b, double c, double d) {
        super(a, b, c);
        porcentajeAdiImportacion = d;

    }

    public void establecerPorcentajeAdicional(double n) {
        porcentajeAdiImportacion = n;
    }

    public void establecerValorAdiImportacion() {
        valorAdiImportacion = precioBase * (porcentajeAdiImportacion / 100);

    }

    public void establecerSeguro() {
        seguro = valorAdiImportacion * 1.5;

    }

    @Override
    public void calcularPrecioFinal() {
        precioFinal = precioBase + seguro;

    }

    public double obtenerPorcentajeAdicional() {
        return porcentajeAdiImportacion;
    }

    public double obtenerValorAdiImportacion() {
        return valorAdiImportacion;
    }

    public double obtenerSeguro() {
        return seguro;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s\n"
                + "Porcentaje de adicional fijo por importación:%.2f \n"
                + "Valor de adicional fijo de importación %.2f \n"
                + "Seguro adicional de mantenimiento:%.2f\n"
                + "Precio final:%.2f\n",
                toString(),
                obtenerPorcentajeAdicional(),
                obtenerValorAdiImportacion(),
                obtenerSeguro(),
                obtenerPrecioFinal());
        return cadena;
    }
}
