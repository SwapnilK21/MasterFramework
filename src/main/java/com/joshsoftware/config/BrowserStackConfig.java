package com.joshsoftware.config;

import java.net.URL;

import org.aeonbits.owner.Config;

import com.joshsoftware.config.converter.StringToURLConverter;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
	"file:${user.dir}/src/test/resources/browser-stack.properties"
})
public interface BrowserStackConfig extends Config{

	@Key("username")
	String username();
	
	String key();
	
	@DefaultValue("https://${username}:${key}@hub-cloud.browserstack.com/wd/hub")
	@ConverterClass(StringToURLConverter.class)
	URL browserStackURL();
}
