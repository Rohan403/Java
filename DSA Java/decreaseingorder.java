
    public class decreaseingorder {
        static void print(int n){
            if(n==1){
                System.out.println(n);
                return;
            }
            System.out.println(n);
            print(--n);
        }
        public static void main(String args[]){
            print(10);
        }
    }
    
