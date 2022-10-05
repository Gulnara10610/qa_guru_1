package guru.qa.model;

import lombok.Getter;
import lombok.NoArgsConstructor;


    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public class Employee {
        public String firstName;
        public String lastName;
        public int age;

        public Employee(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;

        }
    }


