package Task1;



public class Laptop{
   private String name;
   private String color; 
   private String operatingSystem;
   private int volumeHd;
   private int RAM;

   public Laptop(String name, String color, String operatingSystem, int volumeHd, int RAM) {
      this.name = name;
      this.color = color;
      this.operatingSystem = operatingSystem;
      this.volumeHd = volumeHd;
      this.RAM = RAM;
   }
   

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getColor() {
      return this.color;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public String getOperatingSystem() {
      return this.operatingSystem;
   }

   public void setOperatingSystem(String operatingSystem) {
      this.operatingSystem = operatingSystem;
   }

   public int getVolumeHd() {
      return this.volumeHd;
   }

   public void setVolumeHd(int volumeHd) {
      this.volumeHd = volumeHd;
   }

   public int getRAM() {
      return this.RAM;
   }

   public void setRAM(int RAM) {
      this.RAM = RAM;
   }

  public String toString() { 
    return "Name: '" + this.name + "', Color: '" + this.color + "', Operating system: '" + this.operatingSystem + "volume Hd: '" + this.volumeHd +"RAM: '" + this.RAM+"'";
} 
   
}