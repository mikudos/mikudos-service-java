import grpc.Server;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = new Server();
        server.init();
        server.start();
    }
}
