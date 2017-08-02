package com.crisanto;

import com.crisanto.domain.Contacto;
import com.crisanto.domain.LlamadaTelefonica;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );

        Contacto martin = new Contacto("Martin","Juchitan","5555555555", LocalDate.of(1990, Month.JANUARY,26));
        Contacto ali = new Contacto("Ali","Ixtepec","4444444444", LocalDate.of(1991, Month.FEBRUARY,25));
        Contacto elio = new Contacto("Elio","Puerto Escondido","3333333333", LocalDate.of(1980, Month.MARCH,24));
        Contacto nancy = new Contacto("Nancy","Oaxaca","2222222222", LocalDate.of(1992, Month.APRIL,23));
        Contacto roberto = new Contacto("Roberto","Huajuapan","11111111111", LocalDate.of(1993, Month.MAY,22));

        List<LlamadaTelefonica> llamadaTelefonicasLog = Arrays.asList(
                new LlamadaTelefonica(martin,LocalDate.of(2014,Month.MAY,28), Duration.ofSeconds(125)),
                new LlamadaTelefonica(ali,LocalDate.of(2014,Month.MAY,30), Duration.ofMinutes(5)),
                new LlamadaTelefonica(elio,LocalDate.of(2014,Month.MAY,30), Duration.ofMinutes(12)),
                new LlamadaTelefonica(nancy,LocalDate.of(2014,Month.MAY,28), Duration.ofMinutes(3)),
                new LlamadaTelefonica(roberto,LocalDate.of(2014,Month.JUNE,01), Duration.ofSeconds(90)),
                new LlamadaTelefonica(ali,LocalDate.of(2014,Month.MAY,28), Duration.ofSeconds(365)),
                new LlamadaTelefonica(nancy,LocalDate.of(2014,Month.JUNE,01), Duration.ofMinutes(7)),
                new LlamadaTelefonica(roberto,LocalDate.of(2014,Month.MAY,29), Duration.ofSeconds(315)),
                new LlamadaTelefonica(elio,LocalDate.of(2014,Month.MAY,30), Duration.ofMinutes(5)),
                new LlamadaTelefonica(martin,LocalDate.of(2014,Month.JUNE,02), Duration.ofSeconds(180))
        );

    }

}
