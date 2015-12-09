import java.util.ArrayList;

public class TopCustomers
{
    private ArrayList<String> customer;
    
    private int price;
    
    private int count;
    
    public TopCustomers()
    {
        this.customer = new ArrayList<String>();
        this.price = 0;
        this.count = 0;
    }
    
    public void addSale(String customerName, double amount)
    {
        this.customer.add(customerName);
        
    }
    
    public static void main(String[] args)
    {
        
    }
}