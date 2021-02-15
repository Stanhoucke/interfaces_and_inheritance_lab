import java.util.ArrayList;

public class Wallet {
    private String name;
    private ArrayList<IScan> cardsAndTickets;

    public Wallet(String name) {
        this.name = name;
        this.cardsAndTickets = new ArrayList<IScan>();
    }

    public String getName() {
        return name;
    }

    public int getNumberOfItems() {
        return this.cardsAndTickets.size();
    }

    public void addItem(IScan item) {
        this.cardsAndTickets.add(item);
    }
}
