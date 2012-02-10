package com.psychcn.lms.common.convert;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.ConversionFailedException;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.convert.converter.Converter;

public class StringToDateConverter implements Converter<String, Date>{
	
	private Formats format = new Formats();
	
	
	public StringToDateConverter () {
		format.dateFormat = new SimpleDateFormat("yyyy-MM-dd"); 
		format.datetimeFormat =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		format.timeFormat = new SimpleDateFormat("HH:mm:ss");
		
	}
	
	class Formats {
		DateFormat datetimeFormat;
		DateFormat dateFormat;
		DateFormat timeFormat;
	}
	
	
	@Override
	public  synchronized Date convert(String src) {
		try {
			
			if (src != null) src = src.trim();
			if (src == null || src.length() == 0)
				return null;
			
			Date result;
			Formats fmts = this.format;
			result = internal_convert(src, fmts.datetimeFormat);
			if (result != null) return result;
			
			result = internal_convert(src, fmts.dateFormat);
			if (result != null) return result;
			
			result = internal_convert(src, fmts.timeFormat);
			if (result != null) return result;
		
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			
		}
		
		throw new ConversionFailedException(TypeDescriptor.forObject(src), TypeDescriptor.valueOf(Date.class), src, null);
	}
	
	private Date internal_convert(String src, DateFormat format) {
		try {
			return format.parse(src);
		}catch (ParseException pe) {
			return null;
		}
	}


	
	
}




