package hometasks.task2;

public abstract class AbstractHandler {

    abstract void create();

    abstract void open();

    abstract void change();

    abstract void save();

}

class XMLHandler extends AbstractHandler {

    @Override
    void create() {
        System.out.println("XML документ создан.");
    }

    @Override
    void open() {
        System.out.println("XML документ открыт.");
    }

    @Override
    void change() {
        System.out.println("XML документ изменен.");
    }

    @Override
    void save() {
        System.out.println("XML документ сохранен.");
    }
}

class TXTHandler extends AbstractHandler {

    @Override
    void create() {
        System.out.println("TXT документ создан.");
    }

    @Override
    void open() {
        System.out.println("TXT документ открыт.");
    }

    @Override
    void change() {
        System.out.println("TXT документ изменен.");
    }

    @Override
    void save() {
        System.out.println("TXT документ сохранен.");
    }
}

class DOCHandle extends AbstractHandler {


    @Override
    void create() {
        System.out.println("DOC документ создан.");
    }

    @Override
    void open() {
        System.out.println("DOC документ открыт.");
    }

    @Override
    void change() {
        System.out.println("DOC документ изменен.");
    }

    @Override
    void save() {
        System.out.println("DOC документ сохранен.");
    }
}

