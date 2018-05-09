import java.rmi.*;


public class Client 
{
    public static void main (String[] argv) 
    {
        try 
        { 
            HelloIface hello = (HelloIface)Naming.lookup ("rmi://crow.cs.umanitoba.ca:15001/Hello");

            System.out.println
            ("***Welcome to the day time client***\nHere is the time stamp recived from the server:");

            System.out.println (hello.getTimeStamp());
        }
        catch (Exception e) 
        {
            System.out.println ("Client exception...:"+ e); 
        }
        System.out.print("hey");
    } 
}
