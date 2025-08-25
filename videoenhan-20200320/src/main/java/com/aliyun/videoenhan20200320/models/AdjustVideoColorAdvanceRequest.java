// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class AdjustVideoColorAdvanceRequest extends TeaModel {
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
    public java.io.InputStream videoUrlObject;

    public static AdjustVideoColorAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AdjustVideoColorAdvanceRequest self = new AdjustVideoColorAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public AdjustVideoColorAdvanceRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public AdjustVideoColorAdvanceRequest setVideoBitrate(Long videoBitrate) {
        this.videoBitrate = videoBitrate;
        return this;
    }
    public Long getVideoBitrate() {
        return this.videoBitrate;
    }

    public AdjustVideoColorAdvanceRequest setVideoCodec(String videoCodec) {
        this.videoCodec = videoCodec;
        return this;
    }
    public String getVideoCodec() {
        return this.videoCodec;
    }

    public AdjustVideoColorAdvanceRequest setVideoFormat(String videoFormat) {
        this.videoFormat = videoFormat;
        return this;
    }
    public String getVideoFormat() {
        return this.videoFormat;
    }

    public AdjustVideoColorAdvanceRequest setVideoUrlObject(java.io.InputStream videoUrlObject) {
        this.videoUrlObject = videoUrlObject;
        return this;
    }
    public java.io.InputStream getVideoUrlObject() {
        return this.videoUrlObject;
    }

}
