package TRIP;

import TRIP.AllData;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainFrame extends AllData {
    private JTable dataTable;

    public MainFrame() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Data Pemesanan");
        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setSize(800, 600);

        JPanel panel = new JPanel(new BorderLayout());
        JScrollPane scrollPane = new JScrollPane();
        dataTable = new JTable();
        scrollPane.setViewportView(dataTable);
        panel.add(scrollPane, BorderLayout.CENTER);
        getContentPane().add(panel);

        // Panggil method untuk menampilkan data saat JInternalFrame dibuat
        displayData();
    }

    private void displayData() {
        // Ambil data dari database dan masukkan ke dalam tabel
        try {
            Connection conn = CONECTIONDB.connectDatabase();
            String sql = "SELECT c.customer_id, c.Customer, c.Contacts, d.Destinasi, d.PaketTrip, d.Jadwal, d.arga, p.MetodePembayaran, p.payment " +
                         "FROM customer c " +
                         "JOIN destinasi d ON c.customer_id = d.customer_id " +
                         "JOIN payment p ON c.customer_id = p.customer_id";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            DefaultTableModel model = new DefaultTableModel();
            dataTable.setModel(model);

            // Tambahkan kolom ke dalam model tabel
            model.addColumn("No. Pemesanan");
            model.addColumn("Nama Customer");
            model.addColumn("Contact");
            model.addColumn("Tempat Destinasi");
            model.addColumn("Paket Trip");
            model.addColumn("Jadwal Keberangkatan");
            model.addColumn("Harga Paket");
            model.addColumn("Metode Pembayaran");
            model.addColumn("Status Payment");

            // Isi data ke dalam model tabel
            while (rs.next()) {
                Object[] row = new Object[9];
                row[0] = rs.getInt("customer_id");
                row[1] = rs.getString("Customer");
                row[2] = rs.getString("Contacts");
                row[3] = rs.getString("Destinasi");
                row[4] = rs.getString("PaketTrip");
                row[5] = rs.getString("Jadwal");
                row[6] = rs.getDouble("Harga");
                row[7] = rs.getString("MetodePembayaran");
                row[8] = rs.getString("payment");
                model.addRow(row);
            }

            // Tutup koneksi dan statement
            rs.close();
            pst.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
