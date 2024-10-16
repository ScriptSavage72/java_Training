package ArrayStringAssignment;

/*
You are managing a movie rating system where users rate movies. Write a Java program that:
•	Stores the names of 5 movies in a string array and stores ratings (out of 5) in another array.
•	Finds the movie with the highest rating and displays it to the user.

 */

public class MovieRatingSystem {
    public String[] movies;
    public int[] ratings;
    
    public MovieRatingSystem(String[] movies, int[] ratings){
        this.movies =movies;
        this.ratings = ratings;
    }
    
    public void highestRating(){
        int index = -1;
        int max = ratings[0];
        for (int i = 0; i < movies.length; i++) {
            if(ratings[i] > max){
                max = ratings[i];
                index = i;
            }
        }
        System.out.println("The highest rating is for " + movies[index] + " which has a rating of " + max + " stars!");
    }

    public static void main(String[] args) {
        String[] movies = {"Saw", "Pirates of the Caribbean", "Ocean's Eleven", "Green Mile", "Forrest Gump"};
        int[] ratings = {1, 2, 3, 4, 5};
        MovieRatingSystem system = new MovieRatingSystem(movies, ratings);

        system.highestRating();
    }
}
