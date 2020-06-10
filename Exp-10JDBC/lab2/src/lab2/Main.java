/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;
import java.sql.*;
import javax.swing.JOptionPane;
import java.util.*;

/**
 *
 * @author Master
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  try{
    Class.forName("java.sql.Driver");
    Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/exp10","root","");
    Statement stmt=con.createStatement();
    stmt.executeUpdate("Insert into employeetb(id,name) values (101,'Devansh')");
   
System.out.println("Record updated by Devansh");

}
catch(Exception e)
{System.out.println("Exception");
}
        // TODO code application logic here
    }

}
