package ca.ontariotechu.csci2020u_project;

import java.util.Scanner;

public class ClientHandler implements Runnable{

    private Server server;
    private User user;

    public ClientHandler(Server server, User user) {
        this.server = server;
        this.user = user;
    }

    @Override
    public void run() {
        String message = null;

        Scanner sc = new Scanner(user.getReader());

        while (sc.hasNextLine()){
            message = sc.nextLine();
            server.sendToAllUsers(message);
        }

    }
}
