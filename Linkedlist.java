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
