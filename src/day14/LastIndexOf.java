package day14;

public class LastIndexOf {
    public static void main(String[] args) {

        String name="Game of Java"; // length is 12, last char index is 11


        //find out last location the letter a shows up
        System.out.println("last location the letter a shows up");
        System.out.println(name.lastIndexOf("a"));


        //find out last location the character space shows up
        System.out.println("last location the character space shows up");
        System.out.println(name.lastIndexOf(" "));

        //find out last location the letter Ga shows up
        System.out.println("last location the letter Ga shows up");
        System.out.println(name.lastIndexOf("Ga"));

        //find out last location the letter Kawa shows up
        System.out.println("last location the letter Kawa shows up");
        System.out.println(name.lastIndexOf("Kawa"));


        //
        //

        if( name.indexOf("Kawa")>-1    ){
            System.out.println("KAWA FOUND!!! ");
        }else{
            System.out.println("NO KAWA - NO PUMPKIN");
        }






    }
}
