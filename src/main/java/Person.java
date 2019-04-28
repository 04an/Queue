public class Person {

    private String name;
    private String suname;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuname() {
        return suname;
    }

    public void setSuname(String suname) {
        this.suname = suname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, String suname, int age) {
        this.name = name;
        this.suname = suname;
        this.age = age;


    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", suname='" + suname + '\'' +
                ", age=" + age +
                '}';
    }
}
