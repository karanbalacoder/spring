package info.kblogics.util;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebApplicationIntializerUtil implements WebApplicationInitializer {

	@SuppressWarnings("resource")
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
		applicationContext.register(EnableAnnotations.class);
		DispatcherServlet dispatcherServlet = new DispatcherServlet(applicationContext);
		Dynamic dynamic = servletContext.addServlet("ds", dispatcherServlet);
		dynamic.addMapping("/");
		dynamic.setLoadOnStartup(3);
	}

}
