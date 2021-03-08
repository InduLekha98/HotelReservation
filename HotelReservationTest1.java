package com.hotel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class HotelReservationTest1 {

    @Test
    public void givenHotel_whenInvokeAddHotel_shoulBeAbleToAdd() {
        HotelReservationService hotelReservationService = new HotelReservationService();
        Hotel hotel = new Hotel("Bridgewood", 160);
        hotelReservationService.addHotel(hotel);
        List hotelList = hotelReservationService.getHotels();
        Assertions.assertTrue(hotelList.contains(hotel));
    }

    @Test
    public void given3Hotels_whenInvokeFindCheapestHotel_shouldBeAbleToReturnCheapestHotel() {
        HotelReservationService hotelReservationService = new HotelReservationService();
        Hotel Lakewood = new Hotel("Lakewood",110);
        Hotel Bridgewood = new Hotel("Bridgewood",160);
        Hotel RidgeWood = new Hotel("Ridgewood",220);
        hotelReservationService.addHotel(Lakewood);
        hotelReservationService.addHotel(Bridgewood);
        hotelReservationService.addHotel(RidgeWood);
        int countNumberOfDays = hotelReservationService.countDays("2020-09-10","2020-09-12");
        System.out.println(countNumberOfDays);
        Hotel result = hotelReservationService.findCheapestHotel(countNumberOfDays);
        System.out.println(result);
        Assertions.assertTrue(hotelReservationService.HotelList.contains(result));
    }

}

