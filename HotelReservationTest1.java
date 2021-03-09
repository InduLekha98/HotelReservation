package com.hotel;

import com.hotel.Hotel;
import com.hotel.HotelReservationService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class HotelReservationTest1<result> {

    @Test
    public void givenHotel_ShouldReturnTrue() {
        HotelReservationService hotelReservationService = new HotelReservationService();
        Hotel hotel = new Hotel("Lakewood",110,90,80,80,3);
        hotelReservationService.addHotel(hotel);
        List hotelList = hotelReservationService.getHotelList();
        System.out.println(hotelList);
        Assertions.assertTrue(hotelList.contains(hotel));
    }

    @Test
    public void givenHotels_shouldReturnCheapestHotel(){
        HotelReservationService hotelReservationService = new HotelReservationService();
        Hotel Lakewood = new Hotel("Lakewood",110,90,80,80,3);
        Hotel Bridgewood = new Hotel("Bridgewood",150,50,110,50,4);
        Hotel RidgeWood = new Hotel("Ridgewood",220,150,100,40,5);
        hotelReservationService.addHotel(Lakewood);
        hotelReservationService.addHotel(Bridgewood);
        hotelReservationService.addHotel(RidgeWood);
        List hotelList = hotelReservationService.getHotelList();
        System.out.println(hotelList);
//          long days = hotelReservation.noOfWeekEnds("10-09-2021","12-09-2021");
        Hotel result = hotelReservationService.getCheapestHotel("10-09-2021","12-09-2021");
        Assertions.assertTrue(hotelList.contains(result));
    }

    @Test
    public void givenDateRange_shouldReturnCheapestHotel(){
        HotelReservationService hotelReservationService = new HotelReservationService();
        Hotel Lakewood = new Hotel("Lakewood",110,90,80,80,3);
        Hotel Bridgewood = new Hotel("Bridgewood",150,50,110,50,4);
        Hotel RidgeWood = new Hotel("Ridgewood",220,150,100,40,5);
        hotelReservationService.addHotel(Lakewood);
        hotelReservationService.addHotel(Bridgewood);
        hotelReservationService.addHotel(RidgeWood);
        List hotelList = hotelReservationService.getHotelList();
        System.out.println(hotelList);
        Hotel result = hotelReservationService.getCheapestHotel("2020-09-10","2020-09-12");
        Assertions.assertTrue(hotelList.contains(result));
    }

    @Test
    public void givenDateRange_basisOfWeekDayWeekEnd_shouldReturnCheapestHotel(){
        HotelReservationService hotelReservationService = new HotelReservationService();
        Hotel Lakewood = new Hotel("Lakewood",110,90,80,80,3);
        Hotel Bridgewood = new Hotel("Bridgewood",150,50,110,50,4);
        Hotel RidgeWood = new Hotel("Ridgewood",220,150,100,40,5);
        hotelReservationService.addHotel(Lakewood);
        hotelReservationService.addHotel(Bridgewood);
        hotelReservationService.addHotel(RidgeWood);
        List hotelList = hotelReservationService.getHotelList();
        Hotel result = hotelReservationService.getCheapestHotel("2020-09-11","2020-09-12");
        Assertions.assertTrue(hotelList.contains(result));
    }

    @Test
    public void givenDates_basisOfWeekDayWeekEnd_shouldReturnCheapestHotel(){
        HotelReservationService hotelReservationService = new HotelReservationService();
        Hotel Lakewood = new Hotel("Lakewood",110,90,80,80,3);
        Hotel Bridgewood = new Hotel("Bridgewood",150,50,110,50,4);
        Hotel RidgeWood = new Hotel("Ridgewood",220,150,100,40,5);
        hotelReservationService.addHotel(Lakewood);
        hotelReservationService.addHotel(Bridgewood);
        hotelReservationService.addHotel(RidgeWood);
        List hotelList = hotelReservationService.getHotelList();
        Hotel result = hotelReservationService.getCheapestHotel("2020-09-11","2020-09-12");
        Assertions.assertTrue(hotelList.contains(result));
    }

    @Test
    public void givenDates_basisOfWeekDayWeekEnd_shouldReturnBestCheapestHotel(){
        HotelReservationService hotelReservationService = new HotelReservationService();
        Hotel Lakewood = new Hotel("Lakewood",110,90,80,80,3);
        Hotel Bridgewood = new Hotel("Bridgewood",150,50,110,50,4);
        Hotel RidgeWood = new Hotel("Ridgewood",220,150,100,40,5);
        hotelReservationService.addHotel(Lakewood);
        hotelReservationService.addHotel(Bridgewood);
        hotelReservationService.addHotel(RidgeWood);
        List hotelList = hotelReservationService.getHotelList();
        Hotel result = hotelReservationService.getBestCheapHotel("2020-09-11","2020-09-12");
        Assertions.assertTrue(hotelList.contains(result));
    }

    @Test
    public void givenDates_basisOfWeekDayWeekEnd_shouldReturnBestHotel(){
        HotelReservationService hotelReservationService = new HotelReservationService();
        Hotel Lakewood = new Hotel("Lakewood",110,90,80,80,3);
        Hotel Bridgewood = new Hotel("Bridgewood",150,50,110,50,4);
        Hotel RidgeWood = new Hotel("Ridgewood",220,150,100,40,5);
        hotelReservationService.addHotel(Lakewood);
        hotelReservationService.addHotel(Bridgewood);
        hotelReservationService.addHotel(RidgeWood);
        List hotelList = hotelReservationService.getHotelList();
        Hotel result = hotelReservationService.getBestRatedHotel("2020-09-11","2020-09-12");
        Assertions.assertTrue(hotelList.contains(result));
    }


    @Test
    public void addSpecialRates_reward(){
        HotelReservationService hotelReservationService = new HotelReservationService();
        Hotel Lakewood = new Hotel("Lakewood",110,90,80,80,3);
        Hotel Bridgewood = new Hotel("Bridgewood",150,50,110,50,4);
        Hotel RidgeWood = new Hotel("Ridgewood",220,150,100,40,5);
        hotelReservationService.addHotel(Lakewood);
        hotelReservationService.addHotel(Bridgewood);
        hotelReservationService.addHotel(RidgeWood);
        List hotelList = hotelReservationService.getHotelList();
        Hotel result = hotelReservationService.getBestRatedHotel("2020-09-11","2020-09-12");
        Assertions.assertTrue(hotelList.contains(result));
    }

}
