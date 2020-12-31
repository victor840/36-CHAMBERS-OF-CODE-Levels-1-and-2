package Level01;

import org.apache.commons.lang3.StringUtils;


public class ProblemSet01 {

    /**
     * Have the wordCount(input) take the str string parameter being passed
     * and return the number of words the string contains
     * (e.g. "Never eat shredded wheat or cake" would return 6). Words will be
     * separated by single spaces.
     */
    public String wordCount(String input) {
        // code goes here
        // create a string array called strAry to hold an array of strings
        // create an Integer variable called countOfWords and set its value to zero
        // write a for loop to traverse the length of the strAry
        // write an if statement to check if countOfWords is less then the length of words in the array
        // if the condition is true set the countOfWords to the strAry's length
        // return countOfWords as a String

        String[] strAry = input.split(" ");
        Integer countOfWords = 0;
        for (int i = 0; i < strAry.length; i++) {
            if (countOfWords < strAry.length) {
                countOfWords += strAry.length;
            }
        }
        return countOfWords.toString();
    }

    /**
     * Using the Java language, have the function firstReverse(String input) take the input parameter being passed and
     * return the string in reversed order. For example: if the input string is "Hello World and Coders" then your
     * program should return the string sredoC dna dlroW olleH.
     */

    public String firstReverse(String input) {
        // step 1 - instantiate stringBuilder object named reverseString
        // step 2 - assign the result to the reverseString variable using .toString() to cast to String
        // step 3 - call the .reverse() method on the string named input;
        // step 4 - return the reverseString

        String reversedString = "";
        StringBuilder sb = new StringBuilder();
        sb.append(input);
        reversedString = sb.reverse().toString();
        return reversedString;
    }

    /**
     * Have the longestWord(String input) take the input parameter being passed and return the
     * largest word in the string. If there are two or more words that are the same length,
     * return the first word from the string with that length. Ignore punctuation and assume
     * input will not be empty.
     */
    public String longestWord(String input) {
        // code goes here
        // initialize an Integer variable called sizeOfWrd and set it to 0
        // initialize a String variable called lngWord and set it to an empty string
        // initialize a String Array called strAry, split the input String by spaces, special characters and pass that into strAry
        // write for loop to traverse the length of the strAry
        // write an if statement checking if sizeOfWrd is less than the size of the word at index i in the strAry and sizeOfWrd is not equal to the size of the word at index i in the strAry
        // if the above condition is true, make sizeOfWrd equal to size of the word at index i in the strAry and make lngWord equal to the word at index i in the strAry
        // return lngWord

        Integer sizeOfWrd = 0;
        String lngWord = "";
        String[] strAry = input.replaceAll("[^a-zA-Z0-9]", " ").split(" ");
        for (int i = 0; i < strAry.length; i++) {
            if ((sizeOfWrd < strAry[i].length()) & sizeOfWrd != strAry[i].length()) {
                sizeOfWrd += strAry[i].length();
                lngWord = strAry[i];
            }
        }
        return lngWord;
    }

    /**
     * Have the swapCase(String input) take the input parameter and swap the case of each
     * character. For example: if str is "Hello World" the output should be hELLO wORLD.
     * Let numbers and symbols stay the way they are.
     */
    public String swapCase(String str) {
        // code goes here
        // initialize empty String variable called swappedCase
        // initialize char array called charArray, split str variable by spaces and pass the result into charArray
        // write a for loop to traverse the length of charArray
        // write an if-else statement to check each character in the array
        // if the the character is lowerCase make it upperCase, else-if it is upperCase make it lowerCase, set this outcome to swapedCase variable
        // return swappedCase variable

       /*  Tried doing it with Char array and kept getting errors

       String swappedCase = "";
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if(Character.isUpperCase(c)){
               c =  Character.isLowerCase(c);
            }else if(Character.isLowerCase(c)){
                c = Character.isUpperCase(c);
            }

        }*/
        return StringUtils.swapCase(str); //used swapCase from Apache Commons Library
    }
}
