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
public class HashUsuarios {
    private ListaUsuarios[] hash;

    public HashUsuarios() {
    this.hash= new ListaUsuarios[30];
    
    for(int i=0;i<hash.length;i++){
        hash[i]=new ListaUsuarios();
    }
    
    }
    
    public boolean insertar(String usuario,String correo, String nombre, String clave){
        boolean correcto=false;
        Usuario nuevo=new Usuario(usuario,nombre,correo,clave);
        
        int index =elegirIndex(usuario);  
        if(index>=0){
        hash[index].insert(nuevo);
        correcto=true;
        }
        return correcto;
        
    }
    
    public Usuario buscar(String usuario){
        int index=elegirIndex(usuario);
        Usuario actual=hash[index].buscar(usuario);
        return actual;
    }
    
    
    public boolean editar(String usuario,String ncorreo,String nnombre,String nclave){
        Usuario actual=buscar(usuario);
        actual.setNombre(nnombre);
        actual.setCorreo(ncorreo);
        actual.setClave(nclave);
        for(int i=0;i<actual.getCompradas().size();i++){
            actual.getCompradas().get(i).setCliente(nnombre);
        }
        return true;
    }
    
   
    
    
    
    
   public int elegirIndex(String usuario){
       int index=0;
       
      for(int i=0;i<usuario.length();i++){
          index=index+usuario.charAt(i)*(int)Math.pow(7,(usuario.length()-1-i));
      }
      index=index%30;
      return index;
   } 
   
}
