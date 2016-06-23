package ro.ubbcluj.movies.web.config;

import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 * Created by Patri on 6/16/2016.
 */

@Configuration
@ComponentScan({"ro.ubbcluj.movies.web.controller", "ro.ubbcluj.movies.web.converter"})
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter{

    public WebConfig() {
        super();
    }

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(createMappingJackson2HttpMessageConverter());

        super.configureMessageConverters(converters);
    }

    private MappingJackson2HttpMessageConverter createMappingJackson2HttpMessageConverter() {
        MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
        mappingJackson2HttpMessageConverter.getObjectMapper().configure(SerializationFeature.WRAP_ROOT_VALUE, true);

        return mappingJackson2HttpMessageConverter;
    }
}
