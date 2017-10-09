package test;
import com.softserve.armstrong.CountArmstrong;
import org.junit.Test;



import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by ${Mirek} on 08.10.2017.
 */
public class CountArmstrongTest {
    @Test
    public void numberArmstrong() throws Exception {
        List<Integer> expected = new ArrayList<>();
        CountArmstrong countArmstrong = new CountArmstrong();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);
        expected.add(8);
        expected.add(9);
        expected.add(153);
        List<Integer> actual = countArmstrong.numberArmstrong(200);
        assertEquals(expected, actual);
    }

}