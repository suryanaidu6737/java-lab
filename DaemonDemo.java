class DaemonDemo extends Thread {
    public void run() {
        try { 
            for (int i = 0; i < 3; i++) {
                System.out.println("Daemon running");
                Thread.sleep(500); 
            }
        }
        catch (InterruptedException e) { }
    }

    public static void main(String[] args) throws InterruptedException {
        DaemonDemo d = new DaemonDemo();
        d.setDaemon(true); // Daemon thread
        d.start();
        System.out.println("Main thread finished");
    } 
}
