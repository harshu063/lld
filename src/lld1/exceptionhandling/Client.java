package lld1.exceptionhandling;

public class Client {
    public static void main(String[] args) {

        try{
 Pair pair = new Pair("A", "B");
        System.out.println(pair);
Pair null1 = new Pair(null, null);
      System.out.println(null1);
  }
        catch(NotAllowedException exception){
            System.out.println(exception.getMessage());
           System.out.println("null nahi beta ,this shit not allowed");
        }
        catch(ClassCastException exception){
            System.out.println(exception.getMessage());

        }
        System.out.println("rest code");
}
}

