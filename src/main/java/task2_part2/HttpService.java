package task2_part2;

import java.util.ArrayList;
import java.util.List;

public class HttpService {

    private List<Class<? extends CodeProcessor>> codeClasses = new ArrayList<>();

    //@SneakyThrows
    public void handleHttpCode(int code) {
        HttpStatus status = HttpStatus.findByHttpCode(code);
        CodeProcessor codeProcessor = status.getCodeProcessor();
        codeProcessor.processCode(code);

    }
}
