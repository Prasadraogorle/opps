#include<iostream>
using namespace std;
class Shape{
    public:
    virtual void area()=0;
};
class Circle : public Shape{
    public:
    void area(){
        cout<<"Area of circle"<<endl;
    }
};
class Rectangle : public Shape{
    public:
    void area(){
        cout<<"Area of rectangle"<<endl;
    }
};
int main(){
    Rectangle x;
    x.area();
    Circle y;
    y.area();
}
