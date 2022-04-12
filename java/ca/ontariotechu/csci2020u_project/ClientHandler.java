package ca.ontariotechu.csci2020u_project;

import java.util.Scanner;

public class ClientHandler implements Runnable{

    private Server server;
    private User user;

    public ClientHandler(Server server, User user) {
        this.server = server;
        this.user = user;
    }

    /**
     * handle the client connection, read the message from user, then call the function in Server class to send it to all users
     */
    @Override
    public void run() {
        String message = null;

        Scanner sc = new Scanner(user.getReader());

        while (sc.hasNextLine()){
            message = sc.nextLine();
            System.out.println(message);
            server.sendToAllUsers(user, message);
        }

    }
}
