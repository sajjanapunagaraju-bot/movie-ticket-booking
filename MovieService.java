package com.movieticket.service;

import com.movieticket.entity.Movie;
import com.movieticket.repository.MovieRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getAllActiveMovies() {
        return movieRepository.findByActiveTrue();
    }

    public List<Movie> getMoviesByCategory(String category) {
        return movieRepository.findByCategoryAndActiveTrue(category);
    }

    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);
    }
}
