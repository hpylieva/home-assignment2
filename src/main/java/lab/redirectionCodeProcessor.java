package lab;

public class redirectionCodeProcessor implements CodeProcessor {
    @Override
    public void processCode(int code) {
        System.out.println("You are redirected with code "+code);
    }
}
