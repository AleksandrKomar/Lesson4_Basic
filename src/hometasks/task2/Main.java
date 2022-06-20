package hometasks.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Введите тип документа (xml/txt/doc) - ");

        String typeDoc = new Scanner(System.in).next().toLowerCase();

        switch (typeDoc) {
            case "xml" -> {
                AbstractHandler xmlHandler = new XMLHandler();
                xmlHandler.create();
                xmlHandler.open();
                xmlHandler.change();
                xmlHandler.save();
            }
            case "txt" -> {
                AbstractHandler txtHandler = new TXTHandler();
                txtHandler.create();
                txtHandler.open();
                txtHandler.change();
                txtHandler.save();
            }
            case "doc" -> {
                AbstractHandler docHandler = new DOCHandle();
                docHandler.create();
                docHandler.open();
                docHandler.change();
                docHandler.save();
            }
            default -> System.out.println("Введен некорректный формат. Повторите.");
        }

    }


}
