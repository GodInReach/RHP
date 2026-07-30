#include<bits/stdc++.h>
using namespace std;

int find(vector<int> &lead, int x){
    if(lead[x]!=x){
        lead[x]=find(lead,lead[x]);
    }
    return lead[x];
}

void join(vector<int> &lead, int x, int y){
    int llead = find(lead, x);
    int rlead = find(lead, y);
    lead[llead]=rlead;
}

int main(){
    int N,Q; cin>>N>>Q;
    vector<int> a(N+1), lead(N+1);
    map<int,int> vlead, leadv;
    for(int i = 1; i<=N; i++){
        cin>>a[i];
        if(vlead.find(a[i])==vlead.end()){
            vlead[a[i]]=i;
            leadv[i]=a[i];
        }
        lead[i]=vlead[a[i]];
    }
    while(Q--){
        int op, from, to;
        cin >> op;
        if(op==1){
            cin>>from>>to;
            if(from==to){
                continue;
            }
            if(vlead.find(from) == vlead.end()){
                continue;
            }
            if(vlead.find(to) != vlead.end()){
                join(lead,lead[from],lead[to]);
                leadv.erase(vlead[from]);
                vlead.erase(from);
            } else {
                int flead = vlead[from];
                leadv[flead]=to;
                vlead.erase(from);
                vlead[to]=flead;
            }
        } else {
            int idx; cin>>idx;
            int uldr = find(lead, lead[idx]);
            cout<<leadv[uldr]<<endl;
        }
    }
    return 0;
}