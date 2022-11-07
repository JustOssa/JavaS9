package me.oussa.Threads.Exo2;

// - Un "compteur" a un nom (Toto par exemple) et il compte de 1 à n (nombre entier positif quelconque). Il
// marque une pause aléatoire entre chaque nombre (de 0 à 5000 millisecondes par exemple).
// - Un compteur affiche chaque nombre (Toto affichera par exemple, "Toto : 3") et il affiche un message du
// type "*** Toto a fini de compter jusqu'à 10" quand il a fini.
// - 1) Écrivez la classe compteur et testez-la en lançant plusieurs compteurs qui comptent jusqu'à 10. Regardez
// celui qui a fini le plus vite.
// - 2) Modifiez la classe Compteur pour que chaque compteur affiche son ordre d'arrivée : le message de fin est
// du type : "Toto a fini de compter jusqu'à 10 en position 3".

public class Exo2 {
    public static void main(String[] args) {
        Compteur compteur1 = new Compteur("Toto", 10);
        Compteur compteur2 = new Compteur("Oussama", 6);
        compteur1.start();
        compteur2.start();
    }
}

// 1)
class Compteur extends Thread {
    private final String nom;
    private final int n;

    public Compteur(String nom, int n) {
        this.nom = nom;
        this.n = n;
    }

    public void run() {
        for (int i = 1; i <= n; i++) {
            System.out.println(nom + " : " + i);
            try {
                Thread.sleep((int) (Math.random() * 5000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("*** " + nom + " a fini de compter jusqu'à " + n);
    }
}

// 2)
class Compteur2 extends Thread {
    private final String nom;
    private final int n;
    private static int pos = 1;

    public Compteur2(String nom, int n) {
        this.nom = nom;
        this.n = n;
    }

    public void run() {
        for (int i = 1; i <= n; i++) {
            System.out.println(nom + " : " + i);
            try {
                Thread.sleep((int) (Math.random() * 5000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(nom + " a fini de compter jusqu'à " + n + " en position " + pos);
        pos++;
    }
}