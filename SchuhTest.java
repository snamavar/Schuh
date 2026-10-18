

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class SchuhTest
{
@Test   
public void test_printSchuh()
{
    Schuh adidas;
    Schuh nike;
    
    adidas= new Schuh("adidas de",43,true);
    nike= new Schuh("nike at",45,false);
    adidas.printSchuh();
    //adidas Schuh: 43 - Wasserdicht
    nike.printSchuh();
    //nike Schuh: 45 - nicht Wasserdicht
} 
@Test
public void test_wasserdicht_false()
{
    Schuh sniker;
    sniker=new Schuh("Sniker",41,false);
    assertEquals(false,sniker.getWasserdicht());
}
@Test
public void test_wasserdicht_true()
{
    Schuh adidas;
    adidas=new Schuh("adidas",70,true);
    assertEquals(true,adidas.getWasserdicht());
}
 @Test
 public void test_setMarke()
{
    Schuh nike;
    nike= new Schuh("nike",38,true);
    assertEquals("nike",nike.getMarke());
}
}