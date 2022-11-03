
package assignment5;


import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

import java.util.Scanner;
import java.util.Set;


public class Assignment5 {

    public static void main(String[] args) throws Exception {
      
        File file = new File(
            "C:\\Users\\romer\\OneDrive\\Documents\\OneNote Notebooks\\Desktop\\happy.txt");
 
        BufferedReader br
            = new BufferedReader(new FileReader(file));
  int cnt=0;
        String st;
    String[] buffer; 
        while ((st = br.readLine()) != null)
 
        System.out.println(
                    st);
      
           ArrayList arr=new ArrayList();
    HashMap<String, Integer> listOfWords = new HashMap<>(); 
    Scanner in = new Scanner(file);
    int i=0;
    while(in.hasNext())
    {
    String s=in.next();
    //System.out.println(s);
    arr.add(s);
    }
    Iterator itr=arr.iterator();
    while(itr.hasNext())
    {i++;

        listOfWords.put((String) itr.next(), i);
        //System.out.println(listOfWords);    //for Printing the words 
     }

    Set<Object> uniqueValues = new HashSet<>(listOfWords.values()); 
  System.out.println("----------------------------------------------------------------------");
    System.out.println("The number of unique words: "   
            +uniqueValues.size());
    
      System.out.println("----------------------------------------------------------------------");
      
   
        File file2 = new File(
            "C:\\Users\\romer\\OneDrive\\Documents\\OneNote Notebooks\\Desktop\\happy.txt");
 
        BufferedReader br2
            = new BufferedReader(new FileReader(file));
       
           Scanner two = new Scanner(System.in);
           System.out.println("Enter the word to be Searched");
           String wrd=two.nextLine();
           
           
           while((st=br2.readLine())!=null)
           {
               buffer=st.split (" ");
               for (String chr : buffer)
               {
                   if (chr.equals(wrd))
                   {
                       cnt++;
                   }
               }
           }
        
     
        
           {
               System.out.println("Word : " + wrd +" found!   Count : "+ cnt);
           
           }
      
        
      if(cnt==0)  
         
         {
               System.out.println("Word not found!");
           }
           
           
    }
}
