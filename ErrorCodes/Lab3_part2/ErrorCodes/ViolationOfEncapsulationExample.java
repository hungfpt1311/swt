import java.util.logging.Logger;

public class ViolationOfEncapsulationExample {
    private static final Logger logger = Logger.getLogger(ViolationOfEncapsulationExample.class.getName());

    private String name;
    private int age;

    public ViolationOfEncapsulationExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display() {
        if (logger.isLoggable(java.util.logging.Level.INFO)) {
            logger.info(String.format("Name: %s, Age: %d", name, age));
        }
    }

    public static void main(String[] args) {
        ViolationOfEncapsulationExample example = new ViolationOfEncapsulationExample("John", 25);
        example.display();
        example.setName("Jane");
        example.setAge(26);
        logger.info("New Name: " + example.getName() + ", New Age: " + example.getAge());
    }
}