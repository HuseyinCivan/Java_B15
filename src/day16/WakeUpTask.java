package day16;

public class WakeUpTask {
    public static void main(String[] args) {

//        WAKE UP Task 1 :
//        Given a word with 4 characters
//        stored in a String variable word1
//        create a String variable called word2
//        store the reversed word1 into word 2
//        and print out
//        FOR EXAMPLE :
//        word1 ==> Java    -->> word2 avaJ
//                -- optionally ask this word from scanner


        String word1="Java";
        char firtsLetter=word1.charAt(0);
        char secondLetter=word1.charAt(1);
        char thirdLetter=word1.charAt(2);
        char fourthLetter=word1.charAt(3);

        String word2=""+fourthLetter+thirdLetter+secondLetter+firtsLetter;
        System.out.println("word2 = " + word2);

        word2=""+word1.charAt(3)+word1.charAt(2)+word1.charAt(1)+word1.charAt(0);
        System.out.println("word2 = " + word2);

        //        // in order to reverse a word , we need to take last character and put in first character
        //        // then put the second character at 1 location before first character
        //        // start getting character from last location till first location then save it
        //         //word2 =  "" + word1.charAt(3) + word1.charAt(2) + word1.charAt(1) + word1.charAt(0) ;
        ////        word2  = word2 +  word1.charAt(3) + word1.charAt(2) + word1.charAt(1) + word1.charAt(0) ;
        //          word2  +=  ""+word1.charAt(3) + word1.charAt(2) + word1.charAt(1) + word1.charAt(0) ;




        // i want to add World at the end of the it
        String msg="Hello";

        //msg=msg+" World";

        msg+=" World";
        System.out.println("msg = " + msg);










    }
}