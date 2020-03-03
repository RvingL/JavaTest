package Thread;

import character.Hero;

public class ThreadCreate1 extends Thread {
    private Hero h1;
    private Hero h2;

    public ThreadCreate1(Hero h1, Hero h2) {
        this.h1 = h1;
        this.h2 = h2;
    }

    @Override
    public void run() {
        while (!h2.isDead()) {
            h1.attackHero(h2);
        }
    }

    public static void main(String[] args) {
        Hero garen = new Hero("garen", 608.6f, 60);
        Hero temo = new Hero("temo", 400.6f, 60);
        Hero yaso = new Hero("yaso", 508.6f, 70);
        Hero leesin = new Hero("leesin", 548.6f, 60);

        ThreadCreate1 threadCreate1 = new ThreadCreate1(garen, temo);
        threadCreate1.start();
        ThreadCreate1 threadCreate2 = new ThreadCreate1(yaso, leesin);
        threadCreate2.start();
    }
}
