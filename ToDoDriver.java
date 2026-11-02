import java.util.Scanner;

public class ToDoDriver

{
    public static void main(String[] args)
    {
        ToDo List = new ToDo();
        int choice;
        String newItem;
        choice = 0;

        while(choice != 5)
        {
            Scanner choices = new Scanner(System.in);
            System.out.println("What would you like to do? ");
            System.out.println("1. Enter a new To-Do item ");
            System.out.println("2. Check off To-Do item ");
            System.out.println("3. See next To-Do item ");
            System.out.println("4. See how many items remain ");
            System.out.println("5. Exit ");
            choice = choices.nextInt();

            switch(choice)
            {
                case 1: 
                System.out.println("Enter To-Do item: ");
                choices.nextLine();
                newItem = choices.nextLine();
                List.push(newItem);
                break;

                //TODO rest of cases

            }
        }
    }
}