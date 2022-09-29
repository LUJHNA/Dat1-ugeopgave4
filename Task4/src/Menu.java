import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ArrayList<String> options;


    public Menu(ArrayList<String> options) {
        this.options = options;

    }

    public String showMenu() {
        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();
        String msg = "Type a number to choose";
        System.out.println(msg);
        for (String s : options) {
            System.out.println(s);
            String response = showMenu(); int convertedResponse = Integer.parseInt(response); Main.doAction(convertedResponse);
        }
        return choice;
    }
}

