public class Main {
    public static void main(String[] args) {

        // --- Beispiel 1: RECHNUNG ---
        System.out.println(">>> HIER WIRD DIE RECHNUNG AUSGEGEBEN <<<\n");

        DocumentCreator invoiceCreator = new InvoiceCreator();
        Document invoice = invoiceCreator.processDocument(
                "Autohaus Westfalia GmbH",
                "Bahnhofstraße 12, 48143 Münster",
                1299.90
        );
        invoice.print();


        // --- Beispiel 2: LIEFERSCHEIN ---
        System.out.println(">>> HIER WIRD DER LIEFERSCHEIN AUSGEGEBEN <<<\n");

        // Der Betrag ist für den Lieferschein nicht relevant; 0 ist Platzhalter.
        DocumentCreator deliveryNoteCreator = new DeliveryNoteCreator();
        Document deliveryNote = deliveryNoteCreator.processDocument(
                "Autohaus Westfalia GmbH",
                "Bahnhofstraße 12, 48143 Münster",
                0.0
        );
        deliveryNote.print();
    }
}
