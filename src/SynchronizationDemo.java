class Table {
    // TODO: synchronized method void printTable(int n)
    // Loop from 1 to 5 (as per sample) or 10
    // Print n * i + " "
    // Handle InterruptedException (try-catch Thread.sleep(400))
}

class MyThread1 extends Thread {
    Table t;
    MyThread1(Table t) {
        this.t = t;
    }
    public void run() {
        // TODO: Call t.printTable(5)
    }
}

class MyThread2 extends Thread {
    Table t;
    MyThread2(Table t) {
        this.t = t;
    }
    public void run() {
        // TODO: Call t.printTable(100)
    }
}

public class SynchronizationDemo {
    public static void main(String[] args) {
        // TODO: Create Table object
        // TODO: Create MyThread1 and MyThread2 objects passing the table object
        // TODO: Start both threads
    }
}
