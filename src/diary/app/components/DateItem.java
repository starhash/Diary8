/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diary.app.components;

import diary.Diary8Desktop;
import diary.app.Diary8View;
import java.awt.Color;
import java.io.File;
import java.util.Date;
import javax.swing.JComponent;
import javax.swing.JPanel;

/**
 *
 * @author Harsh
 */
public class DateItem extends JPanel {

    boolean isSelected = false;
    Color DEFAULT = Color.WHITE;
    Color DEFAULTTEXT = Color.BLACK;
    Color SELECTED = Color.BLACK;
    Color SELECTEDTEXT = Color.WHITE;
    Color OVER = new Color(240, 240, 240);
    Date DATE;
    String[] dayOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    /**
     * Creates new form DateItem
     */
    public DateItem() {
        initComponents();
    }

    public void setDate(Date d) {
        DATE = d;
        date.setText(DATE.getDate() + "");
        day.setText(dayOfWeek[DATE.getDay()]);
        int count = Diary8Desktop.CUser.getLogCountFor(d.getYear() + 1900, d.getMonth() + 1, d.getDate());
        System.out.println("logs : " + d + " > " + count);
        logCount.setText((count==0)?"No Logs":(count+""));
    }

    public void setColors(Color fg, Color bg) {
        setBackground(bg);
        date.setForeground(fg);
        day.setForeground(fg);
        logCount.setForeground(fg);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        date = new javax.swing.JLabel();
        day = new javax.swing.JLabel();
        logCount = new javax.swing.JLabel();
        vertGap = new javax.swing.JLabel();
        go = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });

        date.setFont(new java.awt.Font("Segoe UI Light", 0, 28)); // NOI18N
        date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date.setText("1");

        day.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        day.setText("Sunday");

        logCount.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        logCount.setText("No Logs");

        vertGap.setText("  ");

        go.setBackground(new java.awt.Color(255, 255, 255));
        go.setForeground(new java.awt.Color(255, 255, 255));
        go.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diary/app/components/resources/go.png"))); // NOI18N
        go.setBorderPainted(false);
        go.setContentAreaFilled(false);
        go.setFocusPainted(false);
        go.setOpaque(true);
        go.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                goMouseEntered(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                goMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                goMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                goMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(vertGap)
                .addGap(0, 0, 0)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(logCount, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(go, javax.swing.GroupLayout.PREFERRED_SIZE, 34, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
            .addComponent(day, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(vertGap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(go, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        // TODO add your handling code here:
        setBackground(OVER);
        go.setBackground(OVER);
        go.setEnabled(true);
        vertGap.setBounds(0, 0, 20, vertGap.getHeight());
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        // TODO add your handling code here:
        setBackground(DEFAULT);
        go.setBackground(DEFAULT);
        go.setEnabled(false);
        vertGap.setBounds(0, 0, 20, vertGap.getHeight());
    }//GEN-LAST:event_formMouseExited

    private void goMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goMouseEntered
        // TODO add your handling code here:
        setBackground(OVER);
        go.setBackground(OVER);
        go.setEnabled(true);
        vertGap.setBounds(0, 0, 20, vertGap.getHeight());
    }//GEN-LAST:event_goMouseEntered

    private void goMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goMouseExited
        // TODO add your handling code here:setBackground(OVER);
        setBackground(DEFAULT);
        go.setBackground(DEFAULT);
        go.setEnabled(false);
        vertGap.setBounds(0, 0, 20, vertGap.getHeight());
    }//GEN-LAST:event_goMouseExited

    private void goMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goMouseClicked
        // TODO add your handling code here:
        super.repaint();
        DiaryPanel d = Diary8Desktop.DIARY.diaryPanel;
        for (int i = 0; i < d.dates.getComponentCount(); i++) {
            DateItem di = (DateItem) d.dates.getComponent(i);
            if (di.date.getText().equals(this.date.getText())) {
                di.DEFAULT = new Color(200, 200, 200);
                di.setColors(Color.BLACK, di.DEFAULT);
                di.go.setBackground(di.DEFAULT);
                Diary8Desktop.DIARY.diaryPanel.selectedDate = new Date(
                        Diary8Desktop.DIARY.diaryPanel.selectedYear,
                        Diary8Desktop.DIARY.diaryPanel.selectedMonth,
                        Integer.parseInt(di.date.getText()));
                File logDir = Diary8Desktop.CUser.getLogFolder(
                        Diary8Desktop.DIARY.diaryPanel.selectedYear,
                        Diary8Desktop.DIARY.diaryPanel.selectedMonth+1,
                        Integer.parseInt(di.date.getText()));
                System.out.println(logDir.getAbsolutePath());
                if(logDir.exists()) {
                    Diary8Desktop.DIARY.diaryPanel.loadLogs(logDir);
                }
            } else {
                di.DEFAULT = Color.WHITE;
                di.setColors(Color.BLACK, di.DEFAULT);
                di.go.setBackground(Color.WHITE);
            }
        }
    }//GEN-LAST:event_goMouseClicked

    private void goMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goMousePressed
        // TODO add your handling code here:
        go.setBackground(DEFAULTTEXT);
    }//GEN-LAST:event_goMousePressed

    private void goMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goMouseReleased
        // TODO add your handling code here:
        go.setBackground(getBackground());
    }//GEN-LAST:event_goMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel date;
    public javax.swing.JLabel day;
    public javax.swing.JButton go;
    public javax.swing.JLabel logCount;
    public javax.swing.JLabel vertGap;
    // End of variables declaration//GEN-END:variables
}
