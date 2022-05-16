package zoo.fish;

import zoo.Action;

public class Сatfish implements Action {

    @Override
    public String getBreathe() {
        return  "Дышит жабрами";
    }

    @Override
    public String getMove() {
        return  "Плавает при помощи хвоста и плавников";
    }

    public String  live() {
        return  "Живёт на дне рек в ямах";
    }

    @Override
    public String toString() { return "< Информация о рыбе Сом: "; }

}