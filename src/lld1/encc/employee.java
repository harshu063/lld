package lld1.encc;

public class employee extends user {
       private static int employeeId;
       private String department;

       public employee(String username, String email, int employeeId, String department) {
              super(username, email);
              this.department=department;
              this.employeeId=employeeId;
       }

       @Override
       public void displayinfo() {
              super.displayinfo();
              System.out.println("id" +employeeId);
              System.out.println("dept" +department);
       }
}
