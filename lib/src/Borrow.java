
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lanz
 */
public class Borrow extends javax.swing.JFrame {

    /**
     * Creates new form Borrow
     */
    public Borrow() {
        initComponents();
    }
    String[][] books = new String[100][5];
    String[][] borrow = new String[100][5];
    int rowTrack = 0;
    int rowTrack2 = 0;
    int rowFind = 0;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbSearch = new javax.swing.JComboBox<>();
        txtFieldSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFieldAccNum = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFieldTitle = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFieldAuthor = new javax.swing.JTextField();
        txtFieldGenre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFieldStudNum = new javax.swing.JTextField();
        txtFieldStudName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtFieldBorrowDate = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtFieldDueDate = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnBorrow = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        cbSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Accession Number", "Title" }));

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel1.setText("Book Info");

        jLabel2.setText("Accession Number");

        txtFieldAccNum.setEditable(false);

        jLabel3.setText("Title");

        txtFieldTitle.setEditable(false);

        jLabel4.setText("Author");

        jLabel5.setText("Genre");

        txtFieldAuthor.setEditable(false);

        txtFieldGenre.setEditable(false);

        jLabel6.setText("Borrower Info");

        jLabel7.setText("Student Number");

        jLabel8.setText("Student Name");

        jLabel9.setText("Borrow Date");

        txtFieldBorrowDate.setEditable(false);

        jLabel10.setText("Due Date");

        txtFieldDueDate.setEditable(false);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnBorrow.setText("Borrow");
        btnBorrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrowActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(btnClear))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtFieldAccNum, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtFieldTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel10))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtFieldAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                            .addComponent(txtFieldGenre, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                            .addComponent(txtFieldStudNum, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                            .addComponent(txtFieldStudName, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                            .addComponent(btnBorrow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(cbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearch)))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFieldBorrowDate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFieldDueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(91, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFieldAccNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtFieldBorrowDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFieldTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtFieldDueDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFieldAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtFieldGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtFieldStudNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtFieldStudName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorrow)
                    .addComponent(btnClear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Clear()
    {
        txtFieldAccNum.setText("");
        txtFieldTitle.setText("");
        txtFieldAuthor.setText("");
        txtFieldGenre.setText("");
        txtFieldStudNum.setText("");
        txtFieldStudName.setText("");
        txtFieldBorrowDate.setText("");
        txtFieldDueDate.setText("");
    }
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String choice = cbSearch.getSelectedItem().toString();
        boolean found = false;
        boolean avail = false;
        if("Accession Number".equals(choice))
        {
            String accnum = txtFieldSearch.getText();
            for(int i = 0; i < rowTrack; i++)
            {
                if(accnum == null ? books[i][0] == null : accnum.equals(books[i][0]))
                {
                    found = true;
                    rowFind = i;
                    break;
                }
            }
            if(found)
            {
                String stat = books[rowFind][4];
                if("Available\r".equals(stat) || "Available".equals(stat))
                {
                    avail = true;
                }
                if(avail)
                {
                    txtFieldAccNum.setText(books[rowFind][0]);
                    txtFieldTitle.setText(books[rowFind][1]);
                    txtFieldAuthor.setText(books[rowFind][2]);
                    txtFieldGenre.setText(books[rowFind][3]);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Book is unavailable at the moment!");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Accession Number has no match!");
            }
        }
        else
        {
            String title = txtFieldSearch.getText();
            for(int i = 0; i < rowTrack; i++)
            {
                if(title == null ? books[i][1] == null : title.equals(books[i][1]))
                {
                    found = true;
                    rowFind = i;
                    break;
                }
            }
            if(found)
            {
                String stat = books[rowFind][4];
                if("Available\r".equals(stat) || "Available".equals(stat))
                {
                    avail = true;
                }
                if(avail)
                {
                    txtFieldAccNum.setText(books[rowFind][0]);
                    txtFieldTitle.setText(books[rowFind][1]);
                    txtFieldAuthor.setText(books[rowFind][2]);
                    txtFieldGenre.setText(books[rowFind][3]);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Book is unavailable at the moment!");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Accession Number has no match!");
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        LMSForm main = new LMSForm();
        main.setLocationRelativeTo(null);
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnBorrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrowActionPerformed
        if("".equals(txtFieldAccNum.getText()) || "".equals(txtFieldTitle.getText()) || "".equals(txtFieldAuthor.getText()) || 
                "".equals(txtFieldGenre.getText()) || "".equals(txtFieldStudNum.getText()) || "".equals(txtFieldStudName.getText()) ||
                "".equals(txtFieldBorrowDate.getText()) || "".equals(txtFieldDueDate.getText()))
        {
            JOptionPane.showMessageDialog(null, "One or more fields are empty!!!");
        }
        else
        {
            books[rowFind][4] = "Unavailable";
            File x = new File("books.txt");
            x.delete();
            try
            {
                x.createNewFile();
            }
            catch(IOException e)
            {
                JOptionPane.showMessageDialog(null, e, "Error!", JOptionPane.WARNING_MESSAGE);
            }
            String data = "";
            for(int i = 0; i < rowTrack; i++)
            {
                for(int j = 0; j < 5; j++)
                {
                    data += books[i][j];
                    if(j != 4)
                    {
                        data += "\\";
                    }
                }
                data += System.lineSeparator();
            }
            try
            {
                Files.write(Paths.get("books.txt"), data.getBytes(), StandardOpenOption.WRITE);
            }
            catch(IOException e)
            {
                JOptionPane.showMessageDialog(null, e, "Error!", JOptionPane.WARNING_MESSAGE);
            }
            borrow[rowTrack][0] = txtFieldAccNum.getText();
            borrow[rowTrack][1] = txtFieldStudName.getText();
            borrow[rowTrack][2] = txtFieldStudNum.getText();
            borrow[rowTrack][3] = txtFieldBorrowDate.getText();
            borrow[rowTrack][4] = txtFieldDueDate.getText();
            String add;
            add = txtFieldAccNum.getText() + "\\" + txtFieldStudName.getText() + "\\" + txtFieldStudNum.getText() + "\\" +
                    txtFieldBorrowDate.getText() + "\\" + txtFieldDueDate.getText() + "_" + System.lineSeparator();
            try
            {
                Files.write(Paths.get("borrow.txt"), add.getBytes(), StandardOpenOption.APPEND);
            }
            catch(IOException e)
            {
                JOptionPane.showMessageDialog(null, e, "Error!", JOptionPane.WARNING_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_btnBorrowActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        LocalDate today = LocalDate.now(ZoneId.of( "Pacific/Auckland" ));
        String dateNow = today.toString();
        today = today.plusDays(3);
        String duedate = today.toString();
        txtFieldBorrowDate.setText(dateNow);
        txtFieldDueDate.setText(duedate);
        File x = new File("books.txt") ;
        if(x.exists())
        {
            try{
                String text = readFile("books.txt");
                if(!"".equals(text))
                {
                    String[] words1 = text.split("_\n");
                    rowTrack = words1.length;
                    for(int j = 0; j < 5; j++)
                    {
                        for(int i = 0; i < words1.length; i++)
                        {
                            String[] words2 = words1[i].split("\\\\");
                            books[i][j] = words2[j];
                        }
                    }
                }
            }
            catch(IOException e)
            {
                JOptionPane.showMessageDialog(null, e, "Error!", JOptionPane.WARNING_MESSAGE);
            }
        }
        else
        {
            try
            {
                x.createNewFile();
            }
            catch(IOException e)
            {
                JOptionPane.showMessageDialog(null, e, "Error!", JOptionPane.WARNING_MESSAGE);
            }
        }
        
        File y = new File("borrow.txt");
        if(y.exists())
        {
            try{
                Scanner sc = new Scanner(y);
                String text = readFile("borrow.txt");
                if(!"".equals(text))
                {
                    String[] words1 = text.split("_\n");
                    rowTrack2 = words1.length;
                    for(int j = 0; j < 5; j++)
                    {
                        for(int i = 0; i < words1.length; i++)
                        {
                            String[] words2 = words1[i].split("\\\\");
                            borrow[i][j] = words2[j];
                        }
                    }
                }
            }
            catch(IOException e)
            {
                JOptionPane.showMessageDialog(null, e, "Error!", JOptionPane.WARNING_MESSAGE);
            }
        }
        else
        {
            try
            {
                y.createNewFile();
            }
            catch(IOException e)
            {
                JOptionPane.showMessageDialog(null, e, "Error!", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        Clear();
    }//GEN-LAST:event_btnClearActionPerformed

    String readFile(String fileName) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader(fileName));
    try {
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();

        while (line != null) {
            sb.append(line);
            sb.append("\n");
            line = br.readLine();
        }
        return sb.toString();
    } finally {
        br.close();
    }
}
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Borrow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Borrow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Borrow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Borrow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Borrow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBorrow;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cbSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtFieldAccNum;
    private javax.swing.JTextField txtFieldAuthor;
    private javax.swing.JTextField txtFieldBorrowDate;
    private javax.swing.JTextField txtFieldDueDate;
    private javax.swing.JTextField txtFieldGenre;
    private javax.swing.JTextField txtFieldSearch;
    private javax.swing.JTextField txtFieldStudName;
    private javax.swing.JTextField txtFieldStudNum;
    private javax.swing.JTextField txtFieldTitle;
    // End of variables declaration//GEN-END:variables
}