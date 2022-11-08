package me.oussa.RMI.TP.EX2.common;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface TemperatureSensorInterface extends Remote {
    public void augmenterTemp(double tempVal) throws RemoteException;

    public void diminuerTemp(double tempVal) throws RemoteException;

    public double lire_temp() throws RemoteException;
}
