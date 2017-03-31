/**
 * Created by Kino on 2017-03-26.
 * Author : Ntsako Mboweni
 * Institute : Cape Peninsula University of Technology
 * Student # 211230235
 */

import junit.*;
import org.junit.Test;

public class Address 
{
    private String streetname, suburb;
    private int unit;
    
    public Address()
    {}


    public Address(String streetName, String suburb, int unit)
    {
        this.streetname = streetName;
        this.suburb = suburb;
        this.unit = unit;
        
    }


    @Test
    public int getUnitNumber()
    {
        return unit;
    }

    @Test
    public void setUnitNumber(int unit)
    {
        this.unit = unit;
    }

    @Test
    public String getStreetName()
    {
        return streetname;
    }

    @Test
     public void setStreetName(String street)
    {
        this.streetname = street;
    }


    @Test
    public String getSuburbName()
    {
        return suburb;

    }

    @Test
    public void setSuburbName(String suburb)
    {
        this.suburb = suburb;

    }

    @Test
    public String toString()
    {
        
     return "\nUnit Number : " + getUnitNumber() + "\nStreet Name : " + getStreetName() + "\nSurburb : " + getSuburbName()+ "\n\n";

    }


}
