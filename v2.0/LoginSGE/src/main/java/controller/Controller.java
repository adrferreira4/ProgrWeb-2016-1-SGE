package controller;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;

public class Controller {
	
	public static String valor(HttpServletRequest req, String param, String padrao) {
		String result = req.getParameter(param);
		if (result == null) {
			result = padrao;
		}
		return result;
	}

	
	public static int toInt(HttpServletRequest req, String param, String padrao) {
		return Integer.parseInt(valor(req, param, padrao));
	}
	
	public static Date toDate(HttpServletRequest req, String param){
		DateFormat formatadorDeData = new SimpleDateFormat("yyyy-mm-dd");
		String result = req.getParameter(param);
		try {
			if (result == null) {
				return new Date(formatadorDeData.parse("01-01-1800").getTime());
			}
			Date retorno = new Date(formatadorDeData.parse(result).getTime());
			return retorno;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
