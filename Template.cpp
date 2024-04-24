#include<iostream>
using namespace std;

template<typename MyType>
class Cal{
    public:
        MyType add(MyType a, MyType b){ return a+b;}
        MyType sub(MyType a, MyType b){ return a-b;}
        MyType mul(MyType a, MyType b){ return a*b;}
        MyType div(MyType a, MyType b){ return a/b;}
};

int main(){

    Cal <int> obj1;
    Cal <double> obj2;
    cout << obj1.add(5,6) << endl;
    cout << obj2.div(5.687,3.25) << endl;
}
