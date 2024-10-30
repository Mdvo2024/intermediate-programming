
class App {
    public static void main(String[] args) throws Exception {
        // 1. Create a new MoviePosterWriter
        MoviePosterWriter mpw = new MoviePosterWriter();
        // 2. Create a new Movie, pass it in a string of a movie title
        Movie avengers = new Movie("avengers");
        // 3. use the movie poster writer to set a movie and then write it
        mpw.setMovieString(avengers.getMovieNameForURL());
        mpw.write(avengers.getMovieNameForURL());

        // check that this works
        System.out.println(avengers.getMovieNameForURL());
        System.out.println(avengers.getMovieFilename());

        
        // Choose your own movies below and put them into this array! make a loop to repeat steps 2 and 3.
        String[] movies = { "Avengers", "Iron Man", "Minions", "Iron Man 2", "Sing" };
        // YOUR CODE HERE: in a loop, do steps 2 and 3 for every movie
        for (int i = 0; i < movies.length; i++){
            Movie movie = new Movie(movies[i]);
            mpw.setMovieString(movie.getMovieNameForURL());
            mpw.write(movie.getMovieFilename());
        }
        // the code currently doesn't work if you have a space in the movie name. see below
        // you need to fix getMovieNameForURL() and getMovieFilename() in the Movie.java file.
        // Movie airbud = new Movie("air bud");
        // mpw.setMovieString("air bud");
        // mpw.write("air bud");
        
    }
}
