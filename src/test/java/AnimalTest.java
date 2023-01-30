import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertNotEquals;

@RunWith(Parameterized.class)
public class AnimalTest {
    private final String animalKind;
    private final String food;

    public AnimalTest(String animalKind, String food) {
        this.animalKind = animalKind;
        this.food = food;
    }

    @Parameterized.Parameters(name = "Тестовые данные: animalKind -> {0}, food -> {1}")
    public static Object[][] getTestData() {
        final Object[][] objects = {
                {"Травоядное", "Трава"},
                {"Травоядное", "Различные растения"},
                {"Хищник", "Животные"},
                {"Хищник", "Птицы"},
                {"Хищник", "Рыба"},
        };
        return objects;
    }

    @Test
    public void FoodTest() throws Exception {
        Animal animal = new Animal();
        assertNotEquals("В списке еды отсутствует: " + food, -1, animal.getFood(animalKind).indexOf(food));
    }
}
