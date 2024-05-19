package com.company;

public class array {
    public static void main(String[] args) {
      /* float []marks={55.7f,76.8f,89.9f,67.3f,56.7f};
        float sum=0;
        for(float element:marks){
            sum=sum+element;
        }
        System.out.println("the value of sum is:\n"+ sum);

        int [] f                                                                                                                                   ind = {45,67,89,90,56};
        int num=78;
        boolean isInArray=false;
        for(int n:find){
            if(num==n) {
                isInArray = true;
                break;
            }
            }
        if(isInArray){
            System.out.println("the value is present in the array");
        }
        else{
            System.out.println("the value is not present in the array");
        }

        float []mark={55.7f,76.8f,89.9f,67.3f,56.7f};
        float sum1=0;
        for(float element:marks){
            sum1=sum1+element;
        }
        System.out.println("the  avg value of marks in physics is:\n"+ sum1/mark.length);

        int [][] ma1={{3 ,4 , 7},
                     {4 ,6 ,8}};
        int [][] ma2={{1 ,3 , 4},
                     {5 ,7 ,2}};
        int [][] result={{0 ,0 ,0},
                       {0 ,0 , 0}};
        for(int i=0;i<ma1.length;i++){
            for(int j=0;j<ma1[i].length;j++){
                result[i][j]=ma1[i][j]+ma2[i][j];

            }
        }
        System.out.println("tha result of adding two array is:");
        for(int i=0;i<ma1.length;i++){
            for(int j=0;j<ma1[i].length;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.print("\n");
        }
        }

       int [] arr={45,78,9,56,76,78,66};
       int n=Math.floorDiv(arr.length,2);
        int a=arr.length;
        for(int b=0;b<n;b++){
            int temp=arr[b];
            arr[b]=arr[a-b-1];
            arr[a-b-1]=temp;
        }
        for(int i=0;i<a;i++){
            System.out.print(arr[i] + " ");
        }

*/

        int [] m={78,5,7,39,98};
        int max=Integer.MIN_VALUE;
        for(int e:m){
            if(e>max)
                max=e;
        }
        System.out.println(max);


        int [] n={2,45,78,96,93};
        int min=Integer.MAX_VALUE;
        for(int p:n){
            if(p<min)
                min=p;
        }
        System.out.println(min);

        int [] a1={3,12,6,8,9};
        boolean isSorted=true;
        for(int k=0;k<a1.length-1;k++){
            if(a1[k]>a1[k+1])
                isSorted=false;
        }
        if(isSorted)
            System.out.println("array is sorted:");
        else
            System.out.println("array is not sorted");

    }
    }

