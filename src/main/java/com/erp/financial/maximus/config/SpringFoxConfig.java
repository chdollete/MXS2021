package com.erp.financial.maximus.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@ConfigurationProperties("swag.val")
@EnableSwagger2
public class SpringFoxConfig {
	@Value("${swag.val.description:}")
	private String description;
	@Value("${swag.val.title:}")
	private String title;
	@Value("${swag.val.version:}")
	private String version;
	@Value("${swag.val.basePackage:}")
	private String basePackage;
	@Value("${swag.val.xsalauthorization:}")
	private String salAuthHeader;
	private static final String HEADER = "header";
	private static final String STR = "string";

	@Bean
	public Docket productApi() {

		// Adding Header
		ParameterBuilder aParameterBuilder = new ParameterBuilder();
		aParameterBuilder.name(salAuthHeader).modelRef(new ModelRef(STR)).parameterType(HEADER).required(false).build();

		List<Parameter> aParameters = new ArrayList<Parameter>();
		aParameters.add(aParameterBuilder.build());

		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis((Predicate<RequestHandler>) RequestHandlerSelectors.basePackage(basePackage)).build()
				.apiInfo(apiInfo()).pathMapping("").globalOperationParameters(aParameters);

	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title(title).description(description).version(version).build();
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getBasePackage() {
		return basePackage;
	}

	public void setBasePackage(String basePackage) {
		this.basePackage = basePackage;
	}

}
