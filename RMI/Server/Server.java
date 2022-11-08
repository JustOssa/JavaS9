package me.oussa.RMI.Server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] telsArgs) {
        try {
            // Créer une instance de l’objet distant
            InformationImpl lObjetDistant = new InformationImpl();
            // Creation du registre
            Registry register = LocateRegistry.createRegistry(1099);
            // L’enregistrer dans le registre
            register.rebind("testRMI", lObjetDistant);
            System.out.println("Le serveur est prêt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
