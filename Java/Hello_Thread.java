class Hello_Thread {
    public static void main(String[] args) {
        System.out.println("Hello Thread!");

        // Create the Runnable object
        Runnable helloWorldRunnable = new HelloWorldRunnable();

        // Create two threads and start them
        Thread thread = new Thread(helloWorldRunnable);
        thread.start();

        Thread thread2 = new Thread(helloWorldRunnable);
        thread2.start();
    }
}

class HelloWorldRunnable implements Runnable {

    // Override the run method to define what the thread will do
    public void run() {
        // Code that will be executed by the thread
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World from a thread! " + Thread.currentThread().getName() +i);
            try {
                // Sleep for 100 milliseconds to simulate some delay
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace(); // Properly catch InterruptedException
            }
        }
    }
}
