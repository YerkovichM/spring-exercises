package ua.procamp.util;

import ua.procamp.config.AccountWebAppInitializer;

public class WebAppInitializerWrapper extends AccountWebAppInitializer {
    public String[] getServletMappings() {
        return super.getServletMappings();
    }

    public Class[] getRootConfigClasses() {
        return super.getRootConfigClasses();
    }

    public Class<?>[] getServletConfigClasses() {
        return super.getServletConfigClasses();
    }
}