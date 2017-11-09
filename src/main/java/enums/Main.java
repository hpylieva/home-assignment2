package enums;


import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Person mstislav = new Person("Mstislav", 22, MaritalStatus.SINGLE);
        Person yaroslav = new Person("Yaroslav", 31, MaritalStatus.SINGLE);

        Set<Person> Clients = new HashSet<>();
        Clients.add(mstislav);
        Clients.add(yaroslav);

        PersonReader personReader = new PersonReader();

        for(Person Client : Clients){
            personReader.readPerson(Client);
        }

    }
}
