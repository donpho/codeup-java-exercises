package movies;

import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        do{
            options();
        }while(true);
    }

    public static void options(){
        System.out.println("What would you like to do?\n\n" +
                "0  -   exit\n" +
                "1  -   view all movies\n" +
                "2  -   view all movies in the animated category\n" +
                "3  -   view all movies in the drama category\n" +
                "4  -   view all movies in the horror category\n" +
                "5  -   view all movies in the sci-fi category\n" +
                "6  -   search for a movie\n" +
                "7  -   add a movie");
        movieList();
    }

    public static void movieList(){
        Input input = new Input();
        Movie movie = new Movie();
        switch (input.getInt(0,7)){
            case 0:
                System.out.println("Have a nice day!");
                System.exit(0);
                break;
            case 1:
                movie.getCategory("all");
                break;
            case 2:
                movie.getCategory("animated");
                break;
            case 3:
                movie.getCategory("drama");
                break;
            case 4:
                movie.getCategory("horror");
                break;
            case 5:
                movie.getCategory("scifi");
                break;
            case 6:
                searchMovie();
                break;
            case 7:
                addMovie();
                break;
        }
    }

    public static void addMovie(){
        Input input = new Input();
        Movie movie = new Movie();
        String movieName;
        String movieCategory;
        System.out.println("Do you want to add a movie? (Yes/No)");
        if(input.yesNo()){
            System.out.println("Please enter the movie title.");
            movieName = input.getString();
            System.out.println("Please enter the movie category");
            movieCategory = input.getString();
            movie.setName(movieName);
            movie.setCategory(movieCategory);
            System.out.println("You have added: "+movie.getName()+ "--" + movie.getCategory());
        }
    }

    public static void searchMovie(){
        Input input = new Input();
        Movie movie = new Movie();
        String search;
        System.out.println("Please enter the movie title");
        search = input.getString().trim();
        movie.searchMovie(search);
    }

}
