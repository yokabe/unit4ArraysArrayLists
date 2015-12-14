

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
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   y   description of parameter y
     * @return  description of the return value
     */
    public void testMonsterLocation()
    {
        Radar radar = new Radar(100, 100);
        radar.setMonsterLocation(0,0);
        int n = 0;
        while (n < 100)
        {
            radar.scan();
            n++;
        }
        
        int largest = 0;
        int a = 0;
        int b = 0;
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
        
    }

}
