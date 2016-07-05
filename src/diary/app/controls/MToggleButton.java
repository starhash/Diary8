package diary.app.controls;
import java.awt.Color;
import javax.swing.JToggleButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Harsh
 */
public class MToggleButton extends JToggleButton {

    private Color BUTTON = Color.WHITE;
    private Color TEXT = Color.BLACK;
    private Color BUTTONTOGGLED = Color.BLACK;
    private Color TEXTTOGGLED = Color.WHITE;
    private boolean MOUSEPRESSED = false;
    private boolean MOUSEHOVER = false;

    /**
     * Creates new form MButton
     */
    public MToggleButton() {
        initComponents();
    }

    public void setButtonColors(Color normal, Color toggled) {
        this.BUTTON = normal;
        this.BUTTONTOGGLED = toggled;
    }

    public void setTextColors(Color normal, Color toggled) {
        this.TEXT = normal;
        this.TEXTTOGGLED = toggled;
    }

    @Override
    public void repaint() {
        super.repaint(); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        setText("Sample");
        setBorder(null);
        setBorderPainted(false);
        setContentAreaFilled(false);
        setMaximumSize(new java.awt.Dimension(45, 20));
        setMinimumSize(new java.awt.Dimension(50, 30));
        setOpaque(true);
        setPreferredSize(new java.awt.Dimension(50, 50));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        // TODO add your handling code here:
        MOUSEHOVER = true;
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        // TODO add your handling code here:
        MOUSEHOVER = false;
    }//GEN-LAST:event_formMouseExited

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formMousePressed

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        // TODO add your handling code here:
        if(this.isSelected()) {
            this.setBackground(BUTTONTOGGLED);
            this.setForeground(TEXTTOGGLED);
        } else {
            this.setBackground(BUTTON);
            this.setForeground(TEXT);
        }
    }//GEN-LAST:event_formMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    @Override
    public void setSelected(boolean b) {
        super.setSelected(b); //To change body of generated methods, choose Tools | Templates.
        if(this.isSelected()) {
            this.setBackground(BUTTONTOGGLED);
            this.setForeground(TEXTTOGGLED);
        } else {
            this.setBackground(BUTTON);
            this.setForeground(TEXT);
        }
        this.repaint();
    }
}