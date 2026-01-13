package lld1.addersubtractor;



public class Client {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter( );


        Thread t1 = new Thread(new Adder(counter));
        Thread t2 = new Thread(new Subtractor(counter));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter.count);


    }

}


class Counter {
    int count=0;
    public synchronized void incrementval() {
        count++;
    }
    public synchronized void decrementval(){
        count --;
    }
}

class Adder implements Runnable {
    private Counter counter;

    public Adder(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            counter.incrementval();

        }
    }
}


 class Subtractor implements Runnable {

     private Counter counter;

    public Subtractor(Counter counter) {
        this.counter = counter;

    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {

            counter.decrementval();

        }
    }
}





