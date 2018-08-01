package movies;

public class Movie {
    private String name;
    private String category;

    public Movie() {
    }

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void getCategory(String search){
        for (Movie movies : MoviesArray.findAll()) {
            if(search.equals("all")) {
                System.out.println(movies.getName() + " -- " + movies.getCategory());
            }
            else if (movies.getCategory().equalsIgnoreCase(search)){
                System.out.println(movies.getName() + " -- " + movies.getCategory());
            }
        }
    }

    public void searchMovie(String search){
        for(Movie movies: MoviesArray.findAll()){
            if(movies.getName().equalsIgnoreCase(search)){
                System.out.println(movies.getName().trim() + " -- " + movies.getCategory());
            }
        }
    }
}
