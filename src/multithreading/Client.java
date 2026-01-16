package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {

        ExecutorService es= Executors.newFixedThreadPool(10);
        for (int i = 0; i < 100; i++) {





            hwp hwp = new hwp();
            es.submit(hwp);


        }
        es.shutdown();
    }
}
