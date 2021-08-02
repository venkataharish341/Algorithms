package com.learn2earnhub;

import java.util.Arrays;

/**
 *
 */
public class Sorting {

    public void bubbleSort(int[] arr){

        int count;
        do{
            int i = 0;
            count = 0;
            while(i < arr.length-1){
                int j = i+1;
                if(arr[i] > arr[j]){
                    swap(arr, i, j);
                    count++;
                }
                i++;
            }
        }while(count > 0);

    }


    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void insertionSort(int[] arr){
        for(int i=0; i< arr.length-1; i++){
            int j=i+1;

            int temp = arr[j];
            int k = i;
            if(arr[k] < temp){
                continue;
            }
            while(k >=0 && arr[k] > temp){
                arr[j]= arr[k];
                j--;
                k--;
            }
            arr[++k] = temp;
        }
    }

    public void mergeSort(int[] arr, int start, int end){
        if(end-start > 0){
            int mid = (start + end)/2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);
            this.merge(arr, start, end, mid);
        }
    }

    private void merge(int[] arr, int start, int end, int mid) {

        int[] a = new int[mid-start+1];
        int[] b = new int[end-mid];
        int i= start;
        int j = 0;
        while(i <= mid){
            a[j++] = arr[i++];
        }

        i= mid+1;
        j = 0;
        while(i <= end){
            b[j++] = arr[i++];
        }

        int k = 0;
        int l = 0;

        while(k < a.length &&  l < b.length){
            if(a[k] < b[l]){
                arr[start++] = a[k++];
            }else{
                arr[start++] = b[l++];
            }
        }

        while(k< a.length){
            arr[start++] = a[k++];
        }

        while(l < b.length){
            arr[start++] = b[l++];
        }
    }

    public static void main(String[] args) {

        int[] arr = new int[]{5,4,1};
        Sorting s = new Sorting();
        s.mergeSort(arr, 0, 2);

        Arrays.stream(arr).forEach(System.out::println);

    }
}
