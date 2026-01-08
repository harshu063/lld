package lld1.inheritance;

public class client {
    public static void main(String[] args) {
        user user = new user();
        user.username="Harshh";
        user.password="pass";
        user.login();
      //  user.scheduleClass();
        instructor instructor = new instructor();
        instructor.username="hemant";
        instructor.password = "passs";
        instructor.login();
        instructor.scheduleClass();
    }
}
