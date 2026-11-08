public class ToDo
{
    private int itemCount;
    private String items[];
    private int top;

    public ToDo()
    {
        this.items = new String[10];
        this.itemCount = 0;
        this.top = -1;
    }

    public boolean push(String newItem)
    {
        if(itemCount < items.length)
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

    public void pop()
    {
        if(top > -1)
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

    public void size()
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

    
    public void peek()
    {
        System.out.println("Next To-Do is: " + items[top]);
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