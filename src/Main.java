import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        int[] student ;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("nhap so luong sv");
            size = sc.nextInt();
            if(size>30){
                System.out.println("so luong sv k dc vuot qua 30");
            }
        }while (size>30);
        student = new int[size];

        for (int i = 0; i < student.length; i++) {
            System.out.println("nhap diem sv " + (i+1) + " :");
            student[i] = sc.nextInt();
        }

        System.out.println("danh sach diem sinh vien bay gio la : " );
        for (int i = 0; i < student.length; i++) {
            System.out.print(student[i] + "\t");
        }
        int count = 0;
        System.out.println("");
        for (int i = 0; i < student.length; i++) {
            if(student[i] >=5 && student[i] <= 10 ){
                count++;
            }
        }
        System.out.println("co " + (count) + " sv da do");
    }
}
