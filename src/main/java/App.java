import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld firstHelloWorld = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(firstHelloWorld.getMessage());

        HelloWorld secondHelloWorld = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(secondHelloWorld.getMessage());

        Cat firstCat = (Cat) applicationContext.getBean("cat");
        System.out.println(firstCat.getName());

        Cat secondCat = (Cat) applicationContext.getBean("cat");
        System.out.println(secondCat.getName());

        System.out.println(secondHelloWorld == firstHelloWorld);
        System.out.println(firstCat == secondCat);
    }
}