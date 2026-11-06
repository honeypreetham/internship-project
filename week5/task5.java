// Thread 1: Extends the Thread class
class NumberThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("NumberThread: " + i);
            try {
                // Short sleep to demonstrate parallel execution
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                System.out.println("NumberThread interrupted.");
            }
        }
    }
}

// Thread 2: Implements the Runnable interface (alternative approach)
class MessageThread implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("MessageThread: Learning Java Multithreading");
            try {
                // Short sleep to demonstrate parallel execution
                Thread.sleep(200); 
            } catch (InterruptedException e) {
                System.out.println("MessageThread interrupted.");
            }
        }
    }
}

public class task5 {
    public static void main(String[] args) {
        System.out.println("--- Task 5: Multithreading Demonstration ---");

        // Instantiating threads
        NumberThread thread1 = new NumberThread();
        Thread thread2 = new Thread(new MessageThread());

        // Starting both threads to execute concurrently
        thread1.start();
        thread2.start();
    }
}