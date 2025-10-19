#include<stdio.h>
int linearSearch(int arr[],int m,int nums)
{
    int i;
    for( i=0; i<m; i++){
        if(arr[i] == nums){
            return i;
        }
        
    }
    return -1;
}
int main(){
        int arr[] = {1,2,3,4,5};
        int nums = 4;
        int n = sizeof(arr)/sizeof(arr[0]);
        int val = linearSearch(arr,n,nums);
        printf("%d" , val);
    }