package com.example.learningspringboot;

import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class ReservationService {

    private static List<Reservation> reservations = new LinkedList<>();

    public void save(Reservation reservation) {
        reservations.add(reservation);
    }

    public List<Reservation> getAllReservations() {
        return reservations;
    }

    public Reservation getReservationById(Long id) {
        return reservations.stream().filter(f -> f.getId().equals(id)).findAny().orElse(null);
    }

    public void deleteReservation(Long id) {
        final Reservation reservationById = getReservationById(id);
        reservations.remove(reservationById);
    }

}
