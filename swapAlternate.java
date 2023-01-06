
public class swapAlternate {
    
    static void printArray(int arr[], int n)
    {
        for(int i=0; i<=n; i++)
        {
            System.out.println(arr[i]+" ");
        }
    }

    public static void swap(int arr[], int size)
    {
        for (int i=0; i<arr.length; i+=2)
        {
            if(i<size)
            {
                int temp;
                temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]= temp;
            }
        }
    }

    public static void main(String[] args) {
        int even[]={1,2,3,4,5,6,7,8};
        int odd[]={1,2,3,4,5,6,7};

        
        swap(odd, 6);
        printArray(odd, 6);
       
    }
}
