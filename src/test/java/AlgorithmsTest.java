import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.exercise2.Algorithms;

public class AlgorithmsTest {
    @Test
    public void testQuickSortEmptyArray() {
        int[] arr = {};
        Algorithms.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[] {}, arr);
    }

    @Test
    public void testQuickSortSingleElement() {
        int[] arr = { 5 };
        Algorithms.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[] { 5 }, arr);
    }

    @Test
    public void testQuickSortAlreadySorted() {
        int[] arr = { 1, 2, 3, 4, 5 };
        Algorithms.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, arr);
    }

    @Test
    public void testQuickSortUnsortedArray() {
        int[] arr = { 3, -1, 0, 5, 2 };
        Algorithms.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[] { -1, 0, 2, 3, 5 }, arr);
    }

    // Kiểm tra với mảng toàn phần tử giống nhau:
    @Test
    public void testQuickSortSameElements() {
        int[] arr = { 5, 5, 5, 5 };
        Algorithms.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[] { 5, 5, 5, 5 }, arr);
    }

    // Kiểm tra với mảng chỉ có 2 phần tử, và cần hoán đổi
    @Test
    public void testQuickSortTwoElements() {
        int[] arr = { 10, -5 };
        Algorithms.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[] { -5, 10 }, arr);
    }

    // Kiểm tra với mảng có số lớn nhất ở đầu
    @Test
    public void testQuickSortMaxElementFirst() {
        int[] arr = { 100, 1, 2, 3, 4 };
        Algorithms.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[] { 1, 2, 3, 4, 100 }, arr);
    }

    // Kiểm tra với mảng có số nhỏ nhất ở cuối
    @Test
    public void testQuickSortMinElementLast() {
        int[] arr = { 3, 2, 1, 0, -1 };
        Algorithms.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[] { -1, 0, 1, 2, 3 }, arr);
    }

    @Test
    public void testAlgorithmsConstructor() {
        Algorithms algorithms = new Algorithms();
        assertNotNull(algorithms);
    }

}
