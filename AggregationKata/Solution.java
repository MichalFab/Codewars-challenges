package Challenges.AggregationKata;


import java.util.*;
import java.util.stream.Stream;
import static java.util.stream.Collectors.*;

public class Solution {

    public static Map<String, Map<Student.Gender, Long>> getNumberOFStudentsByGenderInEachDepartment(Stream<Student> students) {
        return students.collect(groupingBy(Student::getDepartment, groupingBy(Student::getGender, counting())));
    }


    static class Student {
        private String name;
        private double grade;
        private String department;
        private Gender gender;

        public static final double PASSING_GRADE = 70.0;

        public String getName() {
            return name;
        }

        public double getGrade() {
            return grade;
        }

        public String getDepartment() {
            return department;
        }

        public Gender getGender() {
            return gender;
        }

        public enum Gender {
            MALE, FEMALE
        }

        public Student(String name, double grade, String department, Gender gender) {
            this.name = name;
            this.grade = grade;
            this.department = department;
            this.gender = gender;
        }
    }
}
