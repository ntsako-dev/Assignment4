/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ntsmbo
 */
import org.junit.Test;

public class RunMain 
{
  
            
    public static void main(String[]args)
    {
    
    //Encapsulation
    // incaps();
      
    //inheritance
    //Inhert();
      
    //alternative solution to inheritance 
    // altIn();

    }
    
    //Inheritance
     @Test
     public static void Inhert()
     {
        
     String name = "Ntsako", sname = "Mboweni", streetname = "Barrack", suburb = "Cape Town";
     int unit = 20, age = 29;
        
     Person p = new Person();
     
     p.setName(name);
     p.setSname(sname);
     p.setAge(age);
     //Address inheritance
     p.setUnitNumber(unit);
     p.setStreetName(streetname);
     p.setSuburbName(suburb);
     
    System.out.println(p.toString());
     
    
    }
    
    
     //Encapsulation
     @Test
      public static void incaps()
      {
            String name = "Ntsako", sname = "Mboweni", streetname = "Barrack", suburb = "Cape Town";
            int unit = 20, age = 29;
            Person p = new Person(name, sname, age);
            Address a = new Address(streetname, suburb, unit);

            System.out.println( p.toString() + a.toString());
          
      }
      
      //alternative solution to inheritance
      @Test
      public static void altIn()
      {
          
          String name = "Ntsako", sname = "Mboweni", streetname = "Barrack", suburb = "Cape Town";
            int unit = 20, age = 29;
            Person p = new Person(name, sname, age);
            Address a = new Address(streetname, suburb, unit);
            
            PersonDetail pd = new PersonDetail();
            pd.alterInhert(p, a);
      
      }
    
    
     
    
    
}
