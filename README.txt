#Remote method invocation with java


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
