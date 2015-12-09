import java.util.Arrays;
import java.util.Scanner;

public class MagicSquares
{
    public static void main(String[] args)
    {
        int[][] numbers = new int[4][4];
        System.out.println("Input in 16 integers");
        Scanner scan = new Scanner(System.in);
        
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                System.out.print("int: ");
                numbers[i][j] = scan.nextInt();
            }
        }
        
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;
        int d1 = 0;
        int d2 = 0;

        
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                if (i == 0)
                {
                    r1 += numbers[i][j];
                }
                else if (i == 1)
                {
                    r2 += numbers[i][j];
                }
                else if (i == 2)
                {
                    r3 += numbers[i][j];
                }
                else
                {
                    r4 += numbers[i][j];
                }
            }
        }
        
        for (int j = 0; j < 4; j++)
        {
            for (int i = 0; i < 4; i++)
            {
                if (i == 0)
                {
                    c1 += numbers[i][j];
                }
                else if (i == 1)
                {
                    c2 += numbers[i][j];
                }
                else if (i == 2)
                {
                    c3 += numbers[i][j];
                }
                else
                {
                    c4 += numbers[i][j];
                }
            }
        }
        
        d1 = numbers[0][0]+numbers[1][1]+numbers[2][2]+numbers[3][3];
        d2 = numbers[0][3]+numbers[1][2]+numbers[2][1]+numbers[3][0];
        
        if (r1==r2&&r2==r3&&r3==r4&&r1==r4&&c1==c2&&c2==c3&&c3==c4&&r1==c1&&c1==d1&&c1==d2)
        {
            System.out.println("This array is a magic square");
        }
    }
}