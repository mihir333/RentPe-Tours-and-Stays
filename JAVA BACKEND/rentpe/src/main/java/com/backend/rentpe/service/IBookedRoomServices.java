package com.backend.rentpe.service;

import java.util.List;

import com.backend.rentpe.model.Room;
import com.backend.rentpe.response.BookingResponse;

public interface IBookedRoomServices {
	List<BookingResponse> getAllBookingsByRoomId(Room r);
}
