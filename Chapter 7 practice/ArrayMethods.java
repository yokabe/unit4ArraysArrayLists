import java.util.Arrays;
public class ArrayMethods
{
    private int[] values;
    
    public ArrayMethods(int[] initialValues)
    {
        values = initialValues;
    }
    
    public void swapFirstAndLast()
    {
        int n = values[0];
        values[0] = values[values.length-1];
        values[values.length-1] = n;
    }
    
    public void shiftRight()
    {
        int n = values[values.length-1];
        for (int i = 1; i < values.length; i++)
        {
            values[i] = values[i-1];
        }
        values[0] = n; 
    }
    
    public void replaceEven()
    {
        for (int i = 0; i < values.length; i++)
        {
            if (values[i]%2 == 0)
            {
                values[i] = 0;
            }
        }
    }
    
    public void replaceEach()
    {
        for (int i = 0; i < values.length; i++)
        {
            if (i != 0 && i != values.length-1)
            {
                int right = values[i+1]; 
                int left = values[i-1];
                if (right > left)
                {
                    values[i] = right;
                }
                else
                {
                    values[i] = left;
                }
            }
        }
    }
    
    public void removeMiddle()
    {
        if (values.length%2 != 0)
        {
            int n = values.length;
            n = (n-1)/2;
            
        }
        else 
        {
        }
    }
    
    public void birngEvenToFront()
    {
        for (int i = values.length-1; i >= 0; i++)
        {
            if (values[i]%2 == 0)
            {
                
            }
        }
    }
}