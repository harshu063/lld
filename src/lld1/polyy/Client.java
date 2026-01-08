package lld1.polyy;

public class Client {
    public static void main(String[] args) {
        C obj = new C();
        System.out.println(obj.d1); // p ka
        System.out.println(obj.d);// variable hai field hai isliye override nahi hoga.
        obj.fun1(); // p ka
        obj.fun(); // c ka
        obj.sfun(); // p ka
    }
}
