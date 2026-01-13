package lld1.exceptionhandling;

public class NotAllowedException extends RuntimeException{
    public NotAllowedException() {
super("null not allowed");
    }
}
