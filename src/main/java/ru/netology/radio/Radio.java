package ru.netology.radio;

public class Radio {
    private int stationNumber;
    private int soundVolume;
    private int stationNumberMax=10;
    private int stationNumberMin=0;
    private int soundVolumeMax = 100;
    private int soundVolumeMin = 0;

    public Radio(int stationNumberMax, int soundVolume) {
        this.stationNumberMax = stationNumberMax;
        this.soundVolume = soundVolume;
    }

    public Radio(int stationNumberMax) {
        this.stationNumberMax = stationNumberMax;
    }

    public Radio() {

    }



    public int getStationNumber(){
        return this.stationNumber;
    }

    public int getSoundVolume(){
        return this.soundVolume;
    }

    public void setStationNumber(int number){
        if (number > stationNumberMax){
            return;
        }
        if (number < stationNumberMin){
            return;
        }
        this.stationNumber=number;
    }

    public void setStationNext(){
        if (this.stationNumber == stationNumberMax){
            this.stationNumber = stationNumberMin;
        }else this.stationNumber += 1;
    }

    public void setStationPrev(){
        if (this.stationNumber == stationNumberMin){
            this.stationNumber = stationNumberMax;
        }else this.stationNumber -= 1;
    }

    public void setSoundVolumePlus(){

        if (this.soundVolume == soundVolumeMax){
            return;
        }else this.soundVolume = this.soundVolume + 1;

    }

    public void setSoundVolumeMinus(){
        if (this.soundVolume > soundVolumeMin){
            this.soundVolume = this.soundVolume - 1;
        }else return;
    }

}

