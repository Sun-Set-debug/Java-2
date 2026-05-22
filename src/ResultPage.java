/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

/**
 * The ResultPage class represents the final results screen
 * of the Ethics Evaluator application.
 * 
 * It calculates how many "Ethical" and "Unethical" answers
 * the user selected and generates a user profile based on
 * their responses.
 */
public class ResultPage extends javax.swing.JFrame {

    /**
     * Creates and initializes the ResultPage window.
     */
    public ResultPage() {
        initComponents();

        // Add a listener that runs code when the window becomes active
        addWindowListener(new WindowAdapter() {

            @Override
            public void windowActivated(WindowEvent e) {

                System.out.println("JFrame is now focused!");

                // Reset counters before recalculating
                MainPage.ethicalCount = 0;
                MainPage.unethicalCount = 0;

                // Loop through all cases and count user verdicts
                for (EthicsCase c : MainPage.cases) {

                    if (c != null && c.verdict != null) {
                        System.out.println(c.toString());

                        String choice = c.verdict.getStudentVerdict();

                        if ("Ethical".equalsIgnoreCase(choice)) {
                            MainPage.ethicalCount++;

                        } else if ("Unethical".equalsIgnoreCase(choice)) {
                            MainPage.unethicalCount++;
                        }
                    }
                }

                // Display counts on UI labels
                ethical.setText(MainPage.ethicalCount + "");
                unethical.setText(MainPage.unethicalCount + "");

                String profile;

                // Determine user profile based on ethical score
                switch (MainPage.ethicalCount) {

                    case 6, 7, 8:
                        profile = "The Technology Optimist\n\n"
                                + "Description:\n"
                                + "You focus on the positive potential of \n"
                                + "innovation. You believe technology can \n"
                                + "solve many of humanity’s biggest problems \n"
                                + "and that progress should not be slowed down \n"
                                + "by excessive fear or minor risks.";
                        break;

                    case 4, 5:
                        profile = "The Cautious Realist\n\n"
                                + "Description:\n"
                                + "You recognize both the advantages and risks of \n"
                                + "technology. You believe innovation improves \n"
                                + "people’s lives, but it also requires clear laws, \n"
                                + "accountability, and responsible oversight to \n"
                                + "protect society.";
                        break;

                    case 2, 3:
                        profile = "The Privacy Guardian\n\n"
                                + "Description:\n"
                                + "You believe ethics and personal privacy should \n"
                                + "always come before technological progress. \n"
                                + "While technology can be beneficial, companies \n"
                                + "must be closely regulated to prevent data misuse, \n"
                                + "surveillance, and algorithmic bias.";
                        break;

                    default:
                        profile = "The Tech Skeptic\n\n"
                                + "Description:\n"
                                + "You’re highly skeptical of modern technology \n"
                                + "and big tech companies. You believe that \n"
                                + "profit-driven innovation often comes at the \n"
                                + "cost of human rights, privacy, and social fairness.";
                }

                // Display final profile result
                Result.setText(profile);
            }
        });
    }

    /**
     * This method initializes the GUI components.
     * WARNING: Do NOT modify this code manually.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ethical = new javax.swing.JLabel();
        unethical = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lable = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Result = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Results");

        ethical.setText("x");

        unethical.setText("y");

        jLabel4.setText("Ethical");

        lable.setText("Unethical");

        Result.setColumns(20);
        Result.setRows(5);
        jScrollPane1.setViewportView(Result);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(ethical)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(unethical)
                .addGap(112, 112, 112))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lable)
                .addGap(85, 85, 85))
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel1)
                .addGap(97, 169, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ethical)
                    .addComponent(unethical))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lable)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResultPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Result;
    private javax.swing.JLabel ethical;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lable;
    private javax.swing.JLabel unethical;
    // End of variables declaration//GEN-END:variables
}
