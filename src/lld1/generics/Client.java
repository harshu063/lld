package lld1.generics;

public class Client {
    public static void main(String[] args) {
        pair <Double,Double> p1 = new pair(3.55, 36.33);
        pair<Integer,String> student = new pair(1, "harsh");
        Integer f1= student.getFirst();
        String second = student.getSecond();
        Double f11 = p1.getFirst();

        System.out.println(f11+87.322323);
        System.out.println(second.length());
        System.out.println(f1+77);
    }
}
