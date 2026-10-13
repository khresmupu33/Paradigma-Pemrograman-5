/// 2572032
/// Khresna Mulia Putra
package Soal1;

public class Student extends Person{
    private String studentId;

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return studentId + " " + name;
    }
}
