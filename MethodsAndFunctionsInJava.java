/*
 * ============================================================
 *              JAVA METHODS & FUNCTIONS COMPLETE GUIDE
 * ============================================================
 *
 * This program demonstrates Java methods from beginner
 * to advanced level.
 *
 * ============================================================
 * TOPICS COVERED
 * ============================================================
 *
 * 1. What is a method?
 * 2. Basic method syntax
 * 3. Calling a method
 * 4. void methods
 * 5. Methods with parameters
 * 6. Multiple parameters
 * 7. Return types
 * 8. Returning int
 * 9. Returning double
 * 10. Returning String
 * 11. Returning boolean
 * 12. Method parameters
 * 13. Method signature
 * 14. Method overloading
 * 15. Overloading with different parameter types
 * 16. Overloading with different number of parameters
 * 17. Overloading with different order of parameters
 * 18. Call-by-value
 * 19. Passing primitive values
 * 20. Passing object references
 * 21. Modifying an object inside a method
 * 22. Arrays passed to methods
 * 23. Returning arrays
 * 24. Variable arguments (varargs)
 * 25. Static methods
 * 26. Instance methods
 * 27. Calling methods from methods
 * 28. Recursive methods
 * 29. Base case
 * 30. Recursive call
 * 31. Factorial recursion
 * 32. Fibonacci recursion
 * 33. Sum recursion
 * 34. Power recursion
 * 35. Reverse string recursion
 * 36. Recursive array sum
 * 37. Greatest Common Divisor recursion
 * 38. Practical examples
 *
 * ============================================================
 */

import java.util.Arrays;

public class MethodsAndFunctionsInJava {

    /*
     * ========================================================
     * 1. BASIC METHOD
     * ========================================================
     *
     * A method is a block of code that performs a specific task.
     *
     * Basic syntax:
     *
     * returnType methodName(parameters) {
     *
     *     // code
     *
     * }
     *
     * Example:
     *
     * public static void sayHello() {
     *
     *     System.out.println("Hello");
     * }
     *
     * public
     *     Access modifier.
     *
     * static
     *     The method belongs to the class.
     *
     * void
     *     The method does not return a value.
     *
     * sayHello
     *     Method name.
     *
     * ()
     *     Parameter list.
     */

    public static void sayHello() {

        System.out.println(
                "Hello from Java method!"
        );
    }


    /*
     * ========================================================
     * 2. METHOD WITH PARAMETER
     * ========================================================
     *
     * A parameter allows us to send information into a method.
     *
     * Syntax:
     *
     * returnType methodName(Type parameter) {
     *
     * }
     */

    public static void greet(String name) {

        System.out.println(
                "Hello " + name
        );
    }


    /*
     * ========================================================
     * 3. METHOD WITH MULTIPLE PARAMETERS
     * ========================================================
     */

    public static void introduce(
            String name,
            int age
    ) {

        System.out.println(
                "Name: " + name
        );

        System.out.println(
                "Age: " + age
        );
    }


    /*
     * ========================================================
     * 4. METHOD WITH int RETURN TYPE
     * ========================================================
     *
     * A method can return a value.
     *
     * return is used to send a value back to the caller.
     */

    public static int add(
            int a,
            int b
    ) {

        return a + b;
    }


    /*
     * ========================================================
     * 5. METHOD RETURNING double
     * ========================================================
     */

    public static double divide(
            double a,
            double b
    ) {

        return a / b;
    }


    /*
     * ========================================================
     * 6. METHOD RETURNING String
     * ========================================================
     */

    public static String getMessage() {

        return "Java is powerful!";
    }


    /*
     * ========================================================
     * 7. METHOD RETURNING boolean
     * ========================================================
     */

    public static boolean isEven(
            int number
    ) {

        return number % 2 == 0;
    }


    /*
     * ========================================================
     * 8. METHOD RETURNING char
     * ========================================================
     */

    public static char getFirstCharacter(
            String text
    ) {

        return text.charAt(0);
    }


    /*
     * ========================================================
     * 9. METHOD WITH if-else
     * ========================================================
     */

    public static String checkNumber(
            int number
    ) {

        if (number > 0) {

            return "Positive";

        } else if (number < 0) {

            return "Negative";

        } else {

            return "Zero";
        }
    }


    /*
     * ========================================================
     * 10. METHOD TO FIND MAXIMUM
     * ========================================================
     */

    public static int maximum(
            int a,
            int b
    ) {

        if (a > b) {

            return a;

        } else {

            return b;
        }
    }


    /*
     * ========================================================
     * 11. METHOD TO FIND MINIMUM
     * ========================================================
     */

    public static int minimum(
            int a,
            int b
    ) {

        if (a < b) {

            return a;

        } else {

            return b;
        }
    }


    /*
     * ========================================================
     * 12. METHOD WITH ARRAY PARAMETER
     * ========================================================
     *
     * Arrays can be passed to methods.
     */

    public static void printArray(
            int[] numbers
    ) {

        for (int number : numbers) {

            System.out.println(number);
        }
    }


    /*
     * ========================================================
     * 13. METHOD TO FIND ARRAY SUM
     * ========================================================
     */

    public static int arraySum(
            int[] numbers
    ) {

        int sum = 0;

        for (int number : numbers) {

            sum += number;
        }

        return sum;
    }


    /*
     * ========================================================
     * 14. METHOD TO FIND ARRAY MAXIMUM
     * ========================================================
     */

    public static int arrayMaximum(
            int[] numbers
    ) {

        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > max) {

                max = numbers[i];
            }
        }

        return max;
    }


    /*
     * ========================================================
     * 15. METHOD TO FIND ARRAY MINIMUM
     * ========================================================
     */

    public static int arrayMinimum(
            int[] numbers
    ) {

        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] < min) {

                min = numbers[i];
            }
        }

        return min;
    }


    /*
     * ========================================================
     * 16. METHOD TO MODIFY ARRAY
     * ========================================================
     *
     * Arrays can be changed inside a method because the
     * reference value passed to the method refers to the
     * same array object.
     */

    public static void doubleArray(
            int[] numbers
    ) {

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] =
                    numbers[i] * 2;
        }
    }


    /*
     * ========================================================
     * 17. RETURNING AN ARRAY
     * ========================================================
     */

    public static int[] createNumbers() {

        int[] numbers = {
                10,
                20,
                30,
                40,
                50
        };

        return numbers;
    }


    /*
     * ========================================================
     * 18. METHOD SIGNATURE
     * ========================================================
     *
     * A method signature consists of:
     *
     * method name
     * +
     * parameter types
     *
     * Example:
     *
     * add(int, int)
     *
     * The return type is NOT part of the method signature.
     *
     * These have different signatures:
     *
     * add(int, int)
     * add(double, double)
     *
     */


    /*
     * ========================================================
     * 19. METHOD OVERLOADING
     * ========================================================
     *
     * Method overloading means defining multiple methods
     * with the same name but different parameter lists.
     *
     * Example:
     *
     * add(int, int)
     * add(double, double)
     * add(int, int, int)
     */

    public static int add(
            int a,
            int b,
            int c
    ) {

        return a + b + c;
    }


    /*
     * ========================================================
     * 20. OVERLOADING WITH double
     * ========================================================
     */

    public static double add(
            double a,
            double b
    ) {

        return a + b;
    }


    /*
     * ========================================================
     * 21. OVERLOADING WITH DIFFERENT TYPES
     * ========================================================
     */

    public static int multiply(
            int a,
            int b
    ) {

        return a * b;
    }


    public static double multiply(
            double a,
            double b
    ) {

        return a * b;
    }


    /*
     * ========================================================
     * 22. OVERLOADING WITH DIFFERENT NUMBER OF PARAMETERS
     * ========================================================
     */

    public static int multiply(
            int a,
            int b,
            int c
    ) {

        return a * b * c;
    }


    /*
     * ========================================================
     * 23. OVERLOADING WITH DIFFERENT ORDER
     * ========================================================
     *
     * Parameter order can also create different signatures.
     */

    public static void display(
            int number,
            String text
    ) {

        System.out.println(
                "Number: " +
                        number +
                        ", Text: " +
                        text
        );
    }


    public static void display(
            String text,
            int number
    ) {

        System.out.println(
                "Text: " +
                        text +
                        ", Number: " +
                        number
        );
    }


    /*
     * ========================================================
     * 24. OVERLOADING WITH String
     * ========================================================
     */

    public static void print(
            String text
    ) {

        System.out.println(text);
    }


    public static void print(
            int number
    ) {

        System.out.println(number);
    }


    public static void print(
            double number
    ) {

        System.out.println(number);
    }


    /*
     * ========================================================
     * 25. CALL-BY-VALUE
     * ========================================================
     *
     * Java is always pass-by-value.
     *
     * When a primitive value is passed to a method, a copy
     * of the value is passed.
     *
     * Changing the parameter inside the method does not
     * change the original variable.
     */

    public static void changeNumber(
            int number
    ) {

        number = 1000;

        System.out.println(
                "Inside method: " +
                        number
        );
    }


    /*
     * ========================================================
     * 26. CALL-BY-VALUE WITH double
     * ========================================================
     */

    public static void changeDouble(
            double number
    ) {

        number = 999.99;
    }


    /*
     * ========================================================
     * 27. OBJECT REFERENCES
     * ========================================================
     *
     * When an object is passed to a method, the reference
     * value is passed by value.
     *
     * The reference is copied.
     *
     * Both references can refer to the same object.
     *
     * Therefore, the method can change the object's fields.
     */

    public static class Person {

        String name;
        int age;

        public Person(
                String name,
                int age
        ) {

            this.name = name;
            this.age = age;
        }
    }


    /*
     * ========================================================
     * 28. MODIFY OBJECT
     * ========================================================
     */

    public static void changePerson(
            Person person
    ) {

        person.name = "Alex";
        person.age = 30;
    }


    /*
     * ========================================================
     * 29. REASSIGN OBJECT REFERENCE
     * ========================================================
     *
     * Reassigning the parameter does NOT change which object
     * the caller's variable refers to.
     */

    public static void replacePerson(
            Person person
    ) {

        person = new Person(
                "New Person",
                50
        );
    }


    /*
     * ========================================================
     * 30. METHOD CALLING ANOTHER METHOD
     * ========================================================
     */

    public static int square(
            int number
    ) {

        return number * number;
    }


    public static int squareAndAdd(
            int a,
            int b
    ) {

        int first = square(a);
        int second = square(b);

        return first + second;
    }


    /*
     * ========================================================
     * 31. VARARGS
     * ========================================================
     *
     * Varargs allows a method to accept zero or more arguments.
     *
     * Syntax:
     *
     * type... variable
     *
     * Internally, varargs are treated like an array.
     */

    public static int sumAll(
            int... numbers
    ) {

        int sum = 0;

        for (int number : numbers) {

            sum += number;
        }

        return sum;
    }


    /*
     * ========================================================
     * 32. VARARGS WITH String
     * ========================================================
     */

    public static void printNames(
            String... names
    ) {

        for (String name : names) {

            System.out.println(name);
        }
    }


    /*
     * ========================================================
     * 33. RECURSION
     * ========================================================
     *
     * Recursion happens when a method calls itself.
     *
     * A recursive method needs two important parts:
     *
     * 1. Base case
     * 2. Recursive case
     *
     * Base case:
     * Stops the recursion.
     *
     * Recursive case:
     * Calls the method again with a smaller/simpler problem.
     */


    /*
     * ========================================================
     * 34. SIMPLE RECURSION
     * ========================================================
     */

    public static void countDown(
            int number
    ) {

        if (number == 0) {

            return;
        }

        System.out.println(number);

        countDown(number - 1);
    }


    /*
     * ========================================================
     * 35. FACTORIAL USING RECURSION
     * ========================================================
     *
     * 5! =
     *
     * 5 * 4 * 3 * 2 * 1
     *
     * Recursive definition:
     *
     * factorial(n) =
     *
     * n * factorial(n - 1)
     *
     * Base case:
     *
     * factorial(0) = 1
     */

    public static int factorialRecursive(
            int number
    ) {

        if (number == 0) {

            return 1;
        }

        return number *
                factorialRecursive(
                        number - 1
                );
    }


    /*
     * ========================================================
     * 36. SUM USING RECURSION
     * ========================================================
     *
     * sum(5)
     *
     * = 5 + 4 + 3 + 2 + 1
     *
     * = 15
     */

    public static int recursiveSum(
            int number
    ) {

        if (number == 0) {

            return 0;
        }

        return number +
                recursiveSum(
                        number - 1
                );
    }


    /*
     * ========================================================
     * 37. POWER USING RECURSION
     * ========================================================
     *
     * 2^4
     *
     * = 2 * 2 * 2 * 2
     * = 16
     */

    public static int power(
            int base,
            int exponent
    ) {

        if (exponent == 0) {

            return 1;
        }

        return base *
                power(
                        base,
                        exponent - 1
                );
    }


    /*
     * ========================================================
     * 38. FIBONACCI USING RECURSION
     * ========================================================
     *
     * Fibonacci:
     *
     * 0 1 1 2 3 5 8 ...
     *
     * fibonacci(0) = 0
     * fibonacci(1) = 1
     *
     * fibonacci(n) =
     * fibonacci(n-1) + fibonacci(n-2)
     */

    public static int fibonacci(
            int number
    ) {

        if (number == 0) {

            return 0;
        }

        if (number == 1) {

            return 1;
        }

        return fibonacci(number - 1)
                + fibonacci(number - 2);
    }


    /*
     * ========================================================
     * 39. RECURSIVE STRING REVERSE
     * ========================================================
     */

    public static String reverseString(
            String text
    ) {

        if (text.length() <= 1) {

            return text;
        }

        return reverseString(
                text.substring(1)
        ) + text.charAt(0);
    }


    /*
     * ========================================================
     * 40. RECURSIVE ARRAY SUM
     * ========================================================
     *
     * index tells us which element we are currently processing.
     */

    public static int recursiveArraySum(
            int[] numbers,
            int index
    ) {

        if (index == numbers.length) {

            return 0;
        }

        return numbers[index]
                + recursiveArraySum(
                numbers,
                index + 1
        );
    }


    /*
     * ========================================================
     * 41. RECURSIVE ARRAY MAXIMUM
     * ========================================================
     */

    public static int recursiveMaximum(
            int[] numbers,
            int index
    ) {

        if (index == numbers.length - 1) {

            return numbers[index];
        }

        int remainingMaximum =
                recursiveMaximum(
                        numbers,
                        index + 1
                );

        if (
                numbers[index] >
                        remainingMaximum
        ) {

            return numbers[index];

        } else {

            return remainingMaximum;
        }
    }


    /*
     * ========================================================
     * 42. GREATEST COMMON DIVISOR
     * ========================================================
     *
     * Euclidean algorithm:
     *
     * gcd(a,b) = gcd(b,a%b)
     *
     * Base case:
     *
     * gcd(a,0) = a
     */

    public static int gcd(
            int a,
            int b
    ) {

        if (b == 0) {

            return a;
        }

        return gcd(
                b,
                a % b
        );
    }


    /*
     * ========================================================
     * 43. INSTANCE METHOD
     * ========================================================
     *
     * Static methods belong to the class.
     *
     * Instance methods belong to objects.
     *
     * An instance method is called using an object.
     */

    public static class Calculator {

        public int subtract(
                int a,
                int b
        ) {

            return a - b;
        }


        public int multiply(
                int a,
                int b
        ) {

            return a * b;
        }
    }


    /*
     * ========================================================
     * 44. METHOD RETURNING boolean
     * ========================================================
     */

    public static boolean isPalindrome(
            String text
    ) {

        int left = 0;
        int right = text.length() - 1;

        while (left < right) {

            if (
                    text.charAt(left)
                            !=
                            text.charAt(right)
            ) {

                return false;
            }

            left++;
            right--;
        }

        return true;
    }


    /*
     * ========================================================
     * 45. METHOD TO COUNT VOWELS
     * ========================================================
     */

    public static int countVowels(
            String text
    ) {

        int count = 0;

        for (
                int i = 0;
                i < text.length();
                i++
        ) {

            char c =
                    Character.toLowerCase(
                            text.charAt(i)
                    );

            if (
                    c == 'a' ||
                            c == 'e' ||
                            c == 'i' ||
                            c == 'o' ||
                            c == 'u'
            ) {

                count++;
            }
        }

        return count;
    }


    /*
     * ========================================================
     * 46. METHOD TO SWAP ARRAY ELEMENTS
     * ========================================================
     */

    public static void swap(
            int[] numbers,
            int first,
            int second
    ) {

        int temporary =
                numbers[first];

        numbers[first] =
                numbers[second];

        numbers[second] =
                temporary;
    }


    /*
     * ========================================================
     * 47. MAIN METHOD
     * ========================================================
     *
     * Program execution starts here.
     */

    public static void main(
            String[] args
    ) {

        /*
         * ====================================================
         * BASIC METHOD CALL
         * ====================================================
         */

        System.out.println(
                "===== BASIC METHODS ====="
        );

        sayHello();


        /*
         * ====================================================
         * METHOD WITH PARAMETER
         * ====================================================
         */

        greet("Kush");


        /*
         * ====================================================
         * MULTIPLE PARAMETERS
         * ====================================================
         */

        introduce(
                "Kush",
                25
        );


        /*
         * ====================================================
         * RETURN VALUE
         * ====================================================
         */

        int result =
                add(10, 20);

        System.out.println(
                "10 + 20 = " +
                        result
        );


        /*
         * ====================================================
         * DOUBLE RETURN VALUE
         * ====================================================
         */

        double division =
                divide(
                        10.0,
                        3.0
                );

        System.out.println(
                "10 / 3 = " +
                        division
        );


        /*
         * ====================================================
         * STRING RETURN
         * ====================================================
         */

        String message =
                getMessage();

        System.out.println(
                message
        );


        /*
         * ====================================================
         * BOOLEAN RETURN
         * ====================================================
         */

        System.out.println(
                "10 is even: " +
                        isEven(10)
        );


        /*
         * ====================================================
         * CHAR RETURN
         * ====================================================
         */

        System.out.println(
                "First character: " +
                        getFirstCharacter("Java")
        );


        /*
         * ====================================================
         * if-else METHOD
         * ====================================================
         */

        System.out.println(
                "Number status: " +
                        checkNumber(-5)
        );


        /*
         * ====================================================
         * MAXIMUM / MINIMUM
         * ====================================================
         */

        System.out.println(
                "Maximum: " +
                        maximum(10, 20)
        );

        System.out.println(
                "Minimum: " +
                        minimum(10, 20)
        );


        /*
         * ====================================================
         * ARRAY METHODS
         * ====================================================
         */

        int[] numbers = {
                10,
                20,
                30,
                40,
                50
        };

        System.out.println(
                "\n===== ARRAY METHODS ====="
        );

        System.out.println(
                "Array:"
        );

        printArray(numbers);

        System.out.println(
                "Array sum: " +
                        arraySum(numbers)
        );

        System.out.println(
                "Array maximum: " +
                        arrayMaximum(numbers)
        );

        System.out.println(
                "Array minimum: " +
                        arrayMinimum(numbers)
        );


        /*
         * ====================================================
         * MODIFY ARRAY
         * ====================================================
         */

        doubleArray(numbers);

        System.out.println(
                "After doubling: " +
                        Arrays.toString(numbers)
        );


        /*
         * ====================================================
         * RETURN ARRAY
         * ====================================================
         */

        int[] created =
                createNumbers();

        System.out.println(
                "Created array: " +
                        Arrays.toString(created)
        );


        /*
         * ====================================================
         * METHOD OVERLOADING
         * ====================================================
         */

        System.out.println(
                "\n===== METHOD OVERLOADING ====="
        );

        System.out.println(
                add(5, 10)
        );

        System.out.println(
                add(5, 10, 15)
        );

        System.out.println(
                add(5.5, 10.5)
        );

        System.out.println(
                multiply(5, 10)
        );

        System.out.println(
                multiply(5.5, 10.5)
        );

        System.out.println(
                multiply(2, 3, 4)
        );


        /*
         * ====================================================
         * OVERLOADING WITH DIFFERENT ORDER
         * ====================================================
         */

        display(
                100,
                "Java"
        );

        display(
                "Java",
                100
        );


        /*
         * ====================================================
         * PRINT OVERLOADING
         * ====================================================
         */

        print("Hello");
        print(100);
        print(10.5);


        /*
         * ====================================================
         * CALL-BY-VALUE
         * ====================================================
         */

        System.out.println(
                "\n===== CALL-BY-VALUE ====="
        );

        int original = 10;

        System.out.println(
                "Before method: " +
                        original
        );

        changeNumber(original);

        System.out.println(
                "After method: " +
                        original
        );


        /*
         * ====================================================
         * OBJECT REFERENCE
         * ====================================================
         */

        System.out.println(
                "\n===== OBJECT REFERENCE ====="
        );

        Person person =
                new Person(
                        "Kush",
                        25
                );

        System.out.println(
                "Before: " +
                        person.name +
                        " " +
                        person.age
        );

        changePerson(person);

        System.out.println(
                "After: " +
                        person.name +
                        " " +
                        person.age
        );


        /*
         * ====================================================
         * REASSIGNING OBJECT REFERENCE
         * ====================================================
         */

        Person person2 =
                new Person(
                        "John",
                        20
                );

        replacePerson(person2);

        System.out.println(
                "Person after replace attempt: " +
                        person2.name
        );


        /*
         * ====================================================
         * METHOD CALLING ANOTHER METHOD
         * ====================================================
         */

        System.out.println(
                "\n===== METHOD CALLING METHOD ====="
        );

        System.out.println(
                "Square of 5: " +
                        square(5)
        );

        System.out.println(
                "5² + 6² = " +
                        squareAndAdd(5, 6)
        );


        /*
         * ====================================================
         * VARARGS
         * ====================================================
         */

        System.out.println(
                "\n===== VARARGS ====="
        );

        System.out.println(
                sumAll(1, 2, 3)
        );

        System.out.println(
                sumAll(
                        10,
                        20,
                        30,
                        40,
                        50
                )
        );

        printNames(
                "Kush",
                "John",
                "Alex"
        );


        /*
         * ====================================================
         * RECURSION
         * ====================================================
         */

        System.out.println(
                "\n===== RECURSION ====="
        );

        countDown(5);


        /*
         * ====================================================
         * FACTORIAL RECURSION
         * ====================================================
         */

        System.out.println(
                "5! = " +
                        factorialRecursive(5)
        );


        /*
         * ====================================================
         * SUM RECURSION
         * ====================================================
         */

        System.out.println(
                "Sum 1 to 5 = " +
                        recursiveSum(5)
        );


        /*
         * ====================================================
         * POWER RECURSION
         * ====================================================
         */

        System.out.println(
                "2^5 = " +
                        power(2, 5)
        );


        /*
         * ====================================================
         * FIBONACCI RECURSION
         * ====================================================
         */

        System.out.println(
                "Fibonacci(10) = " +
                        fibonacci(10)
        );


        /*
         * ====================================================
         * REVERSE STRING RECURSION
         * ====================================================
         */

        System.out.println(
                "Reverse Java = " +
                        reverseString("Java")
        );


        /*
         * ====================================================
         * RECURSIVE ARRAY SUM
         * ====================================================
         */

        int[] recursiveNumbers = {
                10,
                20,
                30,
                40
        };

        System.out.println(
                "Recursive array sum = " +
                        recursiveArraySum(
                                recursiveNumbers,
                                0
                        )
        );


        /*
         * ====================================================
         * RECURSIVE MAXIMUM
         * ====================================================
         */

        System.out.println(
                "Recursive maximum = " +
                        recursiveMaximum(
                                recursiveNumbers,
                                0
                        )
        );


        /*
         * ====================================================
         * GCD
         * ====================================================
         */

        System.out.println(
                "GCD of 48 and 18 = " +
                        gcd(48, 18)
        );


        /*
         * ====================================================
         * INSTANCE METHOD
         * ====================================================
         */

        System.out.println(
                "\n===== INSTANCE METHOD ====="
        );

        Calculator calculator =
                new Calculator();

        System.out.println(
                "20 - 5 = " +
                        calculator.subtract(
                                20,
                                5
                        )
        );

        System.out.println(
                "5 * 6 = " +
                        calculator.multiply(
                                5,
                                6
                        )
        );


        /*
         * ====================================================
         * PALINDROME
         * ====================================================
         */

        System.out.println(
                "\n===== PRACTICAL METHODS ====="
        );

        System.out.println(
                "madam is palindrome: " +
                        isPalindrome("madam")
        );


        /*
         * ====================================================
         * COUNT VOWELS
         * ====================================================
         */

        System.out.println(
                "Vowels in Programming: " +
                        countVowels("Programming")
        );


        /*
         * ====================================================
         * SWAP ARRAY VALUES
         * ====================================================
         */

        int[] swapNumbers = {
                10,
                20,
                30
        };

        swap(
                swapNumbers,
                0,
                2
        );

        System.out.println(
                "After swap: " +
                        Arrays.toString(
                                swapNumbers
                        )
        );


        /*
         * ====================================================
         * FINAL SUMMARY
         * ====================================================
         */

        System.out.println(
                "\n=========================================="
        );

        System.out.println(
                "JAVA METHODS DEMONSTRATION COMPLETED"
        );

        System.out.println(
                "Methods"
        );

        System.out.println(
                "Parameters"
        );

        System.out.println(
                "Return types"
        );

        System.out.println(
                "Method signatures"
        );

        System.out.println(
                "Method overloading"
        );

        System.out.println(
                "Call-by-value"
        );

        System.out.println(
                "Object references"
        );

        System.out.println(
                "Arrays and methods"
        );

        System.out.println(
                "Varargs"
        );

        System.out.println(
                "Static methods"
        );

        System.out.println(
                "Instance methods"
        );

        System.out.println(
                "Recursion"
        );

        System.out.println(
                "Base cases"
        );

        System.out.println(
                "Recursive calls"
        );

        System.out.println(
                "=========================================="
        );
    }
}