class bst{
    bst left;
    bst right;
    int data;
    bst()
    {
        left = null;
        right = null;
    }
    bst(int n)
    {
        left = null;
        right = null;
        data=n;
    }
    bst addnode(bst r , int val)
    {
        if(r == null)
        {
            return new bst(val);
        }
        if(r.data > val)
        {
            r.left = addnode(r.left , val);
        }
        else{
            r.right = addnode(r.right , val);
        }
        return r;
    }
    void print(bst r)
    {
        if(r == null)
        {
            return;
        } 
        System.out.print(r.data+": ");
        if(r.left != null)
        {
            System.out.print("L "+r.left.data);
        }
        if(r.right != null)
        {
            System.out.print("R "+r.right.data);
        }
        System.out.println();
        print(r.left);
        print(r.right);
    }
}


class Main{
    public static void main(String[] argss)
    {
        bst root = new bst(5);
        root.addnode(root, 4);
        root.addnode(root, 6);
        root.print(root);


    }
}