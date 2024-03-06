#include<iostream>
using namespace std ;
class Area{
    public:
        float length;
        float breadth;
    float rArea(float l,float b)
    {
        length=l;
        breadth=b;
        return l*b;
    }
};
class Perimeter{

        public:
            float length;
            float breadth;
            float rperi(float l,float b)
            {
                length=l;
                breadth=b;
                return 2*(l+b);
            }
};
class Rectangle:public Area,public Perimeter{
    public:
    void display(){
        cout << "The area of rectangle is: " ;
    }
    void display1(){
        cout << "The perimeter of rectangle is :" ;
    }

};
int main()
{
    Rectangle r1;
    float length,breadth;
    cout << "Enter the values of length and breadth: ";
    cin>>length>>breadth;
    r1.display();
    cout<<r1.rArea(length,breadth)<<endl;
    r1.display1();
    cout<<r1.rperi(length,breadth)<<endl;
}