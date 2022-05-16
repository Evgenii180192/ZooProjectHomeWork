package zoo.beasts;

import zoo.Action;

public class Dog implements Action {

    @Override
    public  String getBreathe() { return "Дышит ноздрями"; }

    @Override
    public String  getMove() {
        return  "Передвигается на четырёх лапах по земле";
    }

    public String guard() {
        return  "Охраняет дом от воров";
    }

    @Override
    public String toString() {
        return "< Информация о животном Собака: ";
    }


}
