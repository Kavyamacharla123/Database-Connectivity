//program to insert a record into a table
import java.sql.*;  
import java.util.*;
class UpdateRecords{  
public static void main(String args[]){  
try{
Scanner in=new Scanner(System.in);
            System.out.print("Enter student id : ");  
   int i1=  Integer.parseInt(in.nextLine());   
            System.out.print("Enter student address to Update: ");  
          String add = in.nextLine(); 
           in.close();
             String query="update student set add="'+add+" ' where id="+i1;
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kavya","root","root");  
Statement stmt=con.createStatement();  
  
int n=stmt.executeUpdate(query);  
if(n>0){
ResultSet rs=stmt.executeQuery("select * from student");
while(rs.next())
System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
else
System.out.println("records not deleted");  
con.close();
}
catch(Exception e){ 
System.out.println(e);
}
}
}  