/*
 * ============================================================
 *              JAVA CONDITIONALS COMPLETE GUIDE
 * ============================================================
 *
 * This program demonstrates Java conditional statements
 * and expressions from beginner to advanced level.
 *
 * ============================================================
 * TOPICS COVERED
 * ============================================================
 *
 * 1. What is a condition?
 * 2. if statement
 * 3. if with comparison operators
 * 4. if with boolean variables
 * 5. if with logical operators
 * 6. if-else statement
 * 7. Multiple if statements
 * 8. if-else-if ladder
 * 9. Nested if
 * 10. Nested if-else
 * 11. Multiple conditions
 * 12. AND operator &&
 * 13. OR operator ||
 * 14. NOT operator !
 * 15. Comparison operators
 * 16. String conditions
 * 17. equals()
 * 18. equalsIgnoreCase()
 * 19. switch statement
 * 20. switch with int
 * 21. switch with String
 * 22. switch with char
 * 23. switch with enum
 * 24. Multiple case labels
 * 25. default case
 * 26. break
 * 27. Fall-through
 * 28. Traditional switch
 * 29. Switch expression
 * 30. Arrow syntax ->
 * 31. yield
 * 32. Switch expression with String
 * 33. Switch expression with numbers
 * 34. Nested switch
 * 35. Ternary operator
 * 36. Conditional assignment
 * 37. Combining conditions
 * 38. Input validation
 * 39. Common mistakes
 *
 * ============================================================
 */

public class ConditionalStatementsInJava {

    public static void main(String[] args) {

        /*
         * ====================================================
         * 1. WHAT IS A CONDITION?
         * ====================================================
         *
         * A condition is an expression that produces:
         *
         * true
         *
         * or
         *
         * false
         *
         * Example:
         *
         * age >= 18
         *
         * If age is 20:
         *
         * 20 >= 18
         *
         * becomes true.
         */

        int age = 20;

        System.out.println("CONDITION");

        System.out.println(
                "age >= 18: " +
                        (age >= 18)
        );


        /*
         * ====================================================
         * 2. BASIC if STATEMENT
         * ====================================================
         *
         * The if statement executes code only when the
         * condition is true.
         *
         * Syntax:
         *
         * if (condition) {
         *     code;
         * }
         */

        if (age >= 18) {

            System.out.println(
                    "\nYou are an adult."
            );
        }


        /*
         * ====================================================
         * 3. if WITH GREATER THAN
         * ====================================================
         */

        int number = 100;

        if (number > 50) {

            System.out.println(
                    "Number is greater than 50."
            );
        }


        /*
         * ====================================================
         * 4. if WITH LESS THAN
         * ====================================================
         */

        if (number < 200) {

            System.out.println(
                    "Number is less than 200."
            );
        }


        /*
         * ====================================================
         * 5. if WITH EQUALITY
         * ====================================================
         *
         * == checks whether two values are equal.
         *
         * IMPORTANT:
         *
         * =  means assignment
         * == means comparison
         */

        int x = 10;

        if (x == 10) {

            System.out.println(
                    "x is equal to 10."
            );
        }


        /*
         * ====================================================
         * 6. if WITH NOT EQUAL
         * ====================================================
         */

        if (x != 20) {

            System.out.println(
                    "x is not equal to 20."
            );
        }


        /*
         * ====================================================
         * 7. if WITH >=
         * ====================================================
         */

        int marks = 80;

        if (marks >= 50) {

            System.out.println(
                    "Student passed."
            );
        }


        /*
         * ====================================================
         * 8. if WITH <=
         * ====================================================
         */

        int temperature = 25;

        if (temperature <= 30) {

            System.out.println(
                    "Temperature is 30 or below."
            );
        }


        /*
         * ====================================================
         * 9. if WITH BOOLEAN
         * ====================================================
         *
         * A boolean variable already contains true or false.
         */

        boolean isStudent = true;

        if (isStudent) {

            System.out.println(
                    "The person is a student."
            );
        }


        /*
         * ====================================================
         * 10. if WITH false
         * ====================================================
         */

        boolean isFinished = false;

        if (!isFinished) {

            System.out.println(
                    "The task is not finished."
            );
        }


        /*
         * ====================================================
         * 11. if-else
         * ====================================================
         *
         * if executes when the condition is true.
         *
         * else executes when the condition is false.
         *
         * Syntax:
         *
         * if (condition) {
         *
         * } else {
         *
         * }
         */

        int studentAge = 16;

        if (studentAge >= 18) {

            System.out.println(
                    "\nStudent is an adult."
            );

        } else {

            System.out.println(
                    "Student is a minor."
            );
        }


        /*
         * ====================================================
         * 12. EVEN OR ODD
         * ====================================================
         *
         * Modulus % gives the remainder.
         *
         * Even:
         *
         * number % 2 == 0
         *
         * Odd:
         *
         * number % 2 != 0
         */

        int evenOddNumber = 17;

        if (evenOddNumber % 2 == 0) {

            System.out.println(
                    "\nNumber is even."
            );

        } else {

            System.out.println(
                    "Number is odd."
            );
        }


        /*
         * ====================================================
         * 13. POSITIVE OR NEGATIVE
         * ====================================================
         */

        int signedNumber = -10;

        if (signedNumber > 0) {

            System.out.println(
                    "\nNumber is positive."
            );

        } else if (signedNumber < 0) {

            System.out.println(
                    "Number is negative."
            );

        } else {

            System.out.println(
                    "Number is zero."
            );
        }


        /*
         * ====================================================
         * 14. MULTIPLE if STATEMENTS
         * ====================================================
         *
         * Multiple independent if statements can all execute
         * if their conditions are true.
         */

        int multipleNumber = 20;

        if (multipleNumber > 10) {

            System.out.println(
                    "\nNumber is greater than 10."
            );
        }

        if (multipleNumber > 15) {

            System.out.println(
                    "Number is greater than 15."
            );
        }

        if (multipleNumber > 19) {

            System.out.println(
                    "Number is greater than 19."
            );
        }


        /*
         * ====================================================
         * 15. if-else-if LADDER
         * ====================================================
         *
         * Used when there are multiple possible conditions.
         *
         * Java checks from top to bottom.
         *
         * Once a condition is true, the remaining conditions
         * are skipped.
         */

        int score = 85;

        if (score >= 90) {

            System.out.println(
                    "\nGrade: A"
            );

        } else if (score >= 80) {

            System.out.println(
                    "Grade: B"
            );

        } else if (score >= 70) {

            System.out.println(
                    "Grade: C"
            );

        } else if (score >= 60) {

            System.out.println(
                    "Grade: D"
            );

        } else {

            System.out.println(
                    "Grade: F"
            );
        }


        /*
         * ====================================================
         * 16. RANGE CHECK
         * ====================================================
         *
         * && means AND.
         *
         * Both conditions must be true.
         */

        int rangeNumber = 50;

        if (
                rangeNumber >= 1 &&
                        rangeNumber <= 100
        ) {

            System.out.println(
                    "\nNumber is between 1 and 100."
            );
        }


        /*
         * ====================================================
         * 17. AND OPERATOR &&
         * ====================================================
         *
         * true && true   = true
         * true && false  = false
         * false && true  = false
         * false && false = false
         */

        int userAge = 25;

        if (
                userAge >= 18 &&
                        userAge <= 65
        ) {

            System.out.println(
                    "Age is between 18 and 65."
            );
        }


        /*
         * ====================================================
         * 18. OR OPERATOR ||
         * ====================================================
         *
         * At least one condition must be true.
         *
         * true || true   = true
         * true || false  = true
         * false || true  = true
         * false || false = false
         */

        int day = 6;

        if (
                day == 6 ||
                        day == 7
        ) {

            System.out.println(
                    "\nIt is the weekend."
            );
        }


        /*
         * ====================================================
         * 19. NOT OPERATOR !
         * ====================================================
         *
         * !true  = false
         * !false = true
         */

        boolean loggedIn = false;

        if (!loggedIn) {

            System.out.println(
                    "User is not logged in."
            );
        }


        /*
         * ====================================================
         * 20. COMBINING &&, || AND !
         * ====================================================
         */

        boolean hasID = true;
        boolean hasTicket = true;

        if (
                hasID &&
                        hasTicket
        ) {

            System.out.println(
                    "\nUser can enter."
            );
        }


        /*
         * ====================================================
         * 21. NESTED if
         * ====================================================
         *
         * An if statement inside another if statement
         * is called a nested if.
         */

        int nestedAge = 25;
        boolean hasLicense = true;

        if (nestedAge >= 18) {

            System.out.println(
                    "\nPerson is old enough."
            );

            if (hasLicense) {

                System.out.println(
                        "Person can drive."
                );
            }
        }


        /*
         * ====================================================
         * 22. NESTED if-else
         * ====================================================
         */

        int nestedMarks = 85;

        if (nestedMarks >= 50) {

            System.out.println(
                    "\nStudent passed."
            );

            if (nestedMarks >= 80) {

                System.out.println(
                        "Student got a high score."
                );

            } else {

                System.out.println(
                        "Student passed but score is below 80."
                );
            }

        } else {

            System.out.println(
                    "Student failed."
            );
        }


        /*
         * ====================================================
         * 23. NESTED CONDITIONS WITH MULTIPLE LEVELS
         * ====================================================
         */

        int drivingAge = 22;
        boolean license = true;
        boolean insurance = true;

        if (drivingAge >= 18) {

            if (license) {

                if (insurance) {

                    System.out.println(
                            "\nDriver meets all requirements."
                    );
                }
            }
        }


        /*
         * ====================================================
         * 24. BETTER VERSION OF NESTED CONDITIONS
         * ====================================================
         *
         * Sometimes multiple nested if statements can be
         * simplified using &&.
         */

        if (
                drivingAge >= 18 &&
                        license &&
                        insurance
        ) {

            System.out.println(
                    "Driver is allowed to drive."
            );
        }


        /*
         * ====================================================
         * 25. STRING CONDITION
         * ====================================================
         *
         * For String content comparison, use equals().
         *
         * Do NOT normally use == to compare String contents.
         */

        String username = "admin";

        if (username.equals("admin")) {

            System.out.println(
                    "\nUsername is admin."
            );
        }


        /*
         * ====================================================
         * 26. equalsIgnoreCase()
         * ====================================================
         *
         * equalsIgnoreCase() ignores uppercase/lowercase
         * differences.
         */

        String answer = "YES";

        if (answer.equalsIgnoreCase("yes")) {

            System.out.println(
                    "Answer is yes."
            );
        }


        /*
         * ====================================================
         * 27. STRING STARTS WITH
         * ====================================================
         */

        String email = "student@gmail.com";

        if (email.startsWith("student")) {

            System.out.println(
                    "\nEmail starts with student."
            );
        }


        /*
         * ====================================================
         * 28. STRING CONTAINS
         * ====================================================
         */

        if (email.contains("@")) {

            System.out.println(
                    "Email contains @."
            );
        }


        /*
         * ====================================================
         * 29. SWITCH STATEMENT
         * ====================================================
         *
         * switch is useful when one value is compared against
         * multiple fixed choices.
         *
         * Syntax:
         *
         * switch (value) {
         *
         *     case value1:
         *         code;
         *         break;
         *
         *     case value2:
         *         code;
         *         break;
         *
         *     default:
         *         code;
         * }
         */

        int menuChoice = 2;

        System.out.println(
                "\nSWITCH STATEMENT"
        );

        switch (menuChoice) {

            case 1:
                System.out.println(
                        "You selected Add."
                );
                break;

            case 2:
                System.out.println(
                        "You selected Edit."
                );
                break;

            case 3:
                System.out.println(
                        "You selected Delete."
                );
                break;

            default:
                System.out.println(
                        "Invalid choice."
                );
        }


        /*
         * ====================================================
         * 30. SWITCH WITH int
         * ====================================================
         */

        int numberChoice = 3;

        switch (numberChoice) {

            case 1:
                System.out.println(
                        "\nOne"
                );
                break;

            case 2:
                System.out.println(
                        "Two"
                );
                break;

            case 3:
                System.out.println(
                        "Three"
                );
                break;

            default:
                System.out.println(
                        "Other number"
                );
        }


        /*
         * ====================================================
         * 31. SWITCH WITH String
         * ====================================================
         */

        String fruit = "apple";

        switch (fruit) {

            case "apple":
                System.out.println(
                        "\nApple selected."
                );
                break;

            case "banana":
                System.out.println(
                        "Banana selected."
                );
                break;

            case "orange":
                System.out.println(
                        "Orange selected."
                );
                break;

            default:
                System.out.println(
                        "Unknown fruit."
                );
        }


        /*
         * ====================================================
         * 32. SWITCH WITH char
         * ====================================================
         */

        char operation = '+';

        switch (operation) {

            case '+':
                System.out.println(
                        "\nAddition operation."
                );
                break;

            case '-':
                System.out.println(
                        "Subtraction operation."
                );
                break;

            case '*':
                System.out.println(
                        "Multiplication operation."
                );
                break;

            case '/':
                System.out.println(
                        "Division operation."
                );
                break;

            default:
                System.out.println(
                        "Unknown operation."
                );
        }


        /*
         * ====================================================
         * 33. MULTIPLE CASE LABELS
         * ====================================================
         *
         * Multiple cases can execute the same code.
         */

        int month = 12;

        switch (month) {

            case 12:
            case 1:
            case 2:
                System.out.println(
                        "\nWinter"
                );
                break;

            case 3:
            case 4:
            case 5:
                System.out.println(
                        "Spring"
                );
                break;

            case 6:
            case 7:
            case 8:
                System.out.println(
                        "Summer"
                );
                break;

            case 9:
            case 10:
            case 11:
                System.out.println(
                        "Fall"
                );
                break;

            default:
                System.out.println(
                        "Invalid month."
                );
        }


        /*
         * ====================================================
         * 34. DEFAULT CASE
         * ====================================================
         *
         * default executes when no case matches.
         */

        int unknownChoice = 100;

        switch (unknownChoice) {

            case 1:
                System.out.println(
                        "\nChoice 1"
                );
                break;

            case 2:
                System.out.println(
                        "Choice 2"
                );
                break;

            default:
                System.out.println(
                        "No matching choice."
                );
        }


        /*
         * ====================================================
         * 35. break IN SWITCH
         * ====================================================
         *
         * break stops the switch after a matching case.
         */

        int breakExample = 1;

        switch (breakExample) {

            case 1:
                System.out.println(
                        "\nCase 1"
                );
                break;

            case 2:
                System.out.println(
                        "Case 2"
                );
                break;

            default:
                System.out.println(
                        "Default"
                );
        }


        /*
         * ====================================================
         * 36. SWITCH FALL-THROUGH
         * ====================================================
         *
         * If break is missing, Java continues into the next
         * case.
         *
         * This is called fall-through.
         */

        int fallThrough = 1;

        switch (fallThrough) {

            case 1:
                System.out.println(
                        "\nCase 1"
                );

            case 2:
                System.out.println(
                        "Case 2"
                );
                break;

            default:
                System.out.println(
                        "Default"
                );
        }


        /*
         * ====================================================
         * 37. TRADITIONAL SWITCH
         * ====================================================
         *
         * Traditional switch uses:
         *
         * case:
         * break;
         */

        int traditionalNumber = 2;

        switch (traditionalNumber) {

            case 1:
                System.out.println(
                        "\nTraditional switch: One"
                );
                break;

            case 2:
                System.out.println(
                        "Traditional switch: Two"
                );
                break;

            default:
                System.out.println(
                        "Traditional switch: Other"
                );
        }


        /*
         * ====================================================
         * 38. SWITCH EXPRESSION
         * ====================================================
         *
         * Modern Java supports switch expressions.
         *
         * A switch expression produces a value.
         */

        int expressionNumber = 2;

        String expressionResult =
                switch (expressionNumber) {

                    case 1 -> "One";

                    case 2 -> "Two";

                    case 3 -> "Three";

                    default -> "Other";
                };

        System.out.println(
                "\nSwitch expression: " +
                        expressionResult
        );


        /*
         * ====================================================
         * 39. SWITCH EXPRESSION WITH String
         * ====================================================
         */

        String command = "start";

        String commandResult =
                switch (command) {

                    case "start" ->
                            "Program started.";

                    case "stop" ->
                            "Program stopped.";

                    case "pause" ->
                            "Program paused.";

                    default ->
                            "Unknown command.";
                };

        System.out.println(
                "\n" +
                        commandResult
        );


        /*
         * ====================================================
         * 40. SWITCH EXPRESSION WITH MULTIPLE CASES
         * ====================================================
         *
         * Multiple labels can be written together using commas.
         */

        int monthNumber = 7;

        String season =
                switch (monthNumber) {

                    case 12, 1, 2 ->
                            "Winter";

                    case 3, 4, 5 ->
                            "Spring";

                    case 6, 7, 8 ->
                            "Summer";

                    case 9, 10, 11 ->
                            "Fall";

                    default ->
                            "Invalid month";
                };

        System.out.println(
                "Season: " +
                        season
        );


        /*
         * ====================================================
         * 41. SWITCH EXPRESSION WITH yield
         * ====================================================
         *
         * yield returns a value from a block inside a switch
         * expression.
         */

        int yieldNumber = 2;

        String yieldResult =
                switch (yieldNumber) {

                    case 1 -> "One";

                    case 2 -> {

                        String text =
                                "Number ";

                        text += "Two";

                        yield text;
                    }

                    default -> "Other";
                };

        System.out.println(
                "\nYield result: " +
                        yieldResult
        );


        /*
         * ====================================================
         * 42. SWITCH WITH CALCULATION
         * ====================================================
         */

        char mathOperator = '*';

        int firstNumber = 10;
        int secondNumber = 5;

        int calculation =
                switch (mathOperator) {

                    case '+' ->
                            firstNumber + secondNumber;

                    case '-' ->
                            firstNumber - secondNumber;

                    case '*' ->
                            firstNumber * secondNumber;

                    case '/' ->
                            firstNumber / secondNumber;

                    default ->
                            0;
                };

        System.out.println(
                "\nCalculation result: " +
                        calculation
        );


        /*
         * ====================================================
         * 43. NESTED SWITCH
         * ====================================================
         *
         * A switch can exist inside another switch.
         */

        int mainMenu = 1;
        int subMenu = 2;

        switch (mainMenu) {

            case 1:

                System.out.println(
                        "\nMain menu 1"
                );

                switch (subMenu) {

                    case 1:
                        System.out.println(
                                "Submenu 1"
                        );
                        break;

                    case 2:
                        System.out.println(
                                "Submenu 2"
                        );
                        break;

                    default:
                        System.out.println(
                                "Unknown submenu"
                        );
                }

                break;

            default:

                System.out.println(
                        "Unknown main menu"
                );
        }


        /*
         * ====================================================
         * 44. ENUM WITH SWITCH
         * ====================================================
         */

        Day today = Day.MONDAY;

        switch (today) {

            case MONDAY:
                System.out.println(
                        "\nStart of the week."
                );
                break;

            case FRIDAY:
                System.out.println(
                        "Almost weekend."
                );
                break;

            case SATURDAY:
            case SUNDAY:
                System.out.println(
                        "Weekend."
                );
                break;

            default:
                System.out.println(
                        "Middle of the week."
                );
        }


        /*
         * ====================================================
         * 45. ENUM SWITCH EXPRESSION
         * ====================================================
         */

        Day currentDay = Day.SUNDAY;

        String dayType =
                switch (currentDay) {

                    case SATURDAY, SUNDAY ->
                            "Weekend";

                    default ->
                            "Weekday";
                };

        System.out.println(
                "Day type: " +
                        dayType
        );


        /*
         * ====================================================
         * 46. TERNARY OPERATOR
         * ====================================================
         *
         * The ternary operator is a conditional expression.
         *
         * Syntax:
         *
         * condition ? valueIfTrue : valueIfFalse
         */

        int ternaryAge = 20;

        String ageResult =
                ternaryAge >= 18
                        ? "Adult"
                        : "Minor";

        System.out.println(
                "\nTernary result: " +
                        ageResult
        );


        /*
         * ====================================================
         * 47. TERNARY WITH NUMBERS
         * ====================================================
         */

        int valueA = 100;
        int valueB = 200;

        int largerValue =
                valueA > valueB
                        ? valueA
                        : valueB;

        System.out.println(
                "Larger value: " +
                        largerValue
        );


        /*
         * ====================================================
         * 48. NESTED TERNARY
         * ====================================================
         *
         * Nested ternary operators are possible.
         *
         * However, too many nested ternaries reduce
         * readability.
         */

        int gradeMarks = 75;

        String letterGrade =
                gradeMarks >= 90
                        ? "A"
                        : gradeMarks >= 80
                        ? "B"
                        : gradeMarks >= 70
                        ? "C"
                        : gradeMarks >= 60
                        ? "D"
                        : "F";

        System.out.println(
                "\nLetter grade: " +
                        letterGrade
        );


        /*
         * ====================================================
         * 49. INPUT VALIDATION EXAMPLE
         * ====================================================
         */

        int inputAge = 25;

        if (inputAge < 0) {

            System.out.println(
                    "\nInvalid age."
            );

        } else if (inputAge > 120) {

            System.out.println(
                    "Age is outside the expected range."
            );

        } else {

            System.out.println(
                    "Age is valid."
            );
        }


        /*
         * ====================================================
         * 50. PASSWORD CHECK
         * ====================================================
         */

        String password = "java123";

        if (password.length() >= 8) {

            System.out.println(
                    "\nPassword length is valid."
            );

        } else {

            System.out.println(
                    "Password is too short."
            );
        }


        /*
         * ====================================================
         * 51. MULTIPLE PASSWORD CONDITIONS
         * ====================================================
         */

        String password2 = "Java12345";

        boolean longEnough =
                password2.length() >= 8;

        boolean containsNumber =
                password2.matches(
                        ".*[0-9].*"
                );

        if (
                longEnough &&
                        containsNumber
        ) {

            System.out.println(
                    "Password meets the basic requirements."
            );

        } else {

            System.out.println(
                    "Password does not meet the requirements."
            );
        }


        /*
         * ====================================================
         * 52. CHECK CHARACTER TYPE
         * ====================================================
         */

        char character = '7';

        if (Character.isDigit(character)) {

            System.out.println(
                    "\nCharacter is a digit."
            );

        } else if (Character.isLetter(character)) {

            System.out.println(
                    "Character is a letter."
            );

        } else {

            System.out.println(
                    "Character is a special character."
            );
        }


        /*
         * ====================================================
         * 53. LOGIN EXAMPLE
         * ====================================================
         */

        String loginUsername = "admin";
        String loginPassword = "1234";

        if (
                loginUsername.equals("admin") &&
                        loginPassword.equals("1234")
        ) {

            System.out.println(
                    "\nLogin successful."
            );

        } else {

            System.out.println(
                    "Invalid username or password."
            );
        }


        /*
         * ====================================================
         * 54. DISCOUNT EXAMPLE
         * ====================================================
         */

        double purchaseAmount = 250.00;

        double discount;

        if (purchaseAmount >= 200) {

            discount = 0.20;

        } else if (purchaseAmount >= 100) {

            discount = 0.10;

        } else {

            discount = 0.0;
        }

        double finalPrice =
                purchaseAmount -
                        (purchaseAmount * discount);

        System.out.println(
                "\nFinal price: " +
                        finalPrice
        );


        /*
         * ====================================================
         * 55. LEAP YEAR
         * ====================================================
         *
         * A year is a leap year when:
         *
         * 1. It is divisible by 400
         *
         * OR
         *
         * 2. It is divisible by 4
         *    AND
         *    it is NOT divisible by 100
         */

        int year = 2024;

        if (
                year % 400 == 0 ||
                        (
                                year % 4 == 0 &&
                                        year % 100 != 0
                        )
        ) {

            System.out.println(
                    "\n" +
                            year +
                            " is a leap year."
            );

        } else {

            System.out.println(
                    year +
                            " is not a leap year."
            );
        }


        /*
         * ====================================================
         * 56. MAXIMUM OF THREE NUMBERS
         * ====================================================
         */

        int number1 = 30;
        int number2 = 80;
        int number3 = 50;

        int largest;

        if (
                number1 >= number2 &&
                        number1 >= number3
        ) {

            largest = number1;

        } else if (
                number2 >= number1 &&
                        number2 >= number3
        ) {

            largest = number2;

        } else {

            largest = number3;
        }

        System.out.println(
                "\nLargest number: " +
                        largest
        );


        /*
         * ====================================================
         * 57. PASS / FAIL
         * ====================================================
         */

        int examScore = 72;

        if (examScore >= 50) {

            System.out.println(
                    "\nPASS"
            );

        } else {

            System.out.println(
                    "FAIL"
            );
        }


        /*
         * ====================================================
         * 58. AGE CATEGORY
         * ====================================================
         */

        int categoryAge = 25;

        if (categoryAge < 13) {

            System.out.println(
                    "\nChild"
            );

        } else if (categoryAge < 20) {

            System.out.println(
                    "Teenager"
            );

        } else if (categoryAge < 60) {

            System.out.println(
                    "Adult"
            );

        } else {

            System.out.println(
                    "Senior"
            );
        }


        /*
         * ====================================================
         * 59. SWITCH VS if-else
         * ====================================================
         *
         * Use if-else when:
         *
         * - Conditions involve ranges.
         * - Conditions involve complex expressions.
         * - Multiple different variables are involved.
         *
         * Use switch when:
         *
         * - One value is being compared with fixed choices.
         * - There are many exact choices.
         *
         * Example:
         *
         * score >= 90
         *
         * is better suited to if-else.
         *
         * menuChoice == 1, 2, 3
         *
         * is suitable for switch.
         */


        /*
         * ====================================================
         * 60. COMPLEX CONDITION
         * ====================================================
         */

        int finalAge = 30;
        boolean citizen = true;
        boolean document = true;

        if (
                finalAge >= 18 &&
                        citizen &&
                        document
        ) {

            System.out.println(
                    "\nAll requirements are satisfied."
            );

        } else {

            System.out.println(
                    "One or more requirements are missing."
            );
        }


        /*
         * ====================================================
         * 61. SHORT-CIRCUIT EVALUATION
         * ====================================================
         *
         * With &&:
         *
         * If the first condition is false, Java does not
         * evaluate the second condition.
         *
         * With ||:
         *
         * If the first condition is true, Java does not
         * evaluate the second condition.
         */

        int safeNumber = 0;

        if (
                safeNumber != 0 &&
                        100 / safeNumber > 5
        ) {

            System.out.println(
                    "This will not execute."
            );
        } else {

            System.out.println(
                    "\nShort-circuit prevented division by zero."
            );
        }


        /*
         * ====================================================
         * 62. COMMON MISTAKE: = INSTEAD OF ==
         * ====================================================
         *
         * WRONG:
         *
         * if (x = 10)
         *
         * This is assignment, not comparison.
         *
         * CORRECT:
         *
         * if (x == 10)
         */


        /*
         * ====================================================
         * 63. COMMON MISTAKE: STRING ==
         * ====================================================
         *
         * Avoid:
         *
         * if (name == "Kush")
         *
         * Use:
         *
         * if (name.equals("Kush"))
         */


        /*
         * ====================================================
         * 64. COMMON MISTAKE: MISSING BRACES
         * ====================================================
         *
         * Braces are recommended even when there is only
         * one statement.
         *
         * Good:
         *
         * if (age >= 18) {
         *     System.out.println("Adult");
         * }
         */


        /*
         * ====================================================
         * 65. COMMON MISTAKE: TOO MANY NESTED if STATEMENTS
         * ====================================================
         *
         * Deep nesting can make code difficult to understand.
         *
         * Sometimes this:
         *
         * if (a) {
         *     if (b) {
         *         if (c) {
         *
         *         }
         *     }
         * }
         *
         * can be simplified to:
         *
         * if (a && b && c) {
         *
         * }
         */


        /*
         * ====================================================
         * 66. COMMON MISTAKE: MISSING break
         * ====================================================
         *
         * In traditional switch statements, forgetting break
         * can cause fall-through into the next case.
         */


        /*
         * ====================================================
         * 67. FINAL CONDITIONAL EXAMPLE
         * ====================================================
         *
         * A complete example combining:
         *
         * if
         * else-if
         * else
         * &&
         * ||
         * !
         */

        int finalScore = 88;
        boolean attendanceGood = true;
        boolean assignmentComplete = true;

        if (
                finalScore >= 90 &&
                        attendanceGood &&
                        assignmentComplete
        ) {

            System.out.println(
                    "\nFinal result: A"
            );

        } else if (
                finalScore >= 80 &&
                        attendanceGood &&
                        assignmentComplete
        ) {

            System.out.println(
                    "Final result: B"
            );

        } else if (
                finalScore >= 50 ||
                        assignmentComplete
        ) {

            System.out.println(
                    "Final result: Pass"
            );

        } else {

            System.out.println(
                    "Final result: Fail"
            );
        }


        /*
         * ====================================================
         * 68. FINAL SUMMARY
         * ====================================================
         */

        System.out.println(
                "\n=========================================="
        );

        System.out.println(
                "JAVA CONDITIONALS DEMONSTRATION"
        );

        System.out.println(
                "if, if-else, nested if, switch"
        );

        System.out.println(
                "switch statements and expressions"
        );

        System.out.println(
                "COMPLETED"
        );

        System.out.println(
                "=========================================="
        );
    }


    /*
     * ========================================================
     * ENUM FOR SWITCH EXAMPLE
     * ========================================================
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
}