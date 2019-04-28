import java.util.Deque;
import java.util.LinkedList;
import java.util.logging.Logger;

public class Shop {

    private static final Logger log = Logger.getLogger(Shop.class.getName());


    private Deque<Person> queue = new LinkedList<Person>();

    public int getQueueNumber() {
        return queue.size();
    }

    //dodanie klienta
    // ograniczenia rozmiatu kolejki
    //sprawdzenie wieku
    public void addClient(Person client) {
        if (queue.size() < 5) {
            if (client.getAge() >= 18) {
                queue.offer(client);
            } else {
                System.out.println("Zakaz wejscia dla" + client.getName());
                log.info("Osoba niepewnoletnia UWAGA");
            }

        } else {
            System.out.println("Niestety nie ma juz miejsc");
            log.warning("Kolejka zostala nieobsluzona");
        }
    }

    // obsluzenie klienta
    public Person serveCustomer() {
        return queue.poll();
    }
// dodanie klienta VIP na poczatek kolejki

    public void addVip(Person client) {
        queue.addFirst(client);
    }
}
