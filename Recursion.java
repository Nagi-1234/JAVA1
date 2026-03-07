class Recursion { //Base case
    void rec(int num) {
        if(num>10) {
            return;
        }
        rec(num+1);//System.out.println(num) is ascending order
        System.out.println(num);//rec(num+1);
    }
    public static void main(String[] args) {
        Recursion ob = new Recursion();
        ob.rec(1);
    }
}




