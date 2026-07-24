#include<iostream>
#include<algorithm>
#include<vector>
using namespace std;

bool comp(pair<int,int> &a, pair<int,int> &b){
    return a.second<b.second;
}

int main(){
    int n;
    cin>>n;
    vector<pair<int,int>> vec(n);
    for(int i = 0; i<n; i++){
        int h; cin>>h;
        int l; cin>>l;
        vec[i]=make_pair(h,l);
    }
    sort(vec.begin(),vec.end(),comp);
    int q;
    cin>>q;
    
    return 0;
}
