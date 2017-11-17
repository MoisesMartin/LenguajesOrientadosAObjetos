
package abstraccion;


public class NumeroNegativoException extends Exception
{
    public NumeroNegativoException()
            {
               super("¡Se ha introducido un número negativo!, no existen alturas, edades ni pesos negativos, buen intento taradito/taradita >:D"); 
            }
}
