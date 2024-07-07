import TRIP.CONECTIONDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataFetcher {
    public List<Object[]> getCombinedData() {
        List<Object[]> data = new ArrayList<>();
        Connection conn = CONECTIONDB.connectDatabase();
        String sql = "SELECT c.customer_id, c.Customer, c.Contacts, d.Destinasi, d.PaketTrip, d.Jadwal, d.Harga p.payment, p.MetodePembayaran" +
                     "FROM customer c " +
                     "JOIN destinasi d ON c.customer_id = d.customer_id " +
                     "JOIN payment p ON c.customer_id = p.customer_id";
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Object[] row = new Object[6];
                row[0] = rs.getInt("customer_id");
                row[1] = rs.getString("Customer");
                row[2] = rs.getString("Contacts");
                row[3] = rs.getString("Destinasi");
                row[4] = rs.getString("PaketTrip");
                row[5] = rs.getString("Jadwal");
                row[6] = rs.getInt("Harga");
                row[7] = rs.getString("payment");
                row[8] = rs.getString("MetodePembayaran");
                data.add(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataFetcher.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DataFetcher.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return data;
    }
}
