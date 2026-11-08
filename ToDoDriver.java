import java.util.Scanner;

public class ToDoDriver

{
    public static void main(String[] args)
    {
        ToDo List = new ToDo();
        int choice;
        String newItem;
        choice = 0;

        while(choice != 6)
        {
            Scanner choices = new Scanner(System.in);
            System.out.println("What would you like to do? ");
            System.out.println("1. Enter a new To-Do item ");
            System.out.println("2. Check off To-Do item ");
            System.out.println("3. See next To-Do item ");
            System.out.println("4. See how many items remain ");
            System.out.println("5. Show you all tasks ");
            System.out.println("6. Exit ");
            choice = choices.nextInt();

            if (choice >= 1 && choice <= 6) 
            {
                    switch(choice)
                {
                    
                    case 1: 
                    System.out.println("Enter To-Do item: ");
                    choices.nextLine();
                    newItem = choices.nextLine();
                    List.push(newItem);
                    break;

                    case 2: 
                    System.out.println("Check off To-Do item: ");
                    List.pop();           
                    break;
                    
                    case 3: 
                    List.peek();           
                    break;

                    case 4: 
                    List.size();
                    break;
                    
                    case 5: 
                    System.out.println(List.toString());
                    break;

                    case 6: 
                    System.out.println("Goodbye!");
                    break;

                }
            }else System.out.println("Write a correct number");
            
        }
    }
}