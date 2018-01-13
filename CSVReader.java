import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class CSVReader {
    public static void main(String[] args) throws FileNotFoundException{
        try{
             BufferedReader br = new BufferedReader(new FileReader("PeopleStore.csv"));
             String line = br.readLine();

             while(line != null){
                 String id = "";
                 String name = "";
                 String age = "";
                 String job = "";
                 int count = 0;
                 try{


                      //goes up to 3
                     for(int i = 0; i<line.length(); i++){
                         int j = i+1;
                         String input = line.substring(i,j);
                         if(input.equals(",")) count++;
                         else if(count == 0) id += input;
                         else if(count == 1) name += input;
                         else if(count == 2) age += input;
                         else if(count == 3) job += input;
                     }
                     line = br.readLine();
                 }
                 catch(Exception e){
                     break;
                 }
                 System.out.println("ID: " + id + " Name: " + name + " Age: " + age + " Job: " + job);
             }
        }
        catch (Exception f){
            throw new FileNotFoundException();
        }
    }
}
