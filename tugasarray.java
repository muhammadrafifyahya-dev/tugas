public class tugasarray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        
        System.out.println("Array Ke-1");
        for (int i = 0; i < array1.length; i++) {
            int number = array1[i] & 1;
            if(number == 0) {
                System.out.println("[" + array1[i] + " adalah bilangan genap" + " ]");
            } else {
                System.out.println("[" + array1[i] + " adalah bilangan ganjil" + "]");
            }
        }
        int[] array2 = {5, 6, 7, 8};
        
        System.out.println("Array Ke-2");
        for (int i = 0; i < array2.length; i++) {
            int number1 = array2[i]& 1;
            if(number1== 0) {
                System.out.println("[" + array2[i] + " adalah bilangan genap" + " ]");
            } else {
                System.out.println("[" + array2[i] + " adalah bilangan ganjil" + "]");
            }
        }
    }
}