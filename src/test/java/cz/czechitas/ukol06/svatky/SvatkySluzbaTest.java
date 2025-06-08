package cz.czechitas.ukol06.svatky;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.MonthDay;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SvatkySluzbaTest {

    @Test
    void vyhledatSvatkyKeDni() throws IOException {
        //TODO implementovat test metody vyhledatSvatkyKeDni

        SvatkySluzba seznamSvatku = new SvatkySluzba();
        List<String> svatky = seznamSvatku.vyhledatSvatkyKeDni(MonthDay.of(5, 8));
        assertEquals(0, svatky.size());

        svatky = seznamSvatku.vyhledatSvatkyKeDni(MonthDay.of(1, 3));
        assertEquals(3, svatky.size());
        assertEquals(List.of("Radmila", "Jenovefa", "Radomil"), svatky);

        svatky = seznamSvatku.vyhledatSvatkyKeDni(MonthDay.of(9, 21));
        assertEquals(1, svatky.size());
        assertEquals(List.of("Matouš"), svatky);


    }
}
