public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation () {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;

    }
    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;


    }

    public void nextStation() {
        currentStation++;
        if (currentStation > 9) {
            currentStation = 0;
        }

    }

    public void prevStation() {
        currentStation = currentStation - 1;

        if (currentStation < 0) {
            currentStation = 9;
        }

    }

    public void increaseVolume() {
        if (currentVolume == 10) {
            return;
        }
        currentVolume++;

    }

    public void reduceVolume() {
        if (currentVolume == 0) {
            return;
        }
        currentVolume = currentVolume - 1;


    }



}
