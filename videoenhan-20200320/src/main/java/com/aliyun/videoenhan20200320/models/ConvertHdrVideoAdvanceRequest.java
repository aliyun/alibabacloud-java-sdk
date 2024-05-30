// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class ConvertHdrVideoAdvanceRequest extends TeaModel {
    @NameInMap("Bitrate")
    public Integer bitrate;

    @NameInMap("HDRFormat")
    public String HDRFormat;

    @NameInMap("MaxIlluminance")
    public Integer maxIlluminance;

    /**
     * <p>This parameter is required.</p>
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
