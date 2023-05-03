package com.joshsoftware.config;

import java.net.URL;

import org.aeonbits.owner.Config;

import com.joshsoftware.config.converter.StringToBrowserTypeConverter;
import com.joshsoftware.config.converter.StringToMobileRemoteModeTypeConverter;
import com.joshsoftware.config.converter.StringToRunModeBrowserTypeConverter;
import com.joshsoftware.config.converter.StringToURLConverter;
import com.joshsoftware.enums.BrowserRemoteModeType;
import com.joshsoftware.enums.BrowserType;
import com.joshsoftware.enums.MobileRemoteModeType;
import com.joshsoftware.enums.RunModeBrowserType;
import com.joshsoftware.enums.RunModeType;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
	"system:properties",
	"system:env",
	"file:${user.dir}/src/test/resources/config.properties"
})
public interface FrameworkConfig extends Config{

	@DefaultValue("CHROME")
	@ConverterClass(StringToBrowserTypeConverter.class)
	BrowserType browser();

	@Key("runModeBrowser")
	RunModeBrowserType browserRunMode();
	
	@Key("browserRemoteMode")
	BrowserRemoteModeType browserRemoteMode();
	
	@Key("runModeMobile")
	@ConverterClass(StringToRunModeBrowserTypeConverter.class)
	RunModeType mobileRunMode();
	
	@Key("mobileRemoteMode")
	@ConverterClass(StringToMobileRemoteModeTypeConverter.class)
	MobileRemoteModeType mobileRemoteMode();
	
	@ConverterClass(StringToURLConverter.class)
	URL seleniumGridURL();
	
	@ConverterClass(StringToURLConverter.class)
	URL selenoidURL();
	
	@ConverterClass(StringToURLConverter.class)
	@DefaultValue("http://127.0.0.1:4723/wd/hub")
	URL localAppiumServerURL();
}
