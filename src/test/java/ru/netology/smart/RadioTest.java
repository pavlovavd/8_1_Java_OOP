package ru.netology.smart;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    //ST_ASSIGNER
    @Test
    public void shouldAssignedStationInsideBound() {
        Radio radio = new Radio(20);

        radio.setCurrentStation(15);

        int expected = 15;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldAssignedStationUpperBound() {
        Radio radio = new Radio(20);

        radio.setCurrentStation(19);

        int expected = 19;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);

    }


    @Test
    public void shouldAssignedStationLowerBoundOne() {
        Radio radio = new Radio(20);

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldAssignedStationLowerBound() {
        Radio radio = new Radio(20);

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldAssignedStationAbroadUpper() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldAssignedStationAbroadOne() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldAssignedStationAbroadLower() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldAssignedStationAbroadTwo() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);

    }

    //ST_NEXT
    @Test // Проверка последнего номера странции
    public void shouldNextCurrentStationUpperBound() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.increaseCurrentStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test // Проверка граничного значения последнего номера странции
    public void shouldNextCurrentStationBoundaryUpper() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.increaseCurrentStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test // Проверка первого номера странции
    public void shouldNextCurrentStationLowerBound() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.increaseCurrentStation();

        int expected = 1;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test // Проверка граничного значения первого номера странции
    public void shouldNextCurrentStationBoundaryLower() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.increaseCurrentStation();

        int expected = 2;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test // Проверка значения внутри границ
    public void shouldNextCurrentStationInsideBound() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.increaseCurrentStation();

        int expected = 6;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    //ST_PREV
    @Test // Проверка первого номера странции
    public void shouldPrevCurrentStationLowerBound() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.decreaseCurrentStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test // Проверка граничного значения первого номера странции
    public void shouldPrevCurrentStationBoundaryLower() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.decreaseCurrentStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test // Проверка последнего номера странции
    public void shouldPrevCurrentStationUpperBound() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.decreaseCurrentStation();

        int expected = 8;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test // Проверка граничного последнего номера странции
    public void shouldPrevCurrentStationBoundaryUpper() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        radio.decreaseCurrentStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test // Проверка внутри границ
    public void shouldPrevCurrentStationInsideBound() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.decreaseCurrentStation();

        int expected = 7;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }



    //VOL_INCREASE
    @Test
    public void shouldIncreaseVolumeInsideBound() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);

        radio.increaseVolume();

        int expected = 10;
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

    //VOL_DECREASE
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
    public void shouldDecreaseVolumeLowerBound() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldVolumeUpperBound() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldVolumeLowerBound() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);

    }
}
