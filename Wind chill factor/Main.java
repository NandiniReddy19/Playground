#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  //Type your code here.
 float temp,wind;
  float wcf;
  cin>>temp>>wind;
  wcf = 35.74 + 0.6215*temp + (0.4275*temp - 35.75) * pow(wind,0.16);
  cout<<wcf;
}