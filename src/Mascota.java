public class Mascota {
    private String nombre;
    private String especie;
    private double peso;
    private int edad;
    private int valor;


    Mascota(String nombre, String especie, double peso, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.peso = peso;
        this.edad = edad;

    }

    public int getValor() {
        return valor;
    }


    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public double getPeso() {
        return peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setPeso(double nuevoPeso){
        if(nuevoPeso < 0){
            System.out.println("Invalidado debido a que " + nuevoPeso + " es un valor erroneo y no puede colocarse");
            return;

        }
        this.peso = nuevoPeso;
    }

    public void setEdad(int nuevoEdad){
        if(nuevoEdad < 0){
            System.out.println("invalidado debido a que " + nuevoEdad + " no es una edad valida");
            return;
        }
        this.edad =nuevoEdad;
    }

    public int valorConsulta() {

        int valor = 35000;
        if (getPeso() > 25) {
            valor = 55000;
        } else if (getPeso() > 10) {
            valor = 45000;

        }

        if (getEdad() >= 8){

            valor = valor + 12000;
        }
        return valor;
    }

    public String descripcion(){

        return nombre + " (" + especie + ", " + peso + " kg, " + edad + " años)";

    }
    }












