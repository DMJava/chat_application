package ua.com.app.applications;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import ua.com.app.configuration.ModelConfiguration;
import ua.com.app.configuration.MvcConfiguration;
import ua.com.app.configuration.SecurityConfiguration;
import ua.com.app.configuration.WebSocketConfiguration;

/**
 * Main application entry.
 */
public class WebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{ModelConfiguration.class, SecurityConfiguration.class,
                WebSocketConfiguration.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{MvcConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
