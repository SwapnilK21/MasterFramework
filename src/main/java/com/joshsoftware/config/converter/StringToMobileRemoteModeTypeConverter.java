package com.joshsoftware.config.converter;

import java.lang.reflect.Method;

import org.aeonbits.owner.Converter;

import com.joshsoftware.enums.MobileRemoteModeType;

public class StringToMobileRemoteModeTypeConverter implements Converter<MobileRemoteModeType> {

	@Override
	  public MobileRemoteModeType convert(Method method, String mobileRemoteMode) {
	    return MobileRemoteModeType.valueOf(mobileRemoteMode.toUpperCase());
	  }
}
