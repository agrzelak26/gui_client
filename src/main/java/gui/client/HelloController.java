package gui.client;

import javafx.scene.control.*;

import java.client.ServerThread;

public class HelloController {

    private ServerThread serverThread;
    private ClientGuiReceiver receiver;

    public HelloController(ServerThread serverThread, ClientGuiReceiver receiver) {
        this.serverThread = serverThread;
        this.receiver = receiver;
    }

    public TextArea outputArea;
    public TextField inputField;
    public Button sendButton;
    public Button sendFileButton;
    public ListView clientList;
    public ProgressBar fileProgressBar;
}