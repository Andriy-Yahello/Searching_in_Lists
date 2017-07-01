package com.company;

public class Main {

    public int Linear(int[] a, int b){
        for(int i =0; i<a.length; i++){
            if(a[i]==b){
                return i;
            }
        }
        return -1;
    }

    public int Binary(int[] a, int b){
        int start = 0;
        int end = a.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(b==a[mid]){
                return mid;
            }
            if(b<a[mid]){
                end = mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }

    public int Recursive(int[] a, int start, int end, int b){
        if(start<end){
            int mid = start +(end-start)/2;
            if(b<a[mid]){
                return Recursive(a, start, mid, b);
            }else if(b>a[mid]){
                return Recursive(a, mid+1, end, b);
            }else{
                return mid;
            }
        }
        return -(start+1);
    }



    public static void main(String[] args) {
        int[] a1 = {5,8,7,6,45,6,45,78,1};
        int[] a2 = {5,8,9,16,45,78,145,175,1000};
        int[] a3 = {8,18,19,26,35,76,95,115,200};
        int a = 45;
        int c = 95;
        Main id = new Main();
        //http://ideone.com/te8vtj
        System.out.println("index of "+a+" is "+ id.Linear(a1, a));

        //http://ideone.com/fpenhV
        //a2 needs to be sorted
        System.out.println("index of "+a+" is "+ id.Binary(a2, a));

        //http://ideone.com/PDoTmi
        //a3 needs to be sorted
        System.out.println("index of "+c+" is "+ id.Recursive(a3, 0, 8, c));

    }
}
