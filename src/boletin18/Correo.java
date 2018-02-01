package boletin18;

public class Correo {
    private String correo;
    private boolean leido;

    public Correo() {
    }

    public Correo(String correo, boolean leido) {
        this.correo = correo;
        this.leido = leido;
    }

    public String getCorreo() {
        return correo;
    }

    public boolean isLeido() {
        return leido;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }

    @Override
    public String toString() {
        return "Correo: " + correo + "\nLido: " + leido;
    }
    
}
