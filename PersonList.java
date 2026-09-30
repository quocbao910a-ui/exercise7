package nguyenngocquocbao_7900.Exercise07;

import java.util.ArrayList;

public class PersonList {

    private ArrayList<Person> personList;

    public PersonList() {
        personList = new ArrayList<>();
    }

    public void addPerson(Person person) {
        personList.add(person);
    }

    public void updatePerson(String id) {
        Person person = findPersonById(id);
        if (person != null) {
            person.updatePerson(id);
            System.out.println("Update successfully!");
        } else {
            System.out.println("Person not found!");
        }
    }

    public void deletePersonById(String id) {
        Person person = findPersonById(id);
        if (person != null) {
            personList.remove(person);
            System.out.println("Delete successfully!");
        } else {
            System.out.println("Person not found!");
        }
    }

    public Person findPersonById(String id) {
        for (Person person : personList) {
            if (person.getId().equals(id)) {
                return person;
            }
        }
        return null;
    }

    public void displayEveryone() {
        if (personList.isEmpty()) {
            System.out.println("List is empty!");
            return;
        }
        for (Person person : personList) {
            person.displayInfo();
            System.out.println("--------------------");
        }
    }
}
