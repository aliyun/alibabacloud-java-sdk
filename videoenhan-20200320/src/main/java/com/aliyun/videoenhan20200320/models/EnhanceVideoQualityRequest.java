// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class EnhanceVideoQualityRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Bitrate")
    public Integer bitrate;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("FrameRate")
    public Integer frameRate;

    /**
     * <strong>example:</strong>
     * <p>PQ</p>
     */
    @NameInMap("HDRFormat")
    public String HDRFormat;

    /**
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("MaxIlluminance")
    public Integer maxIlluminance;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("OutPutHeight")
    public Integer outPutHeight;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("OutPutWidth")
    public Integer outPutWidth;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://invi-label.oss-cn-shanghai.aliyuncs.com/label/temp/faceswap/test_for_api/xxxx.mp4">https://invi-label.oss-cn-shanghai.aliyuncs.com/label/temp/faceswap/test_for_api/xxxx.mp4</a></p>
     */
    @NameInMap("VideoURL")
    public String videoURL;

    public static EnhanceVideoQualityRequest build(java.util.Map<String, ?> map) throws Exception {
        EnhanceVideoQualityRequest self = new EnhanceVideoQualityRequest();
        return TeaModel.build(map, self);
    }

    public EnhanceVideoQualityRequest setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
        return this;
    }
    public Integer getBitrate() {
        return this.bitrate;
    }

    public EnhanceVideoQualityRequest setFrameRate(Integer frameRate) {
        this.frameRate = frameRate;
        return this;
    }
    public Integer getFrameRate() {
        return this.frameRate;
    }

    public EnhanceVideoQualityRequest setHDRFormat(String HDRFormat) {
        this.HDRFormat = HDRFormat;
        return this;
    }
    public String getHDRFormat() {
        return this.HDRFormat;
    }

    public EnhanceVideoQualityRequest setMaxIlluminance(Integer maxIlluminance) {
        this.maxIlluminance = maxIlluminance;
        return this;
    }
    public Integer getMaxIlluminance() {
        return this.maxIlluminance;
    }

    public EnhanceVideoQualityRequest setOutPutHeight(Integer outPutHeight) {
        this.outPutHeight = outPutHeight;
        return this;
    }
    public Integer getOutPutHeight() {
        return this.outPutHeight;
    }

    public EnhanceVideoQualityRequest setOutPutWidth(Integer outPutWidth) {
        this.outPutWidth = outPutWidth;
        return this;
    }
    public Integer getOutPutWidth() {
        return this.outPutWidth;
    }

    public EnhanceVideoQualityRequest setVideoURL(String videoURL) {
        this.videoURL = videoURL;
        return this;
    }
    public String getVideoURL() {
        return this.videoURL;
    }

}
