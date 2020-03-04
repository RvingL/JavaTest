package Thread;

public class Exam2 {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                int seconds = 0;
                while(true) {
                    for(int i=1;i<=3;i++) {
                        try {
                            System.out.println("发动技能第"+i+"次");
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }}
                    System.out.println("暂停5秒");
                    try {
                        Thread.sleep(5000);
                    }
                    catch (InterruptedException e) {
                        // TODO: handle exception
                        e.printStackTrace();
                    }
                }
            }
        };
        t1.start();
    }

}

