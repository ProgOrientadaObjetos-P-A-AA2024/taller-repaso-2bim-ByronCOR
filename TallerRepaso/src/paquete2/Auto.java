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
public abstract class Auto {

    protected Comprador propietario;
    protected String marca;
    protected double precioBase;
    protected double precioFinal;
    

    public Auto(Comprador a, String b, double c) {

        propietario = a;
        marca = b;
        precioBase = c;

    }

    public void establecerPropietario(Comprador n) {
        propietario = n;
    }

    public void establecerMarca(String n) {
        marca = n;
    }

    public void establecerPrecioBase(double n) {
        precioBase = n;
    }


    public abstract void calcularPrecioFinal();

    public Comprador obtenerPropietario() {
        return propietario;
    }

    public String obtenerMarca() {
        return marca;
    }

    public double obtenerPrecioBase() {
        return precioBase;
    }

    public double obtenerPrecioFinal() {
        return precioFinal;
    }

 

    @Override
    public String toString() {
        String cadena = String.format("Propietario\n%s\n"
                + "Marca:%s\n"
                + "Precio Base:%.2f",
                obtenerPropietario(),
                obtenerMarca(),
                obtenerPrecioBase());
        return cadena;
    }


    /*
    TipoSuv  
        propietario (Tipo Comprado
            marca, 
            precio base,
            precio final,
                    porcentaje adicional de seguro para personas (ejemplo 10%),
    seguro personas (el valor resultante de obtener el porcentaje de seguro de personas del precio base). 
    
    TipoSedan: 
    propietario (Tipo Comprador), 
    marca, 
    precio base, 
    precio final, 
    porcentaje de descuento, 
    valor de descuento (el valor resultante de obtener el porcentaje de descuento fijo del precio base), 
    seguro adicional de mecánico (por politica de la empresa es el 1% del precio base). 
    
    TipoCamioeneta: 
    propietario (Tipo Comprador, con atributos: nombres y cédula)
    , marca, 
    precio base, 
    precio final, 
    porcentaje de adicional fijo por importación, 
    valor de adicional fijo de importación (es el resultado de obtener el porcentaje de adicional fijo del precio base), 
    seguro adicional de mantenimiento (es el resultado de multiplicar el valor de adicional fijo de importación por 1.5).
     */
    /**
     * @return the propietario
     */
}
