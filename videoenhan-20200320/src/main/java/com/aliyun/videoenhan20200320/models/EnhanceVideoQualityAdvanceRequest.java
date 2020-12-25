// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class EnhanceVideoQualityAdvanceRequest extends TeaModel {
    @NameInMap("VideoURLObject")
    @Validation(required = true)
    public java.io.InputStream videoURLObject;

    @NameInMap("Async")
    public Boolean async;

    @NameInMap("OutPutWidth")
    public Integer outPutWidth;

    @NameInMap("OutPutHeight")
    public Integer outPutHeight;

    @NameInMap("FrameRate")
    public Integer frameRate;

    @NameInMap("HDRFormat")
    public String HDRFormat;

    @NameInMap("MaxIlluminance")
    public Integer maxIlluminance;

    @NameInMap("Bitrate")
    public Integer bitrate;

    public static EnhanceVideoQualityAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        EnhanceVideoQualityAdvanceRequest self = new EnhanceVideoQualityAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public EnhanceVideoQualityAdvanceRequest setVideoURLObject(java.io.InputStream videoURLObject) {
        this.videoURLObject = videoURLObject;
        return this;
    }
    public java.io.InputStream getVideoURLObject() {
        return this.videoURLObject;
    }

    public EnhanceVideoQualityAdvanceRequest setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
    }

    public EnhanceVideoQualityAdvanceRequest setOutPutWidth(Integer outPutWidth) {
        this.outPutWidth = outPutWidth;
        return this;
    }
    public Integer getOutPutWidth() {
        return this.outPutWidth;
    }

    public EnhanceVideoQualityAdvanceRequest setOutPutHeight(Integer outPutHeight) {
        this.outPutHeight = outPutHeight;
        return this;
    }
    public Integer getOutPutHeight() {
        return this.outPutHeight;
    }

    public EnhanceVideoQualityAdvanceRequest setFrameRate(Integer frameRate) {
        this.frameRate = frameRate;
        return this;
    }
    public Integer getFrameRate() {
        return this.frameRate;
    }

    public EnhanceVideoQualityAdvanceRequest setHDRFormat(String HDRFormat) {
        this.HDRFormat = HDRFormat;
        return this;
    }
    public String getHDRFormat() {
        return this.HDRFormat;
    }

    public EnhanceVideoQualityAdvanceRequest setMaxIlluminance(Integer maxIlluminance) {
        this.maxIlluminance = maxIlluminance;
        return this;
    }
    public Integer getMaxIlluminance() {
        return this.maxIlluminance;
    }

    public EnhanceVideoQualityAdvanceRequest setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
        return this;
    }
    public Integer getBitrate() {
        return this.bitrate;
    }

}
