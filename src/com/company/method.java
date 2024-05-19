package com.company;

public class method {
   /* static void multiplication(int n){
        for(int i=0;i<=10;i++) {
            System.out.printf("%d x %d=%d\n",n,i,n*i);
        }

    }
    static void patter(int m) {
        for (int j = 0; j < m; j++) {
            for (int k = 0; k < j + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static  int sumrec(int n){
        if(n==1)
            return 1;
        else
            return n+sumrec(n-1);
    }
    static void patter1(int m) {
        for (int j = 0; j < m; j++) {
            for (int k =0; k < m-j; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int fibo(int r){
        if(r==1)            //if (n==1 ||n==2)
            return 0;           //return n-1
        else if(r==2)
            return 1;
        else
            return fibo(r-1)+ fibo(r-2);

    }

    static void rec_pattern(int h){
        if (h>0)
           rec_pattern(h-1);
           for(int t=0;t<h;t++){
               System.out.print("*");
        }
        System.out.println();
    }
    static void rec_pattern1(int g) {
        if (g > 0) {

            for (int x = g; x > 0; x--) {    //incomplete
                System.out.print("*");
            }
            System.out.println();
            rec_pattern(g - 1);
        }
    }


    static void celcius(int c){
        float f=(c*1.8f)+32;
        System.out.println(f);
    }
    */
    static void sumitra(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
                sum = sum + i;

            }
        System.out.println(sum);
        }
    public static void main(String[] args) {
        //multiplication(3);
        //patter(5);
        //int p=sumrec(4);
        //System.out.println(p);
        //patter1(5);
       // int c=fibo(7);
        //System.out.println(c); //0 1 1 2 3 5 8
          //rec_pattern(5);
        // rec_pattern1(5);
        //celcius(7);
        sumitra(3);

      }
}
