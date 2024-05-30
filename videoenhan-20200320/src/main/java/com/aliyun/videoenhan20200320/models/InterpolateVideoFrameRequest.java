// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class InterpolateVideoFrameRequest extends TeaModel {
    @NameInMap("Bitrate")
    public Integer bitrate;

    @NameInMap("FrameRate")
    public Integer frameRate;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("VideoURL")
    public String videoURL;

    public static InterpolateVideoFrameRequest build(java.util.Map<String, ?> map) throws Exception {
        InterpolateVideoFrameRequest self = new InterpolateVideoFrameRequest();
        return TeaModel.build(map, self);
    }

    public InterpolateVideoFrameRequest setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
        return this;
    }
    public Integer getBitrate() {
        return this.bitrate;
    }

    public InterpolateVideoFrameRequest setFrameRate(Integer frameRate) {
        this.frameRate = frameRate;
        return this;
    }
    public Integer getFrameRate() {
        return this.frameRate;
    }

    public InterpolateVideoFrameRequest setVideoURL(String videoURL) {
        this.videoURL = videoURL;
        return this;
    }
    public String getVideoURL() {
        return this.videoURL;
    }

}
