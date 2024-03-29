package diary.app.controls;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Harsh
 */
public class MTextField extends JTextField {

    private Color BUTTONHOVER = Color.WHITE;
    private Color TEXTHOVER = Color.BLACK;
    private Color BUTTON = new Color(239, 239, 239);
    private Color TEXT = new Color(10, 10, 10);
    private boolean MOUSEHOVER = false;
    private int PADDING = 4;

    /**
     * Creates new form MButton
     */
    public MTextField() {
        initComponents();
        this.setBackground(BUTTON);
        this.setForeground(TEXT);
        this.setBorder(new LineBorder(BUTTON, PADDING));
        MOUSEHOVER = false;
    }

    public void setPadding(int PADDING) {
        this.PADDING = PADDING;
    }

    public void setButtonColors(Color normal, Color mouseover) {
        this.BUTTON = normal;
        this.BUTTONHOVER = mouseover;
    }

    public void setTextColors(Color normal, Color mouseover) {
        this.TEXT = normal;
        this.TEXTHOVER = mouseover;
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

        setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        setText("Sample");
        setBorder(javax.swing.BorderFactory.createLineBorder(this.getBackground(), 4));
        setMaximumSize(new java.awt.Dimension(70, 30));
        setMinimumSize(new java.awt.Dimension(70, 30));
        setPreferredSize(new java.awt.Dimension(70, 30));
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
        this.setBackground(BUTTONHOVER);
        this.setForeground(TEXTHOVER);
        this.setBorder(new LineBorder(BUTTONHOVER, PADDING));
        MOUSEHOVER = true;
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        // TODO add your handling code here:
        this.setBackground(BUTTON);
        this.setForeground(TEXT);
        this.setBorder(new LineBorder(BUTTON, PADDING));
        MOUSEHOVER = false;
    }//GEN-LAST:event_formMouseExited

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formMousePressed

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    private void setBorderPainted(boolean b) {
        
    }

    private void setContentAreaFilled(boolean b) {
        
    }
}
