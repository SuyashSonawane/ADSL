#include <iostream>

using namespace std; 

struct node
{
	int data;
	bool isl,isr;   // true -- threaded
	node *left , *right;

};

class TBT{
	node *root , *dummy;

	node *TBT_insert(node *root,int data,node*parent)
	{
		if(root==NULL)
		{
			node *nn = new node;
			nn->data=data;
			nn->left=nn->right=parent;
			nn->isr=nn->isl=true;
			root = nn;
			return root;
		}
		if(root->data<parent->data)
		{
			parent->isl=false;
			parent->left = TBT_insert(root->)
		}

	}



public:
	TBT()
	{
		root=NULL;
		dummy = new node;
		dummy->isr=dummy->isl=false;
		dummy->left=root;
		dummy->right = NULL;

	}
	void insert()
	{
		cout<<"Enter data : ";
		cin>>data;
		node *nn = new node;
		nn->data=data;
		nn->left=nn->right=dummy;
		nn->isr=nn->isl=true;

		node *temp=root;
		
		while(1)
		{
			if(root==NULL)
			{
				root=nn;
				break;
			}
			else
				if(nn->data < temp->data)
				{
					if(temp->isl==false)
					{
						temp=temp->left;
						continue;
					}


				}
		}
	}

};



int main()
{

}

