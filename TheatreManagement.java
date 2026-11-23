package com.movieticket.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "theatre_management")
public class TheatreManagement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String passwordHash;

    @Column(nullable = false)
    private String role = "ROLE_THEATRE_ADMIN";

    private Long assignedTheatreId;
    private boolean active = true;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getPasswordHash() { return passwordHash; }
    public void setPasswordHash(String passwordHash) { this.passwordHash = passwordHash; }
    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
    public Long getAssignedTheatreId() { return assignedTheatreId; }
    public void setAssignedTheatreId(Long assignedTheatreId) { this.assignedTheatreId = assignedTheatreId; }
    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }
}
