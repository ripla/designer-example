package org.vaadin.risto.designertemplate;

import javax.servlet.annotation.WebServlet;

import org.vaadin.risto.designertemplate.components.MainViewComponent;
import org.vaadin.risto.designertemplate.components.View1Component;
import org.vaadin.risto.designertemplate.components.View2Component;
import org.vaadin.risto.designertemplate.components.View3Component;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.UI;

@SuppressWarnings("serial")
@Theme("designertemplate")
public class DesignerTemplateUI extends UI {

	@WebServlet(value = "/*", asyncSupported = true)
	@VaadinServletConfiguration(productionMode = false, ui = DesignerTemplateUI.class)
	public static class Servlet extends VaadinServlet {
	}

	@Override
	protected void init(VaadinRequest request) {
		MainViewComponent mainDesign = new MainViewComponent();
		Navigator navigator = new Navigator(this, mainDesign.getContent());
		navigator.addView("view1", View1Component.class);
		navigator.addView("view2", View2Component.class);
		navigator.addView("view3", View3Component.class);
		
		setContent(mainDesign);
		
		navigator.navigateTo("view1");
	}
}