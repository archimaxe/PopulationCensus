public class Person {
//    Person, содержащий информацию об имени, возрасте, поле и образовании человека:
    private String name;
    private String firstname;
    private Integer age;
    private Sex sex;
    private Education education;

    public Person(String name, String firstname, Integer age, Sex sex, Education education) {
        this.name = name;
        this.firstname = firstname;
        this.age = age;
        this.sex = sex;
        this.education = education;
    }

    public String getName() {
        return name;
    }

    public String getFirstname() {
        return firstname;
    }

    public Integer getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }

    public Education getEducation() {
        return education;
    }

    public String toString(Object str) {
        return "Person{" +
                "name='" + name + '\'' +
                ", firstname='" + firstname + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", education=" + education +
                '}';
    }
}
