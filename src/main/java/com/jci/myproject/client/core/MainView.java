package com.jci.myproject.client.core;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class MainView extends Composite {

	private static MainViewUiBinder uiBinder = GWT.create(MainViewUiBinder.class);

	@UiField
	HTMLPanel container;
	
	VerticalPanel vPanel;
	
	interface MainViewUiBinder extends UiBinder<Widget, MainView> {
	}

	public MainView() {
		initWidget(uiBinder.createAndBindUi(this));
		Menu menu = new Menu(this);
		container.add(menu);
		vPanel = new VerticalPanel();
		MainHome home = new MainHome();
		vPanel.add(home);
		container.add(vPanel);
	}

	
	public void NavigateToHome() {
		vPanel.clear();
		vPanel.add(new MainHome());
	}
	
	public void NavigateToDocumentation() {
		vPanel.clear();
		vPanel.add(new DocumentationHome());
	}
	

}
