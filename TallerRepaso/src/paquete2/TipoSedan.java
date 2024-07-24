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
public class TipoSedan extends Auto {
/*
 TipoSedan: 
    propietario (Tipo Comprador), 
    marca, 
    precio base, 
    precio final, 
    porcentaje de descuento, 
    valor de descuento (el valor resultante de obtener el porcentaje de descuento fijo del precio base), 
    seguro adicional de mecánico (por politica de la empresa es el 1% del precio base). 
    */
    private double porcentajeDescuento;
    private double valorDescuento;
    private double seguro;

    public TipoSedan(Comprador a, String b, double c, double d) {
        super(a, b, c);
        porcentajeDescuento = d;

    }

    public void establecerPorcentajeDescuento(double n) {
        porcentajeDescuento = n;
    }

    public void establecerValorDescuento() {
        valorDescuento = precioBase * (porcentajeDescuento / 100);

    }

    public void establecerSeguro() {
        seguro = precioBase * 0.01;

    }

    @Override
    public void calcularPrecioFinal() {
        precioFinal = precioBase - valorDescuento + seguro;

    }

    public double obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public double obtenerValorDescuento() {
        return valorDescuento;
    }

    public double obtenerSeguro() {
        return seguro;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s\n"
                + "Porcentaje de descuento:%.2f \n"
                + "Valor de descuento: %.2f \n"
                + "Seguro adicional de mecanico:%.2f\n"
                + "Precio final:%.2f\n",
                toString(),
                obtenerPorcentajeDescuento(),
                obtenerValorDescuento(),
                obtenerSeguro(),
                obtenerPrecioFinal());
        return cadena;
    }
}
