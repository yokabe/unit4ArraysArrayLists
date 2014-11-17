public class PartiallyFilledArray
{
    private int[] values;
    private int currentSize;

    public PartiallyFilledArray()
    {
        this.values = new int[10];
        this.currentSize = 0;
    }
    
    public String toString()
    {
        String str = "[ ";
        
        for( int i = 0; i < this.currentSize; i++ )
        {
            if( i > 0 )
            {
                str += ", ";
            }
            
            str += this.values[i];
        }
        
        str += " ]";
        return str;
    }
    
    public void fillNElementsRandomly( int numberOfElements, int maxValue )
    {
        for( int i = 0; i < numberOfElements; i++ )
        {
            this.values[i] = (int)(Math.random() * maxValue);
            this.currentSize++;
        }
    }
    
    public void removeElementAtIndex( int index )
    {
        this.values[index] = this.values[this.currentSize - 1];
        this.currentSize--;
    }

}
