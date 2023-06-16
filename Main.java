package Herencia1;

public class Main {
    public static void main(String args[])
    {
        Estudiante estudiante = new Estudiante(new CarnetUniversitario("Ingenieria de sistemas","Ingeneiria"),"Yovanni","Ortiz Berrospi",18,"76921483",2021,11);
        System.out.println(estudiante.toString());
    }
}
