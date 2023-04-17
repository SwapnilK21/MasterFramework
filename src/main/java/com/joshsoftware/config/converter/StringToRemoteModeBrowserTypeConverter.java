package com.joshsoftware.config.converter;

import java.lang.reflect.Method;
import java.util.Map;

import org.aeonbits.owner.Converter;

import com.joshsoftware.enums.BrowserRemoteModeType;
import com.joshsoftware.enums.BrowserType;
import com.joshsoftware.enums.RunModeBrowserType;

public class StringToRemoteModeBrowserTypeConverter implements Converter<BrowserRemoteModeType>{

	
	@Override
	public BrowserRemoteModeType convert(Method method, String remoteMode) {
		return BrowserRemoteModeType.valueOf(remoteMode.toUpperCase());
	}
}
	