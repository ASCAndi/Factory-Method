public class DeliveryNoteCreator extends DocumentCreator {

    @Override
    protected String ermittleNextBelegnummer() {
        return "DEL-" + System.currentTimeMillis();
    }

    @Override
    protected Document createDocument(String number, String customerName, String address, double amount) {
        // Für den Lieferschein könnte der Betrag irrelevant sein – stattdessen nehmen wir ein Lieferdatum.
        String deliveryDate = java.time.LocalDate.now().toString();
        return new DeliveryNote(number, customerName, address, deliveryDate);
    }
}
