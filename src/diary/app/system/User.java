/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diary.app.system;

import diary.Diary8Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Harsh
 */
public class User {
    public String NAME;

    public User(String NAME) {
        this.NAME = NAME;
    }
    
    public String getLogPath() {
        return Diary8Desktop.ROOT+"\\"+NAME+"\\Logs";
    }
    
    public File getLogFolder(int year, int month, int date) {
        return new File(getLogPath()+"\\"+year+"\\"+month+"\\"+date);
    }
    
    public int getLogCountFor(int year, int month, int date) {
        File f = getLogFolder(year, month, date);
        if(f.exists()) {
            return f.listFiles().length;
        }
        return 0;
    }
    
    public void write(File f, String s) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new FileWriter(f));
            pw.write(s);
            pw.close();
        } catch (IOException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            pw.close();
        }
    }
    
    public void append(File f, String s) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new FileWriter(f, true));
            pw.write(s);
            pw.close();
        } catch (IOException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            pw.close();
        }
    }

    public String read(File f) {
        String ss = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            String s = "";
            while ((s = br.readLine()) != null) {
                ss += s + "\n";
            }
            br.close();
        } catch (IOException ex) {
        }
        return ss;
    }

}
