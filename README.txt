Remote method invocation with java

RMI allows the communication between more than one distributed objects, with the goal being to allow objects to use methods and access data on remote objects  



Instructions on how to run the java RMI implementation of the Daytime client & server:
-all of the file are ran on crow.cs.umanitoba.ca

-To compile the server, enter this command:
javac Server.java

-To start the server in the background enter this command:
java server &
----------------------------------------------------------
-To compile the Client enter this command:
javac Client.java

-To run the client enter this command:
java -cp . Client
(the cp is needed because you need to specify the classpath)
