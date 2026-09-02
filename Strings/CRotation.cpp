#include<bits/stdc++.h>
using namespace std;
int main(){
  int n,q;
  cin>>n>>q;
  string s; 
  cin>>s;
  int pos=n-1;
  while(q--){
    int t,x;
    cin>>t>>x;
    x=x%n;
    if(t==1){
      pos=pos-x;
      if(pos<0) pos=pos+n;
    }
    else{
      cout<<s[(pos+x)%n]<<endl;
    }
  }
}