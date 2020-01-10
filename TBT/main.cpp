#include <iostream>

using namespace std; 

struct node
{
	int data;
	bool isl,isr;   // true -- threaded
	node *left , *right;

};

class TBT
{
	node *dummy,*root;

	void BST_print_in(node *root)
	{

		if(root==dummy)
		{
			return;
		}
				print_node(root);

		BST_print_in(root->left);
		BST_print_in(root->right);

	}
	void print_node(node *n)
	{
		cout<<"\nData  : "<<n->data;
		cout<<"\n";
	}
public:
	TBT()
	{
		root=NULL;
		dummy->left=root;
		dummy->right=dummy;

	}
	void insert(int k)
	{
		if(root==NULL)
		{
			node *nn = new node;
			nn->data=k;
			nn->left=dummy;
			nn->right=dummy;
			nn->isr=nn->isl=true;
			root=nn;
			return;
		}
		else
		{
			node *temp=root;
			node *parent;
			do
			{
				if(k<temp->data)
				{
					parent=temp;
					temp=temp->left;
					continue;
				}
				if(k>temp->data)
				{
					parent=temp;
					temp=temp->right;
					continue;
				}
			}
			while(temp!=dummy);
			if(parent->isr==true && parent->isl==true)
			{
				node *nn = new node;
				nn->data=k;
				nn->left=parent->left;
				nn->right=parent->right;
				nn->isr=nn->isl=true;
				if(k>parent->data)
				{
					parent->right=nn;
					parent->isr=false;
				}
				else
				{
					parent->left=nn;
					parent->isl=false;
				}
			}
			if(parent->isr==true && parent->isl==false)
			{
					node *nn = new node;
					nn->data=k;
					nn->left=parent->left;
					nn->right=parent->right;
					nn->isr=nn->isl=true;
					parent->right=nn;
					parent->isr=false;
			}
			if(parent->isr==false && parent->isl==true)
			{
					node *nn = new node;
					nn->data=k;
					nn->left=parent->left;
					nn->right=parent->right;
					nn->isr=nn->isl=true;
					parent->left=nn;
					parent->isl=false;
			}
		}
	}
	void print()
	{
		BST_print_in(root);
		cout<<"\n";
	}
	

};

int main()
{
	TBT a;
	a.insert(10);
	a.insert(5);
	cout<<"Inserted\n";
	a.print();

}