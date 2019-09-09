package Question_1;

import java.util.Scanner;

public class question_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int number_lines = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int number_columns = scanner.nextInt();
        int[][] a = new int[number_lines][number_columns];
        System.out.println("Elements matrix (number lines: " + number_lines + "; number columns: " + number_columns + "): ");
        for (int i = 0; i < number_lines; i++) {
            for (int j = 0; j < number_columns; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Original Matrix: ");
        for (int i = 0; i < number_lines; i++) {
            for (int j = 0; j < number_columns; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("New columns: "); //выведем все нечетные столбцы, у которых первый элемент больше последнего
        for (int j = 0; j < number_columns; j++) {
            for (int i = 0; i < number_lines; ++i) {
                    if (j % 2 != 0) { // четность рассматриваем в последовательности: j0,j1,j2,j3...jn;
                        if (a[0][j] > a[number_lines - 1][j]) {
                            System.out.print(a[i][j] + "\t"); // если таковых нет, ничего не выводим.
                        }
                    }
                }
            }
        }
    }




