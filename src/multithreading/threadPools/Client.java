package multithreading.threadPools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {


        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 101; i++) {
        NumberPrinter Printer = new NumberPrinter(i);
        executorService.submit(Printer);

        }
        executorService.shutdown();
    }
}
