import java.io.IOException;
import java.util.Scanner;

import factories.AbstractFactory;
import factories.BlackFactory;
import factories.WhiteFactory;

public class Client 
{
    private static void createFactory(AbstractFactory factory){
        System.out.print("Creating circle: ");
        factory.createCircle();
        System.out.print("Creating triangle: ");
        factory.createTriangle();
    }
    public static void main( String[] args ) throws IOException
    {
        char ch;
        do {
            System.out.println("1) Create white factory");
            System.out.println("2) Create black factory");
            System.out.println("0) Exit app");
            System.out.print("Enter number (1,2,0): ");
            Scanner s = new Scanner(System.in);

            ch = s.nextLine().charAt(0);
            switch (ch) {
                case '1':
                    createFactory(new WhiteFactory());
                    break;
                case '2':
                    createFactory(new BlackFactory());
                    break;
                case '0':
                    break;
                default:
                    System.out.println("Wrong option");
            }
        } while (ch != '0');
    }
}
