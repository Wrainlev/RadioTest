package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int currentSoundVolume;
    private int maxSoundVolume = 10;
    private int minSoundVolume = 0;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < minRadioStation || currentRadioStation > maxRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void increaseRadioStation() {
        currentRadioStation = currentRadioStation + 1;
        if (currentRadioStation > maxRadioStation) {
            currentRadioStation = minRadioStation;
        }
    }

    public void decreaseRadioStation() {
        currentRadioStation = currentRadioStation - 1;
        if (currentRadioStation < minRadioStation) {
            currentRadioStation = maxRadioStation;
        }
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        if (currentSoundVolume < minSoundVolume || currentSoundVolume > maxSoundVolume) {
            return;
        }
        this.currentSoundVolume = currentSoundVolume;
    }

    public void increaseSoundVolume() {
        if (currentSoundVolume < maxSoundVolume) {
            currentSoundVolume = currentSoundVolume + 1;
        }
    }

    public void decreaseSoundVolume() {
        if (currentSoundVolume > minSoundVolume) {
            currentSoundVolume = currentSoundVolume - 1;
        }
    }
}
