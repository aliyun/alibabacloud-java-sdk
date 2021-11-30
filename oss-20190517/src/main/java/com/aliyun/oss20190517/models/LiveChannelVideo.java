// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class LiveChannelVideo extends TeaModel {
    // description
    @NameInMap("Bandwidth")
    public Long bandwidth;

    // description
    @NameInMap("Codec")
    public String codec;

    // description
    @NameInMap("FrameRate")
    public Long frameRate;

    // description
    @NameInMap("Height")
    public Long height;

    // description
    @NameInMap("Width")
    public Long width;

    public static LiveChannelVideo build(java.util.Map<String, ?> map) throws Exception {
        LiveChannelVideo self = new LiveChannelVideo();
        return TeaModel.build(map, self);
    }

    public LiveChannelVideo setBandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Long getBandwidth() {
        return this.bandwidth;
    }

    public LiveChannelVideo setCodec(String codec) {
        this.codec = codec;
        return this;
    }
    public String getCodec() {
        return this.codec;
    }

    public LiveChannelVideo setFrameRate(Long frameRate) {
        this.frameRate = frameRate;
        return this;
    }
    public Long getFrameRate() {
        return this.frameRate;
    }

    public LiveChannelVideo setHeight(Long height) {
        this.height = height;
        return this;
    }
    public Long getHeight() {
        return this.height;
    }

    public LiveChannelVideo setWidth(Long width) {
        this.width = width;
        return this;
    }
    public Long getWidth() {
        return this.width;
    }

}
