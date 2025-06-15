import java.util.logging.Logger;
import java.util.logging.Level;

interface Shape {
    void draw();
    void resize();
}

class Square implements Shape {
    private static final Logger LOGGER = Logger.getLogger(Square.class.getName());

    public void draw() {
        LOGGER.log(Level.INFO, "Drawing square");
    }

    public void resize() {
        LOGGER.log(Level.INFO, "Resizing square");
    }
}

public class IncompleteInterfaceImplementationExample {
    public static void main(String[] args) {
        Shape square = new Square();
        square.draw();
        square.resize();
    }
}