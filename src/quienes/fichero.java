/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quienes;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import quienes.QuienEs;
import quienes.juegoBase;

/**
 *
 * @author ae
 */
public class fichero extends QuienEs{

    public fichero() {
        super();
    }
    
/*los metodos que empiezan por la palabra obtener, sirven para que en base al personaje generado en el random
  y se guardara en el fichero obtenga cada atributo por separado  
    
*/
public void obtenerCabello()throws IOException{
    
    String contenido;
    FileReader archivo = null;
    archivo = new FileReader("QuienEs.txt");
    BufferedReader buffer = new BufferedReader(archivo);
    while ((contenido = buffer.readLine())!=null){
            if(contenido.contains("calvo")){
                
                JOptionPane.showMessageDialog(null,"Es calvo/a");
                System.out.println("Es calvo");
            }     
            if(contenido.contains("con cabello")){
                
                JOptionPane.showMessageDialog(null,"Tiene cabello");
                System.out.println("Tiene cabello");
            }else{
                
            }
    }          
}

public void obtenerPiel()throws IOException{
    
    String contenido;
    FileReader archivo = null;
    archivo = new FileReader("QuienEs.txt");
    BufferedReader buffer = new BufferedReader(archivo);
    while ((contenido = buffer.readLine())!=null){
            if(contenido.contains("amarillo")){
                
                JOptionPane.showMessageDialog(null,"Tiene piel amarilla");
                System.out.println("tiene piel amarilla");} 
            if(contenido.contains("oscura")){
                
                JOptionPane.showMessageDialog(null,"Tiene piel oscura");
                System.out.println("tiene piel oscura");
            }else{
                
            }
            
    }
}   
public void obtenerLentes()throws IOException{
    String contenido;
    FileReader archivo = null;
    archivo = new FileReader("QuienEs.txt");
    BufferedReader buffer = new BufferedReader(archivo);
    while ((contenido = buffer.readLine())!=null){
            if(contenido.contains("sin lentes")){
                JOptionPane.showMessageDialog(null,"no tiene lentes");
                System.out.println("No tiene lentes");}
            if(contenido.contains("con lentes")){
                JOptionPane.showMessageDialog(null,"Tiene lentes");
                System.out.println("con lentes");
            } else{
                
            }
    }
}   
    
public void obtenerBigote()throws IOException{
    String contenido;
    FileReader archivo = null;
    archivo = new FileReader("QuienEs.txt");
    BufferedReader buffer = new BufferedReader(archivo);
    while ((contenido = buffer.readLine())!=null){
            if(contenido.contains("sin bigote")){
                JOptionPane.showMessageDialog(null,"no tiene bigote");
                System.out.println("No tiene bigote");}
            if(contenido.contains("tiene bigote")){
                JOptionPane.showMessageDialog(null,"Tiene bigote");
                System.out.println("Tiene bigote");
            }else{
                
            }  
    }
}    

public void ObtenerColorCabello()throws IOException{
    String contenido;
    FileReader archivo = null;
    archivo = new FileReader("QuienEs.txt");
    BufferedReader buffer = new BufferedReader(archivo);
    while ((contenido = buffer.readLine())!=null){
            if(contenido.contains("sin color")){
                JOptionPane.showMessageDialog(null,"tiene color de cabello");
                System.out.println("No tiene cabello");
            } if(contenido.contains("negro")){
                JOptionPane.showMessageDialog(null,"Tiene cabello negro");
                System.out.println("Es negro");
            }if(contenido.contains("azul")){
                JOptionPane.showMessageDialog(null,"Tiene cabello azul");
                System.out.println("Es azul");
            }if(contenido.contains("blanco")){
                JOptionPane.showMessageDialog(null,"Tiene cabello blanco");
                System.out.println("Es blanco");
            }if(contenido.contains("castaño")){
                JOptionPane.showMessageDialog(null,"Tiene cabello castaño");
                System.out.println("Es castaño");
            }else{
               
            }}
}
public void obtenerGenero()throws IOException{
    
    String contenido;
    FileReader archivo = null;
    archivo = new FileReader("QuienEs.txt");
    BufferedReader buffer = new BufferedReader(archivo);
    while ((contenido = buffer.readLine())!=null){
            if(contenido.contains("hombre")){
                JOptionPane.showMessageDialog(null,"Es hombre");
                System.out.println("Es hombre");
            } if(contenido.contains("mujer")){
                JOptionPane.showMessageDialog(null,"Es Mujer");
                System.out.println("Es Mujer");
            }
        }
    
    }
    
   

//Estte metodo sirve para poder guardar el dichero en base al personaje guardado en el fichero

public void guardarFichero(String personaje1, String sexo1,String bigote1,String cabello1,String colorCabello1,String lentes1,String piel1)throws IOException{
      this.personaje1=personaje1;
      this.sexo1=sexo1;
      this.bigote1=bigote1;
      this.cabello1=cabello1;
      this.colorCabello1=colorCabello1;
      this.lentes1=lentes1;
      this.piel1=piel1;
      
      FileWriter escritura=null;
      PrintWriter print1= null;
      
        try {
             
        escritura = new FileWriter ("QuienEs.txt");
        escritura.write(personaje1);
        escritura.write("  ");
        escritura.write(sexo1);
        escritura.write("  ");
        escritura.write(bigote1);
        escritura.write("  ");
        escritura.write(cabello1);
        escritura.write("  ");
        escritura.write(colorCabello1);
        escritura.write("  ");
        escritura.write(lentes1);
        escritura.write("  ");
        escritura.write(piel1);
        escritura.write("");
        JOptionPane.showMessageDialog(null, "Buena suerte");
        System.out.println("hola "+ personaje1 + " " +" " +sexo1+" " + bigote1 + "  "+
                cabello1+"  "+ colorCabello1);
        

    } catch (IOException e) {
        System.out.println("" + e.toString());
        e.printStackTrace();
    }
        finally{
            
            try{
                escritura.close();
                 
                
                }catch(IOException e2){
                    System.out.println("" + e2.toString());

                }
            }
}
}