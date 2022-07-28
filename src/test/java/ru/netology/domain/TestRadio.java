package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio userRadio = new Radio();

    @Test
    void getCurrentRadioStation() {
        userRadio.setCurrentRadioStation(9);
        int expected = 9;
        int actual = userRadio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void getMoreThanMaxRadioStation() {
        userRadio.setCurrentRadioStation(10);
        int expected = 0;
        int actual = userRadio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void getLessThanMinRadioStation() {
        userRadio.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = userRadio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void increaseRadioStation() {
        userRadio.setCurrentRadioStation(8);
        userRadio.increaseRadioStation();
        int expected = 9;
        int actual = userRadio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void increaseMaxRadioStation() {
        userRadio.setCurrentRadioStation(9);
        userRadio.increaseRadioStation();
        int expected = 0;
        int actual = userRadio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void decreaseRadioStation() {
        userRadio.setCurrentRadioStation(1);
        userRadio.decreaseRadioStation();
        int expected = 0;
        int actual = userRadio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void decreaseLessThanMinRadioStation() {
        userRadio.setCurrentRadioStation(0);
        userRadio.decreaseRadioStation();
        int expected = 9;
        int actual = userRadio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void getCurrentRadioVolume() {
        userRadio.setCurrentSoundVolume(10);
        int expected = 10;
        int actual = userRadio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    void getMoreThanMaxRadioVolume() {
        userRadio.setCurrentSoundVolume(101);
        int expected = 0;
        int actual = userRadio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    void getLessThanMinSoundVolume() {
        userRadio.setCurrentSoundVolume(-1);
        int expected = 0;
        int actual = userRadio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    void increaseRadioVolume() {
        userRadio.setCurrentSoundVolume(9);
        userRadio.increaseSoundVolume();
        int expected = 10;
        int actual = userRadio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    void increaseMoreThanMaxRadioVolume() {
        userRadio.setCurrentSoundVolume(100);
        userRadio.increaseSoundVolume();
        int expected = 100;
        int actual = userRadio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    void decreaseRadioVolume() {
        userRadio.setCurrentSoundVolume(1);
        userRadio.decreaseSoundVolume();
        int expected = 0;
        int actual = userRadio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    void decreaseLessThanMinRadioVolume() {
        userRadio.setCurrentSoundVolume(0);
        userRadio.decreaseSoundVolume();
        int expected = 0;
        int actual = userRadio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    void getCurrentRadioAmount() {
        Radio userRadio = new Radio(30);
        int expected = 30;
        int actual = userRadio.getCurrentRadioAmount();
        assertEquals(expected, actual);
    }

    @Test
    void getMaxRadioStation() {
        Radio userRadio = new Radio(30);
        int expected = 29;
        int actual = userRadio.getMaxRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void getMoreThanMaxRadioStation1() {
        Radio userRadio = new Radio(30);
        userRadio.setCurrentRadioStation(30);
        int expected = 0;
        int actual = userRadio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void increaseMaxRadioStation1() {
        Radio userRadio = new Radio(30);
        userRadio.setCurrentRadioStation(29);
        userRadio.increaseRadioStation();
        int expected = 0;
        int actual = userRadio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

}