/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diary.app.components.resources;

import diary.Diary8Desktop;
import java.awt.Color;
import java.util.Vector;

/**
 *
 * @author Harsh
 */
public class ThemeColors {

    public static Theme WHITE = new Theme(
            "WHITE",
            Color.WHITE, Color.BLACK,
            new Color(250, 250, 250), new Color(240, 240, 240),
            Color.BLACK, Color.BLACK,
            Color.BLACK, Color.WHITE);
    
    public static Theme BLUE = new Theme(
            "BLUE",
            new Color(235, 235, 255), new Color(210, 210, 255),
            new Color(175, 175, 255), new Color(138, 138, 255),
            Color.BLACK, Color.BLACK,
            Color.BLACK, Color.WHITE);
    
    public static Theme RED = new Theme(
            "RED",
            new Color(255, 245, 245), new Color(255, 235, 235),
            new Color(255, 215, 215), new Color(255,180,180),
            Color.BLACK, Color.BLACK,
            Color.BLACK, Color.WHITE);
    
    public static Theme GREEN = new Theme(
            "GREEN",
            new Color(245, 255, 245), new Color(235, 255, 235),
            new Color(215, 255, 215), new Color(180, 255, 180),
            Color.BLACK, Color.BLACK,
            Color.BLACK, Color.WHITE);
    
    public static Theme BLACK = new Theme(
            "BLACK",
            new Color(240, 240, 240), new Color(200, 200, 200),
            new Color(150, 150, 150), new Color(0,0,0),
            Color.BLACK, Color.BLACK,
            Color.BLACK, Color.WHITE);
    
    static {
        Vector<Theme> THEMES = new Vector<>();
        THEMES.add(WHITE);
        THEMES.add(BLUE);
        THEMES.add(RED);
        THEMES.add(GREEN);
        THEMES.add(BLACK);
        Diary8Desktop.THEMES = THEMES;
    }
}
