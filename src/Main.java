import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(tongHaiCheo(hienThi(nhapPhanTu(size(scanner), scanner))));

    }

    static int size(Scanner scanner) {
        System.out.print("Nhap kich thuoc ma tran vuong: ");
        int size = scanner.nextInt();
        return size;
    }

    static int[][] nhapPhanTu(int size, Scanner scanner) {
        int[][] arr = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("Phan tu thu arr[%d][%d] : ", i, j);
                arr[i][j] = scanner.nextInt();
            }
        }
        return arr;
    }

    static int[][] hienThi(int[][] arr) {
        System.out.println("Ma tran vuong : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        return arr;
    }

    static int tongHaiCheo(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
                if (j == arr.length - 1 - i) {
                    sum += arr[i][j];
                }
            }
        return sum;
    }
}
