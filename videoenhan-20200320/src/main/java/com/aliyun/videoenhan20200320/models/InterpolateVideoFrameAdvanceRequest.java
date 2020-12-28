// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class InterpolateVideoFrameAdvanceRequest extends TeaModel {
    @NameInMap("VideoURLObject")
    @Validation(required = true)
    public java.io.InputStream videoURLObject;

    @NameInMap("Async")
    public Boolean async;

    @NameInMap("FrameRate")
    public Integer frameRate;

    @NameInMap("Bitrate")
    public Integer bitrate;

    public static InterpolateVideoFrameAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        InterpolateVideoFrameAdvanceRequest self = new InterpolateVideoFrameAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public InterpolateVideoFrameAdvanceRequest setVideoURLObject(java.io.InputStream videoURLObject) {
        this.videoURLObject = videoURLObject;
        return this;
    }
    public java.io.InputStream getVideoURLObject() {
        return this.videoURLObject;
    }

    public InterpolateVideoFrameAdvanceRequest setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
    }

    public InterpolateVideoFrameAdvanceRequest setFrameRate(Integer frameRate) {
        this.frameRate = frameRate;
        return this;
    }
    public Integer getFrameRate() {
        return this.frameRate;
    }

    public InterpolateVideoFrameAdvanceRequest setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
        return this;
    }
    public Integer getBitrate() {
        return this.bitrate;
    }

}
