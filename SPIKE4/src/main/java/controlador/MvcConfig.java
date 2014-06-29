package controlador;


import java.util.Locale;

import org.apache.catalina.Engine;
import org.apache.catalina.filters.SetCharacterEncodingFilter;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.springframework.web.servlet.mvc.support.ControllerClassNameHandlerMapping;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;
import org.thymeleaf.templateresolver.TemplateResolver;
import  org.springframework.validation.MessageCodesResolver;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {
    
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/siniestro").setViewName("siniestro");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/hello").setViewName("hello");
        registry.addViewController("/pruebas").setViewName("pruebas");
  
    }
    
    /*
    <bean class="org.thymeleaf.spring3.view.ThymeleafViewResolver"> 
    <property name="templateEngine" ref="templateEngine" /> 
    <property name="order" value="1" /> 
    <property name="viewNames" value="*.html,*.xhtml" /> 
    <property name="contentType" value="text/html; charset=UTF-8"/> 
    </bean>
    */
  /*
    @Bean
    public SpringTemplateEngine templateEngine(MessageSource messageSource, ServletContextTemplateResolver templateResolver) { 
        SpringTemplateEngine engine = new SpringTemplateEngine();
        templateResolver.setCharacterEncoding("UTF-8");
        engine.setTemplateResolver(templateResolver);
        engine.setMessageSource(messageSource);
        return engine;
    }
    */
    /*
    @Bean 
    public SessionLocaleResolver localeResolver() { 
            SessionLocaleResolver localeResolver = new SessionLocaleResolver(); 
            Locale defaultLocale = new Locale("en"); 
            localeResolver.setDefaultLocale(defaultLocale); 
            return localeResolver; 
    } 
    
    @Bean 
    public LocaleChangeInterceptor localeChangeInterceptor() { 
            LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor(); 
            localeChangeInterceptor.setParamName("language"); 
            return localeChangeInterceptor; 
    } 
    
    @Bean 
    public ControllerClassNameHandlerMapping handlerMapping() { 
            ControllerClassNameHandlerMapping ccnhm = new ControllerClassNameHandlerMapping(); 
            //I am not sure if I am doing this right 
            Object[] interceptors = new Object[1]; 
            interceptors[0] = localeChangeInterceptor(); 
            ccnhm.setInterceptors(interceptors); 
            return ccnhm; 
    } 
    
    @Bean 
    public ResourceBundleMessageSource messageSource() { 
            ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource(); 
            messageSource.setBasename("/resources/messages"); 
            return messageSource; 
    } 
    */

}
