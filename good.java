// practicing java by insertion sort algorithm
package com.company;
public class good{
    public static void insertion_sort(int[] arr){
        int key=0;
        for(int i=1; i<arr.length; i++){
            key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    public static void printArr(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+",");
        }
        System.out.println(" ");
    }
    public static void main(String[] argh){
        System.out.print("\n*********************************************************\n");
        System.out.print("Using insertion sort.\n");
        int [] ar = new int []{1,5,6,7,43,4532,4,532,662,23,4,6,1};

        System.out.print("Previous array:");
        printArr(ar);
        System.out.print("Sorted array:");
        insertion_sort(ar);
        printArr(ar);
        System.out.print("*********************************************************\n");
    }
}