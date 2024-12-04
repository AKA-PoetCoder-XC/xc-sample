package com.xc.sample.config;

import jakarta.annotation.PostConstruct;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

/**
 * 配置中心配置信息
 * 
 * @author XieChen
 * @date 2024/12/04
 */
@Slf4j
@Data
@RefreshScope
@Configuration
@ConfigurationProperties(prefix = "xc")
public class ApplicationConfig {

	private Nacos nacos;

	@PostConstruct
	private void postConstruct() {
		log.debug("工程配置 ApplicationConfig {}", this.toString());
	}

	@Data
	public static class Nacos {
		private String serverAddr;
		private String namespace;
	}


}