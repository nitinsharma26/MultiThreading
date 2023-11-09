package printnaturalnumber;

public class PrintNaturalNumber implements Runnable{
    static final Object lock = new Object();
    int reminder;

    public PrintNaturalNumber(int reminder) {
        this.reminder = reminder;
    }

    static int number = 1;
    final int n = 10;
    @Override
    public void run() {
        while(number<n-1){
            synchronized (lock) {
                while (number % 3 != reminder) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+" "+number);
                number++;
                lock.notifyAll();
            }
        }
    }
}
