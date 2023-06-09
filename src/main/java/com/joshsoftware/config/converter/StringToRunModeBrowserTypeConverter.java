package com.joshsoftware.config.converter;

import java.lang.reflect.Method;
import java.util.Map;

import org.aeonbits.owner.Converter;

import com.joshsoftware.enums.BrowserType;
import com.joshsoftware.enums.RunModeBrowserType;

public class StringToRunModeBrowserTypeConverter implements Converter<RunModeBrowserType>{

	
	@Override
	public RunModeBrowserType convert(Method method, String runMode) {
		return RunModeBrowserType.valueOf(runMode.toUpperCase());
	}
}
	