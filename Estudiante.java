package Herencia1;

public class Estudiante extends Persona {
    private int codigodeestudiante;
    private float notafinal;

    public Estudiante()
    {

    }

    public Estudiante(CarnetUniversitario carnetUniversitario, String nombre, String apellidos, int edad, String dni, int codigodeestudiante, float notafinal) {
        super(carnetUniversitario, nombre, apellidos, edad, dni);
        this.codigodeestudiante = codigodeestudiante;
        this.notafinal = notafinal;
    }

    public int getCodigodeestudiante() {
        return codigodeestudiante;
    }

    public void setCodigodeestudiante(int codigodeestudiante) {
        this.codigodeestudiante = codigodeestudiante;
    }

    public float getNotafinal() {
        return notafinal;
    }

    public void setNotafinal(float notafinal) {
        this.notafinal = notafinal;
    }

    @Override
    public String toString() {
        return "\nEstudiante:" +
                "\ncodigodeestudiante=" + codigodeestudiante +
                ", \nnotafinal=" + notafinal +
                ", \nnombre='" + nombre + '\'' +
                ", \napellidos='" + apellidos + '\'' +
                ", \nedad=" + edad +
                ", \ndni='" + dni + '\'' +
                ", \nFacultad ='" + carnetUniversitario.getCarrera() +
                ", \nCarrera ='" +carnetUniversitario.getFacultad() +
                '}';
    }
}