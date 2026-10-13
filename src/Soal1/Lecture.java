/// 2572032
/// Khresna Mulia Putra
package Soal1;

public class Lecture extends Person{
    private String lecturerId;

    public void setLecturerId(String lecturerId) {
        this.lecturerId = lecturerId;
    }

    @Override
    public String toString() {
        return lecturerId + " " + name;
    }
}

