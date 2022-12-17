public class Radio {


    public int increaseVolume(int i) {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
        return i;
    }


    private int currentStation;
    private int currentVolume;

    private int maxStation;

    private int maxVolume;


    public Radio() {
        maxStation = 9;
        maxVolume = 100;

    }


    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }

        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;

    }

    public int getCurrentVolume() {
        return currentVolume;

    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void next() {

        if (currentStation < maxStation) {
            currentStation++;
            return;
        }
        currentStation = 0;
    }

    public void prev() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }

    }

    public int getCurrentStation() {
        return currentStation;
    }
}