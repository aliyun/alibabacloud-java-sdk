// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class EraseVideoSubtitlesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0.25</p>
     */
    @NameInMap("BH")
    public Float BH;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BW")
    public Float BW;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("BX")
    public Float BX;

    /**
     * <strong>example:</strong>
     * <p>0.75</p>
     */
    @NameInMap("BY")
    public Float BY;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/videoenhan/EraseVideoSubtitles/EraseVideoSubtitles1.mp4">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/videoenhan/EraseVideoSubtitles/EraseVideoSubtitles1.mp4</a></p>
     */
    @NameInMap("VideoUrl")
    public String videoUrl;

    public static EraseVideoSubtitlesRequest build(java.util.Map<String, ?> map) throws Exception {
        EraseVideoSubtitlesRequest self = new EraseVideoSubtitlesRequest();
        return TeaModel.build(map, self);
    }

    public EraseVideoSubtitlesRequest setBH(Float BH) {
        this.BH = BH;
        return this;
    }
    public Float getBH() {
        return this.BH;
    }

    public EraseVideoSubtitlesRequest setBW(Float BW) {
        this.BW = BW;
        return this;
    }
    public Float getBW() {
        return this.BW;
    }

    public EraseVideoSubtitlesRequest setBX(Float BX) {
        this.BX = BX;
        return this;
    }
    public Float getBX() {
        return this.BX;
    }

    public EraseVideoSubtitlesRequest setBY(Float BY) {
        this.BY = BY;
        return this;
    }
    public Float getBY() {
        return this.BY;
    }

    public EraseVideoSubtitlesRequest setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

}
