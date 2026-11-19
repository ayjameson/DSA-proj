public class ToDo
{
    private int itemCount;
    private String items[];
    private int top;

    public ToDo()                           //ToDo List object constructor that contains an array
    {                                       //as a stack, the size/count, and the top value.
        this.items = new String[10];        //this stack is the basis of our project as an 
        this.itemCount = 0;                 //implementation of a data structure.
        this.top = -1;
    }

    public boolean push(String newItem)     //push method takes a string parameter and adds it
    {                                       //to the stack only if there's space
        if(itemCount < items.length)        //this line checks for space in the stack
        {
            items[itemCount] = newItem;
            itemCount++;
            top++;
            return true;
        }
        else
        {
            System.out.println("To-Do list is full!!");
            return false;
        }
    }

    public void pop()                       //pop method outputs the item on the top of the stack
    {                                       //and removes it from the stack.
        if(top > -1)                        //this line checks if stack is not empty
        {
            String item = items[top];
            top--;
            itemCount--;
            System.out.println("Checked off: " + item);
        }
        else 
        {
            System.out.println("There are no items in the To-Do list ");
        }
    }

    public void size()                      //size method simply returns amount of items in stack
    {
        if(itemCount > 0)
        {
            System.out.println("Number of items in list: " + itemCount);
        }
        else
        {
            System.out.println("To-Do list is empty");
        }
    }

    
    public void peek()                      //peek method outputs the top of the stack but does 
    {                                       //not remove the item from the stack
        if(top > -1){
        System.out.println("Next To-Do is: " + items[top]);
        }
        else  System.out.println("To-Do list is empty");
    }

    public String toString()
    {

        String res = "";
    
        for(int i = 0; i < itemCount; i++)
        {
            res += (i + 1) + ":" + items[i] + "\n";
        }

        return res;

    }
}