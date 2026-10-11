public class Mascota {
    private String nombre;
    private String raza;
    private double peso;
    private int edad;

    Mascota(String nombre, String raza, double peso, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.peso = peso;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public double getPeso() {
        return peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setPeso(double nuevoPeso){
        if(nuevoPeso < 0){
            System.out.println("Invalidado debido a" + nuevoPeso + "es un valor erroneo y no puede colocarse");
            return;

        }
        this.peso = nuevoPeso;
    }

    public void setEdad(int nuevoEdad){
        if(nuevoEdad < 0){
            System.out.println("invalidado debido a" + nuevoEdad + "no es una edad valida");
            return;
        }
        this.edad =nuevoEdad;
    }







    }
}
