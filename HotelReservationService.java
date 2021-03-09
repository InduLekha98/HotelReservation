package com.hotel;

<<<<<<< HEAD
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
=======
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.function.Predicate;
>>>>>>> UC5
import java.util.stream.Collectors;


public class HotelReservationService {
<<<<<<< HEAD
    List<Hotel> HotelList = new ArrayList<>();
=======
    public static Scanner sc = new Scanner(System.in);
    private ArrayList<Hotel> hotelList = new ArrayList<Hotel>();
    static long totalDays, totalWeekDays, totalWeekEndDays;
>>>>>>> UC5

    //Adding hotel.
    public void addHotel(Hotel hotel) {
        HotelList.add(hotel);
        System.out.println(HotelList);

<<<<<<< HEAD
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

=======
    public void getHotelDetails() {
        Hotel hotel1 = new Hotel("LakeWood", 110, 90, 3);
        Hotel hotel2 = new Hotel("BridgeWood", 150, 50, 4);
        Hotel hotel3 = new Hotel("RidgeWood", 220, 150, 5);
        hotelList.add(hotel1);
        hotelList.add(hotel2);
        hotelList.add(hotel3);
    }

    public ArrayList<Hotel> getHotelList() {
        return hotelList;
    }

    public void setHotelList(ArrayList<Hotel> hotelList) {
        this.hotelList = hotelList;
    }

    //To count number of days from the given range of date.
    public long noOfWeekDays(String date1, String date2) {
        LocalDate startDate = LocalDate.parse(date1);
        LocalDate endDate = LocalDate.parse(date2);
        DayOfWeek start = startDate.getDayOfWeek();
        DayOfWeek end = endDate.getDayOfWeek();
        totalDays = ChronoUnit.DAYS.between(startDate, endDate);
        totalDays = totalDays + 1;
        totalWeekEndDays = getTotalWeekEndDays(startDate, endDate);
        totalWeekDays = totalDays - totalWeekEndDays;
        System.out.println(totalWeekDays);
        return totalWeekDays;
    }

    public long noOfWeekEnds(String date1, String date2) {
        LocalDate startDate = LocalDate.parse(date1);
        LocalDate endDate = LocalDate.parse(date2);
        long weekEndDays = 0;
        LocalDate next = startDate.minusDays(1);
        //iterate from start date to end date
        while ((next = next.plusDays(1)).isBefore(endDate.plusDays(1))) {
            if (next.getDayOfWeek().toString().equals("SATURDAY") || next.getDayOfWeek().toString().equals("SUNDAY")) {
                totalWeekEndDays++;
            }
        }
        return (int) totalWeekEndDays;
//        totalDays = ChronoUnit.DAYS.between(startDate, endDate);
//        totalDays = totalDays + 1;
//        totalWeekEndDays = getTotalWeekEndDays(startDate, endDate);
//        totalWeekDays = totalDays - totalWeekEndDays;
//        System.out.println(totalWeekDays);
//        return totalWeekDays;
    }

    public int getTotalWeekEndDays(LocalDate start, LocalDate end) {
        long weekEndDays = 0;
        LocalDate next = start.minusDays(1);
        //iterate from start date to end date
        long totalWeekEndDays = 0;
        while ((next = next.plusDays(1)).isBefore(end.plusDays(1))) {
            if (next.getDayOfWeek().toString().equals("SATURDAY") || next.getDayOfWeek().toString().equals("SUNDAY")) {
                totalWeekEndDays++;
            }
        }
        return (int) totalWeekEndDays;
    }

    //To get the cheapest hotel.
    public Hotel getCheapestHotel(String date1, String date2) {
        totalWeekDays = noOfWeekDays(date1, date2);
        totalWeekEndDays = noOfWeekEnds(date1, date2);
        hotelList.stream().map(r -> {
            r.setRate(totalWeekDays, totalWeekEndDays);
            return r.getRate();
        }).collect(Collectors.toList());
        Hotel minimumRate = hotelList.stream().min(Comparator.comparing(Hotel::getWeekDayRates)).orElseThrow(NoSuchElementException::new);
        return minimumRate;
    }
}
>>>>>>> UC5
