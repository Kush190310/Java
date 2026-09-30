/*
 * ============================================================
 *          JAVA OPERATORS & EXPRESSIONS COMPLETE GUIDE
 * ============================================================
 *
 * This program explains and demonstrates Java operators
 * and expressions from beginner to advanced level.
 *
 * ============================================================
 * TOPICS COVERED
 * ============================================================
 *
 * 1. Arithmetic Operators
 * 2. Addition
 * 3. Subtraction
 * 4. Multiplication
 * 5. Division
 * 6. Modulus
 *
 * 7. Unary Operators
 * 8. Increment
 * 9. Decrement
 * 10. Unary plus
 * 11. Unary minus
 * 12. Logical NOT
 *
 * 13. Assignment Operators
 * 14. +=
 * 15. -=
 * 16. *=
 * 17. /=
 * 18. %=
 * 19. &=
 * 20. |=
 * 21. ^=
 * 22. <<=
 * 23. >>=
 * 24. >>>=
 *
 * 25. Relational Operators
 * 26. >
 * 27. <
 * 28. >=
 * 29. <=
 * 30. ==
 * 31. !=
 *
 * 32. Logical Operators
 * 33. &&
 * 34. ||
 * 35. !
 *
 * 36. Bitwise Operators
 * 37. &
 * 38. |
 * 39. ^
 * 40. ~
 *
 * 41. Shift Operators
 * 42. <<
 * 43. >>
 * 44. >>>
 *
 * 45. Ternary Operator
 * 46. instanceof
 * 47. String concatenation
 * 48. Operator precedence
 * 49. Parentheses
 * 50. Short-circuit evaluation
 * 51. Expressions
 * 52. Compound expressions
 * 53. Type casting in expressions
 * 54. Integer division
 * 55. Overflow
 * 56. Math expressions
 * 57. Common mistakes
 *
 * ============================================================
 */

public class OperatorsExpressionsInJava {

    public static void main(String[] args) {

        /*
         * ====================================================
         * 1. ARITHMETIC OPERATORS
         * ====================================================
         *
         * Arithmetic operators are used for mathematical
         * calculations.
         *
         * +   Addition
         * -   Subtraction
         * *   Multiplication
         * /   Division
         * %   Modulus / Remainder
         */

        int a = 20;
        int b = 6;

        System.out.println("ARITHMETIC OPERATORS");

        System.out.println(
                "Addition: " +
                        (a + b)
        );

        System.out.println(
                "Subtraction: " +
                        (a - b)
        );

        System.out.println(
                "Multiplication: " +
                        (a * b)
        );

        System.out.println(
                "Division: " +
                        (a / b)
        );

        System.out.println(
                "Remainder: " +
                        (a % b)
        );


        /*
         * ====================================================
         * 2. ADDITION
         * ====================================================
         *
         * The + operator adds two values.
         */

        int x = 10;
        int y = 5;

        int addition =
                x + y;

        System.out.println(
                "\nAddition: " +
                        addition
        );


        /*
         * ====================================================
         * 3. SUBTRACTION
         * ====================================================
         */

        int subtraction =
                x - y;

        System.out.println(
                "Subtraction: " +
                        subtraction
        );


        /*
         * ====================================================
         * 4. MULTIPLICATION
         * ====================================================
         */

        int multiplication =
                x * y;

        System.out.println(
                "Multiplication: " +
                        multiplication
        );


        /*
         * ====================================================
         * 5. DIVISION
         * ====================================================
         *
         * If both operands are integers, Java performs
         * integer division.
         */

        int division =
                x / y;

        System.out.println(
                "Division: " +
                        division
        );


        /*
         * ====================================================
         * 6. MODULUS
         * ====================================================
         *
         * % returns the remainder after division.
         *
         * Example:
         *
         * 10 % 3 = 1
         */

        int remainder =
                10 % 3;

        System.out.println(
                "Remainder: " +
                        remainder
        );


        /*
         * ====================================================
         * 7. CHECK EVEN OR ODD
         * ====================================================
         *
         * A number is even when:
         *
         * number % 2 == 0
         *
         * A number is odd when:
         *
         * number % 2 != 0
         */

        int number = 17;

        if (number % 2 == 0) {

            System.out.println(
                    "\n" +
                            number +
                            " is even"
            );

        } else {

            System.out.println(
                    "\n" +
                            number +
                            " is odd"
            );
        }


        /*
         * ====================================================
         * 8. UNARY OPERATORS
         * ====================================================
         *
         * Unary operators work with ONE operand.
         *
         * +x   Unary plus
         * -x   Unary minus
         * ++x  Increment
         * --x  Decrement
         * !x   Logical NOT
         */

        int unaryNumber = 10;

        System.out.println(
                "\nUNARY OPERATORS"
        );

        System.out.println(
                "Unary plus: " +
                        (+unaryNumber)
        );

        System.out.println(
                "Unary minus: " +
                        (-unaryNumber)
        );


        /*
         * ====================================================
         * 9. PREFIX INCREMENT
         * ====================================================
         *
         * ++x increases x by 1 BEFORE the value is used.
         */

        int prefix = 10;

        int prefixResult =
                ++prefix;

        System.out.println(
                "\nPrefix result: " +
                        prefixResult
        );

        System.out.println(
                "Prefix variable: " +
                        prefix
        );


        /*
         * ====================================================
         * 10. POSTFIX INCREMENT
         * ====================================================
         *
         * x++ uses the current value FIRST,
         * then increases it by 1.
         */

        int postfix = 10;

        int postfixResult =
                postfix++;

        System.out.println(
                "\nPostfix result: " +
                        postfixResult
        );

        System.out.println(
                "Postfix variable: " +
                        postfix
        );


        /*
         * ====================================================
         * 11. PREFIX DECREMENT
         * ====================================================
         *
         * --x decreases the value BEFORE it is used.
         */

        int prefixDecrease = 10;

        int prefixDecreaseResult =
                --prefixDecrease;

        System.out.println(
                "\nPrefix decrement: " +
                        prefixDecreaseResult
        );


        /*
         * ====================================================
         * 12. POSTFIX DECREMENT
         * ====================================================
         *
         * x-- uses the current value FIRST,
         * then decreases it by 1.
         */

        int postfixDecrease = 10;

        int postfixDecreaseResult =
                postfixDecrease--;

        System.out.println(
                "Postfix decrement: " +
                        postfixDecreaseResult
        );

        System.out.println(
                "Variable after decrement: " +
                        postfixDecrease
        );


        /*
         * ====================================================
         * 13. LOGICAL NOT
         * ====================================================
         *
         * ! changes:
         *
         * true  -> false
         * false -> true
         */

        boolean isJavaEasy = true;

        System.out.println(
                "\nNOT: " +
                        !isJavaEasy
        );


        /*
         * ====================================================
         * 14. ASSIGNMENT OPERATOR
         * ====================================================
         *
         * = assigns a value to a variable.
         */

        int assignmentNumber = 100;

        System.out.println(
                "\nAssignment: " +
                        assignmentNumber
        );


        /*
         * ====================================================
         * 15. +=
         * ====================================================
         *
         * x += 5
         *
         * is equivalent to:
         *
         * x = x + 5
         */

        int addAssignment = 10;

        addAssignment += 5;

        System.out.println(
                "\n+= result: " +
                        addAssignment
        );


        /*
         * ====================================================
         * 16. -=
         * ====================================================
         */

        int subtractAssignment = 10;

        subtractAssignment -= 3;

        System.out.println(
                "-= result: " +
                        subtractAssignment
        );


        /*
         * ====================================================
         * 17. *=
         * ====================================================
         */

        int multiplyAssignment = 10;

        multiplyAssignment *= 3;

        System.out.println(
                "*= result: " +
                        multiplyAssignment
        );


        /*
         * ====================================================
         * 18. /=
         * ====================================================
         */

        int divideAssignment = 20;

        divideAssignment /= 4;

        System.out.println(
                "/= result: " +
                        divideAssignment
        );


        /*
         * ====================================================
         * 19. %=
         * ====================================================
         */

        int modulusAssignment = 20;

        modulusAssignment %= 6;

        System.out.println(
                "%= result: " +
                        modulusAssignment
        );


        /*
         * ====================================================
         * 20. RELATIONAL OPERATORS
         * ====================================================
         *
         * Relational operators compare values.
         *
         * They always produce true or false.
         *
         * >   Greater than
         * <   Less than
         * >=  Greater than or equal
         * <=  Less than or equal
         * ==  Equal
         * !=  Not equal
         */

        int first = 20;
        int second = 10;

        System.out.println(
                "\nRELATIONAL OPERATORS"
        );

        System.out.println(
                "first > second: " +
                        (first > second)
        );

        System.out.println(
                "first < second: " +
                        (first < second)
        );

        System.out.println(
                "first >= second: " +
                        (first >= second)
        );

        System.out.println(
                "first <= second: " +
                        (first <= second)
        );

        System.out.println(
                "first == second: " +
                        (first == second)
        );

        System.out.println(
                "first != second: " +
                        (first != second)
        );


        /*
         * ====================================================
         * 21. LOGICAL AND &&
         * ====================================================
         *
         * && returns true only when BOTH conditions are true.
         *
         * Example:
         *
         * age >= 18 && age <= 65
         */

        int age = 25;

        boolean validAge =
                age >= 18 &&
                        age <= 65;

        System.out.println(
                "\nLogical AND: " +
                        validAge
        );


        /*
         * ====================================================
         * 22. LOGICAL OR ||
         * ====================================================
         *
         * || returns true when AT LEAST ONE condition is true.
         */

        int day = 6;

        boolean weekend =
                day == 6 ||
                        day == 7;

        System.out.println(
                "Logical OR: " +
                        weekend
        );


        /*
         * ====================================================
         * 23. LOGICAL NOT !
         * ====================================================
         */

        boolean loggedIn = false;

        System.out.println(
                "Logical NOT: " +
                        !loggedIn
        );


        /*
         * ====================================================
         * 24. COMBINING LOGICAL OPERATORS
         * ====================================================
         */

        int score = 85;

        boolean passed =
                score >= 50 &&
                        score <= 100;

        System.out.println(
                "\nPassed: " +
                        passed
        );


        /*
         * ====================================================
         * 25. BITWISE AND &
         * ====================================================
         *
         * Bitwise operators work directly with binary bits.
         *
         * Example:
         *
         * 5 = 0101
         * 3 = 0011
         *
         * 5 & 3
         *
         *     0101
         *     0011
         *     ----
         *     0001
         *
         * Result = 1
         */

        int bitA = 5;
        int bitB = 3;

        System.out.println(
                "\nBITWISE OPERATORS"
        );

        System.out.println(
                "5 & 3 = " +
                        (bitA & bitB)
        );


        /*
         * ====================================================
         * 26. BITWISE OR |
         * ====================================================
         *
         * 5 | 3
         *
         *     0101
         *     0011
         *     ----
         *     0111
         *
         * Result = 7
         */

        System.out.println(
                "5 | 3 = " +
                        (bitA | bitB)
        );


        /*
         * ====================================================
         * 27. BITWISE XOR ^
         * ====================================================
         *
         * XOR returns 1 when the bits are different.
         *
         * 5 ^ 3
         *
         *     0101
         *     0011
         *     ----
         *     0110
         *
         * Result = 6
         */

        System.out.println(
                "5 ^ 3 = " +
                        (bitA ^ bitB)
        );


        /*
         * ====================================================
         * 28. BITWISE NOT ~
         * ====================================================
         *
         * ~ reverses every bit.
         */

        int bitNumber = 5;

        System.out.println(
                "~5 = " +
                        (~bitNumber)
        );


        /*
         * ====================================================
         * 29. LEFT SHIFT <<
         * ====================================================
         *
         * Shifts binary bits to the left.
         *
         * 5 << 1
         *
         * is generally equivalent to:
         *
         * 5 * 2
         */

        int leftShift = 5;

        System.out.println(
                "\n5 << 1 = " +
                        (leftShift << 1)
        );


        /*
         * ====================================================
         * 30. RIGHT SHIFT >>
         * ====================================================
         *
         * Shifts bits to the right.
         *
         * For positive integers:
         *
         * 20 >> 1
         *
         * is generally equivalent to:
         *
         * 20 / 2
         */

        int rightShift = 20;

        System.out.println(
                "20 >> 1 = " +
                        (rightShift >> 1)
        );


        /*
         * ====================================================
         * 31. UNSIGNED RIGHT SHIFT >>>
         * ====================================================
         *
         * >>> shifts bits to the right and fills the left
         * side with zeros.
         *
         * It is especially different from >> for negative
         * numbers.
         */

        int negativeNumber = -20;

        System.out.println(
                "-20 >>> 1 = " +
                        (negativeNumber >>> 1)
        );


        /*
         * ====================================================
         * 32. COMPOUND ASSIGNMENT WITH BITWISE OPERATORS
         * ====================================================
         */

        int bitAssignment = 5;

        bitAssignment &= 3;

        System.out.println(
                "\n&= result: " +
                        bitAssignment
        );


        /*
         * ====================================================
         * 33. BITWISE OR ASSIGNMENT
         * ====================================================
         */

        int orAssignment = 5;

        orAssignment |= 3;

        System.out.println(
                "|= result: " +
                        orAssignment
        );


        /*
         * ====================================================
         * 34. XOR ASSIGNMENT
         * ====================================================
         */

        int xorAssignment = 5;

        xorAssignment ^= 3;

        System.out.println(
                "^= result: " +
                        xorAssignment
        );


        /*
         * ====================================================
         * 35. LEFT SHIFT ASSIGNMENT
         * ====================================================
         */

        int leftAssignment = 5;

        leftAssignment <<= 1;

        System.out.println(
                "<<= result: " +
                        leftAssignment
        );


        /*
         * ====================================================
         * 36. RIGHT SHIFT ASSIGNMENT
         * ====================================================
         */

        int rightAssignment = 20;

        rightAssignment >>= 1;

        System.out.println(
                ">>= result: " +
                        rightAssignment
        );


        /*
         * ====================================================
         * 37. TERNARY OPERATOR
         * ====================================================
         *
         * The ternary operator is a short form of if-else.
         *
         * Syntax:
         *
         * condition ? valueIfTrue : valueIfFalse
         */

        int marks = 75;

        String result =
                marks >= 50
                        ? "Pass"
                        : "Fail";

        System.out.println(
                "\nTernary result: " +
                        result
        );


        /*
         * ====================================================
         * 38. TERNARY WITH NUMBERS
         * ====================================================
         */

        int numberOne = 50;
        int numberTwo = 80;

        int largest =
                numberOne > numberTwo
                        ? numberOne
                        : numberTwo;

        System.out.println(
                "Largest: " +
                        largest
        );


        /*
         * ====================================================
         * 39. NESTED TERNARY
         * ====================================================
         *
         * Ternary operators can be nested, but too many
         * nested ternaries can make code difficult to read.
         */

        int studentMarks = 85;

        String grade =
                studentMarks >= 90
                        ? "A"
                        : studentMarks >= 80
                        ? "B"
                        : studentMarks >= 70
                        ? "C"
                        : "D";

        System.out.println(
                "Grade: " +
                        grade
        );


        /*
         * ====================================================
         * 40. instanceof
         * ====================================================
         *
         * instanceof checks whether an object is an instance
         * of a particular class/type.
         */

        String name = "Java";

        boolean isString =
                name instanceof String;

        System.out.println(
                "\nIs String: " +
                        isString
        );


        /*
         * ====================================================
         * 41. STRING CONCATENATION
         * ====================================================
         *
         * The + operator can also join Strings.
         */

        String firstName = "Kush";
        String lastName = "Chaudhari";

        String fullName =
                firstName +
                        " " +
                        lastName;

        System.out.println(
                "\nFull name: " +
                        fullName
        );


        /*
         * ====================================================
         * 42. IMPORTANT STRING + INTEGER EXAMPLE
         * ====================================================
         *
         * Java evaluates expressions from left to right.
         */

        System.out.println(
                "\nValue: " +
                        10 +
                        20
        );

        /*
         * Output:
         *
         * Value: 1020
         *
         * Because String concatenation starts after "Value: ".
         */


        /*
         * ====================================================
         * 43. INTEGER ADDITION BEFORE STRING
         * ====================================================
         */

        System.out.println(
                "Value: " +
                        (10 + 20)
        );

        /*
         * Output:
         *
         * Value: 30
         */


        /*
         * ====================================================
         * 44. OPERATOR PRECEDENCE
         * ====================================================
         *
         * Java follows a specific order when evaluating
         * expressions.
         *
         * Generally:
         *
         * 1. ()
         * 2. ++ -- ! ~
         * 3. * / %
         * 4. + -
         * 5. < > <= >=
         * 6. == !=
         * 7. &&
         * 8. ||
         * 9. ? :
         * 10. Assignment
         *
         * Parentheses should be used when you want to make
         * the order clear.
         */

        int precedenceResult =
                10 + 5 * 2;

        System.out.println(
                "\n10 + 5 * 2 = " +
                        precedenceResult
        );


        /*
         * ====================================================
         * 45. PARENTHESES
         * ====================================================
         *
         * Parentheses have higher priority.
         */

        int parenthesesResult =
                (10 + 5) * 2;

        System.out.println(
                "(10 + 5) * 2 = " +
                        parenthesesResult
        );


        /*
         * ====================================================
         * 46. WITHOUT PARENTHESES
         * ====================================================
         */

        int noParentheses =
                10 + 5 * 2;

        System.out.println(
                "10 + 5 * 2 = " +
                        noParentheses
        );


        /*
         * ====================================================
         * 47. SHORT-CIRCUIT AND &&
         * ====================================================
         *
         * With &&, if the first condition is false,
         * Java does not evaluate the second condition.
         */

        int shortNumber = 10;

        if (
                shortNumber < 5 &&
                        shortNumber / 0 > 1
        ) {

            System.out.println(
                    "This will not execute."
            );
        }


        /*
         * ====================================================
         * 48. SHORT-CIRCUIT OR ||
         * ====================================================
         *
         * With ||, if the first condition is true,
         * Java does not evaluate the second condition.
         */

        if (
                shortNumber > 5 ||
                        shortNumber / 0 > 1
        ) {

            System.out.println(
                    "\nShort-circuit OR executed."
            );
        }


        /*
         * ====================================================
         * 49. BOOLEAN SHORT-CIRCUIT EXAMPLE
         * ====================================================
         */

        int valueCheck = 10;

        if (
                valueCheck != 0 &&
                        100 / valueCheck > 5
        ) {

            System.out.println(
                    "Division was safe."
            );
        }


        /*
         * ====================================================
         * 50. INTEGER DIVISION
         * ====================================================
         *
         * When both operands are integers:
         *
         * 7 / 2 = 3
         *
         * The decimal part is removed.
         */

        int integerDivision =
                7 / 2;

        System.out.println(
                "\n7 / 2 = " +
                        integerDivision
        );


        /*
         * ====================================================
         * 51. DOUBLE DIVISION
         * ====================================================
         *
         * At least one operand can be a double to obtain
         * a decimal result.
         */

        double doubleDivision =
                7.0 / 2;

        System.out.println(
                "7.0 / 2 = " +
                        doubleDivision
        );


        /*
         * ====================================================
         * 52. TYPE CASTING IN EXPRESSIONS
         * ====================================================
         *
         * Casting can control the type used during calculation.
         */

        int valueA = 7;
        int valueB = 2;

        double castResult =
                (double) valueA / valueB;

        System.out.println(
                "\nCast result: " +
                        castResult
        );


        /*
         * ====================================================
         * 53. EXPRESSION
         * ====================================================
         *
         * An expression is a combination of values,
         * variables, operators, and method calls that
         * produces a value.
         *
         * Example:
         *
         * a + b
         *
         * is an expression.
         */

        int expressionResult =
                a + b * 2;

        System.out.println(
                "\nExpression result: " +
                        expressionResult
        );


        /*
         * ====================================================
         * 54. COMPOUND EXPRESSION
         * ====================================================
         *
         * Multiple operators can appear in one expression.
         */

        int compoundExpression =
                (10 + 20) *
                        2 -
                        5;

        System.out.println(
                "Compound expression: " +
                        compoundExpression
        );


        /*
         * ====================================================
         * 55. RELATIONAL + LOGICAL EXPRESSION
         * ====================================================
         */

        int studentScore = 85;

        boolean validScore =
                studentScore >= 50 &&
                        studentScore <= 100;

        System.out.println(
                "\nValid score: " +
                        validScore
        );


        /*
         * ====================================================
         * 56. FIND LARGEST OF THREE NUMBERS
         * ====================================================
         *
         * Operators can be combined to solve problems.
         */

        int n1 = 10;
        int n2 = 30;
        int n3 = 20;

        int largestNumber =
                Math.max(
                        n1,
                        Math.max(n2, n3)
                );

        System.out.println(
                "\nLargest of three: " +
                        largestNumber
        );


        /*
         * ====================================================
         * 57. ABSOLUTE VALUE
         * ====================================================
         */

        int negativeValue = -50;

        System.out.println(
                "Absolute value: " +
                        Math.abs(negativeValue)
        );


        /*
         * ====================================================
         * 58. POWER
         * ====================================================
         *
         * Math.pow(base, exponent)
         */

        double power =
                Math.pow(2, 3);

        System.out.println(
                "2^3 = " +
                        power
        );


        /*
         * ====================================================
         * 59. SQUARE ROOT
         * ====================================================
         */

        double squareRoot =
                Math.sqrt(25);

        System.out.println(
                "Square root of 25: " +
                        squareRoot
        );


        /*
         * ====================================================
         * 60. MAXIMUM AND MINIMUM
         * ====================================================
         */

        int max =
                Math.max(100, 200);

        int min =
                Math.min(100, 200);

        System.out.println(
                "\nMaximum: " +
                        max
        );

        System.out.println(
                "Minimum: " +
                        min
        );


        /*
         * ====================================================
         * 61. INCREMENT IN A LOOP
         * ====================================================
         *
         * i++ is commonly used in loops.
         */

        System.out.println(
                "\nLoop:"
        );

        for (int i = 0;
             i < 5;
             i++) {

            System.out.println(i);
        }


        /*
         * ====================================================
         * 62. DECREMENT IN A LOOP
         * ====================================================
         */

        System.out.println(
                "\nReverse loop:"
        );

        for (int i = 5;
             i > 0;
             i--) {

            System.out.println(i);
        }


        /*
         * ====================================================
         * 63. PRE-INCREMENT VS POST-INCREMENT
         * ====================================================
         */

        int pre = 5;

        System.out.println(
                "\n++pre = " +
                        (++pre)
        );

        int post = 5;

        System.out.println(
                "post++ = " +
                        (post++)
        );

        System.out.println(
                "post after = " +
                        post
        );


        /*
         * ====================================================
         * 64. COMPLEX PRE/POST EXPRESSION
         * ====================================================
         *
         * Be careful with expressions such as:
         *
         * int result = x++ + ++x;
         *
         * Although Java defines the evaluation order,
         * such expressions are difficult to read.
         *
         * Prefer simple expressions.
         */

        int complexNumber = 5;

        int complexResult =
                complexNumber++ +
                        ++complexNumber;

        System.out.println(
                "\nComplex result: " +
                        complexResult
        );

        System.out.println(
                "Complex number: " +
                        complexNumber
        );


        /*
         * ====================================================
         * 65. COMPARING CHARACTERS
         * ====================================================
         *
         * Characters can be compared using relational
         * operators because char values have numeric Unicode
         * values.
         */

        char charA = 'A';
        char charB = 'B';

        System.out.println(
                "\n'A' < 'B': " +
                        (charA < charB)
        );


        /*
         * ====================================================
         * 66. COMPARING STRINGS
         * ====================================================
         *
         * IMPORTANT:
         *
         * Do NOT normally use == to compare String contents.
         *
         * Use equals().
         */

        String stringA = "Hello";
        String stringB = "Hello";

        System.out.println(
                "\nString equals: " +
                        stringA.equals(stringB)
        );


        /*
         * ====================================================
         * 67. STRING compareTo()
         * ====================================================
         *
         * compareTo() compares Strings lexicographically.
         */

        System.out.println(
                "String compareTo: " +
                        stringA.compareTo(stringB)
        );


        /*
         * ====================================================
         * 68. CONDITIONAL EXPRESSION
         * ====================================================
         */

        int temperature = 30;

        if (temperature > 25) {

            System.out.println(
                    "\nIt is warm."
            );
        }


        /*
         * ====================================================
         * 69. MULTIPLE CONDITIONS
         * ====================================================
         */

        int examMarks = 82;

        if (
                examMarks >= 80 &&
                        examMarks <= 100
        ) {

            System.out.println(
                    "Excellent score."
            );

        } else if (
                examMarks >= 50
        ) {

            System.out.println(
                    "Passed."
            );

        } else {

            System.out.println(
                    "Failed."
            );
        }


        /*
         * ====================================================
         * 70. OPERATOR PRECEDENCE EXAMPLE
         * ====================================================
         */

        int precedenceExample =
                5 + 3 * 2 - 4 / 2;

        System.out.println(
                "\nPrecedence example: " +
                        precedenceExample
        );


        /*
         * ====================================================
         * 71. PARENTHESES FOR CLARITY
         * ====================================================
         */

        int clearExpression =
                ((5 + 3) * 2) -
                        (4 / 2);

        System.out.println(
                "Clear expression: " +
                        clearExpression
        );


        /*
         * ====================================================
         * 72. MODULUS WITH NEGATIVE NUMBERS
         * ====================================================
         */

        System.out.println(
                "\n-10 % 3 = " +
                        (-10 % 3)
        );


        /*
         * ====================================================
         * 73. DIVISION BY ZERO
         * ====================================================
         *
         * Integer division by zero causes:
         *
         * ArithmeticException
         *
         * Do not execute this directly:
         *
         * int result = 10 / 0;
         */

        System.out.println(
                "\nInteger division by zero causes " +
                        "ArithmeticException."
        );


        /*
         * ====================================================
         * 74. DOUBLE DIVISION BY ZERO
         * ====================================================
         *
         * Floating-point division behaves differently.
         */

        double doubleZero =
                10.0 / 0.0;

        System.out.println(
                "10.0 / 0.0 = " +
                        doubleZero
        );


        /*
         * ====================================================
         * 75. NaN
         * ====================================================
         *
         * NaN means "Not a Number".
         */

        double nanValue =
                0.0 / 0.0;

        System.out.println(
                "0.0 / 0.0 = " +
                        nanValue
        );


        /*
         * ====================================================
         * 76. POSITIVE INFINITY
         * ====================================================
         */

        double infinity =
                10.0 / 0.0;

        System.out.println(
                "Positive infinity: " +
                        infinity
        );


        /*
         * ====================================================
         * 77. NEGATIVE INFINITY
         * ====================================================
         */

        double negativeInfinity =
                -10.0 / 0.0;

        System.out.println(
                "Negative infinity: " +
                        negativeInfinity
        );


        /*
         * ====================================================
         * 78. CHECK NaN
         * ====================================================
         */

        System.out.println(
                "Is NaN: " +
                        Double.isNaN(nanValue)
        );


        /*
         * ====================================================
         * 79. CHECK INFINITY
         * ====================================================
         */

        System.out.println(
                "Is infinite: " +
                        Double.isInfinite(infinity)
        );


        /*
         * ====================================================
         * 80. BIT FLAGS EXAMPLE
         * ====================================================
         *
         * Bitwise operators can be used to store multiple
         * true/false flags inside one integer.
         */

        int READ = 1;       // 0001
        int WRITE = 2;      // 0010
        int EXECUTE = 4;    // 0100

        int permissions =
                READ |
                        WRITE;

        System.out.println(
                "\nPermissions: " +
                        permissions
        );

        boolean canRead =
                (permissions & READ) != 0;

        boolean canWrite =
                (permissions & WRITE) != 0;

        boolean canExecute =
                (permissions & EXECUTE) != 0;

        System.out.println(
                "Can read: " +
                        canRead
        );

        System.out.println(
                "Can write: " +
                        canWrite
        );

        System.out.println(
                "Can execute: " +
                        canExecute
        );


        /*
         * ====================================================
         * 81. SWAPPING USING XOR
         * ====================================================
         *
         * XOR can technically be used to swap integers.
         *
         * However, a temporary variable is usually easier
         * to understand and is generally preferred.
         */

        int swapA = 10;
        int swapB = 20;

        swapA ^= swapB;
        swapB ^= swapA;
        swapA ^= swapB;

        System.out.println(
                "\nAfter XOR swap:"
        );

        System.out.println(
                "swapA = " +
                        swapA
        );

        System.out.println(
                "swapB = " +
                        swapB
        );


        /*
         * ====================================================
         * 82. COMPOUND ASSIGNMENT
         * ====================================================
         *
         * These:
         *
         * x += y
         * x -= y
         * x *= y
         * x /= y
         * x %= y
         *
         * are shorter forms of assignment expressions.
         */

        int compound = 10;

        compound += 5;
        compound -= 2;
        compound *= 3;
        compound /= 2;
        compound %= 4;

        System.out.println(
                "\nCompound assignment result: " +
                        compound
        );


        /*
         * ====================================================
         * 83. EXPRESSION WITH MULTIPLE TYPES
         * ====================================================
         *
         * Java may automatically promote smaller numeric
         * types during arithmetic.
         */

        byte byteValue = 10;
        byte anotherByte = 20;

        int byteResult =
                byteValue +
                        anotherByte;

        System.out.println(
                "\nByte arithmetic result: " +
                        byteResult
        );


        /*
         * ====================================================
         * 84. AUTOMATIC TYPE PROMOTION
         * ====================================================
         *
         * byte and short values are generally promoted to int
         * during arithmetic.
         */

        short shortValue = 10;
        short shortValue2 = 20;

        int shortResult =
                shortValue +
                        shortValue2;

        System.out.println(
                "Short arithmetic result: " +
                        shortResult
        );


        /*
         * ====================================================
         * 85. CASTING RESULT BACK TO BYTE
         * ====================================================
         *
         * Because arithmetic produces int, an explicit cast
         * is needed to store the result in byte.
         */

        byte byteResult2 =
                (byte) (
                        byteValue +
                                anotherByte
                );

        System.out.println(
                "Byte after casting: " +
                        byteResult2
        );


        /*
         * ====================================================
         * 86. OPERATOR ASSOCIATIVITY
         * ====================================================
         *
         * Operators with the same precedence are evaluated
         * according to their associativity.
         *
         * Most arithmetic operators are left-associative.
         *
         * Example:
         *
         * 20 / 5 * 2
         *
         * becomes:
         *
         * (20 / 5) * 2
         */

        int associativity =
                20 / 5 * 2;

        System.out.println(
                "\nAssociativity result: " +
                        associativity
        );


        /*
         * ====================================================
         * 87. ASSIGNMENT IS RIGHT-ASSOCIATIVE
         * ====================================================
         *
         * Example:
         *
         * a = b = c = 10;
         */

        int value1;
        int value2;
        int value3;

        value1 =
                value2 =
                        value3 = 10;

        System.out.println(
                "\nAssignment chaining:"
        );

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);


        /*
         * ====================================================
         * 88. CONDITIONAL TERNARY EXPRESSION
         * ====================================================
         */

        int testNumber = 25;

        String evenOdd =
                testNumber % 2 == 0
                        ? "Even"
                        : "Odd";

        System.out.println(
                "\nEven/Odd using ternary: " +
                        evenOdd
        );


        /*
         * ====================================================
         * 89. ABSOLUTE DIFFERENCE
         * ====================================================
         */

        int differenceA = 50;
        int differenceB = 80;

        int absoluteDifference =
                Math.abs(
                        differenceA -
                                differenceB
                );

        System.out.println(
                "\nAbsolute difference: " +
                        absoluteDifference
        );


        /*
         * ====================================================
         * 90. FINAL SUMMARY
         * ====================================================
         */

        System.out.println(
                "\n=========================================="
        );

        System.out.println(
                "OPERATORS & EXPRESSIONS DEMONSTRATION"
        );

        System.out.println(
                "COMPLETED"
        );

        System.out.println(
                "=========================================="
        );
    }
}