package college;
import java.awt.BorderLayout;
import java.awt.CardLayout;

public class TimeTable extends javax.swing.JPanel {

    MainFrame main;
    public TimeTable(MainFrame main) {
        initComponents();
        this.main = main;
        headerContainer.setLayout(new BorderLayout());
        headerContainer.add(new Header(main));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerContainer = new javax.swing.JPanel();

        setBackground(new java.awt.Color(248, 251, 255));
        setPreferredSize(new java.awt.Dimension(1170, 800));

        headerContainer.setBackground(new java.awt.Color(248, 251, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 1170, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 700, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel headerContainer;
    // End of variables declaration//GEN-END:variables
}
