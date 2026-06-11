import java.util.*;
public class warehouse {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=sc.nextInt();
        int [] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("the minimum stock is: "+ arr[0]);
        System.out.println("the maximum stock is: "+ arr[size-1]);
        int sum=0;
        for(int i=0;i<size;i++){
            sum=sum+arr[i];
        }
        System.out.println("the total stock is:  "+sum);
        boolean duplicateFound=false;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate found "+ arr[i]);
                    duplicateFound=true;
                }
            }
        }
        if(duplicateFound==false){
            System.out.println("Duplicate not found");
        }
        System.out.print("How many times you want to rotate: ");
        int k=sc.nextInt();
        while(k!=0){
            int temp=arr[0];
            for(int i=0;i<size-1;i++){
                arr[i]=arr[i+1];
            }
            arr[size-1]=temp;
            k--;
        }
        for(int i=0;i<size;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.print("Enter number of rows:");
int rows = sc.nextInt();

System.out.print("Enter number of columns:");
int cols = sc.nextInt();

int[][] matrix = new int[rows][cols];

System.out.println("Enter matrix elements:");

for(int i = 0; i < rows; i++){
    for(int j = 0; j < cols; j++){
        matrix[i][j] = sc.nextInt();
    }
}

System.out.println("Transpose matrix:");

for(int j = 0; j < cols; j++){
    for(int i = 0; i < rows; i++){
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
        sc.close();

    }
    
}
