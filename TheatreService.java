package com.movieticket.service;

import com.movieticket.entity.Theatre;
import com.movieticket.repository.TheatreRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TheatreService {
    private final TheatreRepository theatreRepository;

    public TheatreService(TheatreRepository theatreRepository) {
        this.theatreRepository = theatreRepository;
    }

    public List<Theatre> searchTheatres(String query) {
        if (query == null || query.isBlank()) {
            return theatreRepository.findAll();
        }
        return theatreRepository.findByNameContainingIgnoreCaseOrLocationContainingIgnoreCaseOrPinCodeContainingIgnoreCase(
                query, query, query);
    }

    public Theatre saveTheatre(Theatre theatre) {
        return theatreRepository.save(theatre);
    }
}
