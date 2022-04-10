package ca.ontariotechu.csci2020u_project;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;



public class Server implements Runnable {
    static ArrayList<User> usersList = new ArrayList<>();
    private int port;
    private ServerSocket server = null;

    public Server(int port) {
        this.port = port;
    }

    public static void main(String[] args) {
        new Thread(new Server(6666)).start();
    }


    /**
     * This function is used to send message to all users in the chat room(userList)
     * @param message - the message sent by user
     */
    public void sendToAllUsers(String message){
        for (User user : usersList){
            user.getWriter().println(user.getUserName() + " : " + message);
        }
    }


    /**
     * When a new user connected to this server, read the first line of input as the the user's name.
     * Then add the user to the userList, then start a new thread to handle the client
     */
    @Override
    public void run() {
        try {
            server = new ServerSocket(port);
            server.setReuseAddress(true);
            System.out.println("Listening on port: " + port);

            while (true){
                Socket socket = server.accept();
                System.out.println("Client connected " + socket.getInetAddress().getHostAddress());
                String userName = new BufferedReader(new InputStreamReader(socket.getInputStream())).readLine();
                User newUser = new User(socket, userName);
                usersList.add(newUser);

                ClientHandler client = new ClientHandler(this, newUser);
                new Thread(client).start();
            }


        }catch (Exception e){
            e.printStackTrace();
        }

        try {
            server.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
