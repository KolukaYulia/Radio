public class Radio {
    private int currentStation;
    public int currentVolume;

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


    public void nextStation() {
        if (currentStation <= 9) {
            currentStation = currentStation + 1;
        }
        if (currentStation >= 10) {
          currentStation = 0;
        }

    }



    public void prevStation() {
        if (currentStation <= 9) {
           currentStation = currentStation - 1;
        }
        if (currentStation < 0) {
            currentStation = 9;
        }

    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume +1;
        }
        if (currentVolume >= 10) {
            currentVolume = 10;
        }
        if (currentVolume <= 0) {
            currentVolume = 0;
        }

    }

    public void reduceVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume -1;
        }
        if (currentVolume >= 10) {
            currentVolume = 10;
        }
        if (currentVolume <= 0) {
            currentVolume = 0;
        }

    }



}
