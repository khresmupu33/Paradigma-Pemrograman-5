/// 2572032
/// Khresna Mulia Putra
package Soal1;

import java.util.ArrayList;
import java.util.List;
public class FacultyData {
    private List<Person> persons;

    public FacultyData() {
        persons = new ArrayList<>();
    }

    public void addData(Person person){
        persons.add(person);
    }

    public void showData(Role role){
        boolean found = false;

        for (Person person : persons){
            if (role == Role.LECTURE && person instanceof Lecture){
                System.out.println(person);
                found = true;
            }

            if (role == Role.STUDENT && person instanceof Student){
                System.out.println(person);
                found = true;
            }
        }
        if (!found){
            if (role == Role.LECTURE){
                System.out.println("No lecturer available");
            }

            if (role == Role.STUDENT){
                System.out.println("No student available");
            }
        }
    }
}
