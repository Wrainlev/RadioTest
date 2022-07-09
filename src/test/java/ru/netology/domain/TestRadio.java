package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void getCurrentRadioStation() {
        Radio userRadio = new Radio();
        userRadio.setCurrentRadioStation(9);
        int expected = 9;
        int actual = userRadio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void getMoreThanMaxRadioStation() {
        Radio userRadio = new Radio();
        userRadio.setCurrentRadioStation(10);
        int expected = 0;
        int actual = userRadio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void getLessThanMinRadioStation() {
        Radio userRadio = new Radio();
        userRadio.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = userRadio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void increaseRadioStation() {
        Radio userRadio = new Radio();
        userRadio.setCurrentRadioStation(8);
        userRadio.increaseRadioStation();
        int expected = 9;
        int actual = userRadio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void increaseMaxRadioStation() {
        Radio userRadio = new Radio();
        userRadio.setCurrentRadioStation(9);
        userRadio.increaseRadioStation();
        int expected = 0;
        int actual = userRadio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void decreaseRadioStation() {
        Radio userRadio = new Radio();
        userRadio.setCurrentRadioStation(1);
        userRadio.decreaseRadioStation();
        int expected = 0;
        int actual = userRadio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void decreaseLessThanMinRadioStation() {
        Radio userRadio = new Radio();
        userRadio.setCurrentRadioStation(0);
        userRadio.decreaseRadioStation();
        int expected = 9;
        int actual = userRadio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void getCurrentRadioVolume() {
        Radio userRadio = new Radio();
        userRadio.setCurrentSoundVolume(10);
        int expected = 10;
        int actual = userRadio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    void getMoreThanMaxRadioVolume() {
        Radio userRadio = new Radio();
        userRadio.setCurrentSoundVolume(11);
        int expected = 0;
        int actual = userRadio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    void getLessThanMinSoundVolume() {
        Radio userRadio = new Radio();
        userRadio.setCurrentSoundVolume(-1);
        int expected = 0;
        int actual = userRadio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    void increaseRadioVolume() {
        Radio userRadio = new Radio();
        userRadio.setCurrentSoundVolume(9);
        userRadio.increaseSoundVolume();
        int expected = 10;
        int actual = userRadio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    void increaseMoreThanMaxRadioVolume() {
        Radio userRadio = new Radio();
        userRadio.setCurrentSoundVolume(10);
        userRadio.increaseSoundVolume();
        int expected = 10;
        int actual = userRadio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    void decreaseRadioVolume() {
        Radio userRadio = new Radio();
        userRadio.setCurrentSoundVolume(1);
        userRadio.decreaseSoundVolume();
        int expected = 0;
        int actual = userRadio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    void decreaseLessThanMinRadioVolume() {
        Radio userRadio = new Radio();
        userRadio.setCurrentSoundVolume(0);
        userRadio.decreaseSoundVolume();
        int expected = 0;
        int actual = userRadio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }
}