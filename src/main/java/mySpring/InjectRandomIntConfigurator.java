package mySpring;


import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.util.Random;

public class InjectRandomIntConfigurator implements ObjectConfigurator {

    private Random random = new Random();

    @SneakyThrows
    @Override
    public <T> T configObject(T o) {
        Class<?> type = o.getClass();
        Field[] fields = type.getDeclaredFields();
        for (Field field : fields) {

            InjectRandomInt annotation = field.getAnnotation(InjectRandomInt.class);
            if (annotation != null) {
                int min = annotation.min();
                int max = annotation.max();
                int randomIntValue = random.nextInt(max - min) + min;
                field.setAccessible(true);
                field.set(o, randomIntValue);

            }
        }
        return o;
    }
}
