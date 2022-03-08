public class firstoccurance {

    static int result;
    static void first(int arr[],int target,int idx){
        if(arr.length == idx){
            return;
        }
        else if(arr[idx]==target){
            result = idx;
            System.out.println("Element found "+result);
            return;
        }
        first(arr,target,idx + 1);
    }
    public static void main(String args[]){
        int arr[] = {1,2,5,5,4,4,6,9,10,12};
        first(arr,4,0);
    }
}
