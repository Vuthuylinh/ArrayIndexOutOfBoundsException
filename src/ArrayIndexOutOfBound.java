import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBound {
    public Integer [] createRandom(){
        Random rd= new Random();
        Integer[] arr =new Integer[100];
        System.out.println("List of array's element: ");
        for(int i=0; i<arr.length;i++){
            arr[i]=rd.nextInt(100);
            System.out.println(arr[i]+ ", ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBound arrExample= new ArrayIndexOutOfBound();
        Integer[]arr =arrExample.createRandom();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a random array's index:");
        int x=input.nextInt();
        try{
            System.out.println("Element at index: " + x + " has value of: "+ arr[x]);
        }catch(IndexOutOfBoundsException e){
            System.err.println("Index out of bounds");
        }

    }


}
