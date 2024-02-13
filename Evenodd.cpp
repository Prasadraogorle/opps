#include<iostream>
using namespace std;

void Evenodd(int);

int main()
{
    int num1;
    cout<<"Enter the number"<<endl;
    cin>>num1;
    Evenodd(num1);
}
void Evenodd(int n)
{
    if(n%2==0)
    {
        cout<<n<<" is even number"<<endl;
    }
    else
    {
        cout<<n<<" is odd number"<<endl;
    }
}
