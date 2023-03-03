public class Radio {
    private int volume = 0;
    private int radioStations = 0;

    public int getVolume() {
        return volume;
    }

    public int getRadioStations() {
        return radioStations;
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume++;
        }
        System.out.println("volume = " + volume);
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        }
        System.out.println("volume = " + volume);
    }

    public int nextRadioStation() {
        if (radioStations < 9) {
            radioStations++;
        } else {
            radioStations = 0;
        }
        System.out.println("radio station is " + radioStations);
        return 0;
    }

    public void prevRadioStation() {
        if (radioStations > 0) {
            radioStations--;
        } else {
            radioStations = 9;
        }
        System.out.println("radio station is " + radioStations);
    }
}