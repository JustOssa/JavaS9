package me.oussa.Threads.Exo4;

public class Main {

}

class Compte {
    private int Solde;

    public Compte(int Solde) {
        this.Solde = Solde;
    }

    public synchronized void ajouter(int solde) {
        this.Solde += solde;
    }

    public synchronized void retirer(int solde) {
        this.Solde -= solde;
    }

    public synchronized void doNothingActually(int solde) {
        ajouter(solde);
        retirer(solde);
    }

    public int getSolde() {
        return Solde;
    }

}

class Operation extends Thread {
    private Compte compte;

    public Operation(String nom, Compte compte) {
        super(nom);
        this.compte = compte;
    }

    public void run() {
        // Appel des méthodes ajouter() et retirer() une somme aléatoire entre 0 et 1000
        while (true) {

            int somme = (int) (Math.random() * 1000);

            compte.ajouter(somme);
            System.out.println(getName() + " : ajouter " + somme);

            compte.retirer(somme);
            System.out.println(getName() + " : retirer " + somme);

            // compte.doNothingActually(somme);
            System.out.println(getName() + " : total " + compte.getSolde());
        }
    }

    public static void main(String[] args) {
        // Instancier un compte
        Compte compte1 = new Compte(0);

        // Instancier et lancer des threads operation
        Operation t1 = new Operation("First", compte1);
        Operation t2 = new Operation("Second", compte1);

        t1.start();
        t2.start();

    }
}