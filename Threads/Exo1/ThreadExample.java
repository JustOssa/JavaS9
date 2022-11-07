package me.oussa.Threads.Exo1;

// Exo 1 :
// Écrivez un programme Java qui crée trois threads. Le premier thread affiche "Bonjour" toutes les
// secondes, le deuxième thread affiche "Bonjour" toutes les deux secondes et le troisième fil affiche
// "Bienvenue" toutes les trois secondes.

class ThreadExample extends Thread {
    private final String message;
    private final int delay;

    public ThreadExample(String message, int delay) {
        this.message = message;
        this.delay = delay;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(message);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ThreadExample thread1 = new ThreadExample("Bonjour", 1000);
        ThreadExample thread2 = new ThreadExample("Bonjour", 2000);
        ThreadExample thread3 = new ThreadExample("Bienvenue", 3000);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
