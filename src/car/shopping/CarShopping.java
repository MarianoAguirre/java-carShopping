/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */





//Mariano Aguirre
//Period 2




package car.shopping;

// Import Scanner Class
import java.util.Scanner;

public class CarShopping
{
    private static Scanner kb = new Scanner(System.in);
    
    // Create static Scanner Object call it kb

   public static void main(String[] args)
   {
      int totalCost = 0;
      totalCost += base();
      totalCost += automaticWindows();
      totalCost += remoteKeylessEntry();
      totalCost += onStarSystem();
      totalCost += antiLockBrakes();
      totalCost += adjustablePedals();
      totalCost += sunRoof();        
      totalCost += heatedSeats();
      totalCost += navigationSystem();
      
      
      totalCost += carWifi();
      totalCost += nitroBoost();
      totalCost += bulletProofExterior();
              
      //TODO: call methods that you write for each feature
      
      
       System.out.println(totalCost);
      //TODO: print the total cost of the vehicle
   }
   
   public static int base()
   {
      System.out.println("Our inventory:");
      System.out.println("Model 1 - $15,000");
      System.out.println("Model 2 - $24,000");
      System.out.println("Model 3 - $40,000");
       System.out.println("Which base model did the customer choose?"
               + "(enter full model name ex. Model 1): ");
      String model = kb.nextLine();
      if(model.equalsIgnoreCase("Model 1")){
         return 15000;
      //...
   }
   else if(model.equalsIgnoreCase("Model 2")){
       return 24000;
   }
   else if(model.equalsIgnoreCase("Model 3")){
       return 40000;
   }
   else{
       return 0;
   }
   }
    /**
     *
     * @return
     */
    public static int automaticWindows()
   {
      System.out.print("Automatic Windows for $500? (y/n) > ");
      String window = kb.nextLine();
      
      if(window.equalsIgnoreCase("y")){
          return 500;
      }
      else{
          return 0;
      }
      //...
   }
    public static int remoteKeylessEntry()
   {
      System.out.print("Remote keyless entry for $1000? (y/n) > ");
      String remote = kb.nextLine();
      
      if(remote.equalsIgnoreCase("y")){
          return 1000;
      }
      else{
          return 0;
      }
      //...
   }
    
    
    public static int onStarSystem()
   {
      System.out.print("OnStar System for $1000? (y/n) > ");
      String star = kb.nextLine();
      
      if(star.equalsIgnoreCase("y")){
          return 1000;
      }
      else{
          return 0;
      }
      //...
   }
    
    
    public static int antiLockBrakes()
   {
      System.out.print("Anti-Lock Brakes for $500? (y/n) > ");
      String abs = kb.nextLine();
      
      if(abs.equalsIgnoreCase("y")){
          return 500;
      }
      else{
          return 0;
      }
      //...
   }
    
    public static int adjustablePedals()
   {
      System.out.print("Adjustable Pedals for $1000? (y/n) > ");
      String aps = kb.nextLine();
      
      if(aps.equalsIgnoreCase("y")){
          return 1000;
      }
      else{
          return 0;
      }
      //...
   }
    
    public static int sunRoof()
   {
      System.out.print("Sunroof for $800? (y/n) > ");
      String sunroof = kb.nextLine();
      
      if(sunroof.equalsIgnoreCase("y")){
          return 800;
      }
      else{
          return 0;
      }
      //...
   }
    
    public static int heatedSeats()
   {
      System.out.print("Heated Seats for $1500? (y/n) > ");
      String hotseat = kb.nextLine();
      
      if(hotseat.equalsIgnoreCase("y")){
          return 1500;
      }
      else{
          return 0;
      }
      //...
   }
    
    public static int navigationSystem()
   {
      System.out.print("GPS Navigation System for $750? (y/n) > ");
      String gps = kb.nextLine();
      
      if(gps.equalsIgnoreCase("y")){
          return 750;
      }
      else{
          return 0;
      }
      //...
   }
    
    public static int carWifi()
   {
      System.out.print("Car Wifi for $750? (y/n) > ");
      String wifi = kb.nextLine();
      
      if(wifi.equalsIgnoreCase("y")){
          return 750;
      }
      else{
          return 0;
      }
      //...
   }
    
    
    public static int nitroBoost()
   {
      System.out.print("Nitro Boost for $2500? (y/n) > ");
      String nb = kb.nextLine();
      
      if(nb.equalsIgnoreCase("y")){
          return 2500;
      }
      else{
          return 0;
      }
      //...
   }
    
    
    public static int bulletProofExterior()
   {
      System.out.print("Bullet Proof Exterior for $5000? (y/n) > ");
      String bpe = kb.nextLine();
      
      if(bpe.equalsIgnoreCase("y")){
          return 5000;
      }
      else{
          return 0;
      }
      //...
   }
    
    
}
