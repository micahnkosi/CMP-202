public class User {
    String username = "Nkosi" ;
    String password = "Pass" ;
    String login() {
        if (username.equals("Nkosi") && password.equals("Pass")) {
            return "Logged in" ;
        } else {
            return "Failed" ;
        }
    }
    public static void main(String[]args) {
        User David = new User() ;
        System.out.println(David.login()) ;
    }
}
