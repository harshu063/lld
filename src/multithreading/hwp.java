package multithreading;

public class hwp implements Runnable {
    //private int number;
   // public hwp(int number){
      // this.number=number;
    public hwp(){
    }

    @Override
    public void run() {


            System.out.println("Hello World gjh: " +Thread.currentThread().getName());
        }
    }

