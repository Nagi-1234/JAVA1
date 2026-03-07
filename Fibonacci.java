public class Fibonacci {
    int rec(int num) {
        if(num<=1) {
            return num;
        }
        return rec(num-1)+rec(num-2);
    }
    public static void main(String[] args) {
        Fibonacci ob = new Fibonacci();
        for(int i=0; i<10;i++)
        System.out.println(ob.rec(i));
    }
    
}


