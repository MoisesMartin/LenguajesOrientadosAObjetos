package constructores;
import javax.swing.JFrame;
public class ProbarConstructores 
{
    public static void main(String[] args) 
    {
       //Creando un objeto de la clase Constructores       
       Constructores anm=new Constructores();
       anm.setEdad(6);
       anm.getEdad();
       anm.isMuerde();
       anm.setNombre("Cabo");
       System.out.println(anm.getEdad());
       System.out.println(anm.getNombre());
       System.out.println(anm.isMuerde());
       Constructores otro=new Constructores(8);
       otro.setEdad(10);
       System.out.println(otro.getEdad());
       /*Vamos a usar un constructor de una clase que no hemos diseñado nosotros*/
       JFrame ventana=new JFrame("Informaciones");
       ventana.setSize(300,300);
       ventana.setVisible(true);
    }
}