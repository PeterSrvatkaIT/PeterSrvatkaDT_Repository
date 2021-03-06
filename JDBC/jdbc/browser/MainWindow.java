package jdbc.browser;

import jdbc.pool.ConnectionPool;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.sql.*;
import java.util.Vector;

public class MainWindow extends javax.swing.JFrame {
    public static final String DEFAULT_COMMAND = "SELECT * FROM student";

    private ConnectionPool pool = new ConnectionPool();

    /** Creates new form MainWindow */
    public MainWindow() {
        initComponents();

        commandField.setText(DEFAULT_COMMAND);
    }

    private TableModel createForCommand(String query) throws SQLException {
        Connection connection = pool.acquire();

        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        Vector<String> columnNames = new Vector<String>();
        ResultSetMetaData rsmd = rs.getMetaData();
        int columnCount = rsmd.getColumnCount();

        for (int index = 1; index <= columnCount; index++) {
            columnNames.add(rsmd.getColumnName(index));
        }

        Vector<Vector<String>> data = new Vector<Vector<String>>();
        while (rs.next()) {
            Vector<String> row = new Vector<String>();
            for (int index = 1; index <= columnCount; index++) {
                row.add(rs.getString(index));
            }
            data.add(row);
        }

        stmt.close();
        pool.release(connection);

        return new DefaultTableModel(data, columnNames);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jScrollPane1 = new javax.swing.JScrollPane();
    resultTable = new javax.swing.JTable();
    jPanel1 = new javax.swing.JPanel();
    executeButton = new javax.swing.JButton();
    commandField = new javax.swing.JTextField();
    jLabel1 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("SQL Browser");

    jScrollPane1.setViewportView(resultTable);

    getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

    executeButton.setText("Execute");
    executeButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        executeButtonActionPerformed(evt);
      }
    });

    jLabel1.setText("Command:");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel1)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(commandField, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(executeButton)
        .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(executeButton)
          .addComponent(commandField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel1))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

    java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
    setBounds((screenSize.width-808)/2, (screenSize.height-634)/2, 808, 634);
  }// </editor-fold>//GEN-END:initComponents

    private void executeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executeButtonActionPerformed
        try {
            String query = commandField.getText();
            resultTable.setModel(createForCommand(query));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error executing command", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_executeButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JTextField commandField;
  private javax.swing.JButton executeButton;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable resultTable;
  // End of variables declaration//GEN-END:variables

}
