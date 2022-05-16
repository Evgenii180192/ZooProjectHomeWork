import org.testng.Assert;
import org.testng.annotations.Test;
import zoo.beasts.Cat;
import zoo.beasts.Dog;
import zoo.birds.Ostrich;
import zoo.birds.Pigeon;

import java.util.HashMap;

public class ZooPositiveTest {

   @Test(groups = "Positive test")
    public void  checkMethodBreatheTest() {
      Cat cat = new Cat();
      cat.getBreathe();
      Assert.assertEquals(cat.getBreathe(), "Дышит ноздрями");
    }

    @Test(groups = "Positive test")
    public void checkMethodMoveTest() {
      Dog dog = new Dog();
      dog.getMove();
      Assert.assertEquals(dog.getMove(), "Передвигается на четырёх лапах по земле");
    }

    @Test(groups = "Positive test")
    public void checkMethodRunTest() {
      Ostrich ostrich = new Ostrich();
      ostrich.run();
      Assert.assertEquals(ostrich.run(), "Очень быстро бегает");
    }

    @Test(groups = "Positive test")
    public void checkNotEqualityValueMethodShitTest() {
      Pigeon pigeon = new Pigeon();
      pigeon.shit();
      Assert.assertNotEquals(pigeon.shit(), "Не любит гадить на автомобили");
    }

    @Test(groups = "Positive test")
    public void checkTrueValueTest() {
      HashMap<Integer, String> listAnimal = new HashMap<>();
        listAnimal.put(1, "Собака");
        listAnimal.put(2, "Кот");
        listAnimal.put(3, "Голубь");
        listAnimal.put(4, "Страус");
        listAnimal.put(5, "Щука");
        listAnimal.put(6, "Сом");
      Assert.assertTrue(!(listAnimal.isEmpty()));
    }


}
