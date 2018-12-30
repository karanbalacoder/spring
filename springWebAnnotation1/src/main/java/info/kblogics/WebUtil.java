package info.kblogics;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebUtil implements WebApplicationInitializer{

	@SuppressWarnings("resource")
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext container = new AnnotationConfigWebApplicationContext();
		container.register(EnableAnnotations.class);
		DispatcherServlet dispatcherServlet = new DispatcherServlet(container);
		Dynamic dynamic = servletContext.addServlet("ds", dispatcherServlet);
		dynamic.addMapping("/");
		dynamic.setLoadOnStartup(2);
		
		
	}

}
