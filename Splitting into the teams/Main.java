#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int frnd,team,left,res;
  cin>>frnd>>team;
  res=frnd/team;
  left=frnd%team;
  cout<<"The number of friends in each team is "<<res<<" and left out is "<<left; 
}