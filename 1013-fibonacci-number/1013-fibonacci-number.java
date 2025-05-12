class Solution {
    public static void main(String[]args){
    int a = 8;
    int ans = fib(8);
    System.out.print(ans);
    }
    public static int fib(int a){
        if(a <= 1) return a;
        return fib(a - 1) + fib(a - 2);
    }
}