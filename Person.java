public class Person {
    int id;
    String name;
    int age;
    String job;
    public Person(int id, String name, int age, String job) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.job = job;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getJob(){
        return job;
    }
}
