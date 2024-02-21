#include<iostream>
using namespace std;
void boxArea(float,float,float);
void boxArea(float length,float width,float height)
{
    cout<<"The area of given box is : "<< 2*(length*width+width*height+height*length)<<endl;
}
