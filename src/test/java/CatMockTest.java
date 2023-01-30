import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

public class CatMockTest {

    @Mock
    Cat cat;
    @Mock
    Feline feline;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void getSoundTest() {
        Mockito.when(cat.getSound()).thenReturn("Pp");
        assertEquals("Pp", cat.getSound());
    }

    @Test
    public void getFoodTest() throws Exception {
        feline.getFood("Kot");
        Mockito.verify(feline).getFood(Mockito.anyString());
    }
}
