// Konkreter Creator für Rechnungen
public class InvoiceCreator extends DocumentCreator {

    @Override
    protected String ermittleNextBelegnummer() {
        // In der Praxis könnte hier eine Datenbankabfrage stehen,
        // die die letzte Belegnummer ermittelt und hochzählt.
        long timestamp = System.currentTimeMillis();
        return "INV-" + timestamp;
    }

    @Override
    protected Document createDocument(String number, String customerName, String address, double amount) {
        // Hier wird das konkrete Produkt (Rechnung) erzeugt
        return new Invoice(number, customerName, address, amount);
    }
}
