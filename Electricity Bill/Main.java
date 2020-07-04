#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int num,cost;
  cin>>num;
  if(num<=200)
  {
    cost=num*0.5;
    cout<<"Rs."<<cost;
  }
  else if(num<=400)
  {
    cost=num*0.65;
    cout<<"Rs."<<cost+100;
  }
  else if(num<=600)
  {
    cost=num*0.80;
    cout<<"Rs."<<cost+200;
  }
  else
  {
    cost=num*1.25;
    cout<<"Rs."<<cost+425;
  }
}