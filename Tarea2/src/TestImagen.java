
/* En esta clase main TestImagen crearemos un objeto tipo de imagen,
asignamos valores negativos a alto y ancho y verficaremos
que se cambien a positivos.*/
/* @author Katherine*/

public class TestImagen {
   
    public static void main(String[] args) {
        
    Imagen tipo1 =new Imagen();
    Imagen tipo2 =new Imagen();
        
    tipo1.setAlto(-12);
    System.out.println("El alto de la Imagen1 es: " + tipo1.getAlto());
    tipo1.setAncho(-4);
    System.out.println("El ancho de la Imagen1 es: " + tipo1.getAncho());
    tipo2.setAlto(-10);
    System.out.println("El alto de la Imagen2 es: " + tipo2.getAlto());
    tipo2.setAncho(-5);
    System.out.println("El ancho de la Imagen2 es: " + tipo2.getAncho());
    
   }
    
}
