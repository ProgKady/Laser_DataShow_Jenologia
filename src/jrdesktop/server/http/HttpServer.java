package jrdesktop.server.http;

import java.net.ServerSocket;
import java.net.Socket;

import jrdesktop.rmi.server.RMIServer;

public class HttpServer extends Thread {

   private ServerSocket ss;

   private boolean connected;

   public HttpServer () {
       start();
   }
   
    @Override
    public void run() {
        try {

            connected = true;
            
            // Create a ServerSocket to listen on that port.
           ss = new ServerSocket(RMIServer.serverConfig.http_port);
        
            // Now enter an infinite loop, waiting for connections and handling them.
           while (connected) {
                // Wait for a client to connect.  The method will block, and when it
                // returns the socket will be already connected to the client

                Socket socket = ss.accept() ;
                
                // starts a new server instance to communicate with the new client
                (new HttpConnection(socket)).start();
            }
           ss.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void disconnected () {
        connected = false;
        interrupt();
        stop();
    }

    @Override
    public void interrupt () {
        if (ss != null)
            try {
                ss.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        super.interrupt();
    }
}
