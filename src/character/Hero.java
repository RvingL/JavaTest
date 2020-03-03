package character;

import java.io.Serializable;

public class Hero implements Serializable, Comparable<Hero> {
    private static final long serialVersionUID = 1L;
    public String name;
    public float hp;
    public int damage;

    public Hero() {

    }

    public Hero(String name) {
        this.name = name;
    }

    public Hero(String name, float hp, int damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    public Boolean isDead() {
        return hp <= 0;
    }

    public void attackHero(Hero h1) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        h1.hp -= damage;
        System.out.format("%s正在攻击%s，对%s造成了%d点伤害，%s还剩下%.0f点血%n", name, h1.name, h1.name, damage, h1.name, h1.hp);
        if (h1.isDead()) {
            System.out.println(h1.name + "挂了！");
        }
    }

    @Override
    public String toString() {
        return "Hero [name=" + name + ", hp=" + hp + ", damage=" + damage + "]\r\n";
    }

    @Override
    public int compareTo(Hero anotherHero) {
        if (damage > anotherHero.damage) {
            return 1;
        } else {
            return -1;
        }
    }
}
