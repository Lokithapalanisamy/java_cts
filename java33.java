import java.sql.*;

public class BankTransaction {
    public static void transfer(Connection conn, int fromAcc, int toAcc, double amount) throws SQLException {
        try {
            conn.setAutoCommit(false);
            
            // Debit
            PreparedStatement debit = conn.prepareStatement(
                "UPDATE accounts SET balance = balance - ? WHERE id = ? AND balance >= ?");
            debit.setDouble(1, amount);
            debit.setInt(2, fromAcc);
            debit.setDouble(3, amount);
            int debited = debit.executeUpdate();
            
            // Credit
            PreparedStatement credit = conn.prepareStatement(
                "UPDATE accounts SET balance = balance + ? WHERE id = ?");
            credit.setDouble(1, amount);
            credit.setInt(2, toAcc);
            credit.executeUpdate();
            
            if (debited == 1) {
                conn.commit();
                System.out.println("Transfer successful!");
            } else {
                conn.rollback();
                System.out.println("Insufficient funds or account not found");
            }
        } finally {
            conn.setAutoCommit(true);
        }
    }

    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "password");
        transfer(conn, 1, 2, 100.0); // Transfer $100 from account 1 to 2
        conn.close();
    }
}