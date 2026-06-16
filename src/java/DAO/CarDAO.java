package DAO;

import Database.DBConnection;
import Model.Car;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CarDAO {

    public List<Car> getCar() {
        List<Car> cars = new ArrayList<>();
        String sql = "SELECT * FROM CarPriceList";

        try {
            Connection conn = DBConnection

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                // add Car object here
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return cars;
    }
}