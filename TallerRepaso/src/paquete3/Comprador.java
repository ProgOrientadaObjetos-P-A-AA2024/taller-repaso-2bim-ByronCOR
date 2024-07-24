/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

/**
 *
 * @author utpl
 */
public class Comprador {

    private String nombres;
    private String cedula;

    public Comprador(String a, String b) {
        nombres = a;
        cedula = b;
    }

    public void establecerNombres(String n) {
        nombres = n;
    }

    public void establecerCedula(String n) {
        cedula = n;
    }

    public String obtenerNombres() {
        return nombres;
    }

    public String obtenerCedula() {
        return cedula;
    }

    @Override
    public String toString() {
        String cadena = String.format("Nombres Completos: %s\n"
                + "Cedula:%s",
                obtenerNombres(),
                obtenerCedula());
        return cadena;
    }

}
