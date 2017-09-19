package abstraccion;

public class Imc 
{
    Usuario usr;
    String resultado;
    
    public String calcularIMC()
    {
        float valorIMC = usr.peso/(usr.altura*usr.altura);
        resultado = "Tu IMC es: "+valorIMC;
        return resultado;
    }
}