package day43;

import day42.Movie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : Akbar
 * Created At : 1/17/20
 * @implNote : This is a Movie Utility class (just like Arrays class)
 * It has 11 static methods
 * to work with common operations on Movie Objects
 * <p>
 * Main method has been added with a way to call those methods
 * Your job is to add implementation to the method body
 * according to the documentation.
 * Read the whole thing quick first then start coding
 */
public class MovieUtility {

    public static void main(String[] args) {

        Movie m1 = new Movie("Joker", 2.2, "Drama");
        Movie m2 = new Movie("Frozen2", 1.5, "Family");
        Movie m3 = new Movie("Pursuit of Happiness", 2.0, "Drama");

        // expected to print The movie Joker is 2.2 hour long and it's genre is Drama
        printMovieInformation(m1);

        // expected to print F-R-O-Z-E-N-2
        printMovieNameCharacters(m2);

        // expected to print Frozen2
        printShorterMovieName(m2, m3);

        Movie result=getJokerMovieOject();
        System.out.println("result.getName() = " + result.getName());



        boolean result1 = isMovieLengthMoreThan2Hours(m1); //true
        System.out.println(result1);
        boolean result2 = isFamilyMovie(m1);               //false
        System.out.println(result2);

        String shortInfo = getCombinedMovieInfo(m1);       //Joker-2.2-Drama
        System.out.println(shortInfo);

        // Create this object : Movie{name='Batman', length=2.3, type='Action'}
        Movie m4 = createMovie("Batman", 2.3, "Action");
        System.out.println("m4 = " + m4);

        // Create this object : Movie{name='Aladdin', length=2.7, type='Family'}
        Movie m5 = createFamilyMovie("Aladdin", 2.7);
        System.out.println("m5 = " + m5);

        // Your Movie List after the method call
        List<Movie> myMovieList = getMyFavoriteMovies();
        System.out.println("myMovieList = " + myMovieList);

        // Sum of your movie hour totals
        double totalHours = getTotalHoursOfAllMovies(myMovieList);
        System.out.println("Total Hours = " + totalHours);


    }

    /**
     * A void method that accept any movie object
     * and print out it's information in below format
     * The movie <name> is <length> hour long and it's genre is <type>
     *
     * @param movieObj the movie object to get information from
     */
    public static void printMovieInformation(Movie movieObj) {
        //TODO YOUR CODE HERE
        // expected to print The movie Joker is 2.2 hour long and it's genre is Drama

        System.out.println("The movie " + movieObj.getName() + " is " + movieObj.getLength() + " hour long and it's genre is " + movieObj.getType());

    }

    /**
     * A void method that accept any movie object
     * and print out it's name in below format
     * If the movie name is Joker then print J-O-K-E-R (all uppercase)
     *
     * @param movieObj the movie object to get information from
     */
    public static void printMovieNameCharacters(Movie movieObj) {
        //TODO YOUR CODE HERE
        // expected to print F-R-O-Z-E-N-2
        for (int x = 0; x < movieObj.getName().length(); x++) {
            System.out.print("" + movieObj.getName().toUpperCase().charAt(x));
            if (movieObj.getName().charAt(x) != movieObj.getName().charAt(movieObj.getName().length() - 1)) {
                System.out.print("-");
            }
        }
        System.out.println();

    }

    /**
     * A void method that accept 2 movie objects
     * and print the name of movie with shorter movie length
     * for example Frozen is 1.5 hours , Joker is 2.2 hours
     * so print The shorter movie is : Frozen
     *
     * @param movieObj1 first movie object
     * @param movieObj2 second movie object
     */
    public static void printShorterMovieName(Movie movieObj1, Movie movieObj2) {
        //TODO YOUR CODE HERE

        if(movieObj1.getLength()<movieObj2.getLength()){
            System.out.println(movieObj1.getName());
        }else{
            System.out.println(movieObj2.getName());

        }
    }
    //create a static method that returns movie object with name Joker 2.5 hour and type Drama
    public static Movie getJokerMovieOject(){
        Movie j=new Movie("Joker",2.5,"Drama");
        return j;
    }




    /**
     * A method that check whether the length of movie is more than 2 hours
     *
     * @param movieObj the movie object to check
     * @return true if movieObj length is more than 2 hours
     */
    public static boolean isMovieLengthMoreThan2Hours(Movie movieObj) {
        //TODO YOUR CODE HERE
//        if(movieObj.getLength()>2){
//            return true;
//        }
//            return false;
        return movieObj.getLength() > 2;
    }

    /**
     * A method that check the type of movie is Family or not
     *
     * @param movieObj the movie object to check
     * @return true if movieObj type is Family (regardless of uppercase lowercase)
     */
    public static boolean isFamilyMovie(Movie movieObj) {
        //TODO YOUR CODE HERE

        if (movieObj.getType().equalsIgnoreCase("family")) {
            return true;
        }

        return false;
    }

    /**
     * A method to return combined movie info as String in below format"
     * for example if the movie is {"Joker", 2.2, "Drama"}
     * It should return Joker-2.2-Drama
     *
     * @param movieObj the movie object to check
     * @return the combined movie info as String
     */
    public static String getCombinedMovieInfo(Movie movieObj) {

        String combinedResult = "";
        //TODO YOUR CODE HERE

        combinedResult = movieObj.getName() + "-" + movieObj.getLength() + "-" + movieObj.getType();

        return combinedResult;
    }

    /**
     * A method to return newly created Movie object with provided arguments
     *
     * @param aName   the movie name you want the object to have
     * @param aLength the movie length you want the object to have
     * @param aType   the movie type you want the object to have
     * @return Movie object with above information
     */
    public static Movie createMovie(String aName, double aLength, String aType) {
        // an spoiler as example , ALREADY DONE FOR YOU
        Movie m = new Movie(aName, aLength, aType);
        return m;
    }

    /**
     * A method to return newly created Movie object with provided arguments
     * This is a bit more specialized version of create method for only Family movie
     * so the type is already known
     *
     * @param name the movie name you want the object to have
     * @param len  the movie type you want the object to have
     * @return Family Movie object with above information
     */
    public static Movie createFamilyMovie(String name, double len) {
        //TODO YOUR CODE HERE
        Movie m = new Movie(name, len, "Family");

        return m;
    }

    /**
     * A method to return your own Favorite Movie Objects as a list
     *
     * @return List of Movie Object
     */
    public static List<Movie> getMyFavoriteMovies() {

        List<Movie> movieLst = new ArrayList<>();
        //TODO YOUR CODE HERE
        movieLst.add(new Movie("The Shawshank Redemption", 2.22, "Drama"));
        movieLst.add(new Movie("The Godfather", 2.55, "Drama"));
        movieLst.add(new Movie("The Dark Knight", 2.32, "Action"));
        movieLst.add(new Movie("12 Angry Men", 1.36, "Drama"));
        movieLst.add(new Movie("Schindler's List", 3.15, " Biography"));
        movieLst.add(new Movie("The Lord of the Rings", 3.21, "Fantasy"));
        movieLst.add(new Movie("Pulp Fiction", 2.34, "Crime"));
        movieLst.add(new Movie("Fight Club", 1.99, "Drama"));
        movieLst.add(new Movie("Forrest Gump", 2.22, "Drama"));
        movieLst.add(new Movie("Inception", 2.28, "Action"));

        return movieLst;
    }

    /**
     * A method to get the total hours to finish all the movies
     *
     * @param lst List of Movie Object to calculate length for
     * @return sum of all movie length
     */
    public static double getTotalHoursOfAllMovies(List<Movie> lst) {

        double sum = 0;
        //TODO YOUR CODE HERE
        for (int x = 0; x < lst.size(); x++) {
            sum += lst.get(x).getLength();
        }
        return sum;
    }


}