import org.junit.jupiter.api.Test;
import ru.netology.radio.Radio;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    void setStationByNumberInside(){
        Radio service = new Radio(10);
        int button = 2;
        int expected = 2;

        service.setStationNumber(button);
        int actual = service.getStationNumber();

        assertEquals(expected, actual);
    }

    @Test
    void setStationByNumberOver(){
        Radio service = new Radio(10);
        int button = 11;
        int expected = 0;

        service.setStationNumber(button);
        int actual = service.getStationNumber();

        assertEquals(expected, actual);
    }

    @Test
    void setStationByNumberBelow(){
        Radio service = new Radio(10);
        int button = -1;
        int expected = 0;

        service.setStationNumber(button);
        int actual = service.getStationNumber();

        assertEquals(expected, actual);
    }


    @Test
    void setStationWithNext(){
        Radio service = new Radio(10);
        int button = 8;
        int expected = 9;

        service.setStationNumber(button);
        service.setStationNext();
        int actual = service.getStationNumber();

        assertEquals(expected, actual);
    }

    @Test
    void setStationWithNextLimit(){
        Radio service = new Radio(9);
        int button = 9;
        int expected = 0;

        service.setStationNumber(button);
        service.setStationNext();
        int actual = service.getStationNumber();

        assertEquals(expected, actual);
    }


    @Test
    void setStationWithPrev(){
        Radio service = new Radio();
        int button = 1;
        int expected = 0;

        service.setStationNumber(button);
        service.setStationPrev();
        int actual = service.getStationNumber();

        assertEquals(expected, actual);
    }

    @Test
    void setStationWithPrevLimit(){
        Radio service = new Radio();
        int button = 0;
        int expected = 10;

        service.setStationNumber(button);
        service.setStationPrev();
        int actual = service.getStationNumber();

        assertEquals(expected, actual);
    }


    @Test
    void setSoundWithPlus(){
        Radio service = new Radio();
        int expected = 1;

        service.setSoundVolumePlus();
        int actual = service.getSoundVolume();

        assertEquals(expected, actual);

    }

    @Test
    void setSoundWithPlusOver(){
        Radio service = new Radio(5, 100);
        int expected = 100;

        service.setSoundVolumePlus();
        int actual = service.getSoundVolume();

        assertEquals(expected, actual);

    }


    @Test
    void setSoundWithMinus(){
        Radio service = new Radio(5,3);
        int expected = 2;

        service.setSoundVolumeMinus();
        int actual = service.getSoundVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setSoundWithMinusBelow(){
        Radio service = new Radio();
        int expected = 0;

        service.setSoundVolumeMinus();
        int actual = service.getSoundVolume();

        assertEquals(expected, actual);
    }

}
