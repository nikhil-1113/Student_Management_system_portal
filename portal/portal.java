import java.util.ArrayList;
import java.util.Scanner;
class portal{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Number of Students:");
        int n = Integer.parseInt(scanner.nextLine());
        String nm[] = new String[n];
        int rl[] = new int[n];
        String cl[] = new String[n];
        ArrayList<ArrayList<String>> allSubjects = new ArrayList<>();
        ArrayList<ArrayList<Integer>> allMarks = new ArrayList<>();
        
        for (int j=0;j<n;j++){
            System.out.println("Enter Name:");
            nm[j] = scanner.nextLine();
            System.out.println("Enter Roll Number:");
            rl[j] = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter Class:");
            cl[j] = scanner.nextLine();
            System.out.println("Enter No.of Subjects wanted to Enter:");
            int a = Integer.parseInt(scanner.nextLine());
            ArrayList<String> subjects = new ArrayList<>();
            ArrayList<Integer> marks = new ArrayList<>();
            for (int i=1;i<=a;i++){
                System.out.println("Enter Subject Name:"+i);
                String subjectName = scanner.nextLine();
                subjects.add(subjectName);
                System.out.println("Enter Marks:");
                int mark = Integer.parseInt(scanner.nextLine());
                marks.add(mark);
            }
            allSubjects.add(subjects);
            allMarks.add(marks);
        }
        
        System.out.println("Malla Reddy Institute of Technology and Science");
        
        for(int i=0;i<n;i++){
            System.out.println("============Student Details=============");
            System.out.println("Name: " + nm[i]);
            System.out.println("Roll Number: " + rl[i]);
            System.out.println("Class: " + cl[i]);
            ArrayList<String> subjects = allSubjects.get(i);
            ArrayList<Integer> marks = allMarks.get(i);
            for (int j=0;j<subjects.size();j++){
                System.out.println("Subject: " + subjects.get(j) + ", Marks: " + marks.get(j));
            }
            int total = 0;
            for (int mark : marks) {
                total += mark;
            }
            System.out.println("Total Marks: " + total);
            double avg = (double) total / marks.size();
            System.out.println("Average Marks: " + avg);
            int per = (int) ((total / (marks.size() * 100.0)) * 100) ;
            System.out.println("Percentage: " + per + "%");
            if (per >= 90) {
                System.out.println("Grade: A");
            } else if (per >= 80) {
                System.out.println("Grade: B");
            } else if (per >= 70) {
                System.out.println("Grade: C");
            } else if (per >= 60) {
                System.out.println("Grade: D");
            } else if (per >= 50) {
                System.out.println("Grade: E");
            } else {
                System.out.println("Grade: F");
            }
            if (per >= 35) {
                System.out.println("Result: Pass");
            } else {
                System.out.println("Result: Fail");
            }
        }
    }
}