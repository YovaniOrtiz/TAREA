package Herencia1;

public class Persona {
    protected String nombre;
    protected String apellidos;
    protected int edad;
    protected String dni;
    protected CarnetUniversitario carnetUniversitario;

    public Persona(){

    }

    public Persona(CarnetUniversitario carnetUniversitario,String nombre, String apellidos, int edad,String dni) {
        this.carnetUniversitario= carnetUniversitario;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = dni;
    }


    public CarnetUniversitario getCarnetUniversitario() {
        return carnetUniversitario;
    }

    public void setCarnetUniversitario(CarnetUniversitario carnetUniversitario) {
        this.carnetUniversitario = carnetUniversitario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
