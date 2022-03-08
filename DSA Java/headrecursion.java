public class headrecursion {
   static void printDec(int i){
       if(i >= 10){
           System.out.println(i);
           return;
       }
       printDec(i + 1);
       System.out.println(i);
   }
   public static void main(String args[]){
       printDec(1);
   }
}
