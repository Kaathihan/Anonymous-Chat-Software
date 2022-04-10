package ca.ontariotechu.csci2020u_project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class User {
    private PrintWriter writer;
    private BufferedReader reader;
    private Socket socket;
    private String userName;


    public User(Socket socket, String userName) throws IOException {
        this.writer = new PrintWriter(socket.getOutputStream(),true);
        this.reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        this.socket = socket;
        this.userName = userName;
    }


    public PrintWriter getWriter() {
        return writer;
    }

    public BufferedReader getReader() {
        return reader;
    }

    public Socket getSocket() {
        return socket;
    }

    public String getUserName() {
        return userName;
    }
}
