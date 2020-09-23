package wira.calculator;
import org.junit.Test;

import wira.calculator.JUnit_Kalkulator;

import static org.junit.Assert.*;
import org.junit.Before;
/**
*
* @author Wira
*/
public class JUnit_Kalkulator_Testing_Automation {
 
   JUnit_Kalkulator kalkulator;
   
   @Before
   public void init(){
       kalkulator=new JUnit_Kalkulator();
   }

   @Test
   public void testKali() {
       assertEquals(20, kalkulator.kali(10, 2),0);
   }

   @Test
   public void testBagi() {
       assertEquals(5, kalkulator.bagi(10, 2),0);
   }

   @Test
   public void testTambah() {
       assertEquals(12, kalkulator.tambah(10, 2),0);
   }

   @Test
   public void testKurang() {
       assertEquals(8, kalkulator.kurang(10, 2),0);
   }
}