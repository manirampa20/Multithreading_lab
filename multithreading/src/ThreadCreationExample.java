// Using Runnable interface
class PrintNumbers implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }
    }
}

// Using Thread class
class PrintLetters extends Thread {
    @Override
    public void run() {
        for (char c = 'A'; c <= 'E'; c++) {
            System.out.println("Letter: " + c);
        }
    }
}

public class ThreadCreationExample {
    public static void main(String[] args) {
        // Creating thread using Runnable
        Thread numberThread = new Thread(new PrintNumbers());
        numberThread.start();

        // Creating thread using Thread class
        PrintLetters letterThread = new PrintLetters();
        letterThread.start();
    }
}
