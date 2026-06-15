import java.util.Scanner;

public class SphereCalculator 
{
    public static void main(String[] args)
    {
        Scanner kbd = new Scanner(System.in);
        double r;
        double volume;
        double surfaceArea;

        System.out.print("Enter the sphere's radius: ");
        r = kbd.nextDouble();

        volume = (4.0 / 3.0) * Math.PI * Math.pow(r,3);
        surfaceArea = 4 * Math.PI * Math.pow(r,2);
        
        System.out.printf("Volume: %.4f\n", volume);
        System.out.printf("Surface area: %.4f\n", surfaceArea);

        kbd.close();
    }
}
