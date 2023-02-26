import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setStation () {
        Radio radio = new Radio();

        radio.setCurrentStation(2);

        int expected = 2;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationMin () {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationThenAboveMax () {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolume () {
        Radio radio = new Radio();

        radio.currentVolume = 3;

        int expected = 3;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation () {
        Radio radio = new Radio();
        radio.setCurrentStation(7);

        radio.nextStation();

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationMax () {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.nextStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationThenMax () {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.nextStation();


        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationThenAboveMax () {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        radio.nextStation();


        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationThenAboveMax10 () {
        Radio radio = new Radio();
        radio.setCurrentStation(11);

        radio.nextStation();


        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }



    @Test
    public void shouldSetNextStationThenMin () {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.nextStation();


        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationThenBelowMin () {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        radio.nextStation();


        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }



    @Test
    public void shouldSetPrevStation () {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.prevStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationThenMax () {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.prevStation();

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationThenAboveMax () {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationThenMin () {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetPrevStationThenBelowMin () {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolume() {
        Radio radio = new Radio();
        radio.currentVolume = 9;

        radio.increaseVolume();

        int expected = 10;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetIncreaseVolumeThenMax() {
        Radio radio = new Radio();
        radio.currentVolume = 10;

        radio.increaseVolume();

        int expected = 10;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetIncreaseVolumeThenAboveMax() {
        Radio radio = new Radio();
        radio.currentVolume = 11;

        radio.increaseVolume();

        int expected = 10;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolumeThenBelowMin() {
        Radio radio = new Radio();
        radio.currentVolume = -1;

        radio.increaseVolume();

        int expected = 0;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetIncreaseVolumeThenMin() {
        Radio radio = new Radio();
        radio.currentVolume = 0;

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetReduceVolume() {
        Radio radio = new Radio();
        radio.currentVolume = 9;

        radio.reduceVolume();

        int expected = 8;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetReduceVolumeThenMax() {
        Radio radio = new Radio();
        radio.currentVolume = 10;

        radio.reduceVolume();

        int expected = 10;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetReduceVolumeThenAboveMax() {
        Radio radio = new Radio();
        radio.currentVolume = 11;

        radio.reduceVolume();

        int expected = 10;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetReduceVolumeThenMin() {
        Radio radio = new Radio();
        radio.currentVolume = 0;

        radio.reduceVolume();

        int expected = 0;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetReduceVolumeThenBelowMin() {
        Radio radio = new Radio();
        radio.currentVolume = -1;

        radio.reduceVolume();

        int expected = 0;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }




}
