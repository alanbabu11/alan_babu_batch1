package NA;
public class Scenario2 {
    public static void main(String[] args) {
        
        CreditCard card = new CreditCard(134, "John");
        Payment bit = new BitCoin(2434);

        System.out.println(card.getTransactionId() + " " + card.getSenderName());
        System.out.println(bit.getTransactionId() + " " + bit.getSenderName());
    }
}

interface Payment {
    void pay(int amt);
    int getTransactionId();
    String getSenderName();
}

class CreditCard implements Payment {
    int transactionId;
    String senderName;

    CreditCard(int id, String name) {
        this.transactionId = id;
        this.senderName = name;
    }

    @Override
    public void pay(int amt) {
        System.out.println("Paid " + amt + "₹");
    }

    @Override
    public int getTransactionId() {
        return transactionId;
    }

    @Override
    public String getSenderName() {
        return senderName;
    }
}

class BitCoin implements Payment {
    int transactionId;

    BitCoin(int id) {
        this.transactionId = id;
    }

    @Override
    public void pay(int amt) {
        System.out.println("Paid " + amt + "₹");
    }

    @Override
    public int getTransactionId() {
        return transactionId;
    }

    @Override
    public String getSenderName() {
        return null;
    }
}
