public class App {
    public static void main(String[] args) throws Exception { 


       Libro primerLibro = new Libro(987550509, "El arte de amar", "Ovidio", 253);

       primerLibro.mostrar();

       Libro segundoLibro = new Libro(978841560, "Edipo rey", "Sofocles", 122);

       segundoLibro.mostrar();


        if(primerLibro.mostrarNumeroDePaginas() > segundoLibro.mostrarNumeroDePaginas()){

          System.out.println("El libro " + primerLibro.mostrarTitulo() + " tiene mas cantidad de paginas.");

        }else{

          System.out.println("El libro " + segundoLibro.mostrarTitulo() + " tiene mas cantidad de paginas.");

        }

       
        

    }
}
