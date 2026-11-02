public class DeliveryNote implements Document {
    private final String number;
    private final String customerName;
    private final String address;
    private final String deliveryDate;

    public DeliveryNote(String number, String customerName, String address, String deliveryDate) {
        this.number = number;
        this.customerName = customerName;
        this.address = address;
        this.deliveryDate = deliveryDate;
    }

    @Override
    public void print() {
        System.out.println("======================================");
        System.out.println("            LIEFERSCHEIN");
        System.out.println("--------------------------------------");
        System.out.println("Belegnummer : " + number);
        System.out.println("Empfänger   : " + customerName);
        System.out.println("Adresse     : " + address);
        System.out.println("Lieferdatum : " + deliveryDate);
        System.out.println("Unterschrift: ________________________");
        System.out.println("======================================\n");
    }
}
