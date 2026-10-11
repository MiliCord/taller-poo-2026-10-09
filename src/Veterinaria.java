public class Veterinaria {

    public static  void main(String[] args){

        System.out.println("!!! Veterinaria patitas del magdalena !!!");
        System.out.println("!!! Clientes del dia de hoy!!!");

        Mascota[] turno = new Mascota[4];

        turno[0] = new Mascota ("Luna", "Perro", 28.5, 9);
        turno[1] = new Mascota ("Michi", "Gato", 4.2, 3);
        turno[2] = new Mascota ("Rocky", "Perro", 12.0, 5);
        turno[3] = new Mascota ("Pepa", "Conejo", 2.1, 1);

        int total = 0;

        for (int i = 0; i < turno.length; i++) {
            Mascota m = turno[i];
            System.out.println(m.getNombre() + " la consulta vale " + m.valorConsulta());
            total = total + m.valorConsulta();

            System.out.println(m.descripcion() );
        }
        System.out.println("total recaudado en el dia :" + total);

        turno[1].setPeso(-3);
        System.out.println(turno[1].descripcion());
        turno[1].setEdad(-9);  //quise poner ambos para ver si funcionaban.
        System.out.println(turno[1].descripcion());
    }



}
