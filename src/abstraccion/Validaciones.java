
package abstraccion;

public class Validaciones 
{
    public static void validarNumeroNegativo(float numero) throws NumeroNegativoException
    {
        if(numero<0) throw new NumeroNegativoException();
            
    }
}
