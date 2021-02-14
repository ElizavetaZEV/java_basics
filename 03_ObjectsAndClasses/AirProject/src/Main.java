import com.skillbox.airport.Aircraft;
import com.skillbox.airport.Airport;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[]args){
        Airport airport = Airport.getInstance();
        airport.getAllAircrafts();
        System.out.println("Список самолетов: " + airport.getAllAircrafts() +  "." );

        airport.getAllAircrafts().size();

        //создание объекта ArrayList <Integer>
     ArrayList<List<Aircraft>> list = new ArrayList<>();
      list.add(airport.getAllAircrafts());

      System.out.println("Количество самолетов: " +  airport.getAllAircrafts().size());
         }


}
