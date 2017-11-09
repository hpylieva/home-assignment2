package lab;

public class successCodeProcessor implements CodeProcessor {
    @Override
    public void processCode(int code) {
        System.out.println("Success with code "+code);
    }
}
