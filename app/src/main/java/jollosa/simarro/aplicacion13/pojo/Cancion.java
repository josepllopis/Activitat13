package jollosa.simarro.aplicacion13.pojo;

public class Cancion {
    private String compositores;
    private String duracion;
    private String nombre;

    public Cancion(String compositores,String duracion,String nombre) {
        this.compositores = compositores;
        this.duracion = duracion;
        this.nombre = nombre;
    }

    public String getCompositores() {
        return compositores;
    }

    public void setCompositores(String compositores) {
        this.compositores = compositores;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "compositores='" + compositores + '\'' +
                ", duracion='" + duracion + '\'' +
                ", genero='" + nombre + '\'' +
                '}';
    }
}
