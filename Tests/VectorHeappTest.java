import org.junit.Test;

import static org.junit.Assert.*;

public class VectorHeappTest {

    @Test
    public void getFirst() {
        Paciente p = new Paciente("Nom", "lol", 'C');
        VectorHeapp<Paciente> vh = new VectorHeapp<Paciente>();
        vh.add(p);

        assertEquals(p, vh.getFirst());

    }

    @Test
    public void add() {
        Paciente p = new Paciente("Nom", "lol", 'C');
        VectorHeapp<Paciente> vh = new VectorHeapp<Paciente>();
        vh.add(p);

        assertEquals(p, vh.getFirst());
    }

    @Test
    public void isEmpty() {
        VectorHeapp<Paciente> vh = new VectorHeapp<Paciente>();
        assertEquals(0, vh.size(), 0);
    }
}