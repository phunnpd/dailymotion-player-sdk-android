package com.dailymotion.android.player.sdk.events;

import com.dailymotion.android.player.sdk.PlayerWebView;

public class AdTimeUpdateEvent extends PlayerEvent {

    private String time;

    AdTimeUpdateEvent(String payload, String time) {
        super(PlayerWebView.EVENT_AD_TIME_UPDATE, payload);
        this.time = time;
    }

    public String getTime() {
        return time;
    }
}
