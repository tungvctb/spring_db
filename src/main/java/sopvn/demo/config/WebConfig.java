package sopvn.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import sopvn.demo.utils.ViewNames;

@EnableWebMvc
@Configuration
public class WebConfig implements WebMvcConfigurer {
    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/").setViewName(ViewNames.ADMIN_INDEX);
        registry.addViewController("/").setViewName(ViewNames.CATE_INDEX);
        registry.addViewController("/").setViewName(ViewNames.CATE_DETAIL);
        registry.addViewController("/").setViewName(ViewNames.CATE_CREATE);
    }
}
