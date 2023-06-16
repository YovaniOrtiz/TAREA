package Herencia1;

public class CarnetUniversitario {
    protected String carrera;
    protected String facultad;

    public CarnetUniversitario() {

    }

    public CarnetUniversitario(String carrera, String facultad) {
        this.carrera = carrera;
        this.facultad = facultad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

}
