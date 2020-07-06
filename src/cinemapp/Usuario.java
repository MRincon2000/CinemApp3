/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemapp;

import java.util.ArrayList;

/**
 *
 * @author MSI PC
 */
public class Usuario {
    private String usuario;
    private String nombre;
    private String correo;
    private String clave;
    private ArrayList<Silla> compradas;
    private Usuario next;

    public Usuario(String usuario, String nombre, String correo, String clave) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.correo = correo;
        this.clave = clave;
        this.next=null;
        this.compradas=new ArrayList<>();
    }
    
    public boolean aniadirCompra(Silla nueva){
        this.compradas.add(nueva);
        return true;
    }
    
    public boolean cancelarCompra(Silla elim){
       
        int posicion=compradas.indexOf(elim);
        if(posicion!=-1){
        this.compradas.remove(elim);
        elim.setCliente(null);
        elim.setOcupado(false);
        return true;
        }else{
            return false;
        }
    }
    
    public void editar(String nombre,String correo,String clave){
        this.nombre=nombre;
        this.clave=clave;
        this.correo=correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public ArrayList<Silla> getCompradas() {
        return compradas;
    }

    public void setCompradas(ArrayList<Silla> compradas) {
        this.compradas = compradas;
    }

    public Usuario getNext() {
        return next;
    }

    public void setNext(Usuario next) {
        this.next = next;
    }
    
    
    
    
}
