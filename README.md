# Factory Method – Beispielprojekt

**LS03: Design Patterns in der Softwareentwicklung (STDM)**
Andreas Aschebrock, Ludwig-Erhard-Berufskolleg

Das Projekt zeigt das Entwurfsmuster **Factory Method** am Beispiel eines Dokumenten-Systems.
Es werden eine Rechnung (`Invoice`) und ein Lieferschein (`DeliveryNote`) erzeugt und ausgegeben.

## Klassen

| Klasse | Rolle im Factory-Method-Pattern |
|---|---|
| `Main` | Aufrufer (Client) |
| `Document` | Product (Interface) |
| `DocumentCreator` | Creator (abstrakte Klasse mit der Factory Method `createDocument()`) |
| `InvoiceCreator`, `DeliveryNoteCreator` | Concrete Creator |
| `Invoice`, `DeliveryNote` | Concrete Product |

## Projekt öffnen

Das Projekt lässt sich sowohl mit **BlueJ** als auch mit **IntelliJ IDEA** öffnen.

### Herunterladen

Auf GitHub oben auf **Code → Download ZIP** klicken und die ZIP-Datei entpacken.

### BlueJ

1. In BlueJ **Projekt → Projekt öffnen…** wählen und den entpackten Ordner auswählen.
2. Rechtsklick auf die Klasse `Main` → `void main(String[] args)` → **OK**.
3. Die Ausgabe erscheint im Terminalfenster.

### IntelliJ IDEA

1. In IntelliJ **File → Open…** wählen und den entpackten Ordner auswählen.
2. Falls oben ein Hinweis zum fehlenden JDK erscheint: auf **Setup SDK** klicken und ein installiertes JDK auswählen.
3. Die Klasse `Main` öffnen und auf den grünen Startpfeil neben `main` klicken.

## Aufgabe

Siehe Arbeitsblatt 2 „Factory Method“, Übungsaufgabe: Erweitern Sie das Projekt um die
Dokumentart **Auftragsbestätigung** (`Confirm` mit `ConfirmCreator`).
