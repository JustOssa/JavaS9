package me.oussa.RMI.TP.EX2.server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Serveur {
    public static void main(String[] telsArgs) {
        try {
            // Créer une instance de l’objet distant
            TemperatureSensor lObjetDistant = new TemperatureSensor();
            // Creation du registre
            Registry register = LocateRegistry.createRegistry(2303);
            // L’enregistrer dans le registre
            register.rebind("tempSensor", lObjetDistant);
            System.out.println("Le serveur est prêt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
