import java.util.LinkedList;

class ProducerConsumer {
    private final LinkedList<Integer> buffer = new LinkedList<>();
    private final int capacity = 5;

    // Synchronized produce method
    public synchronized void produce() throws InterruptedException {
        for (int value = 0; value < 5; value++) {
            while (buffer.size() == capacity) {
                wait(); // wait if buffer is full
            }
            buffer.add(value);
            System.out.println("Produced: " + value);
            notify(); // notify consumer
            Thread.sleep(500); // simulate delay
        }
    }

    // Synchronized consume method
    public synchronized void consume() throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            while (buffer.isEmpty()) {
                wait(); // wait if buffer is empty
            }
            int val = buffer.removeFirst();
            System.out.println("Consumed: " + val);
            notify(); // notify producer
            Thread.sleep(1000); // simulate delay
        }
    }

    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();

        Thread producerThread = new Thread(() -> {
            try {
                pc.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumerThread = new Thread(() -> {
            try {
                pc.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}
