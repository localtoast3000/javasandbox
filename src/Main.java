import pkgs.servers.BasicServer;

public class Main {
    public static void main(String[] args) {
        BasicServer server = new BasicServer(8000);
        server.init();
    }
}
