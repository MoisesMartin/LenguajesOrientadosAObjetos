package examensito;

public class Direccion {
    private String calle;
    private String colonia;
    private String municipio;
    private long codigo_postal;

    public String getCalle() {
        return calle;
    }
    //Constructor por defecto
    public Direccion()
    {
        
    }
    //Generar el constructor que inicializa todos los atributos
    public Direccion(String calle, String colonia, String municipio, long codigo_postal)
    {
        this.calle = calle;
        this.colonia = colonia;
        this.municipio = municipio;
        this.codigo_postal = codigo_postal;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public long getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(long codigo_postal) {
        this.codigo_postal = codigo_postal;
    }
}
