
class stack {
    int top;
    int current;
    int arr[];
    stack(int n)
    {
        current =-1;
        top = n;
        arr = new int[n];
    }
    void push(int n)
    {
        if(current == top-1)
        {
            System.out.println("stack overflow");
        }
        else
        {
            current++;
            arr[current] = n;
        }
    }
    int pop(){
        if(current == -1)
        {
            System.out.println("stack under flow");
            return 0;
        }
        else
        {
            int nn= arr[current];
            current--;
            return nn;
        }
    }
    void show()
    {
        for(int i = top-1; i >=0;i--)
        {
            System.out.println(arr[i]);
        }
    }
}

public class Main
{
	public static void main(String[] args) {
	    stack s = new stack(5);
	    s.push(1);
	    s.push(2);
	    s.push(3);
	    s.push(4);
	    s.push(5);
	    s.push(6);
	    s.show();
	    
	}
}
