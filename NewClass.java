import java.util.*;
public class NewClass{
     public static void main(String []args){
       Scanner s = new Scanner(System.in);
        int x[] = new int [10];
        int i;
        for( i=0;i<x.length;i++){
            x[i] = s.nextInt();
     }
     for(i=0;i<x.length;i++)
        System.out.println(x[i]);
}
}