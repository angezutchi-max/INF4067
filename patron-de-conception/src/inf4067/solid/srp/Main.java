package inf4067.solid.srp;

// Utilisation des classes issues du refactoring SRP
public class Main {
    public static void main(String[] args) {
        BookSRP book = new BookSRP("Les principes SOLID", "Etudiants de M1-GL", "Révision des principes SOLID");

        BookPrinter printer = new BookPrinter();
        printer.printToScreen(book);
        printer.printToHTML(book);

        BookSaver saver = new BookSaver();
        saver.saveToDatabase(book);
        saver.saveToFile(book, "livre.txt");

        BookBusinessLogic logic = new BookBusinessLogic();
        logic.emprunter(book, "Marcial");
        logic.autreService(book);
    }
}
