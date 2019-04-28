import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Iraki", "Babira", 21);
        Person person2 = new Person("Piote", "Babira", 18);
        Person person3 = new Person("Galiko", "Babira", 15);
        Person person4 = new Person("Mila", "Babira", 9);
        Person person5 = new Person("Fabio", "Babira", 40);
        Person person6Vip = new Person("Mamizola", "Babira", 40);



        Shop hD = new Shop();
        hD.addClient(person);
        hD.addClient(person2);
        hD.addClient(person3);
        hD.addClient(person4);
        hD.addClient(person5);
        hD.addClient(person6Vip);
        hD.addVip(person6Vip);

        int sizeQ = hD.getQueueNumber();

        for (int i =0; i<sizeQ; i++){
            System.out.println("Zrobione : " + hD.serveCustomer());
        }




    }
}
