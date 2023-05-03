package com.joshsoftware.config.converter;

import java.lang.reflect.Method;

import org.aeonbits.owner.Converter;

import com.joshsoftware.enums.BrowserRemoteModeType;

public class StringToRemoteModeBrowserTypeConverter implements Converter<BrowserRemoteModeType>{

	
	@Override
	public BrowserRemoteModeType convert(Method method, String remoteMode) {
		return BrowserRemoteModeType.valueOf(remoteMode.toUpperCase());
	}
}
	