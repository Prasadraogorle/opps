#include<iostream>
#include"boxArea.h"
#include"boxVolume.h"
int main()
{
    float a,b,c;
    cout<<"Enter the dimensions"<<endl;
    cin>>a>>b>>c;
    boxArea(a,b,c);
    boxVolume(a,b,c)
}
