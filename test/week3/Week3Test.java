package week3;
import org.junit.Test;
import static org.junit.Assert.*;
public class Week3Test {

    // TODO: Viết 5 testcase cho phương thức max()

        @Test
        public void testMax() {
            assertEquals(-1, Week3.max(-1, -3));}
        @Test
        public void testMax1() {
            assertEquals(-1, Week3.max(-1, -1));}
        @Test
        public void testMax2() {
            assertEquals(0, Week3.max(-1, 0));}
        @Test
        public void testMax3() {
            assertEquals(5, Week3.max(-5, 5));}
        @Test
        public void testMax4() {
            assertEquals(9, Week3.max(6, 9));}

    // TODO: Viết 5 testcase cho phương thức minOfArray()
    @Test
    public void testMinOfArray() {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(1, Week3.minOfArray(a));}
    @Test
    public void testMinOfArray1() {
        int a[] = {-1,-2,-4,-1,10};
        assertEquals(-4, Week3.minOfArray(a));}
    @Test
    public void testMinOfArray2() {
        int a[] = {0,0,0,0,0,0};
        assertEquals(0, Week3.minOfArray(a));}
    @Test
    public void testMinOfArray3() {
        int a[] = {-1001, -20002, -33};
        assertEquals(-20002, Week3.minOfArray(a));}
    @Test
    public void testMinOfArray4() {
        int a[] = {6,9,0,-6,-9};
        assertEquals(-9, Week3.minOfArray(a));}

    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    @Test
    public void testcalculateBMI(){
        assertEquals("Thiếu cân", Week3.calculateBMI(40, 1.7));}
    @Test
    public void testcalculateBMI1(){
        assertEquals("Béo phì", Week3.calculateBMI(90, 1.5));}
    @Test
    public void testcalculateBMI2(){
        assertEquals("Bình thường", Week3.calculateBMI(45, 1.5));}
    @Test
    public void testcalculateBMI3(){
        assertEquals("Thừa cân", Week3.calculateBMI(69.36, 1.7));}
    @Test
    public void testcalculateBMI4(){
        assertEquals("Thiếu cân", Week3.calculateBMI(40, 1.7));}
}

