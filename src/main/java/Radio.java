public class Radio {
    private int minStation = 0;
    private int quantityStations = 10;
    private int maxStation = minStation + quantityStations - 1;

    private int currentStation;
    private int minVolume = 0;
    private int maxVolume = 100;

    private int currentVolume;


    public int getMinStation() {
        return minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }




    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;


    }
    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;


    }

    public Radio() {

    }

    public Radio(int quantity) {
        quantityStations = quantity;
        maxStation = minStation + quantity - 1;
    }
    public void nextStation() {
        currentStation++;

        if (currentStation > maxStation) {
            currentStation = 0;
        }

    }
    public void prevStation() {
        currentStation = currentStation - 1;

        if (currentStation < minStation) {
            currentStation = maxStation;
        }

    }

    public void increaseVolume() {
        if (currentVolume == maxVolume) {
            return;
        }
        currentVolume++;

    }

    public void reduceVolume() {
        if (currentVolume == minVolume) {
            return;
        }
        currentVolume = currentVolume - 1;

    }


}
