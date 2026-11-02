// Abstrakte Basisklasse (Creator) definiert den Ablauf,
// aber nicht, wie das konkrete Dokument erzeugt wird.
public abstract class DocumentCreator {

    // Template-Methode: legt den Erzeugungsprozess fest
    public Document processDocument(String customerName, String address, double amount) {
        // Schritt 1: Belegnummer ermitteln (in Unterklasse konkretisiert)
        String number = ermittleNextBelegnummer();

        // Schritt 2: Dokument erzeugen (Factory Method)
        Document doc = createDocument(number, customerName, address, amount);

        // Schritt 3: Gemeinsame Nachbearbeitung (z. B. Archivierung)
        System.out.println("Dokument wurde erfolgreich erzeugt und archiviert.\n");

        return doc;
    }

    // Abstrakte Methoden, die in Unterklassen umgesetzt werden
    protected abstract String ermittleNextBelegnummer();
    protected abstract Document createDocument(String number, String customerName, String address, double amount);
}
