public class FactorialRecursion { //Non tail Method8u
    int rec(int num) {
        if(num==1) {
            return 1;
        }
        return num * rec(num-1);
    }
    public static void main(String[] args) {
        FactorialRecursion ob = new FactorialRecursion();
        System.out.println(ob.rec(5)); 
    }
    
}
