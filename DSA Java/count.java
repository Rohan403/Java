public class count {
   // static int cnt = 0;
    static void print(int cnt){
        if(cnt==5)
            return;
            System.out.println("1");
           // cnt++;
           cnt = cnt + 1;
            print(cnt);
        }
        public static void main(String args[]){
            print(0);
        }
    }
