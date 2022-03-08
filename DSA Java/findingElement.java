public class findingElement {
    static int arr[] = {1,2,10,5,6,0,-1};
    static void recursivesearch(int index,int target){
        if(arr.length==index){
            System.out.println("Element not found");
            return;
        }
        if(arr[index]==target){
            System.out.println("Element found "+index);
            return;
        }
        recursivesearch( index + 1, target);
    }
    public static void main(String args[]){
        int target= 2;
      
        recursivesearch( 0, target);

    }
}
