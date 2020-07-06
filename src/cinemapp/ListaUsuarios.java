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
public class ListaUsuarios {
    
 private Usuario head;

    public ListaUsuarios() {
        this.head = null;
    }
 
public boolean insert(Usuario nuevo ) {
boolean inserted;
Usuario ptr;
Usuario prev;
inserted = false;
ptr = head;
prev = null;
while(ptr != null && ptr.getUsuario().compareTo(nuevo.getUsuario())<0) {

prev = ptr;
ptr = ptr.getNext();
}
if(ptr == null || !ptr.getUsuario().equals(nuevo.getUsuario())) {
inserted = true;
Usuario newp = nuevo;
newp.setNext(ptr);
if(prev == null)
head = newp;
else
prev.setNext(newp);
}
return inserted;
}

public boolean delete(String usuario){
    boolean deleted=false;
    Usuario ptr=head;
    Usuario prev=null;
    boolean found=false;
while(ptr!=null && ptr.getUsuario().compareTo(usuario)<0){
    prev=ptr;
    ptr=ptr.getNext();
}
if (ptr.getUsuario().equals(usuario)){
    deleted=true;
    if (prev==null){
       head=ptr.getNext();
    }
    else{
    prev.setNext(ptr.getNext());
    }
}
return deleted;
}

public Usuario buscar(String usuario){
    Usuario p= head;
    while(p!=null){
        if(p.getUsuario().equals(usuario)){
            break;
        }
        else{
            p=p.getNext();
        }
        
    }
    return p;
}






    public Usuario getHead() {
        return head;
    }
    
 
}
