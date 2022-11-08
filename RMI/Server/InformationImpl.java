package me.oussa.RMI.Server;

import me.oussa.RMI.common.Information;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class InformationImpl extends UnicastRemoteObject implements Information {

    protected InformationImpl() throws RemoteException {
        super();
    }

    public String getInformation() throws RemoteException {
        return "Bonjour";
    }
}