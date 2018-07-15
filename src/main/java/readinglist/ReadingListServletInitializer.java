package readinglist;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

public class ReadingListServletInitializer extends SpringBootServletInitializer {

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
    //打包时把web.xml、servlet、filter绑定到web容器
    return builder.sources(ReadingListApplication.class);
  }
  
}
