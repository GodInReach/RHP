#include<iostream>
using namespace std;

int main() {
    int n;
    int q;
    cin>>n>>q;
    long long arr[n+1];
    for(int i = 1; i<=n; i++){
        cin>>arr[i];
    }
    for(int i = 1; i<=n; i++){
        arr[i]=arr[i]+arr[i-1];
    }
    cout<<endl;
    for(int i = 0; i<q; i++){
        int a;
        int b;
        cin>>a>>b;
        cout<<(arr[b]-arr[a-1])<<endl;
    }
}
