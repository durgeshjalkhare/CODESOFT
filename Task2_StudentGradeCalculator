import java.util.Scanner;

public class Task2_StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subject : ");
        int n = sc.nextInt();
        int  totalMarks = 0;
        float average=0;
        String Grade;
        System.out.println("Enter the marks of each subject =  ");
        for (int i = 0; i < n; i++) {
            int marks= sc.nextInt();
            totalMarks+=marks;
        }
        average=totalMarks/n;
        if(average>=90) Grade="A+";
        else if (average>=80) Grade="A";
        else if (average>=70) Grade="B";
        else if (average>=60) Grade="C";
        else if (average>=50) Grade="D";
        else Grade="Fail";
        System.out.println("Total Marks obtain = " + totalMarks);
        System.out.println("Average Percentage = " + average);
        System.out.println("grade = " + Grade);
    }
}
