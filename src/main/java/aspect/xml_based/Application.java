package aspect.xml_based;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Application {
    public static void main(String[] args){
        ApplicationContext context = new FileSystemXmlApplicationContext("/src/main/java/aspect/xml_based/config/expert.xml");
        Person person = (Person) context.getBean("girl");
        person.housework();
    }
}
