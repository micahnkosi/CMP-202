package Encapsulation;

public class Main {
    
    public static void main(String[] args) {

        Person student = new Person("Bingham","Nkosi","june","bhu/22/04/09/0071", 0);
        Person staff = new Person("Bingham","Nkosi","june","bhu/22/04/09/0071", 0);
        
        // person.setName("N");
        // person.setPassword("june");
        System.out.println(staff);

        Physics calvelocity = new Physics();
        System.out.println(calvelocity.calculateVelocity(50,10));
        System.out.println(calvelocity.calculateVelocity(50,20,10));



    }
}
