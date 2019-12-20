#include<iostream>

using namespace std;


class list
{
	struct node{
		int data;
		node *next;
	};
	node *head,*tail, *head1, *tail1;

public:
	list()
	{
		head=tail=NULL;
		head1=tail1=NULL;
	}
	void addNew()
	{
		char c;
		do
		{
			node *nn=new node;
			cout<<"Enter data >> ";
			cin>>nn->data;
			nn->next=NULL;
			if(head==NULL)
			{
				head=tail=nn;
			}
			else
			{
				tail->next=nn;
				tail=nn;

			}
			cout<<"\nDo you want to enter more nodes(y/n) >> ";
			cin>>c;

		}while(c!='n');

	}
	void display()
	{
		node *temp=head;
		while(temp!=NULL)
		{
			cout<<temp->data<<" ";
			temp=temp->next;
		}

	}
	void insertafter()
	{
		int target;
		cout<<"Select node value >> ";
				cin>>target;
		node *temp=head;
		while(temp->data!=target)
			temp=temp->next;
		node *nn=new node;
		nn->next=temp->next;
		cout<<"Enter data >> ";
		cin>>nn->data;
		temp->next=nn;

	}
	void del()
	{
		int target;
		cout<<"Select node value >> ";
				cin>>target;
		node *temp=head;
		if(head->data==target)
		{
			node *dn=head;
			head=head->next;
			delete dn;
			return;
		}
		while(temp->next->data!=target)
			temp=temp->next;
		node *dn=temp->next;
		temp->next=dn->next;
		delete dn;

	}

	

};


int main()
{
	list l1, l2, un;
	l1.addNew();
	cout<<"\nINSERT\n";
	l1.insertafter();
	cout<<"\nDELETE\n";
	l1.del();
	cout<<"\nDisplay\n";
	l1.display();
	l2addNew();
	cout<<"\nINSERT\n";
	l2.insertafter();
	cout<<"\nDELETE\n";
	l2.del();
	cout<<"\nDisplay\n";
	l2.display();
}







