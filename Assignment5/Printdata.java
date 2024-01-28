package Assignment5;

import java.io.BufferedReader;
import java.io.FileReader;

public class Printdata {
    public static void main(String[] args) {
        String inputfile="input.txt";
        String line;
        try{
            BufferedReader reader=new BufferedReader(new FileReader(inputfile));
            while ((line=reader.readLine())!=null) {
                System.out.println(line);
            }
        }catch(Exception e)
        {
            System.out.println("error"+ e.getMessage());
        }
    } 
}
