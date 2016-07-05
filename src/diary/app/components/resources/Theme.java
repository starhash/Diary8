/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diary.app.components.resources;

import java.awt.Color;

/**
 *
 * @author Harsh
 */
public class Theme {
    public String NAME;
    public Color BASE;
    public Color FASE;
    public Color BDEV1;
    public Color BDEV2;
    public Color BDEV3;
    public Color FDEV1;
    public Color FDEV2;
    public Color FDEV3;

    public Theme(String NAME, Color BASE, Color FASE, Color BDEV1, Color BDEV2, Color BDEV3, Color FDEV1, Color FDEV2, Color FDEV3) {
        this.NAME = NAME;
        this.BASE = BASE;
        this.FASE = FASE;
        this.BDEV1 = BDEV1;
        this.BDEV2 = BDEV2;
        this.BDEV3 = BDEV3;
        this.FDEV1 = FDEV1;
        this.FDEV2 = FDEV2;
        this.FDEV3 = FDEV3;
    }
    
    
}
