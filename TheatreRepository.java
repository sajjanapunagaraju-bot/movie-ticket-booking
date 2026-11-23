package com.movieticket.repository;

import com.movieticket.entity.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TheatreRepository extends JpaRepository<Theatre, Long> {
    List<Theatre> findByNameContainingIgnoreCaseOrLocationContainingIgnoreCaseOrPinCodeContainingIgnoreCase(
            String name, String location, String pinCode);
}
