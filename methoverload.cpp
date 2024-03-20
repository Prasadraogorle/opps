#include<iostream>
using namespace std;

class Cal{
    public:
        float add(float a,float b){
            return a+b;
        }
        float add(float a,float b,float c){
            return a+b+c;
        }
};

 int main(){

    Cal obj;
    float a=1;
    float b=2;
    float c=3;

    cout << a << " + " << b << " = " << obj.add(a,b) << endl;
    cout << a << " + " << b << " + " << c << " = " << obj.add(a,b,c) << endl;

 }
