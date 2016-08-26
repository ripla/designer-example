package org.vaadin.risto.designertemplate.components;

import org.vaadin.risto.designertemplate.designs.MainViewDesign;

import com.vaadin.ui.ComponentContainer;

public class MainViewComponent extends MainViewDesign {

	public MainViewComponent() {
		view1.addClickListener((e) -> getUI().getNavigator().navigateTo("view1"));
		view2.addClickListener((e) -> getUI().getNavigator().navigateTo("view2"));
		view3.addClickListener((e) -> getUI().getNavigator().navigateTo("view3"));
	}

	public ComponentContainer getContent() {
		return content;
	}
}
