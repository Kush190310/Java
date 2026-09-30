import java.util.Arrays;
import java.util.Scanner;

/*
 * ============================================================
 *                 JAVA STRING COMPLETE GUIDE
 * ============================================================
 *
 * This program demonstrates Java String concepts from
 * beginner level to advanced level.
 *
 * Topics covered:
 *
 * 1. Creating Strings
 * 2. Printing Strings
 * 3. String length
 * 4. Accessing characters
 * 5. Looping through Strings
 * 6. String concatenation
 * 7. concat()
 * 8. equals()
 * 9. equalsIgnoreCase()
 * 10. == vs equals()
 * 11. substring()
 * 12. indexOf()
 * 13. lastIndexOf()
 * 14. contains()
 * 15. startsWith()
 * 16. endsWith()
 * 17. toUpperCase()
 * 18. toLowerCase()
 * 19. trim()
 * 20. strip()
 * 21. replace()
 * 22. replaceAll()
 * 23. split()
 * 24. toCharArray()
 * 25. String to integer
 * 26. Integer to String
 * 27. isEmpty()
 * 28. isBlank()
 * 29. compareTo()
 * 30. String.join()
 * 31. String.format()
 * 32. formatted()
 * 33. Character methods
 * 34. Counting characters
 * 35. Counting vowels
 * 36. Counting digits
 * 37. Counting uppercase letters
 * 38. Counting lowercase letters
 * 39. Reversing a String
 * 40. Palindrome
 * 41. Two-pointer technique
 * 42. Removing spaces
 * 43. Counting words
 * 44. Finding duplicate characters
 * 45. Removing duplicate characters
 * 46. Character frequency
 * 47. First non-repeating character
 * 48. Anagram
 * 49. StringBuilder
 * 50. Regular expressions
 * 51. String Pool
 * 52. intern()
 * 53. Unicode/code points
 * 54. User input
 *
 * ============================================================
 */

public class StringsInJava {

    public static void main(String[] args) {

        /*
         * ====================================================
         * 1. CREATING A STRING
         * ====================================================
         *
         * A String is a sequence of characters.
         *
         * String is a class in Java.
         *
         * The most common way to create a String is by using
         * double quotes.
         */

        String text = "Java Programming";

        System.out.println(text);


        /*
         * ====================================================
         * 2. STRING LENGTH
         * ====================================================
         *
         * length() returns the number of characters in
         * the String.
         *
         * Example:
         *
         * "Hello"
         *
         * H e l l o
         * 0 1 2 3 4
         *
         * Length = 5
         */

        System.out.println("Length: " + text.length());


        /*
         * ====================================================
         * 3. ACCESSING CHARACTERS
         * ====================================================
         *
         * charAt(index) returns the character at a specific
         * index.
         *
         * Index starts from 0.
         */

        System.out.println("First character: " + text.charAt(0));
        System.out.println("Second character: " + text.charAt(1));


        /*
         * ====================================================
         * 4. LOOP THROUGH A STRING
         * ====================================================
         *
         * We can use a for loop to visit every character.
         */

        System.out.println("\nCharacters:");

        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }


        /*
         * ====================================================
         * 5. STRING CONCATENATION
         * ====================================================
         *
         * Concatenation means joining Strings together.
         *
         * The + operator is commonly used.
         */

        String firstName = "Kush";
        String lastName = "Chaudhari";

        String fullName = firstName + " " + lastName;

        System.out.println("\nFull name: " + fullName);


        /*
         * ====================================================
         * 6. concat()
         * ====================================================
         *
         * concat() joins one String to another String.
         */

        String hello = "Hello";
        String world = "World";

        String helloWorld = hello.concat(world);

        System.out.println("concat(): " + helloWorld);


        /*
         * ====================================================
         * 7. equals()
         * ====================================================
         *
         * equals() compares the CONTENT of two Strings.
         *
         * This is the correct way to compare String values.
         */

        String firstString = "Hello";
        String secondString = "Hello";

        System.out.println(
                "equals(): " +
                        firstString.equals(secondString)
        );


        /*
         * ====================================================
         * 8. equalsIgnoreCase()
         * ====================================================
         *
         * This method compares Strings without considering
         * uppercase and lowercase differences.
         */

        System.out.println(
                "equalsIgnoreCase(): " +
                        firstString.equalsIgnoreCase("hello")
        );


        /*
         * ====================================================
         * 9. == VS equals()
         * ====================================================
         *
         * == compares object references.
         *
         * equals() compares String contents.
         *
         * For String content comparison, normally use equals().
         */

        String stringA = new String("Hello");
        String stringB = new String("Hello");

        System.out.println("Using ==: " + (stringA == stringB));
        System.out.println(
                "Using equals(): " +
                        stringA.equals(stringB)
        );


        /*
         * ====================================================
         * 10. substring()
         * ====================================================
         *
         * substring(start, end)
         *
         * start is included.
         * end is NOT included.
         *
         * Example:
         *
         * Java
         * 0123
         */

        String programming = "Java Programming";

        System.out.println(
                "substring(0, 4): " +
                        programming.substring(0, 4)
        );

        System.out.println(
                "substring(5): " +
                        programming.substring(5)
        );


        /*
         * ====================================================
         * 11. indexOf()
         * ====================================================
         *
         * indexOf() finds the first occurrence of a character
         * or String.
         *
         * If it cannot find the value, it returns -1.
         */

        System.out.println(
                "Index of Java: " +
                        programming.indexOf("Java")
        );

        System.out.println(
                "Index of a: " +
                        programming.indexOf('a')
        );

        System.out.println(
                "Index of Python: " +
                        programming.indexOf("Python")
        );


        /*
         * ====================================================
         * 12. lastIndexOf()
         * ====================================================
         *
         * lastIndexOf() finds the LAST occurrence.
         */

        System.out.println(
                "Last index of a: " +
                        programming.lastIndexOf('a')
        );


        /*
         * ====================================================
         * 13. contains()
         * ====================================================
         *
         * contains() checks whether a String contains
         * another sequence of characters.
         *
         * Returns true or false.
         */

        System.out.println(
                "Contains Java: " +
                        programming.contains("Java")
        );

        System.out.println(
                "Contains Python: " +
                        programming.contains("Python")
        );


        /*
         * ====================================================
         * 14. startsWith()
         * ====================================================
         *
         * Checks whether a String starts with a particular
         * sequence of characters.
         */

        System.out.println(
                "Starts with Java: " +
                        programming.startsWith("Java")
        );


        /*
         * ====================================================
         * 15. endsWith()
         * ====================================================
         *
         * Checks whether a String ends with a particular
         * sequence of characters.
         */

        System.out.println(
                "Ends with Programming: " +
                        programming.endsWith("Programming")
        );


        /*
         * ====================================================
         * 16. toUpperCase()
         * ====================================================
         *
         * Converts all letters to uppercase.
         */

        System.out.println(
                "Uppercase: " +
                        programming.toUpperCase()
        );


        /*
         * ====================================================
         * 17. toLowerCase()
         * ====================================================
         *
         * Converts all letters to lowercase.
         */

        System.out.println(
                "Lowercase: " +
                        programming.toLowerCase()
        );


        /*
         * ====================================================
         * 18. trim()
         * ====================================================
         *
         * trim() removes leading and trailing traditional
         * whitespace.
         *
         * It does NOT remove spaces between words.
         */

        String spacesText = "   Hello World   ";

        System.out.println(
                "trim(): [" +
                        spacesText.trim() +
                        "]"
        );


        /*
         * ====================================================
         * 19. strip()
         * ====================================================
         *
         * strip() also removes leading and trailing whitespace.
         *
         * It handles Unicode whitespace more appropriately.
         */

        System.out.println(
                "strip(): [" +
                        spacesText.strip() +
                        "]"
        );


        /*
         * ====================================================
         * 20. replace()
         * ====================================================
         *
         * replace() can replace characters or Strings.
         */

        String replaceText = "Hello";

        System.out.println(
                "Replace characters: " +
                        replaceText.replace('l', 'x')
        );

        System.out.println(
                "Replace String: " +
                        programming.replace(
                                "Java",
                                "Python"
                        )
        );


        /*
         * ====================================================
         * 21. replaceAll()
         * ====================================================
         *
         * replaceAll() uses REGULAR EXPRESSIONS.
         *
         * [0-9] means any digit from 0 to 9.
         */

        String mixedText = "abc123xyz456";

        System.out.println(
                "Remove digits: " +
                        mixedText.replaceAll("[0-9]", "")
        );


        /*
         * ====================================================
         * 22. split()
         * ====================================================
         *
         * split() divides a String into a String array.
         *
         * Here comma is used as the separator.
         */

        String fruits = "Apple,Banana,Orange";

        String[] fruitArray = fruits.split(",");

        System.out.println("\nFruits:");

        for (String fruit : fruitArray) {
            System.out.println(fruit);
        }


        /*
         * ====================================================
         * 23. toCharArray()
         * ====================================================
         *
         * Converts a String into a character array.
         */

        char[] characters = programming.toCharArray();

        System.out.println("\nCharacter array:");

        for (char c : characters) {
            System.out.println(c);
        }


        /*
         * ====================================================
         * 24. STRING TO INTEGER
         * ====================================================
         *
         * Integer.parseInt() converts a numeric String into
         * an int.
         */

        String numberString = "123";

        int number = Integer.parseInt(numberString);

        System.out.println(
                "\nString converted to int: " +
                        (number + 10)
        );


        /*
         * ====================================================
         * 25. INTEGER TO STRING
         * ====================================================
         *
         * String.valueOf() converts a value into a String.
         */

        int integerValue = 100;

        String convertedString =
                String.valueOf(integerValue);

        System.out.println(
                "Integer converted to String: " +
                        convertedString
        );


        /*
         * ====================================================
         * 26. isEmpty()
         * ====================================================
         *
         * Returns true when the String contains zero
         * characters.
         */

        String emptyString = "";

        System.out.println(
                "Is empty: " +
                        emptyString.isEmpty()
        );


        /*
         * ====================================================
         * 27. isBlank()
         * ====================================================
         *
         * Returns true if the String is empty or contains
         * only whitespace.
         */

        String blankString = "   ";

        System.out.println(
                "Is blank: " +
                        blankString.isBlank()
        );


        /*
         * ====================================================
         * 28. compareTo()
         * ====================================================
         *
         * compareTo() compares Strings lexicographically.
         *
         * Result:
         *
         * negative → first String comes before second
         * zero     → Strings are equal
         * positive → first String comes after second
         */

        String apple = "Apple";
        String bananaWord = "Banana";

        System.out.println(
                "compareTo(): " +
                        apple.compareTo(bananaWord)
        );


        /*
         * ====================================================
         * 29. String.join()
         * ====================================================
         *
         * Joins multiple Strings using a delimiter.
         */

        String joinedString = String.join(
                ", ",
                "Apple",
                "Banana",
                "Orange"
        );

        System.out.println(
                "Joined: " +
                        joinedString
        );


        /*
         * ====================================================
         * 30. String.format()
         * ====================================================
         *
         * String.format() creates formatted Strings.
         *
         * %s → String
         * %d → integer
         * %f → floating-point
         * %c → character
         * %b → boolean
         */

        String studentName = "Kush";
        int studentAge = 25;

        String formattedString = String.format(
                "Name: %s, Age: %d",
                studentName,
                studentAge
        );

        System.out.println(formattedString);


        /*
         * ====================================================
         * 31. formatted()
         * ====================================================
         *
         * formatted() is another way to create formatted
         * Strings.
         */

        String formattedString2 =
                "Name: %s, Age: %d"
                        .formatted(
                                studentName,
                                studentAge
                        );

        System.out.println(formattedString2);


        /*
         * ====================================================
         * 32. CHARACTER CLASS
         * ====================================================
         *
         * Character provides methods for checking characters.
         */

        char testCharacter = 'A';

        System.out.println(
                "Is letter: " +
                        Character.isLetter(testCharacter)
        );

        System.out.println(
                "Is digit: " +
                        Character.isDigit(testCharacter)
        );

        System.out.println(
                "Is uppercase: " +
                        Character.isUpperCase(testCharacter)
        );

        System.out.println(
                "Is lowercase: " +
                        Character.isLowerCase(testCharacter)
        );

        System.out.println(
                "Is whitespace: " +
                        Character.isWhitespace(testCharacter)
        );


        /*
         * ====================================================
         * 33. COUNT A CHARACTER
         * ====================================================
         *
         * Count how many times a particular character appears.
         */

        String bananaText = "banana";

        int aCount = 0;

        for (int i = 0; i < bananaText.length(); i++) {

            if (bananaText.charAt(i) == 'a') {
                aCount++;
            }
        }

        System.out.println(
                "Number of a characters: " +
                        aCount
        );


        /*
         * ====================================================
         * 34. COUNT VOWELS
         * ====================================================
         *
         * Checks every character and counts:
         *
         * a, e, i, o, u
         */

        String vowelText = "programming";

        int vowelCount = 0;

        for (int i = 0; i < vowelText.length(); i++) {

            char c =
                    Character.toLowerCase(
                            vowelText.charAt(i)
                    );

            if (c == 'a' ||
                    c == 'e' ||
                    c == 'i' ||
                    c == 'o' ||
                    c == 'u') {

                vowelCount++;
            }
        }

        System.out.println(
                "Number of vowels: " +
                        vowelCount
        );


        /*
         * ====================================================
         * 35. COUNT DIGITS
         * ====================================================
         *
         * Character.isDigit() checks whether a character
         * represents a digit.
         */

        String digitText = "abc123xyz45";

        int digitCount = 0;

        for (int i = 0; i < digitText.length(); i++) {

            if (Character.isDigit(
                    digitText.charAt(i))) {

                digitCount++;
            }
        }

        System.out.println(
                "Number of digits: " +
                        digitCount
        );


        /*
         * ====================================================
         * 36. COUNT UPPERCASE LETTERS
         * ====================================================
         */

        String caseText = "Java JAVA";

        int uppercaseCount = 0;

        for (int i = 0; i < caseText.length(); i++) {

            if (Character.isUpperCase(
                    caseText.charAt(i))) {

                uppercaseCount++;
            }
        }

        System.out.println(
                "Uppercase letters: " +
                        uppercaseCount
        );


        /*
         * ====================================================
         * 37. COUNT LOWERCASE LETTERS
         * ====================================================
         */

        int lowercaseCount = 0;

        for (int i = 0; i < caseText.length(); i++) {

            if (Character.isLowerCase(
                    caseText.charAt(i))) {

                lowercaseCount++;
            }
        }

        System.out.println(
                "Lowercase letters: " +
                        lowercaseCount
        );


        /*
         * ====================================================
         * 38. REVERSE A STRING
         * ====================================================
         *
         * Start from the last index and move toward index 0.
         */

        String originalText = "Hello";

        String reversedText = "";

        for (int i = originalText.length() - 1;
             i >= 0;
             i--) {

            reversedText += originalText.charAt(i);
        }

        System.out.println(
                "Reversed: " +
                        reversedText
        );


        /*
         * ====================================================
         * 39. REVERSE USING STRINGBUILDER
         * ====================================================
         *
         * StringBuilder has a built-in reverse() method.
         */

        String reversedUsingBuilder =
                new StringBuilder(originalText)
                        .reverse()
                        .toString();

        System.out.println(
                "StringBuilder reverse: " +
                        reversedUsingBuilder
        );


        /*
         * ====================================================
         * 40. PALINDROME
         * ====================================================
         *
         * A palindrome reads the same from left to right
         * and right to left.
         *
         * Examples:
         *
         * madam
         * level
         * racecar
         */

        String palindromeText = "madam";

        String palindromeReverse = "";

        for (int i = palindromeText.length() - 1;
             i >= 0;
             i--) {

            palindromeReverse +=
                    palindromeText.charAt(i);
        }

        if (palindromeText.equals(palindromeReverse)) {

            System.out.println(
                    "Palindrome"
            );

        } else {

            System.out.println(
                    "Not Palindrome"
            );
        }


        /*
         * ====================================================
         * 41. PALINDROME USING TWO POINTERS
         * ====================================================
         *
         * left starts at the beginning.
         * right starts at the end.
         *
         * Move both pointers toward the center.
         */

        String twoPointerText = "racecar";

        int left = 0;
        int right = twoPointerText.length() - 1;

        boolean palindrome = true;

        while (left < right) {

            if (twoPointerText.charAt(left) !=
                    twoPointerText.charAt(right)) {

                palindrome = false;
                break;
            }

            left++;
            right--;
        }

        System.out.println(
                "Two-pointer palindrome: " +
                        palindrome
        );


        /*
         * ====================================================
         * 42. REMOVE SPACES
         * ====================================================
         *
         * replace(" ", "") removes normal spaces.
         */

        String sentence = "Hello World Java";

        String noSpaces =
                sentence.replace(" ", "");

        System.out.println(
                "Without spaces: " +
                        noSpaces
        );


        /*
         * ====================================================
         * 43. COUNT WORDS
         * ====================================================
         *
         * split("\\s+") separates words using one or more
         * whitespace characters.
         */

        String sentenceForWords =
                "Java is very easy";

        String[] words =
                sentenceForWords.trim().split("\\s+");

        System.out.println(
                "Number of words: " +
                        words.length
        );


        /*
         * ====================================================
         * 44. PRINT EVERY WORD
         * ====================================================
         */

        for (String word : words) {
            System.out.println(word);
        }


        /*
         * ====================================================
         * 45. FIND DUPLICATE CHARACTERS
         * ====================================================
         *
         * Compare every character with the characters after it.
         *
         * This is a simple approach with O(n^2) time complexity.
         */

        String duplicateText = "programming";

        System.out.println(
                "\nDuplicate characters:"
        );

        for (int i = 0;
             i < duplicateText.length();
             i++) {

            for (int j = i + 1;
                 j < duplicateText.length();
                 j++) {

                if (duplicateText.charAt(i) ==
                        duplicateText.charAt(j)) {

                    System.out.println(
                            duplicateText.charAt(i)
                    );

                    break;
                }
            }
        }


        /*
         * ====================================================
         * 46. REMOVE DUPLICATE CHARACTERS
         * ====================================================
         *
         * Build a new String.
         *
         * Add a character only if it is not already present.
         */

        String duplicateInput = "programming";

        String uniqueCharacters = "";

        for (int i = 0;
             i < duplicateInput.length();
             i++) {

            String currentCharacter =
                    String.valueOf(
                            duplicateInput.charAt(i)
                    );

            if (!uniqueCharacters.contains(
                    currentCharacter)) {

                uniqueCharacters +=
                        currentCharacter;
            }
        }

        System.out.println(
                "Without duplicates: " +
                        uniqueCharacters
        );


        /*
         * ====================================================
         * 47. CHARACTER FREQUENCY
         * ====================================================
         *
         * Count how many times every letter occurs.
         */

        String frequencyText = "banana";

        System.out.println(
                "\nCharacter frequency:"
        );

        for (char c = 'a'; c <= 'z'; c++) {

            int frequency = 0;

            for (int i = 0;
                 i < frequencyText.length();
                 i++) {

                if (frequencyText.charAt(i) == c) {
                    frequency++;
                }
            }

            if (frequency > 0) {

                System.out.println(
                        c + " = " + frequency
                );
            }
        }


        /*
         * ====================================================
         * 48. FIRST NON-REPEATING CHARACTER
         * ====================================================
         *
         * Find the first character whose frequency is 1.
         */

        String nonRepeatingText = "swiss";

        for (int i = 0;
             i < nonRepeatingText.length();
             i++) {

            char current =
                    nonRepeatingText.charAt(i);

            int frequency = 0;

            for (int j = 0;
                 j < nonRepeatingText.length();
                 j++) {

                if (nonRepeatingText.charAt(j) ==
                        current) {

                    frequency++;
                }
            }

            if (frequency == 1) {

                System.out.println(
                        "First non-repeating character: " +
                                current
                );

                break;
            }
        }


        /*
         * ====================================================
         * 49. ANAGRAM
         * ====================================================
         *
         * Two Strings are anagrams if they contain the same
         * characters with the same frequencies.
         *
         * Example:
         *
         * listen
         * silent
         */

        String firstWord = "listen";
        String secondWord = "silent";

        char[] firstArray =
                firstWord.toCharArray();

        char[] secondArray =
                secondWord.toCharArray();

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        if (Arrays.equals(
                firstArray,
                secondArray)) {

            System.out.println(
                    "Anagram"
            );

        } else {

            System.out.println(
                    "Not Anagram"
            );
        }


        /*
         * ====================================================
         * 50. STRINGBUILDER
         * ====================================================
         *
         * String is immutable.
         *
         * StringBuilder is mutable.
         *
         * StringBuilder is useful when repeatedly modifying
         * a String.
         */

        StringBuilder builder =
                new StringBuilder();

        builder.append("Hello");
        builder.append(" ");
        builder.append("Java");

        System.out.println(
                "StringBuilder: " +
                        builder
        );


        /*
         * ====================================================
         * 51. STRINGBUILDER insert()
         * ====================================================
         *
         * insert() adds text at a specific index.
         */

        builder.insert(
                0,
                "Welcome "
        );

        System.out.println(builder);


        /*
         * ====================================================
         * 52. STRINGBUILDER delete()
         * ====================================================
         *
         * delete(start, end)
         *
         * start is included.
         * end is excluded.
         */

        builder.delete(
                0,
                8
        );

        System.out.println(builder);


        /*
         * ====================================================
         * 53. STRINGBUILDER setCharAt()
         * ====================================================
         *
         * Changes one character at a specific index.
         */

        builder.setCharAt(
                0,
                'h'
        );

        System.out.println(builder);


        /*
         * ====================================================
         * 54. STRINGBUILDER reverse()
         * ====================================================
         */

        builder.reverse();

        System.out.println(builder);


        /*
         * ====================================================
         * 55. STRINGBUILDER toString()
         * ====================================================
         *
         * Converts StringBuilder back into a String.
         */

        String finalBuilderString =
                builder.toString();

        System.out.println(
                finalBuilderString
        );


        /*
         * ====================================================
         * 56. REGULAR EXPRESSIONS
         * ====================================================
         *
         * \\d+ means one or more digits.
         */

        String onlyDigits = "12345";

        System.out.println(
                "Only digits: " +
                        onlyDigits.matches("\\d+")
        );


        /*
         * ====================================================
         * 57. REGEX — ONLY LETTERS
         * ====================================================
         *
         * [a-zA-Z]+ means one or more English letters.
         */

        String onlyLetters = "Hello";

        System.out.println(
                "Only letters: " +
                        onlyLetters.matches(
                                "[a-zA-Z]+"
                        )
        );


        /*
         * ====================================================
         * 58. REGEX — REPLACE DIGITS
         * ====================================================
         *
         * \\d represents a digit.
         *
         * Here every digit is replaced with #.
         */

        String data = "Java123Programming456";

        System.out.println(
                data.replaceAll(
                        "\\d",
                        "#"
                )
        );


        /*
         * ====================================================
         * 59. STRING POOL
         * ====================================================
         *
         * Java stores String literals in a String pool.
         *
         * Equal literals can refer to the same pooled object.
         */

        String poolA = "Hello";
        String poolB = "Hello";

        System.out.println(
                "Pool == : " +
                        (poolA == poolB)
        );


        /*
         * ====================================================
         * 60. new String()
         * ====================================================
         *
         * new String() creates a separate String object.
         */

        String poolC =
                new String("Hello");

        System.out.println(
                "Literal == new String: " +
                        (poolA == poolC)
        );

        System.out.println(
                "Literal equals new String: " +
                        poolA.equals(poolC)
        );


        /*
         * ====================================================
         * 61. intern()
         * ====================================================
         *
         * intern() returns the pooled version of a String.
         */

        String poolD = poolC.intern();

        System.out.println(
                "After intern(): " +
                        (poolA == poolD)
        );


        /*
         * ====================================================
         * 62. CODE POINTS
         * ====================================================
         *
         * Java Strings use UTF-16.
         *
         * codePoints() can be used for Unicode-aware
         * processing.
         */

        String unicodeText = "Hello";

        System.out.println(
                "\nCode points:"
        );

        unicodeText
                .codePoints()
                .forEach(
                        System.out::println
                );


        /*
         * ====================================================
         * 63. USER INPUT
         * ====================================================
         *
         * Scanner can be used to read a String from the keyboard.
         *
         * next()     → reads one word
         * nextLine() → reads the entire line
         */

        Scanner scanner =
                new Scanner(System.in);

        System.out.print(
                "\nEnter a String: "
        );

        String userInput =
                scanner.nextLine();

        System.out.println(
                "You entered: " +
                        userInput
        );

        System.out.println(
                "Length: " +
                        userInput.length()
        );

        System.out.println(
                "Uppercase: " +
                        userInput.toUpperCase()
        );

        System.out.println(
                "Lowercase: " +
                        userInput.toLowerCase()
        );


        /*
         * ====================================================
         * PROGRAM END
         * ====================================================
         */

        scanner.close();

        System.out.println(
                "\nString demonstration completed."
        );
    }
}