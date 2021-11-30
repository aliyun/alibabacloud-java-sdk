// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetLiveChannelStatResponseBody extends TeaModel {
    @NameInMap("Audio")
    public LiveChannelAudio audio;

    @NameInMap("ConnectedTime")
    public String connectedTime;

    @NameInMap("RemoteAddr")
    public String remoteAddr;

    @NameInMap("Status")
    public String status;

    @NameInMap("Video")
    public LiveChannelVideo video;

    public static GetLiveChannelStatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLiveChannelStatResponseBody self = new GetLiveChannelStatResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLiveChannelStatResponseBody setAudio(LiveChannelAudio audio) {
        this.audio = audio;
        return this;
    }
    public LiveChannelAudio getAudio() {
        return this.audio;
    }

    public GetLiveChannelStatResponseBody setConnectedTime(String connectedTime) {
        this.connectedTime = connectedTime;
        return this;
    }
    public String getConnectedTime() {
        return this.connectedTime;
    }

    public GetLiveChannelStatResponseBody setRemoteAddr(String remoteAddr) {
        this.remoteAddr = remoteAddr;
        return this;
    }
    public String getRemoteAddr() {
        return this.remoteAddr;
    }

    public GetLiveChannelStatResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetLiveChannelStatResponseBody setVideo(LiveChannelVideo video) {
        this.video = video;
        return this;
    }
    public LiveChannelVideo getVideo() {
        return this.video;
    }

}
