class linearSearch{
 public static int search(int arr[], int key){
    for (int i=0; i<arr.length; i++)
    {
        if(arr[i]==key){
            return i;
        }
    }
    return -1;
 }

 //Drivers Code
 public static void main(String[] args) {
    int arr[]={0,1,2,3,4,5,6,7,8,9};
    int key = 10;

    //function call

    int result = search(arr, key);

    if(result==-1){
        System.out.println("Element not found");

    }

    else {
        System.out.println("element present at index "+result);
    }
 }
}