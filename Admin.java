package User;

public class Admin extends User {
    String staffNo;
    void uploadResults(String course, float score) {
        System.out.println(course + " " + score);
    }
    public static void main(String[] args) {
        Admin adminName = new Admin();
        adminName.name = "Nkosi";
        adminName.password = "123994";
        System.out.println(adminName.register());
    }
}
