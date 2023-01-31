import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int a[]=new int[5];
        Scanner s=new Scanner(System.in);

        for (int i=0; i<5; i++)
        {
            System.out.print("enter the marks of student"+(i+1)+"  -  ");
            a[i]=s.nextInt();
        }
        //printing array
        for (int i=0; i<5; i++)

        {
            System.out.println("the given marks of student" + (i+1)+" : " + a[i]);
        }


    }
}
