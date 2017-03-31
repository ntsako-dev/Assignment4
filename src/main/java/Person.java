/**
 * Created by Kino on 2017-03-26.
 */
import org.junit.Test;

public class Person extends Address
{
    public Person()
    {}
    
    public Person(String name, String sname, int age)
    {
        this.name = name;
        this.sname = sname;
        this.age = age;
        
    
    }
    
    private String name, sname;
    private int age;

    @Test
   public void setName(String n)
   {
     name = n;
   }

    @Test
    public String getName()
    {
        return name;
    }

    @Test
    public void setSname(String sname)
    {
    this.sname = sname;
    }

    @Test
    public String getSname()
    {
        return sname;
    }

    @Test
    public void setAge(int age)
    {
    this.age = age;
    }

    @Test
    public int getAge()
    {
        return age;
    }
    
     public String toString()
    {
        return "Name : " + getName() + "\nSurname : " + getSname() + "\nAge : " + getAge() +"\n\n";

    }

}
