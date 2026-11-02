// Konkretes Produkt: Rechnung
public class Invoice implements Document {

    private final String number;
    private final String customerName;
    private final String address;
    private final double amount;

    public Invoice(String number, String customerName, String address, double amount) {
        this.number = number;
        this.customerName = customerName;
        this.address = address;
        this.amount = amount;
    }

    @Override
    public void print() {
        System.out.println("======================================");
        System.out.println("           RECHNUNG");
        System.out.println("--------------------------------------");
        System.out.println("Belegnummer : " + number);
        System.out.println("Kunde       : " + customerName);
        System.out.println("Adresse     : " + address);
        System.out.println("Betrag      : " + amount + " EUR");
        System.out.println("======================================\n");
    }

    // Getter (optional, falls später benötigt)
    public String getNumber() { return number; }
    public String getCustomerName() { return customerName; }
    public String getAddress() { return address; }
    public double getAmount() { return amount; }
}
