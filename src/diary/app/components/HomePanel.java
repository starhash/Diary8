/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diary.app.components;

import diary.Diary8Desktop;
import diary.app.components.resources.Theme;
import diary.app.components.resources.ThemeColors;
import diary.app.controls.MButton;
import diary.app.controls.TabItemEvent;
import diary.app.controls.TabItemStateListener;
import java.awt.Color;
import java.awt.Dimension;

/**
 *
 * @author Harsh
 */
public class HomePanel extends javax.swing.JComponent {
    int selectedTab = 0;
    
    /**
     * Creates new form homePanel
     */
    public HomePanel() {
        initComponents();
        mTabbedPane1.setTabHeadHeight(40);
        mTabbedPane1.setTabHeadWidth(180);
        try {
            setTheme(Diary8Desktop.THEMES.get(selTheme));
        } catch (NullPointerException e) {
        }
        mTabbedPane1.addTab("Home", homeTab);
        mTabbedPane1.addTab("Appearance", appearanceTab);
        mTabbedPane1.addTabItemStateListener(new TabItemStateListener() {

            @Override
            public void selectedTabChanged(TabItemEvent e) {
                mTabbedPane1.setSelectedTab(e.selectedTab);
            }
        });
    }

    public void setTheme(Theme t) {
        t = Diary8Desktop.THEMES.get(selTheme);
        mButton3.setText(t.NAME);
        mButton3.setButtonColors(t.BDEV1, t.BDEV2, t.BASE);
        mButton3.setTextColors(t.FDEV1, t.FDEV2, t.FASE);
        mButton3.repaint();
        Diary8Desktop.DIARY.diaryPanel.setTheme(t);
        homeTab.setBackground(t.BDEV1);
        Diary8Desktop.DIARY.diaryButton.setButtonColors(Color.WHITE, t.BDEV1);
    }

    public int getSelectedTab() {
        return selectedTab;
    }

    public void setSelectedTab(int selectedTab) {
        this.selectedTab = selectedTab;
        mTabbedPane1.setSelectedTab(selectedTab);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        appearanceTab = new javax.swing.JPanel();
        mButton3 = new diary.app.controls.MButton();
        homeTab = new javax.swing.JPanel();
        chooseColorCombo = new diary.app.controls.MComboPanel();
        mTabbedPane1 = new diary.app.controls.MTabbedPane();

        appearanceTab.setOpaque(false);

        mButton3.setText("");
        mButton3.setFont(new java.awt.Font("Segoe UI Light", 0, 48)); // NOI18N
        mButton3.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                mButton3MouseWheelMoved(evt);
            }
        });
        mButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout appearanceTabLayout = new javax.swing.GroupLayout(appearanceTab);
        appearanceTab.setLayout(appearanceTabLayout);
        appearanceTabLayout.setHorizontalGroup(
            appearanceTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appearanceTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(338, Short.MAX_VALUE))
        );
        appearanceTabLayout.setVerticalGroup(
            appearanceTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appearanceTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(380, Short.MAX_VALUE))
        );

        mButton3.setButtonColors(ThemeColors.BLUE.BDEV1,
            ThemeColors.BLUE.BDEV2,
            ThemeColors.BLUE.BASE);

        javax.swing.GroupLayout homeTabLayout = new javax.swing.GroupLayout(homeTab);
        homeTab.setLayout(homeTabLayout);
        homeTabLayout.setHorizontalGroup(
            homeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 764, Short.MAX_VALUE)
        );
        homeTabLayout.setVerticalGroup(
            homeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 501, Short.MAX_VALUE)
        );

        chooseColorCombo.setTitle("Choose Color");
        for(int i = 16; i<256; i+=16)
        {
            for(int j = 16; j<256; j+=16)
            {
                for(int k = 16; k<256; k+=16)
                {
                    Color c = new Color(i, j, k);
                    Color c2 = new Color(i-6, j, k);
                    Color c3 = new Color(i-12, j, k);
                    MButton m = new MButton();
                    m.setButtonColors(c, c2, c3);
                    m.setPreferredSize(new Dimension(20,20));
                    chooseColorCombo.addItem(m);
                }
            }
        }
        chooseColorCombo.setRowsColumns(64, 64);

        setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void mButton3MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_mButton3MouseWheelMoved
        // TODO add your handling code here:
        selTheme += evt.getWheelRotation();
        if (selTheme > Diary8Desktop.THEMES.size() - 1) {
            selTheme = Diary8Desktop.THEMES.size() - 1;
        } else if (selTheme < 0) {
            selTheme = 0;
        }
        setTheme(Diary8Desktop.THEMES.get(selTheme));
    }//GEN-LAST:event_mButton3MouseWheelMoved

    private void mButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mButton3MouseClicked
        // TODO add your handling code here:
        chooseColorCombo.show();
    }//GEN-LAST:event_mButton3MouseClicked

    public int selTheme = 0;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel appearanceTab;
    private diary.app.controls.MComboPanel chooseColorCombo;
    private javax.swing.JPanel homeTab;
    private diary.app.controls.MButton mButton3;
    private diary.app.controls.MTabbedPane mTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
