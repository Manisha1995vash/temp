package temp;
class node
{ int data;
node left,right;
node(int a)
{ this.data=a;
 this.left=null;
 this.right=null;
}
}

public class binarytree
{  node root;
binarytree(int key)
{ root= new node(key);
}
binarytree()
{root=null;}
 
public void inorder(node n)
{ if(n==null)
	return;
  inorder(n.left);
  System.out.println(n.data);
  inorder(n.right);
}


	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		binarytree bt=new binarytree();
		bt.root=new node(1);
		bt.root.left=new node(3);
		bt.root.right=new node(4);
		bt.inorder(bt.root);

	}

}
