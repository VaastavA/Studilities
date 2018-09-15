package edu.purdue.arora74.studilties;

import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.provider.Telephony;

import java.time.Clock;

public class Checker implements Runnable {

    ClockView clockView;
    @Override
    public void run() {
        check();
    }

    public void check(){
        while(!clockView.refresh){};

    }

    Checker(ClockView clockView){
        this.clockView = clockView;
    }
}
