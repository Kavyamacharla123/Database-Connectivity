//program to insert a record into a table
import java.sql.*;  
import java.util.*;
class InsertRecords{  
public static void main(String args[]){  
try{
Scanner in=new Scanner(System.in);
            System.out.print("Enter student id: ");  
   int i1=  Integer.parseInt(in.nextLine()); 

          System.out.print("Enter student name: ");  
          String name = in.nextLine();  
            System.out.print("Enter student address: ");  
          String add = in.nextLine(); 
           in.close();
             String query=" INSERT INTO student VALUES("+i1+",'"+name+"','"+add+" ' )";
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cseb","root","root");  
Statement stmt=con.createStatement();  
  
int n=stmt.executeUpdate(query);  
if(n>0)
System.out.println("records affected");  
else
System.out.println("records affected");  
con.close();
}
catch(Exception e){ 
System.out.println(e);
}
}
}  