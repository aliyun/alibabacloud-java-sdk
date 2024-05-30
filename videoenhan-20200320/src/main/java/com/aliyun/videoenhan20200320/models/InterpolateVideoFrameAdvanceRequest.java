// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class InterpolateVideoFrameAdvanceRequest extends TeaModel {
    @NameInMap("Bitrate")
    public Integer bitrate;

    @NameInMap("FrameRate")
    public Integer frameRate;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("VideoURL")
    public java.io.InputStream videoURLObject;

    public static InterpolateVideoFrameAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        InterpolateVideoFrameAdvanceRequest self = new InterpolateVideoFrameAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public InterpolateVideoFrameAdvanceRequest setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
        return this;
    }
    public Integer getBitrate() {
        return this.bitrate;
    }

    public InterpolateVideoFrameAdvanceRequest setFrameRate(Integer frameRate) {
        this.frameRate = frameRate;
        return this;
    }
    public Integer getFrameRate() {
        return this.frameRate;
    }

    public InterpolateVideoFrameAdvanceRequest setVideoURLObject(java.io.InputStream videoURLObject) {
        this.videoURLObject = videoURLObject;
        return this;
    }
    public java.io.InputStream getVideoURLObject() {
        return this.videoURLObject;
    }

}
