/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab;
import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author Master
 */
public class Main {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     try{
    Class.forName("java.sql.Driver");
    Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/exp10","root","");
    Statement stmt=con.createStatement();
    String query = "create table employeetb"+"" +
             "(id integer," +
             "name varchar(30))";
    stmt.executeUpdate(query);
System.out.println("table created by devansh");
}
catch(Exception e)
{
JOptionPane.showMessageDialog(null ,e.getMessage());
}
        // TODO code application logic here
    }

}
