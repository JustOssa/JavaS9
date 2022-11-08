package me.oussa.RMI.TP.EX1.Client;

import me.oussa.RMI.TP.EX1.common.TemperatureSensorInterface;

import java.rmi.Naming;

public class Client {
    public static void main(String[] telsArgs) {
        try {
            TemperatureSensorInterface lInterface = (TemperatureSensorInterface) Naming.lookup("rmi://127.0.0.1:2303/tempSensor");

            // Afficher la temperature
            System.out.println(lInterface.lire_temp());

            // Augmenter la temperature
            lInterface.augmenterTemp(2.9);

            // Diminuer la temperature
            lInterface.diminuerTemp(2);

            // ReAfficher la temperature
            System.out.println(lInterface.lire_temp());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
