import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/*
 * ============================================================
 *              JAVA DATA TYPES COMPLETE GUIDE
 * ============================================================
 *
 * This program demonstrates Java data types from basic
 * to advanced level.
 *
 * ============================================================
 * PRIMITIVE DATA TYPES
 * ============================================================
 *
 * 1. byte
 * 2. short
 * 3. int
 * 4. long
 * 5. float
 * 6. double
 * 7. char
 * 8. boolean
 *
 * ============================================================
 * REFERENCE DATA TYPES
 * ============================================================
 *
 * 9. String
 * 10. Arrays
 * 11. Objects
 * 12. Classes
 * 13. Interfaces
 * 14. Enum
 * 15. Record
 *
 * ============================================================
 * OTHER IMPORTANT TOPICS
 * ============================================================
 *
 * 16. Wrapper classes
 * 17. Type casting
 * 18. Widening conversion
 * 19. Narrowing conversion
 * 20. Parsing
 * 21. Converting values to String
 * 22. final variables
 * 23. var
 * 24. null
 * 25. BigInteger
 * 26. BigDecimal
 * 27. Scanner input
 *
 * ============================================================
 */

public class DataTypesInJava {

    public static void main(String[] args) {

        /*
         * ====================================================
         * 1. BYTE
         * ====================================================
         *
         * byte is an integer data type.
         *
         * Size: 8 bits
         *
         * Range:
         *
         * -128 to 127
         *
         * Use byte when a small integer value is enough.
         */

        byte age = 25;

        System.out.println("BYTE");
        System.out.println("Value: " + age);
        System.out.println(
                "Size: " +
                        Byte.SIZE +
                        " bits"
        );
        System.out.println(
                "Minimum: " +
                        Byte.MIN_VALUE
        );
        System.out.println(
                "Maximum: " +
                        Byte.MAX_VALUE
        );


        /*
         * ====================================================
         * 2. SHORT
         * ====================================================
         *
         * short is an integer data type.
         *
         * Size: 16 bits
         *
         * Range:
         *
         * -32,768 to 32,767
         */

        short temperature = 25000;

        System.out.println("\nSHORT");
        System.out.println(
                "Value: " +
                        temperature
        );
        System.out.println(
                "Size: " +
                        Short.SIZE +
                        " bits"
        );
        System.out.println(
                "Minimum: " +
                        Short.MIN_VALUE
        );
        System.out.println(
                "Maximum: " +
                        Short.MAX_VALUE
        );


        /*
         * ====================================================
         * 3. INT
         * ====================================================
         *
         * int is the most commonly used integer data type.
         *
         * Size: 32 bits
         *
         * Range:
         *
         * -2,147,483,648
         * to
         * 2,147,483,647
         */

        int population = 1000000;

        System.out.println("\nINT");
        System.out.println(
                "Value: " +
                        population
        );
        System.out.println(
                "Size: " +
                        Integer.SIZE +
                        " bits"
        );
        System.out.println(
                "Minimum: " +
                        Integer.MIN_VALUE
        );
        System.out.println(
                "Maximum: " +
                        Integer.MAX_VALUE
        );


        /*
         * ====================================================
         * 4. LONG
         * ====================================================
         *
         * long is used for very large integer values.
         *
         * Size: 64 bits
         *
         * Add L at the end of a long literal.
         */

        long worldPopulation = 8000000000L;

        System.out.println("\nLONG");
        System.out.println(
                "Value: " +
                        worldPopulation
        );
        System.out.println(
                "Size: " +
                        Long.SIZE +
                        " bits"
        );
        System.out.println(
                "Minimum: " +
                        Long.MIN_VALUE
        );
        System.out.println(
                "Maximum: " +
                        Long.MAX_VALUE
        );


        /*
         * ====================================================
         * 5. FLOAT
         * ====================================================
         *
         * float stores decimal numbers.
         *
         * Size: 32 bits
         *
         * Add f or F at the end of a float literal.
         *
         * Example:
         *
         * 10.5f
         */

        float height = 5.9f;

        System.out.println("\nFLOAT");
        System.out.println(
                "Value: " +
                        height
        );
        System.out.println(
                "Size: " +
                        Float.SIZE +
                        " bits"
        );
        System.out.println(
                "Minimum: " +
                        Float.MIN_VALUE
        );
        System.out.println(
                "Maximum: " +
                        Float.MAX_VALUE
        );


        /*
         * ====================================================
         * 6. DOUBLE
         * ====================================================
         *
         * double stores decimal numbers with more precision
         * than float.
         *
         * Size: 64 bits
         *
         * Decimal literals are double by default.
         */

        double price = 99.99;

        System.out.println("\nDOUBLE");
        System.out.println(
                "Value: " +
                        price
        );
        System.out.println(
                "Size: " +
                        Double.SIZE +
                        " bits"
        );
        System.out.println(
                "Minimum: " +
                        Double.MIN_VALUE
        );
        System.out.println(
                "Maximum: " +
                        Double.MAX_VALUE
        );


        /*
         * ====================================================
         * 7. CHAR
         * ====================================================
         *
         * char stores a single character.
         *
         * Size: 16 bits
         *
         * Character values use single quotes.
         *
         * Example:
         *
         * 'A'
         */

        char grade = 'A';

        System.out.println("\nCHAR");
        System.out.println(
                "Value: " +
                        grade
        );
        System.out.println(
                "Size: " +
                        Character.SIZE +
                        " bits"
        );

        /*
         * A char can also contain a Unicode character.
         */

        char symbol = '€';

        System.out.println(
                "Unicode character: " +
                        symbol
        );


        /*
         * ====================================================
         * 8. BOOLEAN
         * ====================================================
         *
         * boolean stores only two possible values:
         *
         * true
         * false
         *
         * boolean is normally used in conditions.
         */

        boolean isStudent = true;

        System.out.println("\nBOOLEAN");
        System.out.println(
                "Value: " +
                        isStudent
        );

        if (isStudent) {

            System.out.println(
                    "The person is a student."
            );
        }


        /*
         * ====================================================
         * 9. STRING
         * ====================================================
         *
         * String is NOT a primitive data type.
         *
         * String is a class/reference type.
         *
         * Strings are written using double quotes.
         */

        String name = "Kush";

        System.out.println("\nSTRING");
        System.out.println(
                "Name: " +
                        name
        );

        System.out.println(
                "Length: " +
                        name.length()
        );

        System.out.println(
                "First character: " +
                        name.charAt(0)
        );


        /*
         * ====================================================
         * 10. ARRAY
         * ====================================================
         *
         * An array stores multiple values of the same type.
         *
         * Example:
         *
         * int[] numbers
         */

        int[] numbers = {
                10,
                20,
                30,
                40,
                50
        };

        System.out.println("\nARRAY");

        System.out.println(
                "First element: " +
                        numbers[0]
        );

        System.out.println(
                "Third element: " +
                        numbers[2]
        );

        System.out.println(
                "Array length: " +
                        numbers.length
        );


        /*
         * ====================================================
         * 11. OBJECT
         * ====================================================
         *
         * An object is an instance of a class.
         *
         * Here Student is our custom class.
         */

        Student student =
                new Student(
                        "Kush",
                        25
                );

        System.out.println("\nOBJECT");

        System.out.println(
                "Student name: " +
                        student.name
        );

        System.out.println(
                "Student age: " +
                        student.age
        );


        /*
         * ====================================================
         * 12. ENUM
         * ====================================================
         *
         * enum is used when a variable can have a fixed
         * set of possible values.
         */

        Day today = Day.MONDAY;

        System.out.println("\nENUM");
        System.out.println(
                "Today: " +
                        today
        );


        /*
         * ====================================================
         * 13. RECORD
         * ====================================================
         *
         * A record is a concise way to create a class mainly
         * for storing data.
         */

        Person person =
                new Person(
                        "John",
                        30
                );

        System.out.println("\nRECORD");

        System.out.println(
                "Name: " +
                        person.name()
        );

        System.out.println(
                "Age: " +
                        person.age()
        );


        /*
         * ====================================================
         * 14. WRAPPER CLASSES
         * ====================================================
         *
         * Every primitive data type has a corresponding
         * wrapper class.
         *
         * byte    -> Byte
         * short   -> Short
         * int     -> Integer
         * long    -> Long
         * float   -> Float
         * double  -> Double
         * char    -> Character
         * boolean -> Boolean
         */

        Integer integerObject = 100;
        Double doubleObject = 99.99;
        Character characterObject = 'A';
        Boolean booleanObject = true;

        System.out.println("\nWRAPPER CLASSES");

        System.out.println(
                "Integer: " +
                        integerObject
        );

        System.out.println(
                "Double: " +
                        doubleObject
        );

        System.out.println(
                "Character: " +
                        characterObject
        );

        System.out.println(
                "Boolean: " +
                        booleanObject
        );


        /*
         * ====================================================
         * 15. AUTOBOXING
         * ====================================================
         *
         * Autoboxing means Java automatically converts a
         * primitive into its wrapper object.
         */

        int primitiveNumber = 50;

        Integer boxedNumber =
                primitiveNumber;

        System.out.println("\nAUTOBOXING");

        System.out.println(
                "Primitive: " +
                        primitiveNumber
        );

        System.out.println(
                "Wrapper: " +
                        boxedNumber
        );


        /*
         * ====================================================
         * 16. UNBOXING
         * ====================================================
         *
         * Unboxing converts a wrapper object back into
         * a primitive.
         */

        Integer boxedValue = 100;

        int primitiveValue =
                boxedValue;

        System.out.println("\nUNBOXING");

        System.out.println(
                "Wrapper: " +
                        boxedValue
        );

        System.out.println(
                "Primitive: " +
                        primitiveValue
        );


        /*
         * ====================================================
         * 17. WIDENING TYPE CASTING
         * ====================================================
         *
         * Widening converts a smaller type into a larger
         * compatible type.
         *
         * Example:
         *
         * int -> long
         * int -> float
         * int -> double
         *
         * Java normally performs this automatically.
         */

        int smallNumber = 100;

        long largeNumber =
                smallNumber;

        double decimalNumber =
                smallNumber;

        System.out.println("\nWIDENING");

        System.out.println(
                "int: " +
                        smallNumber
        );

        System.out.println(
                "long: " +
                        largeNumber
        );

        System.out.println(
                "double: " +
                        decimalNumber
        );


        /*
         * ====================================================
         * 18. NARROWING TYPE CASTING
         * ====================================================
         *
         * Narrowing converts a larger type into a smaller
         * type.
         *
         * Explicit casting is required.
         */

        double decimalValue =
                99.99;

        int integerValue =
                (int) decimalValue;

        System.out.println("\nNARROWING");

        System.out.println(
                "double: " +
                        decimalValue
        );

        System.out.println(
                "int: " +
                        integerValue
        );


        /*
         * ====================================================
         * 19. NARROWING CAN LOSE DATA
         * ====================================================
         *
         * When converting double to int, the decimal part
         * is removed.
         */

        double numberWithDecimal =
                10.99;

        int converted =
                (int) numberWithDecimal;

        System.out.println(
                "Original: " +
                        numberWithDecimal
        );

        System.out.println(
                "Converted: " +
                        converted
        );


        /*
         * ====================================================
         * 20. CHAR TO INT
         * ====================================================
         *
         * A char can be converted to an integer.
         *
         * The result is the Unicode value of the character.
         */

        char letter = 'A';

        int unicodeValue =
                letter;

        System.out.println("\nCHAR TO INT");

        System.out.println(
                "Character: " +
                        letter
        );

        System.out.println(
                "Unicode value: " +
                        unicodeValue
        );


        /*
         * ====================================================
         * 21. INT TO CHAR
         * ====================================================
         *
         * An integer can be converted to char.
         */

        int characterNumber = 66;

        char convertedCharacter =
                (char) characterNumber;

        System.out.println("\nINT TO CHAR");

        System.out.println(
                "Number: " +
                        characterNumber
        );

        System.out.println(
                "Character: " +
                        convertedCharacter
        );


        /*
         * ====================================================
         * 22. STRING TO INT
         * ====================================================
         *
         * Integer.parseInt() converts a String containing
         * an integer into an int.
         */

        String numberString =
                "123";

        int parsedInteger =
                Integer.parseInt(
                        numberString
                );

        System.out.println("\nSTRING TO INT");

        System.out.println(
                "String: " +
                        numberString
        );

        System.out.println(
                "Integer: " +
                        parsedInteger
        );


        /*
         * ====================================================
         * 23. STRING TO DOUBLE
         * ====================================================
         */

        String doubleString =
                "123.45";

        double parsedDouble =
                Double.parseDouble(
                        doubleString
                );

        System.out.println("\nSTRING TO DOUBLE");

        System.out.println(
                "String: " +
                        doubleString
        );

        System.out.println(
                "Double: " +
                        parsedDouble
        );


        /*
         * ====================================================
         * 24. STRING TO BOOLEAN
         * ====================================================
         */

        String booleanString =
                "true";

        boolean parsedBoolean =
                Boolean.parseBoolean(
                        booleanString
                );

        System.out.println("\nSTRING TO BOOLEAN");

        System.out.println(
                "Boolean: " +
                        parsedBoolean
        );


        /*
         * ====================================================
         * 25. STRING TO LONG
         * ====================================================
         */

        String longString =
                "123456789";

        long parsedLong =
                Long.parseLong(
                        longString
                );

        System.out.println("\nSTRING TO LONG");

        System.out.println(
                "Long: " +
                        parsedLong
        );


        /*
         * ====================================================
         * 26. STRING TO FLOAT
         * ====================================================
         */

        String floatString =
                "12.5";

        float parsedFloat =
                Float.parseFloat(
                        floatString
                );

        System.out.println("\nSTRING TO FLOAT");

        System.out.println(
                "Float: " +
                        parsedFloat
        );


        /*
         * ====================================================
         * 27. PRIMITIVE TO STRING
         * ====================================================
         *
         * String.valueOf() converts values into Strings.
         */

        int value = 500;

        String valueString =
                String.valueOf(value);

        System.out.println("\nPRIMITIVE TO STRING");

        System.out.println(
                "String value: " +
                        valueString
        );


        /*
         * ====================================================
         * 28. STRING CONCATENATION
         * ====================================================
         *
         * When one side of + is a String, Java converts
         * the other value to String.
         */

        int studentAge = 25;

        String message =
                "Age = " +
                        studentAge;

        System.out.println(
                message
        );


        /*
         * ====================================================
         * 29. FINAL VARIABLE
         * ====================================================
         *
         * final means the variable cannot be reassigned.
         *
         * Once a final variable receives a value, that value
         * cannot be changed.
         */

        final double PI =
                3.14159265359;

        System.out.println("\nFINAL");

        System.out.println(
                "PI = " +
                        PI
        );


        /*
         * ====================================================
         * 30. CONSTANT
         * ====================================================
         *
         * Java convention:
         *
         * Constants are usually written in uppercase.
         */

        final int MAX_USERS = 100;

        System.out.println(
                "Maximum users: " +
                        MAX_USERS
        );


        /*
         * ====================================================
         * 31. var
         * ====================================================
         *
         * var allows Java to infer the local variable type.
         *
         * IMPORTANT:
         *
         * var is NOT a new data type.
         *
         * Java determines the actual type from the value.
         */

        var inferredInteger = 100;
        var inferredString = "Hello";
        var inferredDouble = 10.5;

        System.out.println("\nVAR");

        System.out.println(
                inferredInteger
        );

        System.out.println(
                inferredString
        );

        System.out.println(
                inferredDouble
        );


        /*
         * ====================================================
         * 32. NULL
         * ====================================================
         *
         * null means a reference does not currently refer
         * to an object.
         *
         * Primitive variables cannot contain null.
         *
         * Reference variables can contain null.
         */

        String nullString = null;

        System.out.println("\nNULL");

        System.out.println(
                "Is null: " +
                        (nullString == null)
        );


        /*
         * ====================================================
         * 33. NULL CHECK
         * ====================================================
         *
         * Always check a reference for null before calling
         * methods on it.
         */

        if (nullString == null) {

            System.out.println(
                    "String does not refer to an object."
            );
        }


        /*
         * ====================================================
         * 34. BIGINTEGER
         * ====================================================
         *
         * BigInteger can store integers larger than the
         * maximum value of long.
         *
         * Useful for very large integer calculations.
         */

        BigInteger bigNumber =
                new BigInteger(
                        "123456789123456789123456789"
                );

        BigInteger anotherBigNumber =
                new BigInteger(
                        "100000000000000000000000000"
                );

        BigInteger bigSum =
                bigNumber.add(
                        anotherBigNumber
                );

        System.out.println("\nBIGINTEGER");

        System.out.println(
                "Big number: " +
                        bigNumber
        );

        System.out.println(
                "Sum: " +
                        bigSum
        );


        /*
         * ====================================================
         * 35. BIGDECIMAL
         * ====================================================
         *
         * BigDecimal is useful when exact decimal arithmetic
         * is required.
         *
         * It is commonly used for financial calculations.
         *
         * Prefer constructing it from a String rather than
         * directly from a double.
         */

        BigDecimal price1 =
                new BigDecimal("10.50");

        BigDecimal price2 =
                new BigDecimal("20.75");

        BigDecimal totalPrice =
                price1.add(price2);

        System.out.println("\nBIGDECIMAL");

        System.out.println(
                "Price 1: " +
                        price1
        );

        System.out.println(
                "Price 2: " +
                        price2
        );

        System.out.println(
                "Total: " +
                        totalPrice
        );


        /*
         * ====================================================
         * 36. BIGDECIMAL MULTIPLICATION
         * ====================================================
         */

        BigDecimal quantity =
                new BigDecimal("3");

        BigDecimal total =
                price1.multiply(quantity);

        System.out.println(
                "Price x quantity: " +
                        total
        );


        /*
         * ====================================================
         * 37. BOOLEAN EXPRESSIONS
         * ====================================================
         *
         * Comparison operators return boolean values.
         *
         * >
         * <
         * >=
         * <=
         * ==
         * !=
         */

        int a = 10;
        int b = 20;

        boolean result1 =
                a < b;

        boolean result2 =
                a == b;

        System.out.println("\nBOOLEAN EXPRESSIONS");

        System.out.println(
                "a < b: " +
                        result1
        );

        System.out.println(
                "a == b: " +
                        result2
        );


        /*
         * ====================================================
         * 38. INTEGER OPERATIONS
         * ====================================================
         */

        int x = 10;
        int y = 3;

        System.out.println("\nINTEGER OPERATIONS");

        System.out.println(
                "Addition: " +
                        (x + y)
        );

        System.out.println(
                "Subtraction: " +
                        (x - y)
        );

        System.out.println(
                "Multiplication: " +
                        (x * y)
        );

        System.out.println(
                "Division: " +
                        (x / y)
        );

        System.out.println(
                "Remainder: " +
                        (x % y)
        );


        /*
         * ====================================================
         * 39. INTEGER DIVISION
         * ====================================================
         *
         * When both operands are integers, the result is
         * integer division.
         */

        int division =
                10 / 3;

        System.out.println(
                "\n10 / 3 = " +
                        division
        );


        /*
         * ====================================================
         * 40. DECIMAL DIVISION
         * ====================================================
         *
         * Using double gives a decimal result.
         */

        double decimalDivision =
                10.0 / 3.0;

        System.out.println(
                "10.0 / 3.0 = " +
                        decimalDivision
        );


        /*
         * ====================================================
         * 41. INTEGER OVERFLOW
         * ====================================================
         *
         * An int cannot store values larger than
         * Integer.MAX_VALUE.
         *
         * Overflow can produce unexpected results.
         */

        int maximumInt =
                Integer.MAX_VALUE;

        System.out.println(
                "\nMaximum int: " +
                        maximumInt
        );

        System.out.println(
                "Maximum int + 1: " +
                        (maximumInt + 1)
        );


        /*
         * ====================================================
         * 42. LONG LITERAL
         * ====================================================
         *
         * Use L for long literals when necessary.
         */

        long largeValue =
                9000000000L;

        System.out.println(
                "\nLong value: " +
                        largeValue
        );


        /*
         * ====================================================
         * 43. FLOAT LITERAL
         * ====================================================
         *
         * Decimal values are double by default.
         *
         * Add f to explicitly create a float literal.
         */

        float floatValue =
                10.5f;

        System.out.println(
                "\nFloat value: " +
                        floatValue
        );


        /*
         * ====================================================
         * 44. SCIENTIFIC NOTATION
         * ====================================================
         *
         * Java supports scientific notation for floating
         * point values.
         */

        double scientific =
                1.5e3;

        System.out.println(
                "\nScientific notation: " +
                        scientific
        );


        /*
         * ====================================================
         * 45. CHARACTER METHODS
         * ====================================================
         *
         * Character provides useful methods for char values.
         */

        char testChar = 'A';

        System.out.println("\nCHARACTER METHODS");

        System.out.println(
                "Is letter: " +
                        Character.isLetter(testChar)
        );

        System.out.println(
                "Is digit: " +
                        Character.isDigit(testChar)
        );

        System.out.println(
                "Is uppercase: " +
                        Character.isUpperCase(testChar)
        );

        System.out.println(
                "Is lowercase: " +
                        Character.isLowerCase(testChar)
        );


        /*
         * ====================================================
         * 46. CONVERT CHAR CASE
         * ====================================================
         */

        System.out.println(
                "Lowercase: " +
                        Character.toLowerCase(
                                testChar
                        )
        );

        System.out.println(
                "Uppercase: " +
                        Character.toUpperCase(
                                testChar
                        )
        );


        /*
         * ====================================================
         * 47. TYPE OF AN ARRAY
         * ====================================================
         *
         * Arrays are reference types.
         */

        int[] integerArray = {
                1, 2, 3
        };

        System.out.println(
                "\nArray first value: " +
                        integerArray[0]
        );


        /*
         * ====================================================
         * 48. MULTIDIMENSIONAL ARRAY
         * ====================================================
         */

        int[][] matrix = {
                {1, 2},
                {3, 4}
        };

        System.out.println(
                "\n2D Array:"
        );

        System.out.println(
                matrix[0][0]
        );

        System.out.println(
                matrix[1][1]
        );


        /*
         * ====================================================
         * 49. OBJECT REFERENCE
         * ====================================================
         *
         * Reference variables store references to objects,
         * not the complete object itself.
         */

        Student student1 =
                new Student(
                        "Alex",
                        22
                );

        Student student2 =
                student1;

        student2.name = "John";

        System.out.println(
                "\nREFERENCE"
        );

        System.out.println(
                "Student 1: " +
                        student1.name
        );

        System.out.println(
                "Student 2: " +
                        student2.name
        );


        /*
         * ====================================================
         * 50. SCANNER INPUT
         * ====================================================
         *
         * Scanner can read values from the keyboard.
         *
         * The following code is commented out so the program
         * does not stop and wait for input automatically.
         *
         * You can uncomment it when practicing.
         */

        /*
        Scanner scanner =
                new Scanner(System.in);

        System.out.print(
                "Enter your name: "
        );

        String inputName =
                scanner.nextLine();

        System.out.print(
                "Enter your age: "
        );

        int inputAge =
                scanner.nextInt();

        System.out.println(
                "Name: " +
                inputName
        );

        System.out.println(
                "Age: " +
                inputAge
        );

        scanner.close();
        */


        /*
         * ====================================================
         * 51. SUMMARY
         * ====================================================
         */

        System.out.println(
                "\n================================"
        );

        System.out.println(
                "JAVA DATA TYPES DEMONSTRATION"
        );

        System.out.println(
                "COMPLETED"
        );

        System.out.println(
                "================================"
        );
    }


    /*
     * ========================================================
     * CUSTOM CLASS
     * ========================================================
     *
     * This class demonstrates a reference data type.
     */

    static class Student {

        String name;
        int age;

        Student(
                String name,
                int age
        ) {

            this.name = name;
            this.age = age;
        }
    }


    /*
     * ========================================================
     * ENUM
     * ========================================================
     *
     * An enum contains a fixed set of constants.
     */

    enum Day {

        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }


    /*
     * ========================================================
     * RECORD
     * ========================================================
     *
     * A record automatically provides methods such as:
     *
     * name()
     * age()
     * toString()
     * equals()
     * hashCode()
     */

    record Person(
            String name,
            int age
    ) {
    }
}