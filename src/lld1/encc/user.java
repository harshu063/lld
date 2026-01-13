package lld1.encc;

public class user {
    String username;
    String email;
public user(String username, String email){
    this.username=username;
    this.email=email;
}
public void displayinfo(){
    System.out.println("Username" +username);
    System.out.println("email" + email);

}
}
