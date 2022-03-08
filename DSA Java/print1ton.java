public class print1ton {
    static void print(int n){
        if(n==10){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(++n);
    }
    public static void main(String args[]){
        print(1);
    }
}
