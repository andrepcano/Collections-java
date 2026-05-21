package Set.ExFixacao2.entities;

import java.util.Objects;

public class Cursos implements Comparable<Cursos> {

    private Integer id;

    public Cursos(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cursos cursos = (Cursos) o;
        return Objects.equals(id, cursos.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public int compareTo(Cursos other) {
        return id.compareTo(other.getId());
    }
}
