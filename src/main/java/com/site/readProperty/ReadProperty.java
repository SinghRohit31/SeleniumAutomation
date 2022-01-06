package com.site.readProperty;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

import com.site.constants.FrameworkConstants;

public final class ReadProperty {

	private ReadProperty() {
	}
	
	public static String readPropertyFile(String key) throws IOException  {
		Properties property = new Properties();
		FileInputStream input = null;
		try {
			input = new FileInputStream(FrameworkConstants.CONFIGPATH);
			property.load(input);
			return property.getProperty(key);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			if(Objects.nonNull(input)) {
				input.close();
			}
		}
		return key;
		
		
	}
	
	
	
}
