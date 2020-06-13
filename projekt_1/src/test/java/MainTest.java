import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest
{
    Data test_data1, test_data2, test_data3, test_data4, test_data5;

    @Before
    public void setUp(){
        test_data1 = new Data("Wojciech", "Jagodziński", "Piła", "70111a17646");
        test_data2 = new Data("Wojciech", "Jagodziński", "Piła", "69062524549");
        test_data3 = new Data("Wojciech", "Jagodziński", "Piła", "5309122387");
        test_data4 = new Data("Wojciech", "Jagodziński", "Piła", "460425199771");
        test_data5 = new Data("Wojciech", "Jagodziński", "Piła", "71111417646");
    }

    @Test
    public void onlyNumbers()
    {
        boolean containsChar = test_data1.checkPIN();
        assertFalse(containsChar);
    }

    @Test
    public void correctPIN()
    {
        boolean correctPIN = test_data2.checkPIN();
        assertTrue(correctPIN);
    }

    @Test
    public void incorrectPIN()
    {
        boolean incorrect = test_data5.checkPIN();
        assertFalse(incorrect);
    }

    @Test
    public void tooShortPIN()
    {
        boolean tooShort = test_data3.checkPIN();
        assertFalse(tooShort);
    }

    @Test
    public void tooLongPIN()
    {
        boolean tooLong = test_data4.checkPIN();
        assertFalse(tooLong);
    }


    @Test
    public void emptyData(){
        boolean emptyData = Main.isSet("");
        assertFalse(emptyData);
    }
}