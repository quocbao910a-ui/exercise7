package nguyenngocquocbao_7900.Exercise07;

import java.util.Date;
import java.util.Scanner;

public class Teacher extends Person {

    private String department;
    private String teachingSubject;

    public Teacher() {
    }

    public Teacher(String id, String fullName, Date dateOfBirth, String department, String teachingSubject) {
        super(id, fullName, dateOfBirth);
        this.department = department;
        this.teachingSubject = teachingSubject;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
    }

    @Override
    public void addPerson() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        setId(sc.nextLine());
        System.out.print("Enter full name: ");
        setFullName(sc.nextLine());
        System.out.print("Enter department: ");
        department = sc.nextLine();
        System.out.print("Enter teaching subject: ");
        teachingSubject = sc.nextLine();
    }

    @Override
    public void updatePerson(String id) {
        Scanner sc = new Scanner(System.in);
        if (getId().equals(id)) {
            System.out.print("Enter new full name: ");
            setFullName(sc.nextLine());
            System.out.print("Enter new department: ");
            department = sc.nextLine();
            System.out.print("Enter new teaching subject: ");
            teachingSubject = sc.nextLine();
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Teacher");
        System.out.println("ID: " + getId());
        System.out.println("Full Name: " + getFullName());
        System.out.println("Department: " + department);
        System.out.println("Teaching Subject: " + teachingSubject);
    }
}
