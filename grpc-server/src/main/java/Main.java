import grpc.Server;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        new Server().echo();
        System.out.println("test Main func");
    }
}
