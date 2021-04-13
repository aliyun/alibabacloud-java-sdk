// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class ConvertHdrVideoRequest extends TeaModel {
    @NameInMap("VideoURL")
    public String videoURL;

    @NameInMap("HDRFormat")
    public String HDRFormat;

    @NameInMap("MaxIlluminance")
    public Integer maxIlluminance;

    @NameInMap("Bitrate")
    public Integer bitrate;

    public static ConvertHdrVideoRequest build(java.util.Map<String, ?> map) throws Exception {
        ConvertHdrVideoRequest self = new ConvertHdrVideoRequest();
        return TeaModel.build(map, self);
    }

    public ConvertHdrVideoRequest setVideoURL(String videoURL) {
        this.videoURL = videoURL;
        return this;
    }
    public String getVideoURL() {
        return this.videoURL;
    }

    public ConvertHdrVideoRequest setHDRFormat(String HDRFormat) {
        this.HDRFormat = HDRFormat;
        return this;
    }
    public String getHDRFormat() {
        return this.HDRFormat;
    }

    public ConvertHdrVideoRequest setMaxIlluminance(Integer maxIlluminance) {
        this.maxIlluminance = maxIlluminance;
        return this;
    }
    public Integer getMaxIlluminance() {
        return this.maxIlluminance;
    }

    public ConvertHdrVideoRequest setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
        return this;
    }
    public Integer getBitrate() {
        return this.bitrate;
    }

}
