package com.leyou.upload.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author moxiaolin
 * @date 2018/9/16
 */
@Data
@ConfigurationProperties(prefix = "ly.upload")
@Component
public class UploadProperties {

    private String baseUrl;
    private List<String> allowTypes;
}
