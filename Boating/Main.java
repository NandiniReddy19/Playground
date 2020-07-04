#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int w,b,s;
  cin>>w>>b>>s;
  b=b*75;
  s=s*30;
  if(b+s<=w)
    cout<<"Boat is stable";
  else
    cout<<"Boat will sink";
}