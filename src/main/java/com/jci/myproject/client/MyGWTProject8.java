package com.jci.myproject.client;

import com.jci.myproject.client.core.Main;
import com.jci.myproject.client.core.MainView;
import com.jci.myproject.shared.FieldVerifier;

import java.util.Arrays;
import java.util.List;

import com.google.gwt.cell.client.TextCell;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.cellview.client.CellList;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class MyGWTProject8 implements EntryPoint {
	/**
	 * The message displayed to the user when the server cannot be reached or
	 * returns an error.
	 */
	private static final String SERVER_ERROR = "An error occurred while "
			+ "attempting to contact the server. Please check your network " + "connection and try again.";

	/**
	 * Create a remote service proxy to talk to the server-side Greeting service.
	 */
	private final GreetingServiceAsync greetingService = GWT.create(GreetingService.class);
	 // The list of data to display.
	  private static final List<String> DAYS = Arrays.asList("Sunday", "Monday",
	      "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday");
	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		MainView mainView = new MainView();
		RootPanel.get().add(mainView);
		// Create a cell to render each value in the list.
//	    TextCell textCell = new TextCell();
//
//	    // Create a CellList that uses the cell.
//	    CellList<String> cellList = new CellList<String>(textCell);
//
//	    // Set the total row count. This isn't strictly necessary, but it affects
//	    // paging calculations, so its good habit to keep the row count up to date.
//	    cellList.setRowCount(DAYS.size(), true);
//
//	    // Push the data into the widget.
//	    cellList.setRowData(0, DAYS);
//
//	    // Add it to the root panel.
//	    RootPanel.get().add(cellList);
	}
}
