package fr.fms.hmi;

import javax.swing.*;
import fr.fms.dao.ProductDao;
import fr.fms.entities.Product;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

@SuppressWarnings("serial")
public class View extends JFrame {
    JPanel panel = new JPanel(null);
    JLabel title;
    JButton button;
    Font fauth = new Font(Font.SANS_SERIF, Font.BOLD, 28);
    Font font = new Font(Font.SANS_SERIF, Font.BOLD, 18);
    Font fb = new Font(Font.SANS_SERIF, Font.BOLD, 14);
    JTable table;
    JScrollPane scroll;

    public View() {
        super("MoMo Hardware Shop");
        title = new JLabel("MoMo Hardware Shop");
        title.setBounds(350, 10, 400, 70);
        title.setFont(fauth);
        title.setBackground(Color.black);
        title.setForeground(Color.green);
        panel.add(title);

        button = new JButton("Load the table of products");
        button.setBounds(350, 80, 290, 40);
        button.setFont(fb);
        button.setBackground(Color.black);
        button.setForeground(Color.green);
        panel.add(button);
        button.addActionListener(new ActionListener() {
            @SuppressWarnings("deprecation")
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                refreshTable();
            }
        });

        table = new JTable();
        table.setFont(fb);
        table.setBackground(Color.white);
        table.setForeground(Color.black);
        scroll = new JScrollPane(table);
        scroll.setBounds(30,150,924,382);
        scroll.setFont(fb);
        scroll.setBackground(Color.white);
        scroll.setForeground(Color.black);
        panel.add(scroll);

        refreshTable();


        this.setVisible(true);
        this.setSize(1000, 600);
        this.setLocationRelativeTo(null);
        this.setContentPane(panel);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);
        panel.setBackground(Color.black);
    }

    private void refreshTable() {
        Controller ctrl = new Controller();
        ArrayList<Product> products = ctrl.getMonArrayList();
        System.out.println(products);
        ProductTableModel ptm = new ProductTableModel(products.toArray(new Product[0]));
        table.setModel(ptm);
    }

    public static void main(String[] args) {
        View launch = new View();
    }
}
