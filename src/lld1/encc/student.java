package lld1.encc;

public class student extends user{
    private static int studentId;
    private String course;


    public student(String username, String email , int studentId, String course){
super(username, email);
this.studentId=studentId;
this.course=course;
    }

@Override
    public void displayinfo(){
super.displayinfo();
        System.out.println("id" +studentId);
        System.out.println("course" +course);
    }
}
