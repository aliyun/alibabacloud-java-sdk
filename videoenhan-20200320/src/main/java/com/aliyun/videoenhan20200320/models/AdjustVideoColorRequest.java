// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class AdjustVideoColorRequest extends TeaModel {
    @NameInMap("Mode")
    public String mode;

    @NameInMap("VideoBitrate")
    public Long videoBitrate;

    @NameInMap("VideoCodec")
    public String videoCodec;

    @NameInMap("VideoFormat")
    public String videoFormat;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("VideoUrl")
    public String videoUrl;

    public static AdjustVideoColorRequest build(java.util.Map<String, ?> map) throws Exception {
        AdjustVideoColorRequest self = new AdjustVideoColorRequest();
        return TeaModel.build(map, self);
    }

    public AdjustVideoColorRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public AdjustVideoColorRequest setVideoBitrate(Long videoBitrate) {
        this.videoBitrate = videoBitrate;
        return this;
    }
    public Long getVideoBitrate() {
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

    public AdjustVideoColorRequest setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

}
