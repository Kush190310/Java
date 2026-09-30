/*
 * ============================================================
 *                  JAVA LOOPS COMPLETE GUIDE
 * ============================================================
 *
 * This program demonstrates Java loops from beginner to
 * advanced level.
 *
 * ============================================================
 * TOPICS COVERED
 * ============================================================
 *
 * 1. What is a loop?
 * 2. for loop
 * 3. for loop syntax
 * 4. Counting with for
 * 5. Counting backwards
 * 6. Different increments
 * 7. Multiple variables in for loop
 * 8. Nested for loop
 * 9. for loop with arrays
 * 10. for loop with String
 * 11. Enhanced for-each loop
 * 12. for-each with arrays
 * 13. for-each with String array
 * 14. for-each with collection
 * 15. while loop
 * 16. while loop counter
 * 17. while loop with conditions
 * 18. Nested while loop
 * 19. do-while loop
 * 20. Difference between while and do-while
 * 21. break
 * 22. continue
 * 23. Nested loops
 * 24. break in nested loops
 * 25. continue in nested loops
 * 26. Infinite loops
 * 27. Loop with conditions
 * 28. Sum of numbers
 * 29. Factorial
 * 30. Multiplication table
 * 31. Reverse a number
 * 32. Count digits
 * 33. Find maximum
 * 34. Search array
 * 35. Two-dimensional arrays
 * 36. Pattern printing
 * 37. Practical examples
 *
 * ============================================================
 */

import java.util.ArrayList;

public class LoopsInJava {

    public static void main(String[] args) {

        /*
         * ====================================================
         * 1. WHAT IS A LOOP?
         * ====================================================
         *
         * A loop repeats a block of code multiple times.
         *
         * Java provides four commonly used loop forms:
         *
         * 1. for
         * 2. enhanced for-each
         * 3. while
         * 4. do-while
         */


        /*
         * ====================================================
         * 2. BASIC for LOOP
         * ====================================================
         *
         * Syntax:
         *
         * for (initialization; condition; update) {
         *     code;
         * }
         *
         * Example:
         *
         * for (int i = 1; i <= 5; i++) {
         *     System.out.println(i);
         * }
         *
         * Initialization:
         * int i = 1
         *
         * Condition:
         * i <= 5
         *
         * Update:
         * i++
         */

        System.out.println("BASIC FOR LOOP");

        for (int i = 1; i <= 5; i++) {

            System.out.println(i);
        }


        /*
         * ====================================================
         * 3. FOR LOOP FROM 0
         * ====================================================
         */

        System.out.println("\nCOUNT FROM 0 TO 5");

        for (int i = 0; i <= 5; i++) {

            System.out.println(i);
        }


        /*
         * ====================================================
         * 4. FOR LOOP WITH ARRAY INDEX
         * ====================================================
         *
         * Arrays use indexes starting from 0.
         */

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("\nARRAY USING FOR LOOP");

        for (int i = 0; i < numbers.length; i++) {

            System.out.println(
                    "Index " + i +
                            " = " + numbers[i]
            );
        }


        /*
         * ====================================================
         * 5. COUNT BACKWARDS
         * ====================================================
         */

        System.out.println("\nCOUNT BACKWARDS");

        for (int i = 5; i >= 1; i--) {

            System.out.println(i);
        }


        /*
         * ====================================================
         * 6. INCREMENT BY 2
         * ====================================================
         */

        System.out.println("\nINCREMENT BY 2");

        for (int i = 0; i <= 10; i += 2) {

            System.out.println(i);
        }


        /*
         * ====================================================
         * 7. INCREMENT BY 5
         * ====================================================
         */

        System.out.println("\nINCREMENT BY 5");

        for (int i = 0; i <= 50; i += 5) {

            System.out.println(i);
        }


        /*
         * ====================================================
         * 8. MULTIPLE VARIABLES IN for LOOP
         * ====================================================
         *
         * More than one variable can be initialized and
         * updated in a for loop.
         */

        System.out.println("\nMULTIPLE VARIABLES");

        for (
                int i = 1, j = 10;
                i <= 5;
                i++, j--
        ) {

            System.out.println(
                    "i = " + i +
                            ", j = " + j
            );
        }


        /*
         * ====================================================
         * 9. for LOOP WITH CONDITION
         * ====================================================
         */

        System.out.println("\nEVEN NUMBERS");

        for (int i = 1; i <= 20; i++) {

            if (i % 2 == 0) {

                System.out.println(i);
            }
        }


        /*
         * ====================================================
         * 10. ODD NUMBERS
         * ====================================================
         */

        System.out.println("\nODD NUMBERS");

        for (int i = 1; i <= 20; i++) {

            if (i % 2 != 0) {

                System.out.println(i);
            }
        }


        /*
         * ====================================================
         * 11. SUM USING for LOOP
         * ====================================================
         */

        int sum = 0;

        for (int i = 1; i <= 10; i++) {

            sum = sum + i;
        }

        System.out.println(
                "\nSum from 1 to 10 = " + sum
        );


        /*
         * ====================================================
         * 12. PRODUCT USING for LOOP
         * ====================================================
         */

        int product = 1;

        for (int i = 1; i <= 5; i++) {

            product = product * i;
        }

        System.out.println(
                "Product from 1 to 5 = " + product
        );


        /*
         * ====================================================
         * 13. MULTIPLICATION TABLE
         * ====================================================
         */

        int tableNumber = 5;

        System.out.println(
                "\nMULTIPLICATION TABLE OF " +
                        tableNumber
        );

        for (int i = 1; i <= 10; i++) {

            System.out.println(
                    tableNumber +
                            " x " +
                            i +
                            " = " +
                            (tableNumber * i)
            );
        }


        /*
         * ====================================================
         * 14. NESTED for LOOP
         * ====================================================
         *
         * A loop inside another loop is called a nested loop.
         */

        System.out.println("\nNESTED FOR LOOP");

        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {

                System.out.println(
                        "i = " + i +
                                ", j = " + j
                );
            }
        }


        /*
         * ====================================================
         * 15. RECTANGLE PATTERN
         * ====================================================
         */

        System.out.println("\nRECTANGLE PATTERN");

        for (int row = 1; row <= 4; row++) {

            for (int column = 1; column <= 5; column++) {

                System.out.print("* ");
            }

            System.out.println();
        }


        /*
         * ====================================================
         * 16. TRIANGLE PATTERN
         * ====================================================
         */

        System.out.println("\nTRIANGLE PATTERN");

        for (int row = 1; row <= 5; row++) {

            for (int column = 1; column <= row; column++) {

                System.out.print("* ");
            }

            System.out.println();
        }


        /*
         * ====================================================
         * 17. REVERSE TRIANGLE
         * ====================================================
         */

        System.out.println("\nREVERSE TRIANGLE");

        for (int row = 5; row >= 1; row--) {

            for (int column = 1; column <= row; column++) {

                System.out.print("* ");
            }

            System.out.println();
        }


        /*
         * ====================================================
         * 18. FOR LOOP WITH String
         * ====================================================
         *
         * String indexes start at 0.
         *
         * charAt(index) returns the character at that index.
         */

        String word = "JAVA";

        System.out.println("\nSTRING CHARACTERS");

        for (int i = 0; i < word.length(); i++) {

            System.out.println(
                    word.charAt(i)
            );
        }


        /*
         * ====================================================
         * 19. REVERSE A String
         * ====================================================
         */

        String original = "Hello";

        String reversed = "";

        for (
                int i = original.length() - 1;
                i >= 0;
                i--
        ) {

            reversed += original.charAt(i);
        }

        System.out.println(
                "\nOriginal: " + original
        );

        System.out.println(
                "Reversed: " + reversed
        );


        /*
         * ====================================================
         * 20. ENHANCED for-EACH LOOP
         * ====================================================
         *
         * The enhanced for loop is useful when you want to
         * access every element without using indexes.
         *
         * Syntax:
         *
         * for (Type item : collection) {
         *     code;
         * }
         */

        System.out.println("\nFOR-EACH ARRAY");

        int[] values = {10, 20, 30, 40, 50};

        for (int value : values) {

            System.out.println(value);
        }


        /*
         * ====================================================
         * 21. FOR-EACH WITH String ARRAY
         * ====================================================
         */

        String[] names = {
                "Kush",
                "John",
                "Alex",
                "David"
        };

        System.out.println("\nFOR-EACH STRING ARRAY");

        for (String name : names) {

            System.out.println(name);
        }


        /*
         * ====================================================
         * 22. FOR-EACH WITH char ARRAY
         * ====================================================
         */

        char[] letters = {
                'A',
                'B',
                'C',
                'D'
        };

        System.out.println("\nFOR-EACH CHAR ARRAY");

        for (char letter : letters) {

            System.out.println(letter);
        }


        /*
         * ====================================================
         * 23. FOR-EACH WITH DOUBLE ARRAY
         * ====================================================
         */

        double[] prices = {
                10.5,
                20.75,
                30.25
        };

        System.out.println("\nFOR-EACH DOUBLE ARRAY");

        for (double price : prices) {

            System.out.println(price);
        }


        /*
         * ====================================================
         * 24. FOR-EACH WITH ArrayList
         * ====================================================
         */

        ArrayList<String> fruits =
                new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        System.out.println("\nFOR-EACH ARRAYLIST");

        for (String fruit : fruits) {

            System.out.println(fruit);
        }


        /*
         * ====================================================
         * 25. FOR-EACH WITH Integer ArrayList
         * ====================================================
         */

        ArrayList<Integer> scores =
                new ArrayList<>();

        scores.add(80);
        scores.add(90);
        scores.add(75);
        scores.add(95);

        System.out.println(
                "\nFOR-EACH INTEGER ARRAYLIST"
        );

        for (int score : scores) {

            System.out.println(score);
        }


        /*
         * ====================================================
         * 26. FOR-EACH WITH CONDITION
         * ====================================================
         */

        System.out.println(
                "\nFOR-EACH EVEN NUMBERS"
        );

        for (int score : scores) {

            if (score % 2 == 0) {

                System.out.println(score);
            }
        }


        /*
         * ====================================================
         * 27. for LOOP VS for-EACH
         * ====================================================
         *
         * Traditional for loop:
         *
         * for (int i = 0; i < array.length; i++)
         *
         * Useful when:
         *
         * - You need the index.
         * - You want to access previous/next elements.
         * - You need to change elements by index.
         *
         * for-each:
         *
         * for (int value : array)
         *
         * Useful when:
         *
         * - You only need each element.
         * - You do not need the index.
         */


        /*
         * ====================================================
         * 28. BASIC while LOOP
         * ====================================================
         *
         * Syntax:
         *
         * while (condition) {
         *     code;
         * }
         *
         * The condition is checked BEFORE the loop executes.
         */

        System.out.println("\nBASIC WHILE LOOP");

        int count = 1;

        while (count <= 5) {

            System.out.println(count);

            count++;
        }


        /*
         * ====================================================
         * 29. WHILE LOOP COUNTDOWN
         * ====================================================
         */

        System.out.println("\nWHILE COUNTDOWN");

        int countdown = 5;

        while (countdown >= 1) {

            System.out.println(countdown);

            countdown--;
        }


        /*
         * ====================================================
         * 30. WHILE LOOP WITH EVEN NUMBERS
         * ====================================================
         */

        System.out.println(
                "\nWHILE EVEN NUMBERS"
        );

        int evenNumber = 2;

        while (evenNumber <= 20) {

            System.out.println(evenNumber);

            evenNumber += 2;
        }


        /*
         * ====================================================
         * 31. WHILE LOOP SUM
         * ====================================================
         */

        int whileSum = 0;
        int whileNumber = 1;

        while (whileNumber <= 10) {

            whileSum += whileNumber;

            whileNumber++;
        }

        System.out.println(
                "\nWhile sum = " +
                        whileSum
        );


        /*
         * ====================================================
         * 32. WHILE WITH CONDITION
         * ====================================================
         */

        int positiveNumber = 1;

        while (positiveNumber <= 10) {

            if (positiveNumber == 5) {

                System.out.println(
                        "\nFound number 5."
                );
            }

            positiveNumber++;
        }


        /*
         * ====================================================
         * 33. NESTED WHILE LOOP
         * ====================================================
         */

        System.out.println(
                "\nNESTED WHILE LOOP"
        );

        int row = 1;

        while (row <= 3) {

            int column = 1;

            while (column <= 3) {

                System.out.println(
                        "row = " +
                                row +
                                ", column = " +
                                column
                );

                column++;
            }

            row++;
        }


        /*
         * ====================================================
         * 34. BASIC do-while LOOP
         * ====================================================
         *
         * Syntax:
         *
         * do {
         *     code;
         * } while (condition);
         *
         * The body executes at least once.
         */

        System.out.println(
                "\nBASIC DO-WHILE LOOP"
        );

        int doNumber = 1;

        do {

            System.out.println(doNumber);

            doNumber++;

        } while (doNumber <= 5);


        /*
         * ====================================================
         * 35. do-while EXECUTES AT LEAST ONCE
         * ====================================================
         */

        System.out.println(
                "\nDO-WHILE EXECUTES ONCE"
        );

        int zero = 10;

        do {

            System.out.println(
                    "This executes once."
            );

            zero++;

        } while (zero < 5);


        /*
         * ====================================================
         * 36. WHILE MAY EXECUTE ZERO TIMES
         * ====================================================
         */

        System.out.println(
                "\nWHILE CAN EXECUTE ZERO TIMES"
        );

        int whileZero = 10;

        while (whileZero < 5) {

            System.out.println(
                    "This will not print."
            );
        }


        /*
         * ====================================================
         * 37. break
         * ====================================================
         *
         * break immediately stops the loop.
         */

        System.out.println("\nBREAK EXAMPLE");

        for (int i = 1; i <= 10; i++) {

            if (i == 5) {

                break;
            }

            System.out.println(i);
        }


        /*
         * ====================================================
         * 38. continue
         * ====================================================
         *
         * continue skips the current iteration and moves
         * to the next iteration.
         */

        System.out.println(
                "\nCONTINUE EXAMPLE"
        );

        for (int i = 1; i <= 10; i++) {

            if (i == 5) {

                continue;
            }

            System.out.println(i);
        }


        /*
         * ====================================================
         * 39. BREAK WITH while
         * ====================================================
         */

        System.out.println(
                "\nBREAK WITH WHILE"
        );

        int breakNumber = 1;

        while (breakNumber <= 10) {

            if (breakNumber == 6) {

                break;
            }

            System.out.println(breakNumber);

            breakNumber++;
        }


        /*
         * ====================================================
         * 40. CONTINUE WITH while
         * ====================================================
         */

        System.out.println(
                "\nCONTINUE WITH WHILE"
        );

        int continueNumber = 0;

        while (continueNumber < 10) {

            continueNumber++;

            if (continueNumber == 5) {

                continue;
            }

            System.out.println(
                    continueNumber
            );
        }


        /*
         * ====================================================
         * 41. SEARCH ARRAY
         * ====================================================
         */

        int[] searchNumbers = {
                10,
                20,
                30,
                40,
                50
        };

        int searchValue = 30;

        boolean found = false;

        for (int i = 0; i < searchNumbers.length; i++) {

            if (searchNumbers[i] == searchValue) {

                found = true;

                System.out.println(
                        "\nValue found at index " +
                                i
                );

                break;
            }
        }

        if (!found) {

            System.out.println(
                    "Value not found."
            );
        }


        /*
         * ====================================================
         * 42. FIND MAXIMUM
         * ====================================================
         */

        int[] maxNumbers = {
                10,
                45,
                20,
                90,
                30
        };

        int maximum = maxNumbers[0];

        for (int i = 1; i < maxNumbers.length; i++) {

            if (maxNumbers[i] > maximum) {

                maximum = maxNumbers[i];
            }
        }

        System.out.println(
                "\nMaximum = " +
                        maximum
        );


        /*
         * ====================================================
         * 43. FIND MINIMUM
         * ====================================================
         */

        int minimum = maxNumbers[0];

        for (int i = 1; i < maxNumbers.length; i++) {

            if (maxNumbers[i] < minimum) {

                minimum = maxNumbers[i];
            }
        }

        System.out.println(
                "Minimum = " +
                        minimum
        );


        /*
         * ====================================================
         * 44. COUNT EVEN NUMBERS
         * ====================================================
         */

        int evenCount = 0;

        for (int value : maxNumbers) {

            if (value % 2 == 0) {

                evenCount++;
            }
        }

        System.out.println(
                "\nEven numbers = " +
                        evenCount
        );


        /*
         * ====================================================
         * 45. COUNT ODD NUMBERS
         * ====================================================
         */

        int oddCount = 0;

        for (int value : maxNumbers) {

            if (value % 2 != 0) {

                oddCount++;
            }
        }

        System.out.println(
                "Odd numbers = " +
                        oddCount
        );


        /*
         * ====================================================
         * 46. COUNT DIGITS IN A NUMBER
         * ====================================================
         */

        int digitNumber = 123456;

        int digitCount = 0;

        int temporary = digitNumber;

        while (temporary != 0) {

            temporary =
                    temporary / 10;

            digitCount++;
        }

        System.out.println(
                "\nNumber of digits = " +
                        digitCount
        );


        /*
         * ====================================================
         * 47. REVERSE A NUMBER
         * ====================================================
         */

        int reverseNumber = 12345;

        int reversedNumber = 0;

        int tempNumber = reverseNumber;

        while (tempNumber != 0) {

            int digit =
                    tempNumber % 10;

            reversedNumber =
                    reversedNumber * 10 +
                            digit;

            tempNumber =
                    tempNumber / 10;
        }

        System.out.println(
                "\nOriginal number = " +
                        reverseNumber
        );

        System.out.println(
                "Reversed number = " +
                        reversedNumber
        );


        /*
         * ====================================================
         * 48. PALINDROME NUMBER
         * ====================================================
         */

        int palindromeNumber = 121;

        int originalNumber =
                palindromeNumber;

        int palindromeReverse = 0;

        while (palindromeNumber != 0) {

            int digit =
                    palindromeNumber % 10;

            palindromeReverse =
                    palindromeReverse * 10 +
                            digit;

            palindromeNumber =
                    palindromeNumber / 10;
        }

        if (
                originalNumber ==
                        palindromeReverse
        ) {

            System.out.println(
                    "\nNumber is palindrome."
            );

        } else {

            System.out.println(
                    "\nNumber is not palindrome."
            );
        }


        /*
         * ====================================================
         * 49. FACTORIAL
         * ====================================================
         *
         * 5! =
         *
         * 5 x 4 x 3 x 2 x 1
         *
         * = 120
         */

        int factorialNumber = 5;

        int factorial = 1;

        for (
                int i = 1;
                i <= factorialNumber;
                i++
        ) {

            factorial *= i;
        }

        System.out.println(
                "\nFactorial = " +
                        factorial
        );


        /*
         * ====================================================
         * 50. PRIME NUMBER CHECK
         * ====================================================
         */

        int primeNumber = 29;

        boolean isPrime = true;

        if (primeNumber < 2) {

            isPrime = false;

        } else {

            for (
                    int i = 2;
                    i < primeNumber;
                    i++
            ) {

                if (
                        primeNumber % i == 0
                ) {

                    isPrime = false;

                    break;
                }
            }
        }

        if (isPrime) {

            System.out.println(
                    "\n" +
                            primeNumber +
                            " is prime."
            );

        } else {

            System.out.println(
                    "\n" +
                            primeNumber +
                            " is not prime."
            );
        }


        /*
         * ====================================================
         * 51. FASTER PRIME CHECK
         * ====================================================
         *
         * We only need to check divisors up to sqrt(n).
         *
         * This reduces unnecessary iterations.
         */

        int fastPrimeNumber = 97;

        boolean fastPrime = true;

        if (fastPrimeNumber < 2) {

            fastPrime = false;

        } else {

            for (
                    int i = 2;
                    i * i <= fastPrimeNumber;
                    i++
            ) {

                if (
                        fastPrimeNumber % i == 0
                ) {

                    fastPrime = false;

                    break;
                }
            }
        }

        System.out.println(
                "\nFast prime check: " +
                        fastPrime
        );


        /*
         * ====================================================
         * 52. TWO-DIMENSIONAL ARRAY
         * ====================================================
         *
         * A 2D array requires nested loops.
         */

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(
                "\n2D ARRAY"
        );

        for (int i = 0; i < matrix.length; i++) {

            for (
                    int j = 0;
                    j < matrix[i].length;
                    j++
            ) {

                System.out.print(
                        matrix[i][j] +
                                " "
                );
            }

            System.out.println();
        }


        /*
         * ====================================================
         * 53. 2D ARRAY USING FOR-EACH
         * ====================================================
         */

        System.out.println(
                "\n2D ARRAY USING FOR-EACH"
        );

        for (int[] rowArray : matrix) {

            for (int value : rowArray) {

                System.out.print(
                        value +
                                " "
                );
            }

            System.out.println();
        }


        /*
         * ====================================================
         * 54. SUM OF 2D ARRAY
         * ====================================================
         */

        int matrixSum = 0;

        for (int[] rowArray : matrix) {

            for (int value : rowArray) {

                matrixSum += value;
            }
        }

        System.out.println(
                "\n2D array sum = " +
                        matrixSum
        );


        /*
         * ====================================================
         * 55. NESTED LOOP WITH break
         * ====================================================
         *
         * break normally exits only the nearest loop.
         */

        System.out.println(
                "\nBREAK IN NESTED LOOP"
        );

        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 5; j++) {

                if (j == 3) {

                    break;
                }

                System.out.println(
                        "i = " +
                                i +
                                ", j = " +
                                j
                );
            }
        }


        /*
         * ====================================================
         * 56. NESTED LOOP WITH continue
         * ====================================================
         */

        System.out.println(
                "\nCONTINUE IN NESTED LOOP"
        );

        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 5; j++) {

                if (j == 3) {

                    continue;
                }

                System.out.println(
                        "i = " +
                                i +
                                ", j = " +
                                j
                );
            }
        }


        /*
         * ====================================================
         * 57. LABELED break
         * ====================================================
         *
         * A label can be used to exit an outer loop.
         */

        System.out.println(
                "\nLABELED BREAK"
        );

        outerLoop:

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5; j++) {

                if (i == 3 && j == 3) {

                    break outerLoop;
                }

                System.out.println(
                        "i = " +
                                i +
                                ", j = " +
                                j
                );
            }
        }


        /*
         * ====================================================
         * 58. LABELED continue
         * ====================================================
         */

        System.out.println(
                "\nLABELED CONTINUE"
        );

        outerContinue:

        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {

                if (j == 2) {

                    continue outerContinue;
                }

                System.out.println(
                        "i = " +
                                i +
                                ", j = " +
                                j
                );
            }
        }


        /*
         * ====================================================
         * 59. INFINITE LOOP
         * ====================================================
         *
         * This is an infinite loop:
         *
         * while (true) {
         *
         * }
         *
         * It should only be used when there is a clear
         * break condition.
         *
         * Example:
         */

        int infiniteCounter = 1;

        while (true) {

            System.out.println(
                    "\nInfinite loop example: " +
                            infiniteCounter
            );

            infiniteCounter++;

            if (infiniteCounter > 3) {

                break;
            }
        }


        /*
         * ====================================================
         * 60. for LOOP WITHOUT INITIALIZATION
         * ====================================================
         */

        System.out.println(
                "\nFOR WITHOUT INITIALIZATION"
        );

        int outsideCounter = 1;

        for (; outsideCounter <= 3; outsideCounter++) {

            System.out.println(
                    outsideCounter
            );
        }


        /*
         * ====================================================
         * 61. for LOOP WITHOUT UPDATE
         * ====================================================
         */

        System.out.println(
                "\nFOR WITHOUT UPDATE"
        );

        int updateCounter = 1;

        for (; updateCounter <= 3;) {

            System.out.println(
                    updateCounter
            );

            updateCounter++;
        }


        /*
         * ====================================================
         * 62. EMPTY for LOOP
         * ====================================================
         *
         * The three sections of a for loop are optional.
         *
         * for (;;) {
         *
         * }
         *
         * This creates an infinite loop.
         *
         * Do not use it unless you have a break condition.
         */


        /*
         * ====================================================
         * 63. LOOPING THROUGH CHARACTERS
         * ====================================================
         */

        String text = "Programming";

        System.out.println(
                "\nCHARACTERS"
        );

        for (char character : text.toCharArray()) {

            System.out.println(character);
        }


        /*
         * ====================================================
         * 64. COUNT A CHARACTER
         * ====================================================
         */

        String sentence = "banana";

        char target = 'a';

        int characterCount = 0;

        for (char character : sentence.toCharArray()) {

            if (character == target) {

                characterCount++;
            }
        }

        System.out.println(
                "\n'a' appears " +
                        characterCount +
                        " times."
        );


        /*
         * ====================================================
         * 65. FIND FIRST MATCH
         * ====================================================
         */

        int[] findArray = {
                5,
                10,
                15,
                20,
                25
        };

        int targetValue = 15;

        for (int i = 0; i < findArray.length; i++) {

            if (findArray[i] == targetValue) {

                System.out.println(
                        "\nFirst match at index " +
                                i
                );

                break;
            }
        }


        /*
         * ====================================================
         * 66. COPY ARRAY USING LOOP
         * ====================================================
         */

        int[] originalArray = {
                1,
                2,
                3,
                4,
                5
        };

        int[] copiedArray =
                new int[originalArray.length];

        for (int i = 0; i < originalArray.length; i++) {

            copiedArray[i] = originalArray[i];
        }

        System.out.println(
                "\nCOPIED ARRAY"
        );

        for (int value : copiedArray) {

            System.out.println(value);
        }


        /*
         * ====================================================
         * 67. MODIFY ARRAY USING for LOOP
         * ====================================================
         */

        int[] modifyArray = {
                1,
                2,
                3,
                4,
                5
        };

        for (int i = 0; i < modifyArray.length; i++) {

            modifyArray[i] =
                    modifyArray[i] * 2;
        }

        System.out.println(
                "\nMODIFIED ARRAY"
        );

        for (int value : modifyArray) {

            System.out.println(value);
        }


        /*
         * ====================================================
         * 68. for-EACH LIMITATION
         * ====================================================
         *
         * for-each is excellent for reading elements.
         *
         * If you need to modify the array element itself,
         * use a traditional for loop with an index.
         *
         * Example:
         *
         * for (int i = 0; i < array.length; i++) {
         *     array[i] = array[i] * 2;
         * }
         */


        /*
         * ====================================================
         * 69. SUM USING FOR-EACH
         * ====================================================
         */

        int[] sumArray = {
                10,
                20,
                30,
                40
        };

        int total = 0;

        for (int value : sumArray) {

            total += value;
        }

        System.out.println(
                "\nArray total = " +
                        total
        );


        /*
         * ====================================================
         * 70. AVERAGE USING FOR-EACH
         * ====================================================
         */

        double average =
                (double) total /
                        sumArray.length;

        System.out.println(
                "Average = " +
                        average
        );


        /*
         * ====================================================
         * 71. FIBONACCI SERIES
         * ====================================================
         *
         * Fibonacci:
         *
         * 0 1 1 2 3 5 8 13 ...
         */

        int fibonacciCount = 10;

        int first = 0;
        int second = 1;

        System.out.println(
                "\nFIBONACCI SERIES"
        );

        for (
                int i = 1;
                i <= fibonacciCount;
                i++
        ) {

            System.out.print(
                    first + " "
            );

            int next =
                    first + second;

            first = second;
            second = next;
        }

        System.out.println();


        /*
         * ====================================================
         * 72. NUMBER PATTERN
         * ====================================================
         */

        System.out.println(
                "\nNUMBER PATTERN"
        );

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(
                        j + " "
                );
            }

            System.out.println();
        }


        /*
         * ====================================================
         * 73. REVERSE NUMBER PATTERN
         * ====================================================
         */

        System.out.println(
                "\nREVERSE NUMBER PATTERN"
        );

        for (int i = 5; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {

                System.out.print(
                        j + " "
                );
            }

            System.out.println();
        }


        /*
         * ====================================================
         * 74. WHILE LOOP WITH USER-STYLE VALIDATION
         * ====================================================
         *
         * This example repeatedly checks a value until it
         * becomes valid.
         */

        int enteredNumber = -1;

        while (enteredNumber < 0) {

            /*
             * In a real program, the value could come from
             * Scanner input.
             *
             * Here we simulate changing the value.
             */

            enteredNumber = 10;
        }

        System.out.println(
                "\nValid number: " +
                        enteredNumber
        );


        /*
         * ====================================================
         * 75. do-WHILE VALIDATION
         * ====================================================
         */

        int doValue = -1;

        do {

            /*
             * Simulated input.
             */

            doValue = 20;

        } while (doValue < 0);

        System.out.println(
                "Valid do-while value: " +
                        doValue
        );


        /*
         * ====================================================
         * 76. LOOP CONTROL SUMMARY
         * ====================================================
         *
         * break:
         *
         * Stops the loop completely.
         *
         * continue:
         *
         * Skips the current iteration.
         *
         * return:
         *
         * Exits the current method.
         */


        /*
         * ====================================================
         * 77. WHICH LOOP SHOULD YOU USE?
         * ====================================================
         *
         * for:
         *
         * Use when you know how many times you want to loop.
         *
         * Example:
         *
         * for (int i = 0; i < 10; i++)
         *
         *
         * for-each:
         *
         * Use when you want to visit every element of an
         * array or collection.
         *
         * Example:
         *
         * for (int value : array)
         *
         *
         * while:
         *
         * Use when the number of iterations is not known
         * beforehand and the condition should be checked
         * before every iteration.
         *
         *
         * do-while:
         *
         * Use when the code must execute at least once.
         */


        /*
         * ====================================================
         * 78. FINAL EXAMPLE
         * ====================================================
         *
         * This example combines loops and conditions.
         */

        int[] finalArray = {
                12,
                7,
                25,
                4,
                18,
                9
        };

        int finalSum = 0;
        int finalMax = finalArray[0];
        int finalMin = finalArray[0];
        int finalEvenCount = 0;

        for (int value : finalArray) {

            finalSum += value;

            if (value > finalMax) {

                finalMax = value;
            }

            if (value < finalMin) {

                finalMin = value;
            }

            if (value % 2 == 0) {

                finalEvenCount++;
            }
        }

        System.out.println(
                "\nFINAL ARRAY ANALYSIS"
        );

        System.out.println(
                "Sum = " +
                        finalSum
        );

        System.out.println(
                "Maximum = " +
                        finalMax
        );

        System.out.println(
                "Minimum = " +
                        finalMin
        );

        System.out.println(
                "Even count = " +
                        finalEvenCount
        );


        /*
         * ====================================================
         * 79. FINAL SUMMARY
         * ====================================================
         */

        System.out.println(
                "\n=========================================="
        );

        System.out.println(
                "JAVA LOOPS DEMONSTRATION COMPLETED"
        );

        System.out.println(
                "for"
        );

        System.out.println(
                "enhanced for-each"
        );

        System.out.println(
                "while"
        );

        System.out.println(
                "do-while"
        );

        System.out.println(
                "break"
        );

        System.out.println(
                "continue"
        );

        System.out.println(
                "nested loops"
        );

        System.out.println(
                "=========================================="
        );
    }
}