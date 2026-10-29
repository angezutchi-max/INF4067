package inf4067.solid.cohesion;

// Implémentation concrète interchangeable
public class MysqlDatabase implements BaseDeDonnees {
    @Override
    public void executer(String requete) {
        System.out.println("Exécution MySQL : " + requete);
    }
}
