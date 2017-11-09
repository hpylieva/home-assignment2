package lab;

public class serverErrorCodeProcessor implements CodeProcessor {
    @Override
    public void processCode(int code) {
        System.out.println("Server error with code "+ code);
    }
}
