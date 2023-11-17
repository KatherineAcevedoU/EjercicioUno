public class Libro {

    private int ISBN;
    private String titulo;
    private String autor;
    private int numeroDePaginas;

    public Libro(int ISBN, String titulo, String autor, int numeroDePaginas) {

        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    public void cambiarISBN(int ISBN) {
       this.ISBN = ISBN;
    }

    public void cambiarTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void cambiarAutor(String autor) {
        this.autor = autor;
    }

    public void cambiarNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }


    public int mostrarISBN() {
        return ISBN;
    }

    public String mostrarTitulo() {
        return titulo;
    }

    public String mostrarAutor() {
        return autor;
    }

    public int mostrarNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void mostrar(){

        System.out.println("El libro " +titulo+ " con ISBN " +ISBN+ " creado por el autor " +autor+ " tiene " +numeroDePaginas+ " paginas.");

    }

    



    


    
}
