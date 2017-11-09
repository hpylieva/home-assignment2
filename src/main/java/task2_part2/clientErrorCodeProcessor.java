package task2_part2;

public class clientErrorCodeProcessor implements CodeProcessor {
    @Override
    public void processCode(int code) {
        System.out.println("Client error wth code " + code);
    }
}
