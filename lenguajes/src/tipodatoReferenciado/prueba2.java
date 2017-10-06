package tipodatoReferenciado;
//Se importa la clase usuario del paquete abstracción
import abstraccion.Usuario;

public class prueba2 
{
    public static void main(String[] args) 
    { 
     /*Todos los referenciados pertenecen  a una clase
       y además se necesita uno o mas primitivos para 
       definirlos
     */
        String nombre = "Moises Martin";
        String otro = new String("HolaxD");
        Usuario u = new Usuario();
        u.setPeso(60.5f);
        u.setAltura( 80.0f);
    }
}
