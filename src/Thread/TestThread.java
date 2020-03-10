package Thread;

import character.Hero;

public class TestThread {
    public static void main(String[] args) {
        Hero hero = new Hero("garem", 600f, 60);
        Thread[] t=new Thread[5];

        for (int i = 0; i < 5; i++) {
            Thread t1 = new Thread() {
                @Override
                public void run() {
                    while (true) {
                        hero.hurt();
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                }
            };
            t1.start();
        }


        for (int i = 0; i < 2; i++) {
            Thread t2 = new Thread() {
                @Override
                public void run() {
                    while (true) {
                        hero.recover();
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            };
            t2.start();
        }
    }
}
