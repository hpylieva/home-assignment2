package never_use_switch;


import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class MailSender2 {

    private List<Class <?extends MailGenerator>> mailClasses = new ArrayList<>();

    public MailSender2() {
        Reflections scanner = new Reflections("never_use_switch");
        Set<Class<? extends MailGenerator>> classes = scanner.getSubTypesOf(MailGenerator.class);
        for (Class<? extends MailGenerator> aClass : classes) {
            if (!Modifier.isAbstract(aClass.getModifiers())) {
                mailClasses.add(aClass);
            }
        }
    }

    @SneakyThrows
    public void sendMail(MailInfo mailInfo) {
        Random random = new Random();

        Class <? extends MailGenerator> mailClass = mailClasses.get(random.nextInt(mailClasses.size()));
       MailGenerator mailGenerator = mailClass.newInstance();
//        if (mailGenerator == null) {
//            throw new IllegalStateException(mailInfo.getMailCode() + " not supported yet");
//        }
        String html = mailGenerator.generateHtml(mailInfo);
        send(html,mailInfo);
    }

    private void send(String html, MailInfo mailInfo) {
        System.out.println("sending to ... " + html);
    }


}
