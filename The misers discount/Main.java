#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float a,b,c;
  cin>>a>>b>>c;
  float total,discount;
  total=a+b;
  discount=total*(c/100);
  cout<<total<<"\n"<<total-discount<<"\n"<<discount;
}