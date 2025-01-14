# Advanced_testing_with_JUnit

The source code includes functions designed to perform various computational tasks, with a particular focus on functionality and correctness. Each module and function is developed to meet a specific requirement. Below is an analysis of the key aspects:

- Function Purpose: The main function performs operations such as processing data and calculating specific results.

- Error Handling: Proper exception handling is in place to manage unexpected inputs or issues during execution.

- Code Quality: The code is modular, reusable, and adheres to common programming standards.


## Authors

- FullName: PHAM BAO NHI 
- SID: BIT220127
- Class: 22IT-SE2


## Implementation

### Algorithms Class

The class likely holds data attributes to store information about input arrays, sorting results, and possibly metadata such as execution time for testing the algorithms.

The primary purpose of the Algorithms class seems to be implementing and testing sorting algorithms (e.g., Bubble Sort, Quick Sort, Merge Sort).

- The methods within this class execute sorting algorithms on input arrays.

- They likely measure execution time and store the sorted output for verification.

Helper methods are probably included for comparing expected results with the actual output (e.g., using assertions or checking array equivalence).

Implementations of classic sorting techniques:

- Bubble Sort: A simple comparison-based algorithm with a worst-case time complexity.

- Quick Sort: A divide-and-conquer algorithm with average-case complexity.

- Merge Sort: A stable and efficient divide-and-conquer sorting algorithm, also with a time complexity.

### AlgorithmsTest Class

The test code prepares various input arrays to test the sorting algorithms:

- Random Array: Used to test the ability to sort unsorted data.

- Pre-sorted Array: Checks whether the algorithm correctly handles already sorted input.

- Reverse-sorted Array (descending): Evaluates algorithm performance in worst-case scenarios.

- Empty or Small Arrays: Ensures the algorithms work safely on edge-case inputs.

Sorting algorithms tested include: Bubble Sort, Quick Sort, Merge Sort. Each algorithm is applied to the same input dataset to maintain consistency during testing.
![testcase (1)](https://github.com/user-attachments/assets/313905fe-a2fc-4ba8-a232-43fb6ebd5e16)

![testcase (2)](https://github.com/user-attachments/assets/c6c433d8-23d7-44ed-8a5b-64399edd6617)

![testcase (3)](https://github.com/user-attachments/assets/641fb98b-5e23-420a-8a04-6f3fe496b995)



## Results

### Output Results

#### Correctness:

- The Bubble Sort, Quick Sort, and Merge Sort algorithms all sorted the input data correctly in the test cases.

- No logical errors or issues were detected in the results.

#### Performance:

- Quick Sort and Merge Sort performed more efficiently than Bubble Sort for larger datasets.

- Bubble Sort took the longest execution time, especially on random and reverse-sorted datasets, due to its O(n^2) time complexity.

- Merge Sort and Quick Sort showed comparable performance in many cases, with significantly shorter execution times than Bubble Sort.

```bash
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running AlgorithmsTest
Tests run: 9, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.031 sec

Results :

Tests run: 9, Failures: 0, Errors: 0, Skipped: 0

[INFO]
[INFO] --- jacoco-maven-plugin:0.8.10:report (default-cli) @ ex2 ---      
[INFO] Loading execution data file D:\Documents\HK8\KTPM\ASSIGNMENT\ex2\target\jacoco.exec
[INFO] Analyzed bundle 'ex2' with 2 classes
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.874 s
[INFO] Finished at: 2025-01-06T16:24:29+07:00
[INFO] ------------------------------------------------------------------------
```
![result1](https://github.com/user-attachments/assets/35bb7370-cc9b-4eab-9333-2e4f21c66d7e)

![result2](https://github.com/user-attachments/assets/45c0e12f-cd75-4f3c-8d6e-38f23f57086a)



The test code for the AlgorithmsTest class effectively ensures the correctness and measures the performance of sorting algorithms in the Algorithms class. The test results (PASS) indicate that the algorithms perform as expected. The information on execution time helps evaluate the efficiency of each algorithm, allowing decisions on which algorithm to use for specific scenarios.



## ChatGPT Link

https://chatgpt.com/share/677baed2-bd44-8011-987d-eace0bd0eb19 
