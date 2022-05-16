package zoo.fish;

import zoo.Action;

public class Pike implements Action {
    @Override
    public String getBreathe() { return  "Дышит кислородом жабрами"; }

    @Override
    public String getMove() {
        return  "Плавает при помощи хвоста и плаников";
    }

    public String eat() {
        return  "Питается другими видами рыб";
    }

    @Override
    public String toString() {
        return "< Информация о рыбе Щука: ";
    }
}
