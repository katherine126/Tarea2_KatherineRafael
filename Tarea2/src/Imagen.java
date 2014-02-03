/*Tarea2: En esta clase Imagen debemos agregar los atributos int alto, int ancho.
Practicar el encapsulamiento y poner la regla de que los atributos no sean negativos
(transformarlos a positivos).*/
/* @author Katherine */

public class Imagen {
    
    private int alto;
    private int ancho;
    
public int getAlto(){
    return alto;
}
public void setAlto(int alto){
    if(alto<0)alto=-alto;
    this.alto=alto;
    }

public int getAncho(){
    return ancho;
}
public void setAncho(int ancho){
    if(ancho<0)ancho=-ancho;
    this.ancho=ancho;
    }
}
