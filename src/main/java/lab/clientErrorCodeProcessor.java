package lab;

public class clientErrorCodeProcessor implements CodeProcessor {
    @Override
    public void processCode(int code) {
        System.out.println("Client error wth code " + code);
    }
}
