package org.rosario.escuela;

public class Escuela {

    public static void alumno(String noControl, String nombre, int edad, String correo, String carrera ){
        String datosAlumno= "Numero de Control: " + noControl
                + " \nNombre del alumno: " + nombre
                + " \nEdad: " + edad
                + " \nCorreo: " + correo
                + " \nCarrera: " + carrera ;
        System.out.println(datosAlumno);

    }

    public static void Materia(String clave, String nombre, int creditos, byte horasTotales, String profesor){
        String datosMateria= "Clave de la materia: " + clave
                + " \nNombre:  "  + nombre
                + " \nCreditos: " + creditos
                + " \nHoras Totales " + horasTotales
                + " \nProfesor: " + profesor;
        System.out.println(datosMateria);

    }

}
