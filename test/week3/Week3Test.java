package week3;
import org.junit.Test;
import static org.junit.Assert.*;
public class Week3Test {

    // TODO: Viết 5 testcase cho phương thức max()
    @Test
    public void testMax() {
        assertEquals(-1, Week3.max(-1, -3));
        assertEquals(3, Week3.max(3, 0));
        assertEquals(3, Week3.max(-1, 3));
        assertEquals(1000, Week3.max(-1000, 1000));
        assertEquals(0, Week3.max(-4, 0));
    }


    // TODO: Viết 5 testcase cho phương thức minOfArray()
    @Test
    public void testMinOfArray() {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(1, Week3.minOfArray(a));
        int b[] = {-1, 0, 5, 4, -2, 0, 19};
        assertEquals(-2, Week3.minOfArray(b));
        int c[] = {0, 0, 0, 0, 0, 0};
        assertEquals(0, Week3.minOfArray(c));
        int d[] = {999, -999};
        assertEquals(-999, Week3.minOfArray(d));
        int e[] = {1, 3, 5, 7, 10000};
        assertEquals(1, Week3.minOfArray(e));
    }

    // TODO: Viết 5 testcase cho phương thức calculateBMI()
 @Test
    public void testcalculateBMI(){
        assertEquals("Thiếu cân", Week3.calculateBMI(40, 1.7));
        assertEquals("Béo phì", Week3.calculateBMI(100, 1.5));
        assertEquals("Bình thường", Week3.calculateBMI(65, 1.7));
        assertEquals("Thừa cân", Week3.calculateBMI(69.12, 1.7));
        assertEquals("Béo phì", Week3.calculateBMI(80, 1.2));
    }
}
