// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class EraseVideoSubtitlesRequest extends TeaModel {
    @NameInMap("VideoUrl")
    public String videoUrl;

    @NameInMap("Async")
    public Boolean async;

    @NameInMap("BX")
    public Float BX;

    @NameInMap("BY")
    public Float BY;

    @NameInMap("BW")
    public Float BW;

    @NameInMap("BH")
    public Float BH;

    public static EraseVideoSubtitlesRequest build(java.util.Map<String, ?> map) throws Exception {
        EraseVideoSubtitlesRequest self = new EraseVideoSubtitlesRequest();
        return TeaModel.build(map, self);
    }

    public EraseVideoSubtitlesRequest setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

    public EraseVideoSubtitlesRequest setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
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

    public EraseVideoSubtitlesRequest setBW(Float BW) {
        this.BW = BW;
        return this;
    }
    public Float getBW() {
        return this.BW;
    }

    public EraseVideoSubtitlesRequest setBH(Float BH) {
        this.BH = BH;
        return this;
    }
    public Float getBH() {
        return this.BH;
    }

}
