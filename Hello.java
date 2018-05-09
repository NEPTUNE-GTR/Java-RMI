import java.rmi.*;
import java.rmi.server.*;

//Your remote object instance is exported: make it available to accept incoming remote
//method invocations by listening for incoming calls to the remote object on an anonymous port.
public class Hello extends UnicastRemoteObject implements HelloIface 
{
  private String message;
  private String server;
  private String timeStamp;
  private int    port;

    //Because the object export could potentially throw a java.rmi.RemoteException,
    //you must define a constructor that throws a RemoteException
    public Hello (String msg, int serverPort, String serverName) throws RemoteException 
    {
      this.message   = msg;
      this.server    = serverName; 
      this.port      = serverPort;
      this.timeStamp = ""; 
    } 
    public String getMessage() throws RemoteException 
    {
      return this.message;
    }

    public String getServerName() throws RemoteException 
    {
      return this.server;
    }
    public int getServerPort() throws RemoteException 
    {
      return this.port;
    }

    public void sendMessage(String text) throws RemoteException
    {

    }
    public void setTimeStamp(String text) throws RemoteException
    {
        this.timeStamp = text;
    }
    public String getTimeStamp() throws RemoteException
    {
        System.out.println("***This is the time stamp from the server***");
        return this.timeStamp;
    }
}
