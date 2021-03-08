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

    public Hotel findCheapestHotel(int countDays) {
        HotelList.stream().map(p -> {p.setRate(countDays); return p.getRate(); }).collect(Collectors.toList());
        Hotel cheapestRate =  HotelList.stream().min(Comparator.comparing(Hotel::getRate)).orElseThrow(NoSuchElementException::new);
        return cheapestRate;
    }
}
