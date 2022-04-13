package ca.ontariotechu.csci2020u_project;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

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
            if (message.startsWith("@")){
                String messages[] = message.split(":");
//                System.out.println(messages[0].split("@")[1]);
//                messages[0].replace("@", "");
                server.sendPrivateMessage(messages[0].split("@")[1], user, messages[1]);
            }else if (message.equals("U%s^E7*r(E&x%^I754t36")){
                server.deleteUser(user);
            }else {
                server.sendToAllUsers(user, message);
            }
//            System.out.println(message);
//            server.sendToAllUsers(user, message);
        }

    }
}
