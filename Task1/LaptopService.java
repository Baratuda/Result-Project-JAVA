package Task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LaptopService {
   private static Scanner sc = new Scanner(System.in);
   private static String inputVariables(Scanner sc, String message) {
      System.out.print(message);
      return sc.nextLine();
   }


   private static Laptop createLaptop(){
         String name = inputVariables(sc,"Please input laptops name: ");
         String color= inputVariables(sc,"Please input laptops color: ");
         String operatingSystem= inputVariables(sc,"Please input laptops operation system: ");
         int volumeHd= Integer.parseInt(inputVariables(sc,"Please input laptops volume hd: "));
         int RAM= Integer.parseInt(inputVariables(sc,"Please input laptops RAM: "));
         return new Laptop(name,color,operatingSystem,volumeHd,RAM);
   }

   private static Map<String,List<Laptop>> createLaptopDataBase(){
      Map<String,List<Laptop>> ourLaptopMap = new HashMap<>();
      List<Laptop> arrayLaptops = new ArrayList<>();
      Laptop laptop;
      laptop = createLaptop();
      if(ourLaptopMap.get(laptop.getName())!=null)
         arrayLaptops = ourLaptopMap.get(laptop.getName());
      arrayLaptops.add(laptop);
      ourLaptopMap.put(laptop.getName(),arrayLaptops);
      return ourLaptopMap;
   }


   private static List<Laptop> showLaptops(Map<String,List<Laptop>> laptopsMap){ 
       List<Laptop> results = new ArrayList<>();
       String str = "Please select:\n1) Search by name;\n2) Search by color;\n3) Search by operation system;\n4) Search by volume HD;\n5) Search by volume RAM;\n ";
       String parametersNameForLookingAt = inputVariables(sc, str);
       String variable = "";

       if(parametersNameForLookingAt.equals("1")){
          variable = inputVariables(sc, "Please input laptop name:");
          if(laptopsMap.get(variable)!=null)
             return laptopsMap.get(variable);
          else System.out.println("Not found results( ");  
       }    

       else for (Map.Entry<String, List<Laptop>> entry : laptopsMap.entrySet()){ 
            if(parametersNameForLookingAt.equals("2")) variable = inputVariables(sc, "Please input color:");
            if(parametersNameForLookingAt.equals("3")) variable = inputVariables(sc, "Please input operation system:");
            if(parametersNameForLookingAt.equals("4")) variable = inputVariables(sc, "Please input hd volume:");
            if(parametersNameForLookingAt.equals("5")) variable = inputVariables(sc, "Please input RAM volume:");
            for (Laptop i : entry.getValue()){
               if(parametersNameForLookingAt.equals("2") && i.getColor().equals(variable))
                  results.addAll(entry.getValue());     
               if(parametersNameForLookingAt.equals("3") && i.getOperatingSystem().equals(variable))
                  results.addAll(entry.getValue());
               if(parametersNameForLookingAt.equals("4") && i.getVolumeHd()==Integer.parseInt(variable))
                  results.addAll(entry.getValue());
               if(parametersNameForLookingAt.equals("5") && i.getRAM()==Integer.parseInt(variable))
                  results.addAll(entry.getValue());
            }              
       }
       return results;               
   }

    public static void dispatcher(Map<String,List<Laptop>> laptopsDataBase){
      System.out.println("Hello User!");
      while(true){
         String input = LaptopService.inputVariables(sc, "1.Create laptop\n2.Show laptop\n3.Exit\n");
         if(input.equals("1")) laptopsDataBase.putAll(LaptopService.createLaptopDataBase());
         if(input.equals("2")) System.out.println(LaptopService.showLaptops(laptopsDataBase));
         if(input.equals("3")) break;
      }
      
   }
}
