package readinglist;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 创建一个单独的bean,加上注解（@ConfigurationProperties），收集（配置）所有的属性。
 * **/

@Component
@ConfigurationProperties("amazon")
public class AmazonProperties {

  //推荐id，可以从amazon获取推荐费用
  private String associateId;
  
  public void setAssociateId(String associateId) {
    this.associateId = associateId;
  }
  
  public String getAssociateId() {
    return associateId;
  }
  
}
