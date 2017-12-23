package Challenges.LombokBuilder;

public class People {

    private final int age;
    private String name;
    private String lastName;
    private String city;
    private String job;
    private String GREET="hello";

    public People(int age, String name, String lastName, String city, String job) {
        this.age = age;
        this.name = name;
        this.lastName = lastName;
        this.city = city;
        this.job = job;
    }

    public String getCity() {
        return city;
    }

    public String getJob() {
        return job;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String greet(){
        return GREET+" my name is "+name;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{
        private int age;
        private String name;
        private String lastName;
        private String city;
        private String job;

        public Builder(int age, String name, String lastName, String city, String job) {
            this.age = age;
            this.name = name;
            this.lastName = lastName;
            this.city = city;
            this.job = job;
        }

        public Builder() {
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }
        public Builder age(int age){
            this.age = age;
            return this;
        }
        public Builder job(String job){
            this.job = job;
            return this;
        }
        public Builder city(String city){
            this.city = city;
            return this;
        }

        public People build(){
            return new People(age, name, lastName, city, job);
        }
    }
}