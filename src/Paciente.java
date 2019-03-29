public class Paciente implements Comparable<Paciente> {

    private String nombre;
    private String condicion;
    private char urgencia;

    public Paciente(String n, String c, char u){
        this.nombre = n;
        this.condicion = c;
        this.urgencia = u;
    }

    @Override
    public int compareTo(Paciente o) {
        /*
         Dado que las letras posteriores en el abecedario
         tienen un valor mayor en ascii, usamos los comparadores al revez.
         Es decir, ya que C > A -> true (devolveria 1) y necesitamos que sea al contrario
         cuando this > devolvemos -1.
         e.g.
            'C' > 'A' === 67 > 65
            @return -1
         */

        if (this.urgencia > o.getUrgencia()){
            System.out.println("this < o:\n");
            System.out.println(this.urgencia + " and " + o.getUrgencia());
            return 1;
        } else if (this.urgencia < o.getUrgencia()){
            System.out.println("this > o:\n");
            System.out.println(this.urgencia + " and " + o.getUrgencia());
            return -1;
        } else return 0;
    }

    public char getUrgencia() {
        return this.urgencia;
    }

    public String toString(){
        return this.nombre + " " + String.valueOf(this.urgencia);
    }
}
