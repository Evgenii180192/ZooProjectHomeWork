package zoo;

import zoo.beasts.*;
import zoo.birds.*;
import zoo.fish.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Pigeon pigeon = new Pigeon();
        Ostrich ostrich = new Ostrich();
        Pike pike = new Pike();
        Сatfish catfish = new Сatfish();

        HashMap <Integer, String> listAnimal = new HashMap<>();
        listAnimal.put(1, "Собака");
        listAnimal.put(2, "Кот");
        listAnimal.put(3, "Голубь");
        listAnimal.put(4, "Страус");
        listAnimal.put(5, "Щука");
        listAnimal.put(6, "Сом");

    while (true) {
        System.out.println("* Чтобы узнать информацию о животном укажи его номер *");
        for (Map.Entry <Integer, String > animal : listAnimal.entrySet()) {
        System.out.print(animal.getKey() + "." + animal.getValue() + "  ");
    }       System.out.println();
            Scanner scanner = new Scanner(System.in);
            int userNum = scanner.nextInt();
            switch (userNum) {
                case 1: {
                    System.out.println(dog + dog.getBreathe() + ". " + dog.getMove() + ". " + dog.guard() + ". >");
                    System.out.println("                                                                             ");
                    break;
                }
                case 2: {
                    System.out.println(cat + cat.getBreathe() + ". " + cat.getMove() + ". " + cat.prey() + ". >");
                    System.out.println("                                                                             ");
                    break;
                }
                case 3: {
                    System.out.println(pigeon + pigeon.getBreathe() + ". " + pigeon.getMove() + ". "
                                        + pigeon.shit() + ". >");
                    System.out.println("                                                                             ");
                    break;
                }
                case 4: {
                    System.out.println(ostrich + ostrich.getBreathe() + ". " + ostrich.getMove() + ". "
                                        + ostrich.run() + ". >");
                    System.out.println("                                                                             ");
                    break;
                }
                case 5: {
                    System.out.println(pike + pike.getBreathe() + ". " + pike.getMove() + ". " + pike.eat() + ". >");
                    System.out.println("                                                                             ");
                    break;
                }
                case 6: {
                    System.out.println(catfish + catfish.getBreathe() + ". " + catfish.getMove() + ". "
                    + catfish.live() + ". >");
                    System.out.println("                                                                             ");
                    break;
                }
            }
                if (userNum <= 0) {
                    System.out.println("Выход из программы.....");
                    break;
                } else if (userNum > 6) {
                    System.out.println("Внимание.Под таким номером ничего нет!!!");
            }
        }
    }
}