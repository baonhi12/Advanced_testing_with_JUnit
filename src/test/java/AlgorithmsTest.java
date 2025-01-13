import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.exercise2.Algorithms;

import java.util.Arrays;
import java.util.Random;

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

    // Kiểm tra với mảng có giá trị trùng lặp và số âm xen kẽ
    @Test
    public void testQuickSortMixedDuplicatesAndNegatives() {
        int[] arr = { 5, -5, 0, 5, -5, 0 };
        Algorithms.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[] { -5, -5, 0, 0, 5, 5 }, arr);
    }

    // Kiểm tra mảng giảm dần
    @Test
    public void testQuickSortDescendingArray() {
        int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        Algorithms.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, arr);
    }

    // Kiểm tra mảng `null`
    @Test
    public void testQuickSortNullArray() {
        NullPointerException exception = assertThrows(NullPointerException.class, () -> {
            int[] arr = null;
            Algorithms.quickSort(arr, 0, 0);
        });
        assertEquals("Input array is null", exception.getMessage());
    }

    // Kiểm tra mảng lớn với dữ liệu ngẫu nhiên
    @Test
    public void testQuickSortLargeArray() {
        int size = 1000000; // 1 triệu phần tử
        int[] arr = new int[size];
        int[] expected = new int[size];

        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(1000000);
            expected[i] = arr[i];
        }

        Arrays.sort(expected); // Kết quả mong đợi
        Algorithms.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(expected, arr);
    }

    // Sử dụng @ParameterizedTest để kiểm tra các trường hợp
    @ParameterizedTest
    @CsvSource({
            "'1,3,2,5,4', '1,2,3,4,5'",
            "'10,5,-5,0,2', '-5,0,2,5,10'",
            "'100,1,50,-100,-1', '-100,-1,1,50,100'"
    })
    public void testQuickSortParameterized(String input, String expected) {
        int[] arr = parseArray(input);
        int[] expectedArr = parseArray(expected);
        Algorithms.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(expectedArr, arr);
    }

    private int[] parseArray(String input) {
        return Arrays.stream(input.split(","))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    @Test
    public void testAlgorithmsConstructor() {
        Algorithms algorithms = new Algorithms();
        assertNotNull(algorithms);
    }

}
