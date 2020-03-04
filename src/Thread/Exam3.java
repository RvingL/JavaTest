package Thread;

import character.Hero;

public class Exam3 {
    public static void main(String[] args) {
        final Hero hero=new Hero("garen",400.0f,60);
        int n=10000;
        Thread[] t1=new Thread[n];
        Thread[] t2=new Thread[n];

        for (int i = 0; i <n ; i++) {
            Thread thread1=new Thread(){
                @Override
                public void run() {
                    hero.hurt();
                    try{
                        Thread.sleep(100);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            };
            thread1.start();
            t1[i]=thread1;
        }

        for (int i = 0; i <n ; i++) {
            Thread thread2=new Thread(){
                @Override
                public void run() {
                    hero.recover();
                    try{
                        Thread.sleep(100);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            };
            thread2.start();
            t2[i]=thread2;
        }

        for (int i = 0; i < n; i++) {
            try{
                t1[i].join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        for (Thread t:t2) {
            try{
                t.join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.printf("%d个增加线程和%d个减少线程结束后%n盖伦的血量是 %.0f%n", n,n,hero.hp);
    }
}
