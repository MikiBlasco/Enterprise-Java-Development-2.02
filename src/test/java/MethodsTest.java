import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MethodsTest {

    List<Integer> list1 = Arrays.asList(1,3,5);
    List<String> list2 = Arrays.asList( "abstract", "assert", "boolean");



    @Test
    @DisplayName("Debería devolver los números impares en un array")
    public  void returnOddNumsInArray(){
       assertEquals(list1, Methods.oddArray(6));

    }

    @Test
    public void returnTrueIfKeyWord(){
          assertEquals(true, Methods.findKeyWords("I work while this happens"));
    }

}
