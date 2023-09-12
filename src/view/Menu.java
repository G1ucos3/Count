package view;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public abstract class Menu<T> {
    protected String title;
    protected ArrayList<T> mchoice;

    public Menu(){
        mchoice = new ArrayList<>();
    }

    public Menu(String ti, String[] mc){
        title = ti;
        mchoice = new ArrayList<>();
        for (String s : mc) {
            mchoice.add((T) s);
        }
    }

    public void display(){
        System.out.println(title);
        System.out.println("-----------------------------");
        for(int i = 0; i < mchoice.size(); i++){
            System.out.println((i + 1) + "." + mchoice.get(i));
        }
        System.out.println("-----------------------------");
    }

    public int getChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        return choice;
    }

    public abstract void execute(int choice);

    public void run() {
        int choice;
        do {
            display();
            choice = getChoice();
            execute(choice);
        } while (choice > 0 && choice < mchoice.size());

    }
}

