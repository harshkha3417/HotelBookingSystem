package com.Harsh.projects.airBnbApp.repository;

import com.Harsh.projects.airBnbApp.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
