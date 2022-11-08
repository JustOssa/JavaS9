package me.oussa.RMI.TP.EX2.server;

import me.oussa.RMI.TP.EX2.common.TemperatureSensorInterface;

import java.rmi.RemoteException;

public class TemperatureSensor implements TemperatureSensorInterface {

    private double temp = 0;

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
