package ru.netology.smart;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


//   Тесты на конструкторы
    @Test
    public void shouldUseRadioLowerBound() {
        Radio radio = new Radio(1);
        radio.setCurrentStation(1);
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void shouldUseRadioUpperBound() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(20);
        assertEquals(20, radio.getCurrentStation());
    }

    @Test
    public void shouldUseRadioUpperLimit() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(15);
        assertEquals(15, radio.getCurrentStation());
    }

    @Test
    public void shouldUseRadioLowerLimit() {
        Radio radio = new Radio(5);
        assertEquals(5, radio.getNumberStation());
    }

    @Test
    public void shouldUseNoArgsRadio() {
        Radio radio = new Radio();
        assertEquals(10, radio.getNumberStation());
    }

    //ST_ASSIGNER
    @Test
    public void shouldAssignedStationOutBound() {
        Radio radio = new Radio();

        radio.setCurrentStation(11);

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldAssignedStationUpperBound() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldAssignedStationLowerBound() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldAssignedStationAbroad() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = 10;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldAssignedStationAbroadLow() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);

    }

    // Тесты на переключение следущей станции
    @Test
    public void shouldNextCurrentStationMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        radio.increaseCurrentStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextCurrentStationMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.increaseCurrentStation();

        int expected = 1;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextCurrentStationBoundMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.increaseCurrentStation();

        int expected = 10;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextCurrentStationBoundMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.increaseCurrentStation();

        int expected = 2;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    // Тесты на переключение предыдущей странции
    @Test
    public void shouldPrevCurrentStationMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.decreaseCurrentStation();

        int expected = 10;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevCurrentStationMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        radio.decreaseCurrentStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevCurrentStationInsideBound() {
        Radio radio = new Radio();
        radio.setCurrentStation(99);

        radio.decreaseCurrentStation();

        int expected = 10;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevCurrentStationLowerBoundMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.decreaseCurrentStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevCurrentStationBoundMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(11);

        radio.decreaseCurrentStation();

        int expected = 10;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    // Тесты на увеличение громкости
    @Test
    public void shouldIncreaseVolumeInsideBound() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeUpperBound() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    // Тесты на уменьшение громкости
    @Test
    public void shouldDecreaseVolumeUpperBound() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.decreaseVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeLowerBound() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeInsideBound() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.decreaseVolume();

        int expected = 98;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }



    @Test
    public void shouldVolumeUpperBound() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1000);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeLowerBound() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
}
