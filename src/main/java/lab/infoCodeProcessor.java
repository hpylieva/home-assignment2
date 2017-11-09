package lab;

public class infoCodeProcessor implements CodeProcessor {
    @Override
    public void processCode(int code) {
        System.out.println("There is information for you with code "+code);
    }
}
