package diary.app.controls;
import javax.swing.JList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Harsh
 */
public class MList extends JList {

    /**
     * Creates new form MList
     */
    public MList() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "A", "B", "C", "D" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        setSelectionBackground(new java.awt.Color(102, 102, 102));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
