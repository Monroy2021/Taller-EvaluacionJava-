package sofka.exercise18;


public class Serie implements entregable {

    //Constantes

   // Numero de temporadas por defecto

    private final static int NUM_TEMPORADAS_DEF = 3;


    public final static int MAYOR = 1;


    public final static int MENOR = -1;

    // Constante que indica que un objeto es igual que otro

    public final static int IGUAL = 0;

    //Atributos

    private String titulo;


    private int numeroTemporadas;

    // Indica si esta entregado la serie

    private boolean entregado;


    private String genero;

    // Creador de la serie

    private String creador;

    //Métodos publicos


    public String getTitulo() {
        return titulo;
    }

    // Modifica el titulo de la serie

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Devuelve la numeroTemporadas de la serie

    public int getnumeroTemporadas() {
        return numeroTemporadas;
    }

    // Modifica la numeroTemporadas de la serie

    public void setnumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }


    //Devuelve el genero de la serie

    public String getGenero() {
        return genero;
    }

    // Modifica el genero de la serie

    public void setGenero(String genero) {
        this.genero = genero;
    }

    //Devuelve el creador de la serie

    public String getcreador() {
        return creador;
    }

    // Modifica el creador de la serie

    public void setcreador(String creador) {
        this.creador = creador;
    }

    //Cambia el estado de entregado a true

    public void entregar() {
        entregado = true;
    }


    //Cambia el estado de entregado a false

    public void devolver() {
        entregado = false;
    }


    //Indica el estado de entregado

    public boolean isEntregado() {
        return entregado;
    }


    public int compareTo(Object a) {
        int estado = MENOR;

        //Hacemos un casting de objetos para usar el metodo get
        Serie ref = (Serie) a;
        if (numeroTemporadas > ref.getnumeroTemporadas()) {
            estado = MAYOR;
        } else if (numeroTemporadas == ref.getnumeroTemporadas()) {
            estado = IGUAL;
        }

        return estado;
    }


    //Muestra informacion de la Serie


    public String toString() {
        return "Informacion de la Serie: \n" +
                "\tTitulo: " + titulo + "\n" +
                "\tNumero de temporadas: " + numeroTemporadas + "\n" +
                "\tGenero: " + genero + "\n" +
                "\tCreador: " + creador;
    }


    //Indica si dos Series son iguales, siendo el titulo y creador iguales

    public boolean equals(Serie a) {
        if (titulo.equalsIgnoreCase(a.getTitulo()) && creador.equalsIgnoreCase(a.getcreador())) {
            return true;
        }
        return false;
    }

    //Constructor


    public Serie() {
        this("", NUM_TEMPORADAS_DEF, "", "");
    }


    // Contructor con 2 parametros

    public Serie(String titulo, String creador) {
        this(titulo, NUM_TEMPORADAS_DEF, "", creador);
    }

    // Constructor con 4 parametros

    public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.genero = genero;
        this.creador = creador;
        this.entregado = false;
    }
}

