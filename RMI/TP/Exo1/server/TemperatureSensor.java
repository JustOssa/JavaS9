package me.oussa.RMI.TP.EX1.server;

import me.oussa.RMI.TP.EX1.common.TemperatureSensorInterface;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class TemperatureSensor extends UnicastRemoteObject implements TemperatureSensorInterface {

    private double temp = 0;

    protected TemperatureSensor() throws RemoteException {
        super();
    }

    @Override
    public void augmenterTemp(double tempVal) throws RemoteException {
        this.temp += tempVal;
    }

    @Override
    public void diminuerTemp(double tempVal) throws RemoteException {
        this.temp -= tempVal;
    }

    @Override
    public double lire_temp() throws RemoteException {
        return temp;
    }
}
