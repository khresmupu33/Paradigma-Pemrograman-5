/// 2572032
/// Khresna Mulia Putra
package Soal1;

import java.util.Scanner;

public class facultyDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FacultyData facultyData=new FacultyData();
        boolean ulang=true;
        do{
            System.out.println("=================================");
            System.out.println("1. Add Lecturer");
            System.out.println("2. Add STudent");
            System.out.println("3. show all lecturers");
            System.out.println("4. show all student");
            System.out.println("5. exit");

            System.out.println("Choose");
            int pilih=input.nextInt();
            switch (pilih){
                case 1:
                    input.nextLine();
                    System.out.println("Enter NIDN");
                    String LNIP=input.nextLine();
                    System.out.println("Enter Name");
                    String Lname=input.nextLine();

                    Lecture lecture=new Lecture();
                    lecture.setLecturerId(LNIP);
                    lecture.setName(Lname);
                    facultyData.addData(lecture);
                    break;
                case 2:
                    input.nextLine();
                    System.out.println("Enter NIDN");
                    String SNIP=input.nextLine();
                    System.out.println("Enter Name");
                    String Sname=input.nextLine();

                    Student student=new Student();
                    student.setStudentId(SNIP);
                    student.setName(Sname);
                    facultyData.addData(student);
                    break;
                case 3:
                    facultyData.showData(Role.LECTURE);
                    break;
                case 4:
                    facultyData.showData(Role.STUDENT);
                    break;
                case 5:
                    System.out.println("Program finished");
                    ulang=false;
                    break;
                default:
                    System.out.println("Wrong Menu");
                    break;
            }
            System.out.println("=================================");
        }while(ulang);
    }
}
