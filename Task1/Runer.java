package Task1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Runer {
   public static void main(String[] args) {
      Map<String,List<Laptop>> laptopsDataBase = new HashMap<>();
      LaptopService.dispatcher(laptopsDataBase); 
   }
}
