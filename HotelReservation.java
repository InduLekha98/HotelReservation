package com.hotel;

import java.util.ArrayList;
import java.util.List;

public class HotelReservation {
    private List<HotelReservation> hotelList = new ArrayList<>();
    int result;

    public void addHotel(HotelReservation hotel) {
        hotelList.add(hotel);
    }

    public List<HotelReservation> getHotels() {
        return hotelList;
    }
}
