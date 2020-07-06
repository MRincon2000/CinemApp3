/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemapp;

/**
 *
 * @author MSI PC
 */
public class Silla {
    
    private String cliente;
    private char fila;
    private int numero;
    private double precio;
    private boolean ocupado;
    private String peli;

    public Silla(char fila, int numero, String peli) {
        this.fila = fila;
        this.numero = numero;
        this.precio = 12000;
        this.ocupado=false;
        this.peli=peli;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public char getFila() {
        return fila;
    }

    public void setFila(char fila) {
        this.fila = fila;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    } 

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public String getPeli() {
        return peli;
    }
    
    
    
}
