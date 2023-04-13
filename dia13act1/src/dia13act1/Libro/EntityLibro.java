package dia13act1.Libro;

public class EntityLibro {
    
   public int ISBN;
   public String titulo;
   public String autor;
   public int npagina;

    public EntityLibro(int ISBN, String titulo, String autor, int npagina) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.npagina = npagina;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNpagina(int npagina) {
        this.npagina = npagina;
    }
   
}
