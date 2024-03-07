package com.backend.rentpe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.backend.rentpe.model.Hotel;
import com.backend.rentpe.model.Room;
import com.backend.rentpe.response.RoomResponse;


public interface RoomRepository extends JpaRepository<Room, Long> {
	@Query("SELECT DISTINCT r.roomType FROM Room r")
	List<String> findDistinctRoomTypes();

	List<Room> findAllByHotel(Hotel hotel);

}
