package com.hotel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class HotelReservationTest1 {

    @Test
    public void givenHotel_whenInvokeAddHotel_shoulBeAbleToAdd() {
        HotelReservationService hotelReservationService = new HotelReservationService();
        Hotel hotel = new Hotel("Lakewood", 110,90);
        hotelReservationService.addHotel(hotel);
        List hotelList = hotelReservationService.getHotelList().subList();
        Assertions.assertTrue(hotelList.contains(hotel));
    }

    @Test
    public void given3Hotels_whenInvokeFindCheapestHotel_shouldBeAbleToReturnCheapestHotel() {
        HotelReservationService hotelReservationService = new HotelReservationService();
        Hotel Lakewood = new Hotel("Lakewood",110,90);
        Hotel Bridgewood = new Hotel("Bridgewood",160,50);
        Hotel RidgeWood = new Hotel("Ridgewood",220,150);
        hotelReservationService.addHotel(Lakewood);
        hotelReservationService.addHotel(Bridgewood);
        hotelReservationService.addHotel(RidgeWood);
        int countNumberOfDays = hotelReservationService.countDays("2020-09-10","2020-09-12");
        System.out.println(countNumberOfDays);
        Hotel result = hotelReservationService.findCheapestHotel(countNumberOfDays);
        System.out.println(result);
        Assertions.assertTrue(hotelReservationService.getHotelList().contains(result));
    }
    @Test
    public void givenDateRange_basisOfWeekDayWeekEnd_shouldReturnCheapestHotel(){
        HotelReservationService hotelReservationService = new HotelReservationService();
        Hotel Lakewood = new Hotel("Lakewood",110,90);
        Hotel Bridgewood = new Hotel("Bridgewood",160,50);
        Hotel RidgeWood = new Hotel("Ridgewood",220,150);
        hotelReservationService.addHotel(Lakewood);
        hotelReservationService.addHotel(Bridgewood);
        hotelReservationService.addHotel(RidgeWood);
        List HotelList = hotelReservationService.getCheapestHotel();
        Hotel result = hotelReservationService.getCheapestHotel("2020-09-11","2020-09-12");
        Assertions.assertTrue(HotelList.contains(result));
    }

    @Test
    public void givenDates_basisOfWeekDayWeekEnd_shouldReturnCheapestHotel(){
        HotelReservationService hotelReservationService = new HotelReservationService();
        Hotel Lakewood = new Hotel("Lakewood",110,90,3);
        Hotel Bridgewood = new Hotel("Bridgewood",160,50,4);
        Hotel RidgeWood = new Hotel("Ridgewood",220,150,5);
        hotelReservationService.addHotel(Lakewood);
        hotelReservationService.addHotel(Bridgewood);
        hotelReservationService.addHotel(RidgeWood);
        List hotelList = hotelReservationService.getHotelList();
        Hotel result = hotelReservationService.getCheapestHotel("2020-09-11","2020-09-12");
        Assertions.assertTrue(hotelList.contains(result));
    }



}
