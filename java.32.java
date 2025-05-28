import java.sql.*;

public class StudentDAO {
    private Connection conn;

    public StudentDAO(String url, String user, String pass) throws SQLException {
        this.conn = DriverManager.getConnection(url, user, pass);
    }

    public void insertStudent(int id, String name, int age) throws SQLException {
        String sql = "INSERT INTO students VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setInt(3, age);
            pstmt.executeUpdate();
            System.out.println("Student inserted successfully!");
        }
    }

    public void updateStudentAge(int id, int newAge) throws SQLException {
        String sql = "UPDATE students SET age = ? WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, newAge);
            pstmt.setInt(2, id);
            int rows = pstmt.executeUpdate();
            System.out.println(rows + " row(s) updated.");
        }
    }

    public static void main(String[] args) throws SQLException {
        StudentDAO dao = new StudentDAO("jdbc:mysql://localhost:3306/school", "root", "password");
        dao.insertStudent(3, "Charlie", 21);
        dao.updateStudentAge(1, 23);
    }
}