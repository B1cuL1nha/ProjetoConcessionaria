package br.sceweb.modelo;

import java.util.Locale;

import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

public class ManipulaDatas {
	public static void main(String[] args) {

		Logger logger = Logger.getLogger(ManipulaDatas.class);

		DateTime dateTime = new DateTime();
		// Imprimindo a data no formato YYYY-MM-dd
		logger.info("dateTime.toString() = " + dateTime.toString("YYYY-MM-dd"));

		// Imprimindo a data no formato YYYY-MM-dd HH:mm:ss
		logger.info("dateTime.toString() = " + dateTime.toString("YYYY-MM-dd HH:mm:ss"));

		// Imprimindo o mês
		logger.info("dateTime.toString() = " + dateTime.monthOfYear().getAsText());

		// Imprimindo o mês
		logger.info("dateTime.toString() = " + dateTime.monthOfYear().getAsShortText());

		// Imprimindo o mês em Inglês
		logger.info("dateTime.toString() = " + dateTime.monthOfYear().getAsText(Locale.ENGLISH));
		
		//formatacao da data
		DateTimeFormatter fmt = DateTimeFormat.forPattern("dd-MM-YYYY");

		// Alternativa 1
		logger.info(fmt.print(dateTime));

		// Alternativa 2
		logger.info(dateTime.toString(fmt));

		// Efetuando parse da string no formato "dd-MM-YYYY"
		dateTime = fmt.parseDateTime("21-12-2012");
		logger.info(dateTime.toString(fmt));

		// Imprimindo no formato ISO8601
		fmt = ISODateTimeFormat.dateTime();
		logger.info(fmt.print(dateTime));
	}
}
