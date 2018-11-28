public class Main {

    public static void getMin3Numbers(Integer[] arr) {
        Collections.sort(Arrays.asList(arr));
        System.out.println("Minimum 3 Numbers are :");
        for (int i = 0; i < 3 && i < arr.length; i++)
            System.out.println(arr[i]);
    }
    public static void FindUnique(Integer[] a){
        for(int i=0;i<a.length;i++){
          boolean isUnique=true;
          for(int j=0;j<i;j++){
             if(a[i]==a[j]){
              isUnique=false;
              break;
             }
         
         }
          if(isUnique){
            System.out.print(a[i]+" ");
            }
        }
     
   
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int sz = in.nextInt();
        System.out.print("Enter array values: ");
        Integer arr[] = new Integer[sz];
        for (int i = 0; i < sz; i++)
            arr[i] = in.nextInt();
        System.out.println("Choose Function Number:");
        System.out.println("1. Get minimum 3 numbers");
        System.out.println("2.distinct array");
        int reply = in.nextInt();
        switch (reply) {
            case 1:
                getMin3Numbers(arr);
                break;
            case 2:
              FindUnique(arr);
              break;    
        }
        
    }
}
