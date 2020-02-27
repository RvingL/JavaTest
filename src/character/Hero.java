package character;

import java.io.Serializable;

public class Hero implements Serializable {
    private static final long serialVersionUID=1L;
    public String name;
    public int hp;
    public int damage;

    public Hero() {

    }

    public Hero(String name) {
        this.name=name;
    }

    @Override
    public String toString() {
        return name;
    }
}
