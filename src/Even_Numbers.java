public class Even_Numbers {
    public static void main(String[] args) {
        int a []=new int[200];

        for(int i=2;i<a.length;i+=2)
        {
            if(a[i]%2==0)
            {
                a[i]=i;
                System.out.println(i);
            }
        }

    }
}