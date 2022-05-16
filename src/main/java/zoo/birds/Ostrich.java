package zoo.birds;

import zoo.Action;

public class Ostrich implements Action {

    @Override
    public String getBreathe() { return  "Дышит через носовые полости"; }

    @Override
    public String getMove() {
        return  "Передвигается по земле на двух лапах, летать не умеет";
    }

    public String  run() {
        return "Очень быстро бегает";
    }

    @Override
    public String toString() {
        return "< Информация о птице Страус: ";
    }
}
