import org.rosario.escuela.Escuela;

public class AppEscuela {
    public static void main(String[] args) {


        Escuela.alumno("TE342","Maria del Rosario",22,
                "rosario@gmail.com", "Ingenieria en Informatica");

        System.out.println("***********************************");
        Escuela.Materia("MA5PROG","POO",5,(byte)120,"Edgar Degante");

    }


}