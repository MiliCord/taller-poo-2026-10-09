public class Veterinaria {

    public static  void main(String[] args){

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


        }
        System.out.println("total recaudado en el dia :" + total);
    }
}
