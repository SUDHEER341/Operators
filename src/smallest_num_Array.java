public class smallest_num_Array {
    public static void main(String[] args) {
        int temp, size;
        int max[] = {34, 56, 23, 89, 12};
        size = max.length;

        for(int i = 0; i<size; i++ ){
            for(int j = i+1; j<size; j++){

                if(max[i]>max[j]){
                    temp = max[i];
                    max[i] = max[j];
                    max[j] = temp;
                }
            }
        }
        System.out.println("Smallest number is : "+ max[0]);
    }
}
