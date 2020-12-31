package Level02;

public class ProblemSet02 {
    /**
     * Have the function TimeConvert(num) take the num parameter being passed and return
     * the number of hours and minutes the parameter converts to (ie. if num = 63 then
     * the output should be 1:3). Separate the number of hours and minutes with a colon.
     */
    public String timeConvert(int num){
        // create int variable called hours and make it equal to num/60
        // create int variable called minutes = nums minus hours times 60
        // create String variable called timeStr and make it equal to hours, append ":" and + minutes
        // return timeStr variable
        int hours = num/60;
        int minutes = num - (hours * 60);
        String timeStr = hours + ":" + minutes;
        return timeStr;
    }

    /**
     * Have the function CountingMinutesI(str) take the str parameter being passed which
     * will be two times (each properly formatted with a colon and am or pm) separated
     * by a hyphen and return the total number of minutes between the two times.
     * The time will be in a 12 hour clock format.
     * For example: if str is 9:00am-10:00am then the output should be 60.
     * If str is 1:00pm-11:00am the output should be 1320.
     */
    public String countingMinutes(String str) {
        // code goes here
        return null;
    }

    /**
     * Have the function ArrayMatching(strArr) read the array of strings stored in strArr
     * which will contain only two elements, both of which will represent an array of
     * positive integers. For example: if strArr is ["[1, 2, 5, 6]", "[5, 2, 8, 11]"],
     * then both elements in the input represent two integer arrays, and your goal for
     * this challenge is to add the elements in corresponding locations from both arrays.
     * For the example input, your program should do the following additions:
     * [(1 + 5), (2 + 2), (5 + 8), (6 + 11)] which then equals [6, 4, 13, 17].
     * Your program should finally return this resulting array in a string format with
     * each element separated by a hyphen: 6-4-13-17.
     *
     * If the two arrays do not have the same amount of elements, then simply append the
     * remaining elements onto the new array (example shown below).
     * Both arrays will be in the format: [e1, e2, e3, ...] where at least one element will
     * exist in each array.
     */
    public String arrayMatching(String[] strArr) {
        // code goes here
        return null;
    }
}
