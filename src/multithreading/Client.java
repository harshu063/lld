package multithreading;

public class Client {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {


            hwp hwp = new hwp();
            Thread thread1 = new Thread(hwp);

            thread1.start();

        }
    }
}
