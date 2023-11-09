package printnaturalnumber;

import printnaturalnumber.PrintNaturalNumber;

public class Main {
    public static void main(String[] args) {
        PrintNaturalNumber obj1 = new PrintNaturalNumber(1);
        PrintNaturalNumber obj2 = new PrintNaturalNumber(2);
        PrintNaturalNumber obj3 = new PrintNaturalNumber(0);
        Thread t1 =new Thread(obj1,"thread1");
        Thread t2 =new Thread(obj2,"thread2");
        Thread t3 =new Thread(obj3,"thread3");
        t1.start();
        t2.start();
        t3.start();
    }
}