public class Radio {
    //private int minStation = 0;
    //private int quantityStations = 10;
    //private int maxStation = minStation + quantityStations - 1;

    private int currentStation;
    public int currentVolume;



    //public int getMinStation () { return minStation; }

    //public int getMaxStation () { return maxStation; }


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
    //public int getQuantityStations () {
        //return quantityStations;
    //}

    //public Radio() {

    //}

    //public Radio(int quantity) {
        //quantityStations = quantity;
        //maxStation = minStation + quantity - 1;
    //}


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
