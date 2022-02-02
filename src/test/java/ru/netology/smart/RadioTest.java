package ru.netology.smart;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    //ST_ASSIGNER
    @Test
    public void shouldAssignedStationInsideBound() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);

        int expected = 5;
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

        int expected = 0;
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

    //ST_NEXT
    @Test
    public void shouldNextCurrentStationUpperBound() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.increaseCurrentStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextCurrentStationLowerBound() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.increaseCurrentStation();

        int expected = 1;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextCurrentStationInsideBound() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.increaseCurrentStation();

        int expected = 6;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }


    //ST_PREV
    @Test
    public void shouldPrevCurrentStationLowerBound() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.decreaseCurrentStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevCurrentStationUpperBound() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.decreaseCurrentStation();

        int expected = 8;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
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
        radio.setCurrentVolume(10);

        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);

    }


    //VOL_DECREASE
    @Test
    public void shouldDecreaseVolumeInsideBound() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);

        radio.decreaseVolume();

        int expected = 8;
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