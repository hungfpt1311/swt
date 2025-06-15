import java.util.logging.Logger;

class Animal {
    void speak() {
        Logger.getLogger(Animal.class.getName()).info("Animal speaks");
    }
}

class Dog extends Animal {
    private static final Logger logger = Logger.getLogger(Dog.class.getName());

    @Override
    void speak() {
        logger.info("Dog barks");
    }
}
