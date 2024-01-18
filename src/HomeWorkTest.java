import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HomeWorkTest {

    @Test
    public void test_HomeWork_countName() {
        List<String> names = List.of("Tom", "John", "Eva", "Sara", "Tom", "Liza", "Anna", "Tom");
        String selected = "Tom";


        HomeWork homeWork = new HomeWork();

        int result = homeWork.countName(names, selected);
        assertEquals(3, result);


        String noName = "Monica";
       int  noNameResult = homeWork.countName (names,noName);
        assertEquals(0, noNameResult);


    }
}
