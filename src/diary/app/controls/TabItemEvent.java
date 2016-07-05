package diary.app.controls;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Harsh
 */
public class TabItemEvent extends java.util.EventObject {
	public int selectedTab;

	public TabItemEvent(Object source, int selectedTab) {
		super(source);
		this.selectedTab = selectedTab;
	}
	
	// and some getters here
}