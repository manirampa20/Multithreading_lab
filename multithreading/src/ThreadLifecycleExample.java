class ThreadLifecycle extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Thread State: " + Thread.currentThread().getState());
            Thread.sleep(1000);
            synchronized (this) {
                wait(1000);
            }
            System.out.println("Thread State: " + Thread.currentThread().getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ThreadLifecycleExample {
    public static void main(String[] args) {
        ThreadLifecycle thread = new ThreadLifecycle();
        System.out.println("Thread State before start(): " + thread.getState());

        thread.start();
        System.out.println("Thread State after start(): " + thread.getState());

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread State after completion: " + thread.getState());
    }
}
