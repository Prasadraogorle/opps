#include<iostream>
#include<math.h>
using namespace std;
class Basiccalci{
    public:
    double x;
    double y;
    double add(double x,double y)
    {
        return x+y;
    }
    double subtract(double x,double y)
    {
        return x-y;
    }
    double multiplication(double x,double y)
    {
        return x*y;
    }
    double divison(double x,double y)
    {
        return x/y;
    }
};
class Scientificcalci : public Basiccalci{
    public:
        double squareroot(double x)
        {
            return sqrt(x);
        }
        double powerof(double x,double y)
        {
            return pow(x,y);
        }

};
class Financialcalci : public Scientificcalci{
    public:
        double Simpleinterest(double x,double y,double z)
        {
            return (x*y*z)/100;
        }
        double compoundinterest(double p, double t,double r)
        {
            return p*pow(1+r/100,t)-p;
        }
};
int main()
{
    Financialcalci s1;
    double x,y;
    char c;
    cout << "Choice numbers with operations" << endl;
    cout<<"1.Addition"<<endl
    <<"2.Subtraction"<<endl
    <<"3.Multiplication"<<endl
    <<"4.Divison"<<endl
    <<"5.Square root of a number"<<endl
    <<"6.Power of a number"<<endl
    <<"7.Simple interest"<<endl
    <<"8.compound interst"<<endl;
    cout<<"Enter the choice you desired to perform :";
    cin>>c;
    cout<<"Enter the values: ";
    cin>>x>>y;
    
    switch(c)
    {
        case '1' :
                    cout<< x << " + "<< y << " = "<<s1.add(x,y)<<endl;
                    break;
        case '2' : cout <<x << " - "<< y <<" = "<<s1.subtract(x,y)<<endl;
                    break;
        case '3' :  cout<< x << " * "<< y << " = "<<s1.multiplication(x,y)<<endl;
                    break;
        case '4' :  cout<<x << " / "<< y << " = "<< s1.divison(x,y)<<endl;
                    break;
        case '5' :  cout<<"square root "<< x <<s1.squareroot(x)<<endl;
                    break;
        case '6' :  cout<< x << " power of "<< y << " is :"<<s1.powerof(x,y)<<endl;
                    break;           
        case '7' :  float z;
                    cin>>z; 
                    cout<<"Simple interest :"<<s1.Simpleinterest(x,y,z)<<endl;
                    break;
        case '8' :  float m;
                    cin>>m;
                    cout<<"Compound interest :"<<s1.compoundinterest(x,y,z)<<endl;
                    break;
        defalut : cout<<"Invalid choice is given"<<endl;
    }

}