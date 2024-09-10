// src/main/java/Q1WeirdFunction.java

public class Q1WeirdFunction {

    public static int fRecursive(int n) {
        if(n < 3){
            return n;
        }
        return fRecursive(n-1) + (2 * fRecursive(n-2)) + (3 * fRecursive(n-3));
        
    }

    public static int fIterative(int n) {
        if(n < 3){
            return n;
        }
        int arr[] = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        for(int i = 3 ; i <=n ; i++){
            arr[i] = arr[i-1] + 2 * arr[i-2] + 3*arr[i-3];
        }
        return arr[n];
    }
}