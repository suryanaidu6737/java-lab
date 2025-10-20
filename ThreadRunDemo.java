// Program to create threads by implementing Runnable (readable version using for loop)
class R1 implements Runnable {
    public void run() {
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("Good Morning");
                Thread.sleep(1000);
            }
        } 
        catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class R2 implements Runnable {
    public void run() {
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("Hello");
                Thread.sleep(2000);
            }
        } 
        catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class R3 implements Runnable {
    public void run() {
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("Welcome");
                Thread.sleep(3000);
            }
        } 
        catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class ThreadRunDemo {
    public static void main(String[] args) {
        R1 obj1 = new R1();
        R2 obj2 = new R2();
        R3 obj3 = new R3();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        Thread t3 = new Thread(obj3);

        t1.start();
        t2.start();
        t3.start();
    }
}
