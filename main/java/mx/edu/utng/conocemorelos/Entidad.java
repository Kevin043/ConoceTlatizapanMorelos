package mx.edu.utng.conocemorelos;

public class Entidad {
    private int imgFoto;
    private String titulo;
    private String contenido;
    private String direccion;

    public Entidad(int imgFoto, String titulo, String contenido, String direccion) {
        this.imgFoto = imgFoto;
        this.titulo = titulo;
        this.contenido = contenido;
        this.direccion = direccion;
    }

    public int getImgFoto() {
        return imgFoto;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public String getDireccion() {
        return direccion;
    }
}
