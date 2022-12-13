package knn;

public class Movie {
    private double budget;

    private final Genre[] genres;
    private double revenue;
    private double runtime;
    private double voteAverage;
    private double voteCount;

    public Movie() {
        genres = new Genre[0];
    }
}
