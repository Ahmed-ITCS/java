class node{
    int data;
    node next;
    node()
    {
        data=0;
        next = null;
    }
    node(int data)
    {
    this.data=data;
    next = null;
    }
}
class LL{
    node head;
    LL()
    {
        head = null;
    }
    LL(node n)
    {
        head = n;
    }
    
    void prepend(node n)
    {
        if(head==null)
        {
            head = n;
        }
        else{
        n.next = head;
        head = n;
        }
    }
    void append(node n)
    {
        node nn =head;
        while(head.next != null)
        {
            head = head.next;
        }
        head.next=n;
        head = nn;
    }
    void insert(node pn, node n)
    {
        n.next = pn.next;
        pn.next = n;


    }    
    void show()
    {
        node nn = head;
        while(head!=null)
        if(head.next !=null)
        {
            System.out.print(head.data+"-->");
            head = head.next;
        }
       else{
            System.out.println(head.data+"----|");
            head = head.next;
        }
        head = nn;
    }
    void delete(node n)
    {
        node nn = head;
        while(head.next !=n)
        {
            head = head.next;
        }
        head.next = n.next;
        head = nn;
    }

}


class stack{
    node head;
    stack()
    {
      head = null;
    }
    void push(int n)
    {
        node  no = new node(n);
        if (head == null)
        {
            head = no;
        }
        else{
            head.next = no;
        }
    }
    int pop()
    {
        node nn = head;
        node prev = null;
        while(head.next == null)
        {   prev = head;
            head = head.next;
        }
        prev.next = null;
        int returnn = head.data;
        head = nn;
        return returnn;
    }
    void show()
    {
        node nn = head;
        while(head.next == null)
        {
            System.out.print(head.data);
            head = head.next;
        }
        head = nn;
    }
}

class stackusingLL {
    public static void main(String[] args)
    {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.show();
        s.pop();
        s.show();
    } 
    
}
