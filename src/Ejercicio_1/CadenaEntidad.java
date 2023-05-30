package Ejercicio_1;

public class CadenaEntidad {
    
    private String frase;
    private int longitud;

    public CadenaEntidad() {
    }

    public CadenaEntidad(String frase) {
        this.frase = frase;
        setLongitud(frase.length());
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    
    
}
