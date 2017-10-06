package datos;

public class Prueba1 
{
    public static void main(String[] args) 
    {
    //Prueba del tipo de dato integer
    byte b = 2;
    short s = 2;
    int i = 2;
    long l = 2;
     //Algunas de las siguientes líneas marcarán errores de compilación ya que hay 
     //errores de Casting o de Promoción
     b=(byte)s; 
     s=b;
     l=i;
     l=s;
     s=(short)l;
     s=b;
     b=(byte)s;
     b=(byte)i;
     i=s;
     //Prueba de los tipos de dato flotantes
    float f=2.0f;
    //float f=(float)2.0;
    double d=2.0;
     //Prueba con los tipos de dato flotante
    boolean b1 = true;
    boolean b2 = false;
    //Tipos de datos Caracter
    char algo = 'b';
    char otro = ' '; 
    }
}
