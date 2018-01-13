import java.io.*;
import java.util.Scanner;

public class CSVStore {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many people?");
        int n = scan.nextInt();
        Person[] people = new Person[n];
        for(int i = 0; i<n; i++){
            int id = i + 1;
            String name;
            int age;
            String job;
            System.out.println("What is your name?");
            name = scan.next();
            System.out.println("How old are you?");
            age = scan.nextInt();
            System.out.println("What do you do for a living?");
            job = scan.next();
            people[i] = new Person(id, name, age, job);
        }
        try{
            FileWriter fw = new FileWriter("PeopleStore.csv");
            fw.append("ID Number");
            fw.append(',');
            fw.append("Name");
            fw.append(',');
            fw.append("Age");
            fw.append(',');
            fw.append("Job");
            fw.append('\n');


            for(int j = 0; j<n; j++){
                fw.append(Integer.toString( people[j].getId()));
                fw.append(',');
                fw.append(people[j].getName());
                fw.append(',');
                fw.append(Integer.toString(people[j].getAge()));
                fw.append(',');
                fw.append(people[j].getJob());
                fw.append('\n');
            }
            fw.flush();
            fw.close();
        }
        catch (Exception e)
        {
            System.out.println("Khotha");
        }


    }
}
