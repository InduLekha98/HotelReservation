package com.hotel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.List;

public class HotelReservationTest {

    @Test
    public void givenHotel_whenInvokeAddHotel_shouldBeAbleToAdd() {
        HotelReservation hotelReservation = new HotelReservation();
        Hotel hotel = new Hotel("Lakewood",110);
        hotelReservation.addHotel(hotel);
        List hotelList = hotelReservation.getHotels();
        Assertions.assertTrue(hotelList.contains(hotel));
    }
}
