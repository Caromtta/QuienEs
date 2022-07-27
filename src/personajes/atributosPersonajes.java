/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personajes;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.swing.JLabel;

//Creamos el molde de los personajes


public class atributosPersonajes {
   
   public String nombre;
   public String sexo;
   public String colorCabello;
   public String bigote;
   public String lentes;
   public String piel;
   public String cabello;
   

public atributosPersonajes(){
   nombre=null;
   sexo=null;
   colorCabello=null;
   bigote=null;
   lentes=null;
   piel=null;
   cabello=null;
}
   

public atributosPersonajes (String nombre, String sexo, String colorCabello, String bigote, String lentes, String piel, 
        String cabello){
    this.nombre = nombre;
    this.sexo = sexo;
    this.colorCabello = colorCabello;
    this.bigote = bigote;
    this.lentes = lentes;
    this.piel = piel;
    this.cabello = cabello;
    
}

    
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre (){
        return nombre;
    }

    public void setSexo (String sexo){
        this.sexo = sexo;
    }
    public String getSexo(){
        return sexo;
    }
    public void setColorCabello (String colorCabello){
        this.colorCabello = colorCabello;
    }
    public String getColorCabello(){
        return colorCabello;      
    }
    public void setBigote (String bigote){
        this.bigote = bigote;
    }
    public String getBigote(){
        return bigote;      
    }
    public void setLentes (String lentes){
        this.lentes = lentes;
    }
    public String getLentes(){
        return lentes;      
    }
    public void setPiel (String piel){
        this.piel = piel;
    }
    public String getPiel(){
        return piel;      
    }
    public void setCabello (String cabello){
        this.cabello = cabello;
    }
    public String getCabello(){
        return cabello;      
    }

@Override
    public String toString() {
        return "atributosPersonajes{" + "nombre=" + nombre + ", sexo=" + sexo + ", colorCabello=" + colorCabello + ", bigote=" + bigote + ", lentes=" + lentes + ", piel=" + piel + ", cabello=" + cabello + '}';
    }
    
/*public void personajeRandom(){
        Map<Integer,atributosPersonajes> listaPersonajes = new HashMap<Integer,atributosPersonajes>();
        atributosPersonajes homero=new atributosPersonajes("Homero","hombre","no","no","no","amarillo","calvo");
        atributosPersonajes apu=new atributosPersonajes("Apu","hombre","negro","si","no","oscura","si");
        atributosPersonajes marge=new atributosPersonajes("Marge","mujer","azul","no","no","amarillo","si");
        atributosPersonajes locaGatos=new atributosPersonajes("loca de los gatos","mujer","blanco","no","no","amarillo","si");
        atributosPersonajes milhouse=new atributosPersonajes("Milhouse","hombre","azul","no","si","amarillo","si");
        atributosPersonajes nelson=new atributosPersonajes("Nelson","hombre","castaño","no","no","amarillo","si");
        atributosPersonajes flanders=new atributosPersonajes("Ned","hombre","castaño","si","si","amarillo","si");
        atributosPersonajes Hibbert=new atributosPersonajes("Hibbert","hombre","negro","no","no","oscura","si");
        atributosPersonajes krusty=new atributosPersonajes("krusty","hombre","azul","no","no","amarillo","si");
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
       
        
        Object [] p=listaPersonajes.keySet().toArray();
        Object key = p[new Random().nextInt(p.length)];
        System.out.println( listaPersonajes.get(key));
}*/
public void definirSexo(){
    if(sexo == "Mujer"){
        System.out.println("Si, es mujer");
    }if(sexo == "Hombre"){
        System.out.println("Si, es hombre");
    }else {
        
    }  
}
  
    

public void definirColorCabello(){
    if(colorCabello == "Negro"){
        System.out.println("Es color negro");
    }if (colorCabello == "Gris") {
        System.out.println ("Es color gris");
    } if (colorCabello == "Azul"){
        System.out.println("Es color azul");
    }if (colorCabello == "cafe"){
        System.out.println("Es color azul");
    }if (colorCabello == "No tiene"){
        System.out.print("No tiene cabello");
    }else{  
    }
}
    
public void definirBigote(){
    if(bigote == "si"){
        System.out.println("Si, tiene bigote");
    }if (bigote == "no"){
        System.out.println("No tiene bigote");
    }else {
    }
}

public void definirLentes(){
    if(lentes == "si"){
        System.out.println("Si, usa lentes");
    }if(lentes == "no") {
        System.out.println("No usa lentes");
    }else{
    }
}

public void definirPiel (){
    if(piel == "morena"){
        System.out.println("Si, tiene piel morena");
    }if(piel == "amarilla"){
        System.out.println("Si, tiene piel amarilla");
    }else {
    }
}
public void definirCabello (){
    if(cabello == "si"){
        System.out.println("Tiene cabello");
    }if(cabello == "no"){
        System.out.println("No tiene cabello");
    }else{  
    }
}

}


