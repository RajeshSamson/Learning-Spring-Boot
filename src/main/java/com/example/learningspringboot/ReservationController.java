package com.example.learningspringboot;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservation")
public class ReservationController {

    private final ReservationService service;

    public ReservationController(ReservationService service) {
        this.service = service;
    }

    @PostMapping("/save")
    public void save(@RequestBody Reservation reservation) {
        this.service.save(reservation);
    }

    @GetMapping("/all")
    public List<Reservation> getAllReservations() {
        return this.service.getAllReservations();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getReservationById(@PathVariable("id") Long id) {
        final Reservation reservation = this.service.getReservationById(id);
        if (reservation == null) {
            return ResponseEntity.ok().body("\"No Reservation with the ID\"");
        } else {
            return ResponseEntity.ok().body(reservation);
        }
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        this.service.deleteReservation(id);
    }


}
