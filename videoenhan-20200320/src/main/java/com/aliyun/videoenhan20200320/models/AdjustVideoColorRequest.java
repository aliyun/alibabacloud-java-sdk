// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class AdjustVideoColorRequest extends TeaModel {
    @NameInMap("VideoUrl")
    public String videoUrl;

    @NameInMap("Async")
    public Boolean async;

    @NameInMap("VideoBitrate")
    public String videoBitrate;

    @NameInMap("VideoCodec")
    public String videoCodec;

    @NameInMap("VideoFormat")
    public String videoFormat;

    @NameInMap("Mode")
    public String mode;

    public static AdjustVideoColorRequest build(java.util.Map<String, ?> map) throws Exception {
        AdjustVideoColorRequest self = new AdjustVideoColorRequest();
        return TeaModel.build(map, self);
    }

    public AdjustVideoColorRequest setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

    public AdjustVideoColorRequest setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
    }

    public AdjustVideoColorRequest setVideoBitrate(String videoBitrate) {
        this.videoBitrate = videoBitrate;
        return this;
    }
    public String getVideoBitrate() {
        return this.videoBitrate;
    }

    public AdjustVideoColorRequest setVideoCodec(String videoCodec) {
        this.videoCodec = videoCodec;
        return this;
    }
    public String getVideoCodec() {
        return this.videoCodec;
    }

    public AdjustVideoColorRequest setVideoFormat(String videoFormat) {
        this.videoFormat = videoFormat;
        return this;
    }
    public String getVideoFormat() {
        return this.videoFormat;
    }

    public AdjustVideoColorRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

}
