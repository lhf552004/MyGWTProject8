package com.jci.myproject.client.core;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiConstructor;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

public class Menu extends Composite {

	private static MenuUiBinder uiBinder = GWT.create(MenuUiBinder.class);
	
	MainView mainView;
	
	interface MenuUiBinder extends UiBinder<Widget, Menu> {
	}
	
	public Menu(MainView mainView) {
		this.mainView = mainView;
		initWidget(uiBinder.createAndBindUi(this));
		
	}

	public Menu() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiField
	Button homeButton;
	
	@UiField
	Button documentationButton;

	@UiHandler("homeButton")
	void onClick1(ClickEvent e) {
		this.mainView.NavigateToHome();
	}

	@UiHandler("documentationButton")
	void onClick2(ClickEvent e) {
		this.mainView.NavigateToDocumentation();
	}
	
	public MainView getMainView() {
		return mainView;
	}

	public void setMainView(MainView mainView) {
		this.mainView = mainView;
	}


}
