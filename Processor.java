package nguyenngocquocbao_7900.Exercise07;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersonList list = new PersonList();
        int choice;
        do {
            System.out.println("\n===== PERSON MANAGEMENT =====");
            System.out.println("1.Add new student");
            System.out.println("2.Add new teacher");
            System.out.println("3.Update person by id");
            System.out.println("4.Delete person by id");
            System.out.println("5.Find person by id");
            System.out.println("6.Display all students and teachers");
            System.out.println("0.Exit");
            System.out.print("Choose:");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    Student student = new Student();
                    student.addPerson();
                    list.addPerson(student);
                    System.out.println("Add student successfully!");
                    break;
                case 2:
                    Teacher teacher = new Teacher();
                    teacher.addPerson();
                    list.addPerson(teacher);
                    System.out.println("Add teacher successfully!");
                    break;
                case 3:
                    System.out.print("Enter ID to update: ");
                    String updateId = sc.nextLine();
                    list.updatePerson(updateId);
                    break;
                case 4:
                    System.out.print("Enter ID to delete: ");
                    String deleteId = sc.nextLine();
                    list.deletePersonById(deleteId);
                    break;
                case 5:
                    System.out.print("Enter ID to find: ");
                    String findId = sc.nextLine();
                    Person person = list.findPersonById(findId);
                    if (person != null) {
                        person.displayInfo();
                    } else {
                        System.out.println("Person not found!");
                    }
                    break;
                case 6:
                    list.displayEveryone();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);
        sc.close();
    }
}
