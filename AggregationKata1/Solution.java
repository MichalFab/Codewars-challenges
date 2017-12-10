package Challenges.AggregationKata1;


import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {

    public static Map<String, Map<Student.Gender, Long>> getNumberOFStudentsByGenderInEachDepartment(Stream<Student> students) {
        return students.collect(Collectors.groupingBy(Student::getDepartment, Collectors.averagingDouble(Student::getGrade)));
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
