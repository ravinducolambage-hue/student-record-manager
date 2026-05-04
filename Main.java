import java.util.ArrayList;

public class Main {
    static ArrayList<String> students = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Student Record Manager");

        addStudent("Alice");
        addStudent("Bob");

        viewStudents();

        deleteStudent("Alice");

        countStudents();

        updateStudent("Bob", "Charlie");
        searchStudent("Charlie");

    }

    static void addStudent(String name) {
        students.add(name);
        System.out.println(name + " added.");
    }

    static void viewStudents() {
        System.out.println("Student List:");
        for (String s : students) {
            System.out.println(s);
        }
    }

    static void deleteStudent(String name) {
        students.remove(name);
        System.out.println(name + " removed.");
    }

    static void countStudents() {
        System.out.println("Total students: " + students.size());
    }

    static void updateStudent(String oldName, String newName) {
        int index = students.indexOf(oldName);
        if (index != -1) {
            students.set(index, newName);
            System.out.println(oldName + " updated to " + newName + ".");
        } else {
            System.out.println(oldName + " not found.");
        }
    }

    static void searchStudent(String name) {
        if (students.contains(name)) {
            System.out.println(name + " found.");
        } else {
            System.out.println(name + " not found.");
        }
    }

}
