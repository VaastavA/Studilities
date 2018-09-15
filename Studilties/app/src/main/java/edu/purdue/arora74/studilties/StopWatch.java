package edu.purdue.arora74.studilties;

public class StopWatch {
    private long startTime,stopTime;

    public StopWatch(long startTime,long stopTime){
        this.startTime = startTime;
        this.stopTime = stopTime;
    }
    public long getMinutes() {
        return ((System.currentTimeMillis()-startTime)/1000)/60;
    }

    public long getSeconds() throws Exception{
        long current = System.currentTimeMillis();
        if(System.currentTimeMillis()>stopTime) throw new Exception();
        return (System.currentTimeMillis()-startTime)/1000;
    }

}
