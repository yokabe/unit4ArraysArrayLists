

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class RadarTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RadarTest
{
    

    /**
     * Default constructor for objects of class RadarTest
     */
    public RadarTest()
    {
        // initialise instance variables
        
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void s()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    /**
     * Tests if the radar works
     */
    public void testMonsterLocation()
    {
        //First test
        Radar radar = new Radar(100, 100);
        radar.setMonsterLocation(0,0);
        int n = 0;
        //Scans radar class a lot of times
        while (n < 100)
        {
            radar.scan();
            n++;
        }
        
        int largest = 0;
        int a = 0;
        int b = 0;
        //Finds largest value in radar and sets the locations
        for (int i = 0; i < radar.getNumRows(); i ++)
        {
            for (int j = 0; j < radar.getNumCols(); j++)
            {
                if (radar.getAccumulatedDetection(i, j) > largest)
                {
                    largest = radar.getAccumulatedDetection(i, j);
                    a = i;
                    b = j;
                }
            }
        }
        
        assertEquals(a, 0);
        assertEquals(b, 0);
       
        
    }

    @Test
    /**
     * Tests monster location second time
     */
    public void testMonsterLocation1()
    {
        //Second test
        Radar radar1 = new Radar(100, 100);
        radar1.setMonsterLocation(55,60);
        int n1 = 0;
        //Scans radar class a lot of times
        while (n1 < 100)
        {
            radar1.scan();
            n1++;
        }
        
        int largest1 = 0;
        int a1 = 0;
        int b1 = 0;
         //Finds largest value in radar and sets the locations
        for (int i = 0; i < radar1.getNumRows(); i ++)
        {
            for (int j = 0; j < radar1.getNumCols(); j++)
            {
                if (radar1.getAccumulatedDetection(i, j) > largest1)
                {
                    largest1 = radar1.getAccumulatedDetection(i, j);
                    a1 = i;
                    b1 = j;
                }
            }
        }
        
        assertEquals(a1, 55);
        assertEquals(b1, 60);
    }

}
