/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quienes;

import java.io.BufferedReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import personajes.atributosPersonajes;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;




/**
 *
 * @author ae
 */
//Heredamos los atributos, que sera el molde de los personajes.
public class QuienEs extends atributosPersonajes {
    
   
   public QuienEs(){
       super();
   }
    public QuienEs(String nombre, String sexo, String colorCabello, String bigote, String lentes, String piel, 
        String cabello){
        
    }

    //Estas variables se van a declarar ya que sera el resultado del random
    String contenido;
    String personaje1;
    String sexo1;   
    String bigote1;
    String cabello1;
    String colorCabello1;
    String lentes1;
    String piel1;
    

    //Este metodo genera el numero Random, en base al HashMap que estamos haciendo con los personajes
     public void personajeAleatorio() throws IOException{
        Map<Integer,atributosPersonajes> listaPersonajes = new HashMap<Integer,atributosPersonajes>();
        atributosPersonajes homero=new atributosPersonajes("Homero","hombre","sin color","sin bigote","sin lentes","amarillo","calvo");
        atributosPersonajes apu=new atributosPersonajes("Apu","hombre","negro","tiene bigote","sin lentes","oscura","con cabello");
        atributosPersonajes marge=new atributosPersonajes("Marge","mujer","azul","sin bigote","sin lentes","amarillo","con cabello");
        atributosPersonajes locaGatos=new atributosPersonajes("loca de los gatos","mujer","blanco","sin bigote","sin lentes","amarillo","con cabello");
        atributosPersonajes milhouse=new atributosPersonajes("Milhouse","hombre","azul","sin bigote","con lentes","amarillo","con cabello");
        atributosPersonajes nelson=new atributosPersonajes("Nelson","hombre","castaño","sin bigote","sin lentes","amarillo","con cabello");
        atributosPersonajes flanders=new atributosPersonajes("Ned","hombre","castaño","tiene bigote","con lentes","amarillo","con cabello");
        atributosPersonajes Hibbert=new atributosPersonajes("Hibbert","hombre","negro","sin bigote","sin lentes","oscura","con cabello");
        atributosPersonajes krusty=new atributosPersonajes("krusty","hombre","azul","sin bigote","sin lentes","amarillo","con cabello");
        //*Se agregan los personajes a la lista
        listaPersonajes.put(1,homero);
        listaPersonajes.put(2,marge);
        listaPersonajes.put(3,locaGatos);
        listaPersonajes.put(4,apu);
        listaPersonajes.put(5,milhouse);
        listaPersonajes.put(6,nelson);
        listaPersonajes.put(7,flanders);
        listaPersonajes.put(8,Hibbert);
        listaPersonajes.put(9,krusty);
        //Este nos sirve para poder generar el numero random en base al key del hashmap
        Object [] p=listaPersonajes.keySet().toArray();
        Object keyR = p[new Random().nextInt(p.length)];
        String personaje1= listaPersonajes.get(keyR).getNombre();
        String sexo1= listaPersonajes.get(keyR).getSexo();   
        String bigote1= listaPersonajes.get(keyR).getBigote();
        String cabello1= listaPersonajes.get(keyR).getCabello();
        String colorCabello1= listaPersonajes.get(keyR).getColorCabello();
        String lentes1= listaPersonajes.get(keyR).getLentes();
        String piel1= listaPersonajes.get(keyR).getPiel();
        
        fichero aleatorio1=new fichero();
        aleatorio1.guardarFichero(personaje1, sexo1, bigote1,cabello1,colorCabello1, lentes1, piel1); 
        
        
        
  
}
   
    
   
    public static void main(String[] args) {
      
   
        
      
    }        
    
   
    
    }
   

