// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class EraseVideoSubtitlesAdvanceRequest extends TeaModel {
    @NameInMap("BH")
    public Float BH;

    @NameInMap("BW")
    public Float BW;

    @NameInMap("BX")
    public Float BX;

    @NameInMap("BY")
    public Float BY;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("VideoUrl")
    public java.io.InputStream videoUrlObject;

    public static EraseVideoSubtitlesAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        EraseVideoSubtitlesAdvanceRequest self = new EraseVideoSubtitlesAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public EraseVideoSubtitlesAdvanceRequest setBH(Float BH) {
        this.BH = BH;
        return this;
    }
    public Float getBH() {
        return this.BH;
    }

    public EraseVideoSubtitlesAdvanceRequest setBW(Float BW) {
        this.BW = BW;
        return this;
    }
    public Float getBW() {
        return this.BW;
    }

    public EraseVideoSubtitlesAdvanceRequest setBX(Float BX) {
        this.BX = BX;
        return this;
    }
    public Float getBX() {
        return this.BX;
    }

    public EraseVideoSubtitlesAdvanceRequest setBY(Float BY) {
        this.BY = BY;
        return this;
    }
    public Float getBY() {
        return this.BY;
    }

    public EraseVideoSubtitlesAdvanceRequest setVideoUrlObject(java.io.InputStream videoUrlObject) {
        this.videoUrlObject = videoUrlObject;
        return this;
    }
    public java.io.InputStream getVideoUrlObject() {
        return this.videoUrlObject;
    }

}
