package lab;

import lombok.SneakyThrows;
import org.aspectj.apache.bcel.classfile.Code;
import org.reflections.Reflections;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class HttpService {

    private List<Class<? extends CodeProcessor>> codeClasses = new ArrayList<>();

    //@SneakyThrows
    public void handleHttpCode(int code) {
        HttpStatus status = HttpStatus.findByHttpCode(code);
        CodeProcessor codeProcessor = status.getCodeProcessor();
        codeProcessor.processCode(code);

    }
}
