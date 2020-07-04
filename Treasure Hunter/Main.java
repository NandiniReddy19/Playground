#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float coins,ben,black;
  cin>>coins>>ben>>black;
  int bens,blacks,pirates,rem;
  bens=coins*(ben/100);
  rem=coins-bens;
  blacks=rem*(black/100);
  rem=rem-blacks;
  pirates=rem/3;
  cout<<bens<<"\n"<<blacks<<"\n"<<pirates;
}