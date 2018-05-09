import java.rmi.*; 


public interface HelloIface extends Remote 
{   
    public String getMessage() throws RemoteException; 

    public String getServerName() throws RemoteException;

    public int    getServerPort() throws RemoteException;

    public void   sendMessage(String text) throws RemoteException;

    public void   setTimeStamp(String text) throws RemoteException;

    public String getTimeStamp() throws RemoteException;
} 


