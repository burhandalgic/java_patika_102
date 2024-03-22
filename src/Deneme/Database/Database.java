package Deneme.Database;

import java.sql.*;

public class Database {

    public static void main(String[] args) {
        final String url = "jdbc:mysql://localhost/universty";
        final String user = "root";
        final String password = "root";

        try {
            Connection connect = DriverManager.getConnection(url,user,password);
            Statement st = connect.createStatement();

            st.executeUpdate("insert into students(student_name,student_class) values ('damla', 4)");
            st.executeUpdate("update students set student_name='burhan' where student_id=2");
            st.executeUpdate("delete from students where student_id=2");

            PreparedStatement prSt = connect.prepareStatement("insert into students(student_name,student_class) values (?,?)");
            prSt.setString(1,"mehmet");
            prSt.setInt(2,1);
            prSt.execute();

            ResultSet data = st.executeQuery("select * from students");
            while (data.next()){
                System.out.print (data.getInt("student_id") + " : ");
                System.out.print (data.getString("student_name"));
                System.out.println();
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }



    }

}