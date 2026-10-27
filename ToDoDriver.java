import java.util.Scanner;

public class ToDoDriver

{
    public static void main(String[] args)
    {
        ToDo[] ToDo = new ToDo[10];
        int choice;
        String newItem;

        Scanner choicesScanner = new Scanner(System.in);
        System.out.println("What would you like to do? ");
        System.out.println("1. Enter a new To-Do item ");
        System.out.println("2. Check off To-Do item ");
        System.out.println("3. See next To-Do item ");
        System.out.println("4. See how many items remain ");
        System.out.println("5. Exit ");
        choice = choicesScanner.nextInt();

        switch(choice)
        {
            Scanner caseScanner = new Scanner(System.in); 
            case 1: 
            System.out.println("Enter To-Do item: ");
            newItem = caseScanner.nextLine();
            ToDo.addItem(newItem);

        }

    }
}