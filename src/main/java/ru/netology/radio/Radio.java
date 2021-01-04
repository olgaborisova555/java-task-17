package ru.netology.radio;

public class Radio {
    private int stationNumber;
    private int soundVolume;
    private int stationNumberMax=9;
    private int stationNumberMin=0;
    private int soundVolumeMax = 10;
    private int soundVolumeMin = 0;

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
        if (this.stationNumber == 9){
            this.stationNumber = 0;
        }else this.stationNumber += 1;
    }

    public void setStationPrev(){
        if (this.stationNumber == 0){
            this.stationNumber = 9;
        }else this.stationNumber -= 1;
    }

    public void setSoundVolumePlus(int clicks){

        if (this.soundVolume + clicks > 10){
            this.soundVolume = 10;
        }else this.soundVolume = this.soundVolume + clicks;

    }

    public void setSoundVolumeMinus(){
        if (this.soundVolume > 0){
            this.soundVolume = this.soundVolume - 1;
        }else return;
    }

}

