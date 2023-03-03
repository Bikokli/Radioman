import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetMaxVolume() {
        Radio radio = new Radio();
        for (int i = 0; i < 100; i++) {
            radio.increaseVolume();
        }
        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinVolume() {
        Radio radio = new Radio();
        radio.increaseVolume();
        for (int i = 0; i < 100; i++) {
            radio.decreaseVolume();
        }
        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxRadioStation() {
        Radio radio = new Radio();
        radio.prevRadioStation();
        for (int i = 0; i < 9; i++) {
            radio.nextRadioStation();
        }
        int expected = 8;
        int actual = radio.getRadioStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinRadioStation() {
        Radio radio = new Radio();
        radio.nextRadioStation();
        for (int i = 0; i < 10; i++) {
            radio.prevRadioStation();
        }
        int expected = 1;
        int actual = radio.getRadioStations();

        Assertions.assertEquals(expected, actual);
    }

}
