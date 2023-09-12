
import controller.Counting;
import java.util.Scanner;
import model.Element;



/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your content: ");
        Scanner sc = new Scanner(System.in);
        Element element = new Element();
        element.setS(sc.nextLine());
        new Counting(element).run();
    }
}
