package Deneme.Database;

import java.sql.*;
import java.util.ArrayList;

public class Database {

    public static void main(String[] args) throws SQLException {

        addData("kazım", 12);
        deleteData(11);
        getData();

    }

    public static void getData() throws SQLException {
        Connection connect = null;
        ArrayList<Student> students = new ArrayList<>();
        try {
            connect = DbHelper.getConection();
            Statement st = connect.createStatement();
            ResultSet rs = st.executeQuery("select * from students");
            while (rs.next()){
                students.add(new Student(rs.getInt("student_id"),rs.getString("student_name"),rs.getInt("student_class")));
            }
            for(Student student : students){
                System.out.println("Id : " + student.getId() + " Name : " + student.getName() + " Class: " + student.getSınıf()  );
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }finally {
            connect.close();
        }
    }


    public static void addData(String name, int sınıf) throws SQLException {
        Connection connect = null;
        try {
            connect = DbHelper.getConection();
            PreparedStatement prSt = connect.prepareStatement("insert into students(student_name,student_class) values (?,?)");
            prSt.setString(1,name);
            prSt.setInt(2,sınıf);
            prSt.execute();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }finally {
            connect.close();
        }
    }

    public static void deleteData(int id) throws SQLException {
        Connection connect = null;
        try {
            connect = DbHelper.getConection();
            PreparedStatement prSt = connect.prepareStatement("delete from students where student_id=?");
            prSt.setInt(1,id);
            prSt.execute();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }finally {
            connect.close();
        }
    }

}
