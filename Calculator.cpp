#include<iostream>
using namespace std;
int main()
{
    float num1,num2;
    char choice;
    cout<<"Enter the two numbers : ";
    cin>>num1>>num2;
    cout<<"Enter 1 for performing addition"<<endl<<"Enter 2 for performing Subtraction "<<endl<<"Enter 3 for performing Multiplication"<<endl<<"Enter 4 for performing Divison"<<endl;
    cout<<"Enter the choice you desired : ";
    cin>>choice;
    switch(choice)
    {
        case '1': cout<<num1 << " + " << num2  << " = " <<num1+num2<<endl;
        break;
        case '2':cout<<num1 << " - " << num2  << " = " <<num1-num2<<endl;
        break;
        case '3':cout<<num1 << " * " << num2  << " = " <<num1*num2<<endl;
        break;
        case '4':cout<<num1 << " / " << num2  << " = " <<num1/num2<<endl;
        break;
        default:cout<<"you have entered invalid choice"<<endl;
        break;

    }
}