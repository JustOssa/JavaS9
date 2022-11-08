package me.oussa.RMI.Client;

import me.oussa.RMI.common.Information;

import java.rmi.Naming;

public class Client {
    public static void main(String[] telsArgs) {
        try {
            Information lInterface = (Information) Naming.lookup("rmi://127.0.0.1:1099/testRMI");
            String laChaine = lInterface.getInformation();
            System.out.println("Chaine renvoyée : " + laChaine);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}