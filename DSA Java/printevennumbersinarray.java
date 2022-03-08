public class printevennumbersinarray {
    static int arr[] = {1,6,4,9,10};
    static void print(int arr[],int idx){
        if(arr.length==idx){
           //System.out.println("Element not found");
            return;
        }
            if(arr[idx]%2 == 0){
                System.out.println(arr[idx]);
                //return;
            }
            print(arr,idx+1);
        }
     
        public static void main(String args[]){
         int arr[] = {1,6,4,9,10};
         print(arr,0);
        }
       
    } 
