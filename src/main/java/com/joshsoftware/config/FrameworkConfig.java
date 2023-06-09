package com.joshsoftware.config;

import org.aeonbits.owner.Config;

import com.joshsoftware.config.converter.StringToBrowserTypeConverter;
import com.joshsoftware.enums.BrowserRemoteModeType;
import com.joshsoftware.enums.BrowserType;
import com.joshsoftware.enums.RunModeBrowserType;

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
}
