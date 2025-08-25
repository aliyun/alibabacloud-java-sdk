// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class AdjustVideoColorRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>LogC</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("VideoBitrate")
    public Long videoBitrate;

    /**
     * <strong>example:</strong>
     * <p>h264</p>
     */
    @NameInMap("VideoCodec")
    public String videoCodec;

    /**
     * <strong>example:</strong>
     * <p>mp4</p>
     */
    @NameInMap("VideoFormat")
    public String videoFormat;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/videoenhan/AdjustVideoColor/AdjustVideoColor1.mp4">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/videoenhan/AdjustVideoColor/AdjustVideoColor1.mp4</a></p>
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
