package zoo.beasts;

import zoo.Action;

public class Cat implements Action {

    @Override
    public String getBreathe() { return  "Дышит ноздрями"; }

    @Override
    public String getMove() { return  "Передвигается по земле на четырёх лапах"; }

    public String prey() {
        return  "Ловит мышей в доме";
    }

    @Override
    public String toString() {
        return "< Информация о животном  Кот: ";
    }
}
