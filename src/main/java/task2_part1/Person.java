package task2_part1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
    private String name;
    private int age;
    private MaritalStatus maritalStatus;

    @Override
    public String toString(){return this.getName()+" age: "+this.getAge()+", "+getMaritalStatus();}
}
