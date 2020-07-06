/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemapp;

import java.util.*;
import java.io.*;

/**
 *
 * @author MSI PC
 */
public class CinemApp {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here

    
    
    }

    
 public static void detener() throws InterruptedException {
     Thread.sleep(1000);
 }   
   public static CineArbol fileIn(CineArbol cine)throws FileNotFoundException, IOException{
       File fileIn= new File("Almacenamiento.txt");
       
       Scanner ingreso=new Scanner(fileIn);

       
       while(ingreso.hasNext()){
          String datos=ingreso.nextLine();
          Scanner sc= new Scanner(datos).useDelimiter(",");
           String nombre= sc.next();
           String genero= sc.next();
           int duracion=Integer.parseInt(sc.next());
           
           PeliAr p=new PeliAr(nombre);
           p.setDuracion(duracion);
           p.setGenero(genero);
           cine.insertPeliculaClase(p);
           
           for(int i=0;i<7;i++){
               datos=ingreso.nextLine();

               Scanner sc2=new Scanner(datos).useDelimiter(",");
               
              for(int u=0;u<100;u++){
                  String cliente=sc2.next();
                  if(!cliente.equals(" ")){
                  p.getHorarios()[i].ComprarSilla(cliente, u);
                  }
              }
           
           }
           
           
           
       }
       
     return cine;  
   } 
   
   public static void fileOut(CineArbol cine) throws IOException{
       File almacen= new File("Almacenamiento.txt");

       try{
       if(!almacen.exists()){
           almacen.createNewFile();
       }
       cine.traverseInFile(almacen);
     
       }catch(IOException e){
           System.out.println("No se pudo crear el archivo");
       }
       
   }
   public static void PrintOut(CineArbol cine){
       
       cine.traverseInPrint();
     

       
   }
   
   
   
   
}
