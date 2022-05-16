package zoo.birds;

import zoo.Action;

public class Pigeon implements Action {
    @Override
    public String getBreathe() { return  "Дышит через носовые полости"; }

    @Override
    public String  getMove() {
        return "Передвигается по воздуху на крыльях либо по земле на двух лапах";
    }

    public String shit() {
        return "Любит гадить на автомобили";
    }

    @Override
    public String toString() {
        return "< Информация о птице Голубь: ";
    }
}
