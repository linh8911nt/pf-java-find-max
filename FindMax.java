import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Nhập số lượng tỷ phú (không quá 20 người): ");
            size = input.nextInt();
            if (size > 20)
                System.out.println("Số lượng không được quá 20 người");
        }while (size > 20);

        array = new  int[size];
        int i = 0;
        while (i < array.length){
            System.out.println("Nhập số tài sản người thứ " + (i + 1) + " :" );
            array[i] = input.nextInt();
            i++;
        }
        System.out.println("Danh sách tài sản: ");
        for (int j = 0; j < array.length; j++)
            System.out.println(array[j] + "\t");

        int max = array[0];
        int index = 0;
        for (int j = 0; j < array.length; j++){
            if (array[j] > max){
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("Giá trị tài sản lớn nhất " + max + " ở vị trí " + index + " trong danh sách");
    }
}
