package com.hotel;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;


public class HotelReservationService {
    List<Hotel> HotelList = new ArrayList<>();

    public void addHotel(Hotel hotel) {
        HotelList.add(hotel);
        System.out.println(HotelList);

    }
    public List<Hotel> getHotels() {
        return HotelList;
    }
    public int countDays(String firstDate,String lastDate) {
        LocalDate startDate = LocalDate.parse(firstDate);
        LocalDate endDate = LocalDate.parse(lastDate);
        return  (int) ChronoUnit.DAYS.between(startDate,endDate);
    }

    public Hotel getCheapestHotel(String date1, String date2){
       long totalWeekDays = noOfWeekDays(date1,date2);
       long totalWeekEndDays = noOfWeekEnds(date1,date2) (date1,date2);
        HotelList.stream().map(r -> { r.setRate(totalWeekDays,totalWeekEndDays);return r.getRate(); }).collect(Collectors.toList());
        Hotel minimumRate = HotelList.stream().min(Comparator.comparing(Hotel::getWeekDayRates)).orElseThrow(NoSuchElementException::new);
        return minimumRate;
    }
    }

