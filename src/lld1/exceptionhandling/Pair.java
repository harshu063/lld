package lld1.exceptionhandling;

public class Pair  {
    private String first;
    private String second;
    public Pair(Object first, Object second){
        if (first == null || second == null){

        throw new NotAllowedException()   ;
        }
        this.first=(String)first;
        this.second=(String)second;
    }

    public String getFirst() {
        return first;
    }

    public String getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "pair{" +
                "first='" + first + '\'' +
                ", second='" + second + '\'' +
                '}';
    }
}
