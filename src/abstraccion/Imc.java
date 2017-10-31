package abstraccion;

public class Imc 
{
    Usuario usr;
    String resultado;
    
    public String calcularIMC()
    {
        float pesoNeto = usr.getPeso();
        float alturaN = usr.getAltura();
        float valorIMC = pesoNeto/(alturaN*alturaN);
        resultado = "Tu IMC es: "+valorIMC;
        return resultado;
    }
}