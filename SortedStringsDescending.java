import java.io.*;
import java.util.*;

public class SortedStringsDescending{

     public static void main(String []args)
     {
         String str;
         ArrayList arr = new ArrayList();
         
         try 
	 {
             BufferedReader in = new BufferedReader(new FileReader("input.cvs"));
             str = in.readLine();
             
         } 
         catch (IOException e) {} 

         for (String s: str.split(",")) 
         {
            arr.add(s);
         }
            
         Collections.sort(arr);
         Collections.reverse(arr);
            
         String output = String.join(",", arr);
        
        try 
        {
             BufferedWriter out = new BufferedWriter(new FileWriter("output.cvs"));
             out.write(output);
             out.close();
        }
        catch (IOException e) {} 
     }
}

