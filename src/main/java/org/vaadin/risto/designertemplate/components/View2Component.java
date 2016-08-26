package org.vaadin.risto.designertemplate.components;

import org.vaadin.risto.designertemplate.designs.View2Design;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;

public class View2Component extends View2Design implements View {

	public  View2Component() {
		toggleColor.addClickListener(e -> {
			if(getUI().getStyleName().contains("redText")) {
				getUI().removeStyleName("redText");
			}else {
				getUI().addStyleName("redText");
			}
		});
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub

	}

}
