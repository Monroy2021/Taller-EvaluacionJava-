package sofka.exercise18;

public class Videojuego implements entregable {

    //Constantes

    // Horas estimadas por defecto

    private static final int HORAS_ESTIMADAS_DEF = 100;


    public static final int MAYOR = 1;


    public static final int MENOR = -1;


    public static final int IGUAL = 0;

    //Atributos


    private String titulo;


    private int horasEstimadas;


    private boolean entregado;


    private String genero;


    private String compañia;



    // Devuelve el titulo del videojuego

    public String getTitulo() {
        return titulo;
    }

    // Modifica el titulo del videojuego

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Devuelve el numero de paginas del videojuego

    public int getHorasEstimadas() {
        return horasEstimadas;
    }


    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }


    public void setGenero(String genero) {
        this.genero = genero;
    }


    public String getcompañia() {
        return compañia;
    }


    protected void setcompañia(String compañia) {
        this.compañia = compañia;
    }

    // Cambia el estado de entregado a true/false

    @Override
    public void entregar() {
        entregado = true;
    }

   

    @Override
    public void devolver() {
        entregado = false;
    }


    @Override
    public boolean isEntregado() {
        if (entregado) {
            return true;
        }
        return false;
    }


    // Se hacen comparaciones para tomar en cuanta el mayor y menor.

    @Override
    public int compareTo(Object a) {
        int estado = MENOR;

        //Hacemos un casting de objetos para usar el metodo get
        Videojuego ref = (Videojuego) a;
        if (horasEstimadas > ref.getHorasEstimadas()) {
            estado = MAYOR;
        } else if (horasEstimadas == ref.getHorasEstimadas()) {
            estado = IGUAL;
        }

        return estado;
    }

    //  informacion del videojuego

    @Override
    public String toString() {
        return "Informacion del videojuego: \n" +
                "\tTitulo: " + titulo + "\n" +
                "\tHoras estimadas: " + horasEstimadas + "\n" +
                "\tGenero: " + genero + "\n" +
                "\tcompañia: " + compañia;
    }


    //Indica si 2 videojuegos son iguales, siendo el titulo y compañia iguales

    public boolean equals(Videojuego a) {
        if (titulo.equalsIgnoreCase(a.getTitulo()) && compañia.equalsIgnoreCase(a.getcompañia())) {
            return true;
        }
        return false;
    }

    //Constructor

    public Videojuego() {
        this("", HORAS_ESTIMADAS_DEF, "", "");
    }


    // Constructor con 2 parametros

    public Videojuego(String titulo, String compañia) {
        this(titulo, HORAS_ESTIMADAS_DEF, "", compañia);
    }


    //Constructor con 4 parametros

    public Videojuego(String titulo, int horasEstimadas, String genero, String compañia) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compañia = compañia;
        this.entregado = false;
    }
}

