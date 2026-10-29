package inf4067.solid.cohesion;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Commande commande = new Commande(Arrays.asList(1500.0, 2500.0, 1000.0));

        BaseDeDonnees db = new MysqlDatabase();
        CommandeRepository repository = new CommandeRepository(db);
        repository.sauvegarder(commande);
    }
}
