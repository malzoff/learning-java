package chat;

import java.net.Socket;

/**
 * Created by Zver on 20.08.2016.
 */
public class ClientInfo {
    public static final String NONAME = "NoNameClient";

    public Socket getClientSocket() {
        return clientsocket;
    }

    public void setClientSocket(Socket clientsocket) {
        this.clientsocket = clientsocket;
    }

    public String getClientName() {
        return clientname;
    }

    public void setClientName(String clientname) {
        this.clientname = clientname;
    }

    private Socket clientsocket;
    private String clientname;

    public ClientInfo(Socket socket, String name) {
        this.clientsocket = socket;
        this.clientname = name;
    }

    public ClientInfo(Socket socket) {
        this.clientsocket = socket;
        this.clientname = NONAME;
    }

    public ClientInfo(String name) {
        this.clientname = name;
        this.clientsocket = null;
    }

    public ClientInfo() {
        this.clientname = NONAME;
        this.clientsocket = null;
    }

}