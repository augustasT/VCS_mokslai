package interfeisai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AplinkaJDBCImplementation implements Aplinka {
    private int laivuSkaicius;
    private Connection connection;

    public AplinkaJDBCImplementation() throws Exception {
        setUp();
    }

    public Laivas padetiLaiva(int dydis, int x, int y, Kryptis kryptis) {
        LaivasImplementation naujasLaivas = new LaivasImplementation(4);

        laivuSkaicius++;

        return naujasLaivas;
    }

    public int gautiLaivuSkaiciu() {
        return laivuSkaicius;
    }

    public int gautiGyvuLaivuSkaiciu() {
        return 0;
    }

    public Laivas[][] gautiLenta() {
        return new Laivas[0][];
    }

    public boolean sauti(int x, int y) {
        return false;
    }


    protected void setUp() throws Exception {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Where is your MySQL JDBC Driver?");
            e.printStackTrace();
            return;
        }

        System.out.println("MySQL JDBC Driver Registered!");
        Connection connection = null;

        try {
            connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/mokymai", "root", "");

        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return;
        }

        if (connection != null) {
            System.out.println("You made it, take control your database now!");
        } else {
            System.out.println("Failed to make connection!");
        }
    }
}
