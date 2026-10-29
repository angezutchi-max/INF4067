package inf4067.solid.cohesion;

// Cette classe ne gère QUE la persistance (le stockage)
public class CommandeRepository {
    private BaseDeDonnees db;

    // Injection de dépendance : on reçoit l'interface, pas une classe concrète
    public CommandeRepository(BaseDeDonnees db) {
        this.db = db; // Faible couplage : accepte MySQL, PostgreSQL, Oracle, etc.
    }

    public void sauvegarder(Commande commande) {
        String requete = "INSERT INTO commandes (total) VALUES (" + commande.getCalculerTotal() + ")";
        db.executer(requete);
    }
}
