#include<iostream>
using namespace std;

class Cylinder {
public:
    float radius;
    float height;
    
    Cylinder() {
        radius = 1;
        height = 1;
    }

    Cylinder(float r, float h) {
        radius = r;
        height = h;
    }
};

class Volumecylinder : public Cylinder {
public:
    Volumecylinder(float radius, float height) : Cylinder(radius, height) {}

    void print(float radius, float height) {
        float pi = 3.14;
        cout << "The volume of cylinder is: " << pi * radius * radius * height;
    }
};

class TSAcylinder : public Cylinder {
public:
    TSAcylinder(float radius, float height) : Cylinder(radius, height) {}

    void print1(float radius, float height) {
        float pi = 3.14;
        cout << "The total surface area of cylinder is: " << 2 * pi * radius *(radius+height)<<endl;
    }
};
class LSAcylinder:public Cylinder{
public:
    LSAcylinder(float radius, float height) : Cylinder(radius, height) {}
    void print2(float radius,float height)
    {
        float pi=3.14;
        cout << "The lateral surface area of cylinder is: " <<2*pi*radius*height<<endl;
    }
    };

int main() {
    float r, h;
    Volumecylinder v1={r, h};
    TSAcylinder t1={r, h};
    LSAcylinder l1={r,h};
    cout << "Enter the height and radius of Cylinder : " ;
    cin >> r >> h;
    char c;
    cout<<"1.Volume of Cylinder"<<endl
          <<  "2.TSA of cylinder"<<endl
          <<"3.LSA of cylinder"<<endl;
    cout << "Enter the choice: ";

    cin>>c;
    switch(c)
    {
        case '1': 
            v1.print(r, h);
            break;
        case '2':
            t1.print1(r, h);
            break;
        case '3':
            l1.print2(r,h);    
        default:
            cout << "invalid choice" << endl;    
            break;
                
    }
    return 0;
}