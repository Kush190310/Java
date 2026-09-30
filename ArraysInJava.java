import java.util.Arrays;
import java.util.Scanner;

/*
 * ============================================================
 *                 JAVA ARRAY COMPLETE GUIDE
 * ============================================================
 *
 * This program demonstrates Java Arrays from beginner
 * level to advanced level.
 *
 * TOPICS COVERED:
 *
 * 1. Creating an array
 * 2. Initializing an array
 * 3. Accessing elements
 * 4. Changing elements
 * 5. Array length
 * 6. Printing an array
 * 7. Looping through an array
 * 8. Enhanced for loop
 * 9. Taking array input
 * 10. Finding sum
 * 11. Finding average
 * 12. Finding minimum
 * 13. Finding maximum
 * 14. Searching
 * 15. Counting elements
 * 16. Even and odd numbers
 * 17. Positive and negative numbers
 * 18. Reversing an array
 * 19. Copying an array
 * 20. Arrays.copyOf()
 * 21. Arrays.copyOfRange()
 * 22. Arrays.equals()
 * 23. Arrays.fill()
 * 24. Arrays.sort()
 * 25. Binary search
 * 26. Finding duplicates
 * 27. Removing duplicates
 * 28. Frequency
 * 29. Second largest
 * 30. Second smallest
 * 31. Swapping elements
 * 32. Left rotation
 * 33. Right rotation
 * 34. 2D arrays
 * 35. Printing 2D arrays
 * 36. Row sum
 * 37. Column sum
 * 38. Matrix addition
 * 39. Matrix transpose
 * 40. Diagonal elements
 * 41. Matrix multiplication
 * 42. Jagged arrays
 * 43. Array of Strings
 * 44. Array of objects
 * 45. Variable arguments
 *
 * ============================================================
 */

public class ArraysInJava {

    public static void main(String[] args) {

        /*
         * ====================================================
         * 1. CREATING AN ARRAY
         * ====================================================
         *
         * An array stores multiple values of the same type.
         *
         * Syntax:
         *
         * dataType[] arrayName;
         *
         * Example:
         */

        int[] numbers;


        /*
         * ====================================================
         * 2. CREATING ARRAY WITH SIZE
         * ====================================================
         *
         * The size tells Java how many elements the array
         * can store.
         *
         * Index starts from 0.
         *
         * For an array of size 5:
         *
         * index:   0   1   2   3   4
         * value:   ?   ?   ?   ?   ?
         */

        numbers = new int[5];

        System.out.println(
                "Array length: " +
                        numbers.length
        );


        /*
         * ====================================================
         * 3. INITIALIZING AN ARRAY
         * ====================================================
         *
         * We can directly provide values.
         */

        int[] marks = {
                80,
                75,
                90,
                85,
                95
        };

        System.out.println(
                "Marks: " +
                        Arrays.toString(marks)
        );


        /*
         * ====================================================
         * 4. ACCESSING ARRAY ELEMENTS
         * ====================================================
         *
         * Use the index to access an element.
         */

        System.out.println(
                "First element: " +
                        marks[0]
        );

        System.out.println(
                "Third element: " +
                        marks[2]
        );


        /*
         * ====================================================
         * 5. CHANGING ARRAY ELEMENTS
         * ====================================================
         *
         * Arrays are mutable.
         *
         * We can change an element using its index.
         */

        marks[0] = 100;

        System.out.println(
                "After changing first element: " +
                        Arrays.toString(marks)
        );


        /*
         * ====================================================
         * 6. ARRAY LENGTH
         * ====================================================
         *
         * length gives the number of elements.
         *
         * IMPORTANT:
         *
         * Array uses:
         *
         * array.length
         *
         * String uses:
         *
         * string.length()
         */

        System.out.println(
                "Array length: " +
                        marks.length
        );


        /*
         * ====================================================
         * 7. NORMAL FOR LOOP
         * ====================================================
         *
         * A normal for loop gives access to the index.
         */

        System.out.println(
                "\nNormal for loop:"
        );

        for (int i = 0; i < marks.length; i++) {

            System.out.println(
                    "Index " +
                            i +
                            " = " +
                            marks[i]
            );
        }


        /*
         * ====================================================
         * 8. ENHANCED FOR LOOP
         * ====================================================
         *
         * Enhanced for loop directly gives each element.
         *
         * It is useful when we do not need the index.
         */

        System.out.println(
                "\nEnhanced for loop:"
        );

        for (int mark : marks) {

            System.out.println(mark);
        }


        /*
         * ====================================================
         * 9. PRINT ARRAY
         * ====================================================
         *
         * Printing an array directly does not display its
         * contents properly.
         *
         * Use Arrays.toString().
         */

        System.out.println(
                "\nArray: " +
                        Arrays.toString(marks)
        );


        /*
         * ====================================================
         * 10. FIND SUM
         * ====================================================
         *
         * Add every element to a variable.
         */

        int sum = 0;

        for (int mark : marks) {

            sum += mark;
        }

        System.out.println(
                "Sum: " +
                        sum
        );


        /*
         * ====================================================
         * 11. FIND AVERAGE
         * ====================================================
         *
         * Average = sum / number of elements.
         *
         * Use double to get decimal results.
         */

        double average =
                (double) sum / marks.length;

        System.out.println(
                "Average: " +
                        average
        );


        /*
         * ====================================================
         * 12. FIND MINIMUM
         * ====================================================
         *
         * Start with the first element as minimum.
         *
         * Then compare every element.
         */

        int minimum = marks[0];

        for (int i = 1; i < marks.length; i++) {

            if (marks[i] < minimum) {

                minimum = marks[i];
            }
        }

        System.out.println(
                "Minimum: " +
                        minimum
        );


        /*
         * ====================================================
         * 13. FIND MAXIMUM
         * ====================================================
         */

        int maximum = marks[0];

        for (int i = 1; i < marks.length; i++) {

            if (marks[i] > maximum) {

                maximum = marks[i];
            }
        }

        System.out.println(
                "Maximum: " +
                        maximum
        );


        /*
         * ====================================================
         * 14. SEARCH FOR AN ELEMENT
         * ====================================================
         *
         * Linear search checks elements one by one.
         */

        int searchValue = 90;

        boolean found = false;

        for (int i = 0; i < marks.length; i++) {

            if (marks[i] == searchValue) {

                found = true;

                System.out.println(
                        "Found at index: " +
                                i
                );

                break;
            }
        }

        if (!found) {

            System.out.println(
                    "Element not found"
            );
        }


        /*
         * ====================================================
         * 15. COUNT OCCURRENCES
         * ====================================================
         *
         * Count how many times a particular number occurs.
         */

        int[] values = {
                2, 5, 2, 8, 2, 10, 5
        };

        int target = 2;

        int count = 0;

        for (int value : values) {

            if (value == target) {

                count++;
            }
        }

        System.out.println(
                "Occurrences of " +
                        target +
                        ": " +
                        count
        );


        /*
         * ====================================================
         * 16. PRINT EVEN NUMBERS
         * ====================================================
         */

        System.out.println(
                "\nEven numbers:"
        );

        for (int value : values) {

            if (value % 2 == 0) {

                System.out.println(value);
            }
        }


        /*
         * ====================================================
         * 17. PRINT ODD NUMBERS
         * ====================================================
         */

        System.out.println(
                "\nOdd numbers:"
        );

        for (int value : values) {

            if (value % 2 != 0) {

                System.out.println(value);
            }
        }


        /*
         * ====================================================
         * 18. POSITIVE AND NEGATIVE NUMBERS
         * ====================================================
         */

        int[] positiveNegative = {
                -10,
                5,
                -3,
                8,
                0,
                -7
        };

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int value : positiveNegative) {

            if (value > 0) {

                positiveCount++;

            } else if (value < 0) {

                negativeCount++;

            } else {

                zeroCount++;
            }
        }

        System.out.println(
                "Positive: " +
                        positiveCount
        );

        System.out.println(
                "Negative: " +
                        negativeCount
        );

        System.out.println(
                "Zero: " +
                        zeroCount
        );


        /*
         * ====================================================
         * 19. REVERSE AN ARRAY
         * ====================================================
         *
         * Use two indexes:
         *
         * left  -> beginning
         * right -> end
         *
         * Swap them and move toward the middle.
         */

        int[] reverseArray = {
                1, 2, 3, 4, 5
        };

        int left = 0;
        int right = reverseArray.length - 1;

        while (left < right) {

            int temp = reverseArray[left];

            reverseArray[left] =
                    reverseArray[right];

            reverseArray[right] =
                    temp;

            left++;
            right--;
        }

        System.out.println(
                "Reversed array: " +
                        Arrays.toString(reverseArray)
        );


        /*
         * ====================================================
         * 20. COPY AN ARRAY USING LOOP
         * ====================================================
         */

        int[] originalArray = {
                10, 20, 30, 40, 50
        };

        int[] copiedArray =
                new int[originalArray.length];

        for (int i = 0;
             i < originalArray.length;
             i++) {

            copiedArray[i] =
                    originalArray[i];
        }

        System.out.println(
                "Copied array: " +
                        Arrays.toString(copiedArray)
        );


        /*
         * ====================================================
         * 21. Arrays.copyOf()
         * ====================================================
         *
         * Creates a copy with the specified length.
         */

        int[] copyOfArray =
                Arrays.copyOf(
                        originalArray,
                        originalArray.length
                );

        System.out.println(
                "copyOf(): " +
                        Arrays.toString(copyOfArray)
        );


        /*
         * ====================================================
         * 22. Arrays.copyOfRange()
         * ====================================================
         *
         * Copies a range.
         *
         * Start index is included.
         * End index is excluded.
         */

        int[] rangeArray =
                Arrays.copyOfRange(
                        originalArray,
                        1,
                        4
                );

        System.out.println(
                "copyOfRange(): " +
                        Arrays.toString(rangeArray)
        );


        /*
         * ====================================================
         * 23. Arrays.equals()
         * ====================================================
         *
         * Compares the contents of two arrays.
         */

        int[] arrayOne = {
                1, 2, 3
        };

        int[] arrayTwo = {
                1, 2, 3
        };

        System.out.println(
                "Arrays equal: " +
                        Arrays.equals(
                                arrayOne,
                                arrayTwo
                        )
        );


        /*
         * ====================================================
         * 24. Arrays.fill()
         * ====================================================
         *
         * Fills every element with the same value.
         */

        int[] fillArray =
                new int[5];

        Arrays.fill(
                fillArray,
                10
        );

        System.out.println(
                "Filled array: " +
                        Arrays.toString(fillArray)
        );


        /*
         * ====================================================
         * 25. Arrays.sort()
         * ====================================================
         *
         * Sorts an array in ascending order.
         */

        int[] unsortedArray = {
                50, 10, 40, 20, 30
        };

        Arrays.sort(unsortedArray);

        System.out.println(
                "Sorted array: " +
                        Arrays.toString(unsortedArray)
        );


        /*
         * ====================================================
         * 26. BINARY SEARCH
         * ====================================================
         *
         * Binary search works on a sorted array.
         *
         * Arrays.binarySearch() returns:
         *
         * index if found
         * negative value if not found
         */

        int searchIndex =
                Arrays.binarySearch(
                        unsortedArray,
                        30
                );

        System.out.println(
                "Binary search index: " +
                        searchIndex
        );


        /*
         * ====================================================
         * 27. FIND DUPLICATE ELEMENTS
         * ====================================================
         *
         * Compare each element with every element after it.
         */

        int[] duplicateArray = {
                1, 2, 3, 2, 4, 1, 5
        };

        System.out.println(
                "\nDuplicate elements:"
        );

        for (int i = 0;
             i < duplicateArray.length;
             i++) {

            for (int j = i + 1;
                 j < duplicateArray.length;
                 j++) {

                if (duplicateArray[i] ==
                        duplicateArray[j]) {

                    System.out.println(
                            duplicateArray[i]
                    );

                    break;
                }
            }
        }


        /*
         * ====================================================
         * 28. REMOVE DUPLICATES
         * ====================================================
         *
         * This simple method creates a new array.
         *
         * It does not use HashSet.
         */

        int[] duplicateInput = {
                1, 2, 2, 3, 4, 4, 5
        };

        int[] uniqueArray =
                new int[duplicateInput.length];

        int uniqueCount = 0;

        for (int i = 0;
             i < duplicateInput.length;
             i++) {

            boolean alreadyExists = false;

            for (int j = 0;
                 j < uniqueCount;
                 j++) {

                if (uniqueArray[j] ==
                        duplicateInput[i]) {

                    alreadyExists = true;
                    break;
                }
            }

            if (!alreadyExists) {

                uniqueArray[uniqueCount] =
                        duplicateInput[i];

                uniqueCount++;
            }
        }

        System.out.print(
                "Unique elements: "
        );

        for (int i = 0;
             i < uniqueCount;
             i++) {

            System.out.print(
                    uniqueArray[i] +
                            " "
            );
        }

        System.out.println();


        /*
         * ====================================================
         * 29. SECOND LARGEST ELEMENT
         * ====================================================
         */

        int[] secondLargestArray = {
                10, 30, 20, 50, 40
        };

        int largest =
                Integer.MIN_VALUE;

        int secondLargest =
                Integer.MIN_VALUE;

        for (int value :
                secondLargestArray) {

            if (value > largest) {

                secondLargest = largest;
                largest = value;

            } else if (
                    value > secondLargest &&
                            value != largest) {

                secondLargest = value;
            }
        }

        System.out.println(
                "Largest: " +
                        largest
        );

        System.out.println(
                "Second largest: " +
                        secondLargest
        );


        /*
         * ====================================================
         * 30. SECOND SMALLEST ELEMENT
         * ====================================================
         */

        int[] secondSmallestArray = {
                10, 30, 20, 50, 40
        };

        int smallest =
                Integer.MAX_VALUE;

        int secondSmallest =
                Integer.MAX_VALUE;

        for (int value :
                secondSmallestArray) {

            if (value < smallest) {

                secondSmallest = smallest;
                smallest = value;

            } else if (
                    value < secondSmallest &&
                            value != smallest) {

                secondSmallest = value;
            }
        }

        System.out.println(
                "Smallest: " +
                        smallest
        );

        System.out.println(
                "Second smallest: " +
                        secondSmallest
        );


        /*
         * ====================================================
         * 31. SWAP TWO ELEMENTS
         * ====================================================
         */

        int[] swapArray = {
                10, 20, 30
        };

        int swapTemp =
                swapArray[0];

        swapArray[0] =
                swapArray[2];

        swapArray[2] =
                swapTemp;

        System.out.println(
                "After swap: " +
                        Arrays.toString(swapArray)
        );


        /*
         * ====================================================
         * 32. LEFT ROTATION BY ONE
         * ====================================================
         *
         * Example:
         *
         * [1,2,3,4,5]
         *
         * becomes
         *
         * [2,3,4,5,1]
         */

        int[] leftRotate = {
                1, 2, 3, 4, 5
        };

        int firstElement =
                leftRotate[0];

        for (int i = 0;
             i < leftRotate.length - 1;
             i++) {

            leftRotate[i] =
                    leftRotate[i + 1];
        }

        leftRotate[
                leftRotate.length - 1
                ] = firstElement;

        System.out.println(
                "Left rotation: " +
                        Arrays.toString(leftRotate)
        );


        /*
         * ====================================================
         * 33. RIGHT ROTATION BY ONE
         * ====================================================
         *
         * Example:
         *
         * [1,2,3,4,5]
         *
         * becomes
         *
         * [5,1,2,3,4]
         */

        int[] rightRotate = {
                1, 2, 3, 4, 5
        };

        int lastElement =
                rightRotate[
                        rightRotate.length - 1
                        ];

        for (int i =
             rightRotate.length - 1;
             i > 0;
             i--) {

            rightRotate[i] =
                    rightRotate[i - 1];
        }

        rightRotate[0] =
                lastElement;

        System.out.println(
                "Right rotation: " +
                        Arrays.toString(rightRotate)
        );


        /*
         * ====================================================
         * 34. TWO-DIMENSIONAL ARRAY
         * ====================================================
         *
         * A 2D array can be viewed as rows and columns.
         *
         * Example:
         *
         * 1 2 3
         * 4 5 6
         * 7 8 9
         */

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };


        /*
         * ====================================================
         * 35. PRINT 2D ARRAY
         * ====================================================
         */

        System.out.println(
                "\n2D Array:"
        );

        for (int i = 0;
             i < matrix.length;
             i++) {

            for (int j = 0;
                 j < matrix[i].length;
                 j++) {

                System.out.print(
                        matrix[i][j] +
                                " "
                );
            }

            System.out.println();
        }


        /*
         * ====================================================
         * 36. ACCESS 2D ARRAY ELEMENT
         * ====================================================
         *
         * matrix[row][column]
         */

        System.out.println(
                "Element at row 1 column 2: " +
                        matrix[1][2]
        );


        /*
         * ====================================================
         * 37. ROW SUM
         * ====================================================
         */

        System.out.println(
                "\nRow sums:"
        );

        for (int i = 0;
             i < matrix.length;
             i++) {

            int rowSum = 0;

            for (int j = 0;
                 j < matrix[i].length;
                 j++) {

                rowSum += matrix[i][j];
            }

            System.out.println(
                    "Row " +
                            i +
                            ": " +
                            rowSum
            );
        }


        /*
         * ====================================================
         * 38. COLUMN SUM
         * ====================================================
         */

        System.out.println(
                "\nColumn sums:"
        );

        for (int j = 0;
             j < matrix[0].length;
             j++) {

            int columnSum = 0;

            for (int i = 0;
                 i < matrix.length;
                 i++) {

                columnSum += matrix[i][j];
            }

            System.out.println(
                    "Column " +
                            j +
                            ": " +
                            columnSum
            );
        }


        /*
         * ====================================================
         * 39. TRANSPOSE MATRIX
         * ====================================================
         *
         * Original:
         *
         * 1 2 3
         * 4 5 6
         * 7 8 9
         *
         * Transpose:
         *
         * 1 4 7
         * 2 5 8
         * 3 6 9
         */

        int[][] transpose =
                new int[
                        matrix[0].length
                        ][
                        matrix.length
                        ];

        for (int i = 0;
             i < matrix.length;
             i++) {

            for (int j = 0;
                 j < matrix[i].length;
                 j++) {

                transpose[j][i] =
                        matrix[i][j];
            }
        }

        System.out.println(
                "\nTranspose:"
        );

        for (int i = 0;
             i < transpose.length;
             i++) {

            for (int j = 0;
                 j < transpose[i].length;
                 j++) {

                System.out.print(
                        transpose[i][j] +
                                " "
                );
            }

            System.out.println();
        }


        /*
         * ====================================================
         * 40. MAIN DIAGONAL
         * ====================================================
         *
         * For a square matrix:
         *
         * matrix[i][i]
         */

        System.out.println(
                "\nMain diagonal:"
        );

        for (int i = 0;
             i < matrix.length;
             i++) {

            System.out.println(
                    matrix[i][i]
            );
        }


        /*
         * ====================================================
         * 41. SECONDARY DIAGONAL
         * ====================================================
         *
         * For an n x n matrix:
         *
         * matrix[i][n - 1 - i]
         */

        System.out.println(
                "\nSecondary diagonal:"
        );

        int n = matrix.length;

        for (int i = 0;
             i < n;
             i++) {

            System.out.println(
                    matrix[i][n - 1 - i]
            );
        }


        /*
         * ====================================================
         * 42. MATRIX ADDITION
         * ====================================================
         *
         * Two matrices can be added when they have the
         * same number of rows and columns.
         */

        int[][] matrixA = {
                {1, 2},
                {3, 4}
        };

        int[][] matrixB = {
                {5, 6},
                {7, 8}
        };

        int[][] matrixSum =
                new int[2][2];

        for (int i = 0;
             i < 2;
             i++) {

            for (int j = 0;
                 j < 2;
                 j++) {

                matrixSum[i][j] =
                        matrixA[i][j] +
                                matrixB[i][j];
            }
        }

        System.out.println(
                "\nMatrix addition:"
        );

        for (int i = 0;
             i < 2;
             i++) {

            for (int j = 0;
                 j < 2;
                 j++) {

                System.out.print(
                        matrixSum[i][j] +
                                " "
                );
            }

            System.out.println();
        }


        /*
         * ====================================================
         * 43. MATRIX MULTIPLICATION
         * ====================================================
         *
         * Matrix multiplication uses three loops.
         */

        int[][] multiplyA = {
                {1, 2},
                {3, 4}
        };

        int[][] multiplyB = {
                {5, 6},
                {7, 8}
        };

        int[][] multiplication =
                new int[2][2];

        for (int i = 0;
             i < 2;
             i++) {

            for (int j = 0;
                 j < 2;
                 j++) {

                for (int k = 0;
                     k < 2;
                     k++) {

                    multiplication[i][j] +=
                            multiplyA[i][k] *
                                    multiplyB[k][j];
                }
            }
        }

        System.out.println(
                "\nMatrix multiplication:"
        );

        for (int i = 0;
             i < 2;
             i++) {

            for (int j = 0;
                 j < 2;
                 j++) {

                System.out.print(
                        multiplication[i][j] +
                                " "
                );
            }

            System.out.println();
        }


        /*
         * ====================================================
         * 44. JAGGED ARRAY
         * ====================================================
         *
         * A jagged array is a 2D array where each row can
         * have a different length.
         */

        int[][] jagged = new int[3][];

        jagged[0] =
                new int[]{1, 2};

        jagged[1] =
                new int[]{3, 4, 5};

        jagged[2] =
                new int[]{6, 7, 8, 9};

        System.out.println(
                "\nJagged array:"
        );

        for (int i = 0;
             i < jagged.length;
             i++) {

            for (int j = 0;
                 j < jagged[i].length;
                 j++) {

                System.out.print(
                        jagged[i][j] +
                                " "
                );
            }

            System.out.println();
        }


        /*
         * ====================================================
         * 45. ARRAY OF STRINGS
         * ====================================================
         *
         * Arrays can store objects such as Strings.
         */

        String[] names = {
                "Kush",
                "John",
                "Alex",
                "David"
        };

        System.out.println(
                "\nNames:"
        );

        for (String name : names) {

            System.out.println(name);
        }


        /*
         * ====================================================
         * 46. FIND LONGEST STRING
         * ====================================================
         */

        String longestName =
                names[0];

        for (int i = 1;
             i < names.length;
             i++) {

            if (names[i].length() >
                    longestName.length()) {

                longestName =
                        names[i];
            }
        }

        System.out.println(
                "Longest name: " +
                        longestName
        );


        /*
         * ====================================================
         * 47. SORT STRING ARRAY
         * ====================================================
         */

        Arrays.sort(names);

        System.out.println(
                "Sorted names: " +
                        Arrays.toString(names)
        );


        /*
         * ====================================================
         * 48. VARIABLE ARGUMENTS
         * ====================================================
         *
         * A method can accept a variable number of arguments
         * using ...
         *
         * Example:
         *
         * sumNumbers(1, 2, 3)
         * sumNumbers(1, 2, 3, 4, 5)
         *
         * Inside the method, values behaves like an array.
         */

        int variableSum =
                sumNumbers(
                        10,
                        20,
                        30,
                        40
                );

        System.out.println(
                "Varargs sum: " +
                        variableSum
        );


        /*
         * ====================================================
         * 49. ARRAY INPUT USING SCANNER
         * ====================================================
         *
         * We can ask the user for the size of an array and
         * then read each element.
         *
         * This section is commented out so the main program
         * does not stop waiting for input.
         *
         * You can remove the comments to use it.
         */

        /*
        Scanner scanner =
                new Scanner(System.in);

        System.out.print(
                "Enter array size: "
        );

        int size =
                scanner.nextInt();

        int[] userArray =
                new int[size];

        for (int i = 0;
             i < userArray.length;
             i++) {

            System.out.print(
                    "Enter element " +
                    i +
                    ": "
            );

            userArray[i] =
                    scanner.nextInt();
        }

        System.out.println(
                "Your array: " +
                Arrays.toString(userArray)
        );

        scanner.close();
        */


        /*
         * ====================================================
         * 50. FINAL MESSAGE
         * ====================================================
         */

        System.out.println(
                "\nArray demonstration completed."
        );
    }


    /*
     * ========================================================
     * VARARGS METHOD
     * ========================================================
     *
     * int... numbers means the method can receive any number
     * of integer arguments.
     *
     * Internally, numbers is treated as an int[] array.
     */

    public static int sumNumbers(int... numbers) {

        int total = 0;

        for (int number : numbers) {

            total += number;
        }

        return total;
    }
}