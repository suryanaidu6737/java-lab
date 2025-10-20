// Program to create threads by extending Thread (using for loop)
class T1 extends Thread {
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

class T2 extends Thread {
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

class T3 extends Thread {
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

class ThreadExtDemo {
    public static void main(String[] args) {
        new T1().start();
        new T2().start();
        new T3().start();
    }
}
