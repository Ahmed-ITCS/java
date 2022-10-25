
class queuee{
    int front;
    int back;
    int size;
    int arr[];
    queuee(int n)
    {
        size = n;
        front = -1;
        back  = -1;
        arr = new int[n];
    }
    void enqueue(int n)
    {
        if(back == size -1)
        {
            System.out.println("queue over flow");
        }
        else
        {
            back++;
            arr[back] = n;
        }
    }
    int dequeue()
    {
        if(front !=size-1)
        {
            front++;
            int n = arr[front];
            arr[front] = 0;
            return n; 
        }        
        else
        {
            System.out.println("queue empty");
            return 0;
        }

    }
    void show()
    {
        for(int i = 0; i<size;i++)
        {
            System.out.print(arr[i]+"  ");
            
        }
        System.out.print("\n");
    }
}

class main{
    public static void main(String[] args) {
        queuee q = new queuee(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        q.show();
        q.dequeue();
        q.dequeue();
        q.show();
    }
}