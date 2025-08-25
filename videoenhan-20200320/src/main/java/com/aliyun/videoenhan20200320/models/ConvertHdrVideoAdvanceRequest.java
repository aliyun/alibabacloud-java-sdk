// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class ConvertHdrVideoAdvanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("Bitrate")
    public Integer bitrate;

    /**
     * <strong>example:</strong>
     * <p>HLG</p>
     */
    @NameInMap("HDRFormat")
    public String HDRFormat;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("MaxIlluminance")
    public Integer maxIlluminance;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://invi-label.oss-cn-shanghai.aliyuncs.com/label/temp/faceswap/test_for_api/xxxx.mp4">https://invi-label.oss-cn-shanghai.aliyuncs.com/label/temp/faceswap/test_for_api/xxxx.mp4</a></p>
     */
    @NameInMap("VideoURL")
    public java.io.InputStream videoURLObject;

    public static ConvertHdrVideoAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ConvertHdrVideoAdvanceRequest self = new ConvertHdrVideoAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public ConvertHdrVideoAdvanceRequest setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
        return this;
    }
    public Integer getBitrate() {
        return this.bitrate;
    }

    public ConvertHdrVideoAdvanceRequest setHDRFormat(String HDRFormat) {
        this.HDRFormat = HDRFormat;
        return this;
    }
    public String getHDRFormat() {
        return this.HDRFormat;
    }

    public ConvertHdrVideoAdvanceRequest setMaxIlluminance(Integer maxIlluminance) {
        this.maxIlluminance = maxIlluminance;
        return this;
    }
    public Integer getMaxIlluminance() {
        return this.maxIlluminance;
    }

    public ConvertHdrVideoAdvanceRequest setVideoURLObject(java.io.InputStream videoURLObject) {
        this.videoURLObject = videoURLObject;
        return this;
    }
    public java.io.InputStream getVideoURLObject() {
        return this.videoURLObject;
    }

}
