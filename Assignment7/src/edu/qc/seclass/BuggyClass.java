package edu.qc.seclass;

public class BuggyClass {

    public int buggyMethod1(int x, int y) {

        if (x+y== 0) {
            return x;
        }else if(x+y==1){
            return y;
        }else {

            return x / y;
        }




    }

    public int buggyMethod2(int a, int b) {

        if (a+b== 0) {
            return a;
        } else {

            return a / b;
        }

    }

    public static int buggyMethod3(int a,int b) {
        if (a >= 0) {
            a=a / a;
        }
        if (b == 1){
            a=b;

    }
    return b;

    }

    public int buggyMethod4(int a, int b) {
        if (a+b== 0) {
            return a;
        }else if(a+b==1){
            return b;
        }else {

            return a / b;
        }
    }

    public void buggyMethod5 (int i) {

        /*
            It is impossible to create a method for buggyMethod5 because in order for us to show
            100% statement coverage, then we cannot show the division by 0 (which is x=i/0). Even if we
            add more line, [point where you can add code], for example, let x = 2, or some other variable,
            in order to avoid x=i/0 error. but it will not show 100% statement coverage
		*/
    }
}
