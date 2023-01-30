import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Test
    public void getFoodTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самка", feline);
        lion.getFood().indexOf("Животные");
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }

    @Test
    public void getKittensTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самка", feline);
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void getManeFelseTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самка", feline);
        assertFalse(lion.doesHaveMane());
    }

    @Test
    public void getManeTrueTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самец", feline);
        assertTrue(lion.doesHaveMane());
    }

}
