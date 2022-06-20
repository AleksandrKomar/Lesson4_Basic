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
        System.out.println("XML �������� ������.");
    }

    @Override
    void open() {
        System.out.println("XML �������� ������.");
    }

    @Override
    void change() {
        System.out.println("XML �������� �������.");
    }

    @Override
    void save() {
        System.out.println("XML �������� ��������.");
    }
}

class TXTHandler extends AbstractHandler {

    @Override
    void create() {
        System.out.println("TXT �������� ������.");
    }

    @Override
    void open() {
        System.out.println("TXT �������� ������.");
    }

    @Override
    void change() {
        System.out.println("TXT �������� �������.");
    }

    @Override
    void save() {
        System.out.println("TXT �������� ��������.");
    }
}

class DOCHandle extends AbstractHandler {


    @Override
    void create() {
        System.out.println("DOC �������� ������.");
    }

    @Override
    void open() {
        System.out.println("DOC �������� ������.");
    }

    @Override
    void change() {
        System.out.println("DOC �������� �������.");
    }

    @Override
    void save() {
        System.out.println("DOC �������� ��������.");
    }
}

