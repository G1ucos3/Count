package controller;
import java.util.Scanner;
import view.Menu;
import common.Algorithm;
import model.Element;
/**
 *
 * @author ASUS
 */
public class Counting extends Menu<String>{
    static String[] mChoice = {"Count letter", "Count character", "Exit"};
    protected Algorithm algorithm;
    protected String s;
    
    public Counting(Element element){
        super("Counting menu", mChoice);
        algorithm = new Algorithm();
        s = element.getS();
    }
    
    @Override
    public void execute(int n){
        switch(n){
            case 1:
                System.out.println(algorithm.countLetter(s));
                break;
            case 2:
                System.out.println(algorithm.countCharacter(s));
                break;
            case 3:
                System.out.println("Exit!");
                System.exit(0);
        }
    }
}
