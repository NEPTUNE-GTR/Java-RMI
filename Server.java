import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Date;   


public class Server  
{
    public static void main (String[] argv) throws RemoteException
    {
        int    serverPort = 15001;
        String serverName = "crow.cs.umanitoba.ca";
        try 
        {
            Registry registry = LocateRegistry.createRegistry(serverPort);

            System.out.println("Request received");
            Hello obj = new Hello("Hello from the server", serverPort, serverName);
            //Naming.rebind("//crow.cs.umanitoba.ca:15001/Hello", obj);
            registry.rebind("Hello", obj);
            System.out.println("********************");
            System.out.println("***DayTime Server***");
            System.out.println("********************");

            Date timestamp = new Date();
            obj.setTimeStamp( timestamp.toString());
        }
        catch (Exception e) 
        {
            System.out.println("Server failed...: " + e.getMessage()); 
            e.printStackTrace();   
        }
    }
} 
