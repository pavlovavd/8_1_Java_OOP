package ru.netology.smart;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int numberStation = 10;

    public Radio() {
    }

    public Radio(int numberStation) {
        this.numberStation = numberStation - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getNumberStation() {
        return numberStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 10) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void increaseCurrentStation() {
        if (currentStation < 10) {
            currentStation = currentStation + 1;
        } else {
            this.currentStation = 0;
        }
    }

    public void decreaseCurrentStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            this.currentStation = 10;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}

